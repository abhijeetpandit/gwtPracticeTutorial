package org.abhi.app5.dao;

import java.util.List;

import org.abhi.app5.shared.beans.AuditLog;

public interface AuditDao {
	public List<AuditLog> getAuditRecords();
}
