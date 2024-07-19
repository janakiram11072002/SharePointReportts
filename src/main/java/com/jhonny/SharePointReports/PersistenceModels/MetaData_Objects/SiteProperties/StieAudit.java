package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SiteProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class StieAudit 
{
    @JsonProperty("AuditFlags")
    private int AuditFlags;

    public int getAuditFlags() {
        return AuditFlags;
    }

    public void setAuditFlags(int auditFlags) {
        AuditFlags = auditFlags;
    }
    
}