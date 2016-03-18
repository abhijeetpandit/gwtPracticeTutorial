package org.abhi.app5.client.service;

import java.util.List;

import org.abhi.app5.shared.beans.AuditLog;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("auditlogs")
public interface AuditService extends RemoteService {
	public List<AuditLog> getAuditLogs();
}
