package co.edu.poli.ces3.models.autofact;

import java.sql.Date;

public class LogAudits {
    private String audit_createBy;
    private Date audit_createdate;
    private String audit_modifyBy;

    public void setAudit_createBy(String audit_createBy) {
        this.audit_createBy = audit_createBy;
    }

    public void setAudit_createdate(Date audit_createdate) {
        this.audit_createdate = audit_createdate;
    }

    public void setAudit_modifyBy(String audit_modifyBy) {
        this.audit_modifyBy = audit_modifyBy;
    }

    public void setAudit_modifyDate(Date audit_modifyDate) {
        this.audit_modifyDate = audit_modifyDate;
    }

    public String getAudit_createBy() {
        return audit_createBy;
    }

    public Date getAudit_createdate() {
        return audit_createdate;
    }

    public String getAudit_modifyBy() {
        return audit_modifyBy;
    }

    public Date getAudit_modifyDate() {
        return audit_modifyDate;
    }

    private Date audit_modifyDate;
}
