package org.abhi.app5.shared.beans;

import java.io.Serializable;
import java.util.Date;

public class AuditLog implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private long auditId;
	private String myRecordId;
	private Date dateCreated;
	private Date dateModified;
	public AuditLog() {
		super();
	}
	public AuditLog(long auditId, String myRecordId, Date dateCreated,
			Date dateModified) {
		super();
		this.auditId = auditId;
		this.myRecordId = myRecordId;
		this.dateCreated = dateCreated;
		this.dateModified = dateModified;
	}
	public long getAuditId() {
		return auditId;
	}
	public void setAuditId(long auditId) {
		this.auditId = auditId;
	}
	public String getMyRecordId() {
		return myRecordId;
	}
	public void setMyRecordId(String myRecordId) {
		this.myRecordId = myRecordId;
	}
	public Date getDateCreated() {
		return dateCreated;
	}
	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}
	public Date getDateModified() {
		return dateModified;
	}
	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}
	@Override
	public String toString() {
		return "AuditLog [auditId=" + auditId + ", myRecordId=" + myRecordId
				+ ", dateCreated=" + dateCreated + ", dateModified="
				+ dateModified + "]";
	}
}
