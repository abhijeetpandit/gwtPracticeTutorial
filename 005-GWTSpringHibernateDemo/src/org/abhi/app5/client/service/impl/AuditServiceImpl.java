package org.abhi.app5.client.service.impl;

import java.util.List;

import org.abhi.app5.client.service.AuditService;
import org.abhi.app5.dao.AuditDao;
import org.abhi.app5.shared.beans.AuditLog;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;

public class AuditServiceImpl extends RemoteServiceServlet implements AuditService {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private AuditDao auditDao;
	
	public void setAuditDao(AuditDao auditDao) {
		this.auditDao = auditDao;
	}

	@Override
	public List<AuditLog> getAuditLogs() {
		return auditDao.getAuditRecords();
	}

}
