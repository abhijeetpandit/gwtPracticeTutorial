package org.abhi.app5.dao.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.abhi.app5.dao.AuditDao;
import org.abhi.app5.shared.beans.AuditLog;

public class AuditDaoImpl implements AuditDao {

	@Override
	public List<AuditLog> getAuditRecords() {
		List<AuditLog> auditLogs = new ArrayList<>();
		auditLogs.add(new AuditLog(1l, "REC_001", new Date(), new Date()));
		auditLogs.add(new AuditLog(2l, "REC_002", new Date(), new Date()));
		auditLogs.add(new AuditLog(3l, "REC_003", new Date(), new Date()));
		auditLogs.add(new AuditLog(4l, "REC_004", new Date(), new Date()));
		auditLogs.add(new AuditLog(5l, "REC_005", new Date(), new Date()));
		return auditLogs;
	}

}
