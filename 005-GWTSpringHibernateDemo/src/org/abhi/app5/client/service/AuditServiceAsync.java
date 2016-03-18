package org.abhi.app5.client.service;

import java.util.List;

import org.abhi.app5.shared.beans.AuditLog;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface AuditServiceAsync {
	public void getAuditLogs(AsyncCallback<List<AuditLog>> callback);
}
