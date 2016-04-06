package org.abhi.app5.client.widgets;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.abhi.app5.client.service.AuditService;
import org.abhi.app5.client.service.AuditServiceAsync;
import org.abhi.app5.shared.beans.AuditLog;

import com.google.gwt.cell.client.AbstractCell;
import com.google.gwt.core.client.GWT;
import com.google.gwt.safehtml.shared.SafeHtmlBuilder;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.cellview.client.Column;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.gwt.user.client.ui.TabLayoutPanel;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.view.client.ProvidesKey;

public class MyWidget extends Composite implements AsyncCallback<List<AuditLog>> {

	private static MyWidgetUiBinder uiBinder = GWT
			.create(MyWidgetUiBinder.class);

	private AuditServiceAsync auditService = GWT.create(AuditService.class);
	
	interface MyWidgetUiBinder extends UiBinder<Widget, MyWidget> {
	}

	@UiField
	Button fetchRecordsButton;
	
	@UiField
	TabLayoutPanel tab;
	
	@UiField
	SimplePanel tablePanel;

	CellTable<AuditLog> cellTable;
	
	public MyWidget() {
		initWidget(uiBinder.createAndBindUi(this));
		tab.selectTab(1);
		cellTable = new CellTable<>(5, new ProvidesKey<AuditLog>() {

			@Override
			public Object getKey(AuditLog item) {
				return item.getAuditId();
			}
			
		});
		Column<AuditLog, Long> auditLogIdColumn = new Column<AuditLog, Long>(new AbstractCell<Long>() {

			@Override
			public void render(com.google.gwt.cell.client.Cell.Context context,
					Long value, SafeHtmlBuilder sb) {
				sb.appendHtmlConstant(value.toString());
			}
		}) {

			@Override
			public Long getValue(AuditLog object) {
				return object.getAuditId();
			}
		};
		
		
		
		Column<AuditLog, String> myRecordIdColumn = new Column<AuditLog, String>(new AbstractCell<String>() {

			@Override
			public void render(com.google.gwt.cell.client.Cell.Context context,
					String value, SafeHtmlBuilder sb) {
				sb.appendHtmlConstant(value);
			}
		}) {
			@Override
			public String getValue(AuditLog object) {
				return object.getMyRecordId();
			}
		};
		
		Column<AuditLog, Date> dateCreatedColumn = new Column<AuditLog, Date>(new AbstractCell<Date>() {

			@Override
			public void render(com.google.gwt.cell.client.Cell.Context context,
					Date value, SafeHtmlBuilder sb) {
				sb.appendHtmlConstant(value.toString());
			}
		}) {
			@Override
			public Date getValue(AuditLog object) {
				return object.getDateCreated();
			}
		};
		
		Column<AuditLog, Date> dateModifiedColumn = new Column<AuditLog, Date>(new AbstractCell<Date>() {

			@Override
			public void render(com.google.gwt.cell.client.Cell.Context context,
					Date value, SafeHtmlBuilder sb) {
				sb.appendHtmlConstant(value.toString());
			}
		}) {
			@Override
			public Date getValue(AuditLog object) {
				return object.getDateModified();
			}
		};
		cellTable.addColumn(auditLogIdColumn, "ID");
		cellTable.addColumn(myRecordIdColumn, "Record id");
		cellTable.addColumn(dateCreatedColumn, "Date Created");
		cellTable.addColumn(dateModifiedColumn, "Date modified");
		cellTable.setColumnWidth(auditLogIdColumn, "25%");
		cellTable.setColumnWidth(myRecordIdColumn, "25%");
		cellTable.setColumnWidth(dateCreatedColumn, "25%");
		cellTable.setColumnWidth(dateModifiedColumn, "25%");
		
		auditService.getAuditLogs(this);
		tablePanel.add(cellTable);
	}

	@Override
	public void onFailure(Throwable caught) {
		System.out.println("Failure");
	}

	@Override
	public void onSuccess(List<AuditLog> result) {
		cellTable.setRowCount(result.size());
		cellTable.setRowData(result);
	}

}
