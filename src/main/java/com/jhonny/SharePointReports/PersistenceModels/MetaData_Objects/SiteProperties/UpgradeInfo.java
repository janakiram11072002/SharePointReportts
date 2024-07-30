package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SiteProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UpgradeInfo
{
    @JsonProperty("ErrorFile")
    private String ErrorFile;
    @JsonProperty("Errors")
    private int Errors;
    @JsonProperty("LastUpdated")
    private Date LastUpdated;
    @JsonProperty("LogFile")
    private String LogFile;
    @JsonProperty("RequestDate")
    private Date RequestDate;
    @JsonProperty("RetryCount")
    private int RetryCount;
    @JsonProperty("StartTime")
    private Date StartTime;
    @JsonProperty("Status")
    private int Status;
    @JsonProperty("UpgradeType")
    private int UpgradeType;
    @JsonProperty("Warnings")
    private int Warnings;

    public String getErrorFile() {
        return ErrorFile;
    }

    public void setErrorFile(String errorFile) {
        ErrorFile = errorFile;
    }

    public int getErrors() {
        return Errors;
    }

    public void setErrors(int errors) {
        Errors = errors;
    }

    public Date getLastUpdated() {
        return LastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        LastUpdated = lastUpdated;
    }

    public String getLogFile() {
        return LogFile;
    }

    public void setLogFile(String logFile) {
        LogFile = logFile;
    }

    public Date getRequestDate() {
        return RequestDate;
    }

    public void setRequestDate(Date requestDate) {
        RequestDate = requestDate;
    }

    public int getRetryCount() {
        return RetryCount;
    }

    public void setRetryCount(int retryCount) {
        RetryCount = retryCount;
    }

    public Date getStartTime() {
        return StartTime;
    }

    public void setStartTime(Date startTime) {
        StartTime = startTime;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        Status = status;
    }

    public int getUpgradeType() {
        return UpgradeType;
    }

    public void setUpgradeType(int upgradeType) {
        UpgradeType = upgradeType;
    }

    public int getWarnings() {
        return Warnings;
    }

    public void setWarnings(int warnings) {
        Warnings = warnings;
    }
}
