package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SiteProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TenantLevelSiteProperties
{
    @JsonProperty("ArchiveStatus")
    private String ArchiveStatus;
    @JsonProperty("AverageResourceUsage")
    private int AverageResourceUsage;
    @JsonProperty("CurrentResourceUsage")
    private int CurrentResourceUsage;
    @JsonProperty("DenyAddAndCustomizePages")
    private int DenyAddAndCustomizePages;
    @JsonProperty("Description")
    private String Description;
    @JsonProperty("ExpireVersionsAfterDays")
    private int ExpireVersionsAfterDays;
    @JsonProperty("HasHolds")
    private boolean HasHolds;
    @JsonProperty("IsGroupOwnerSiteAdmin")
    private boolean IsGroupOwnerSiteAdmin;
    @JsonProperty("IsTeamsChannelConnected")
    private boolean IsTeamsChannelConnected;
    @JsonProperty("IsTeamsConnected")
    private boolean IsTeamsConnected;
    @JsonProperty("LastContentModifiedDate")
    private String LastContentModifiedDate;
    @JsonProperty("Lcid")
    private int Lcid;
    @JsonProperty("LockState")
    private String LockState;
    @JsonProperty("NewUrl")
    private String NewUrl;
    @JsonProperty("PWAEnabled")
    private int PWAEnabled;
    @JsonProperty("RequestFilesLinkEnabled")
    private boolean RequestFilesLinkEnabled;
    @JsonProperty("RequestFilesLinkExpirationInDays")
    private int RequestFilesLinkExpirationInDays;
    @JsonProperty("SetOwnerWithoutUpdatingSecondaryAdmin")
    private boolean SetOwnerWithoutUpdatingSecondaryAdmin;
    @JsonProperty("SharingAllowedDomainList")
    private String SharingAllowedDomainList;
    @JsonProperty("SharingBlockedDomainList")
    private String SharingBlockedDomainList;
    @JsonProperty("SharingCapability")
    private int SharingCapability;
    @JsonProperty("SharingDomainRestrictionMode")
    private int SharingDomainRestrictionMode;
    @JsonProperty("Status")
    private String Status;
    @JsonProperty("StorageMaximumLevel")
    private long StorageMaximumLevel;
    @JsonProperty("StorageQuotaType")
    private String StorageQuotaType;
    @JsonProperty("StorageUsage")
    private long StorageUsage;
    @JsonProperty("StorageWarningLevel")
    private long StorageWarningLevel;
    @JsonProperty("Template")
    private String Template;
    @JsonProperty("TimeZoneId")
    private int TimeZoneId;
    @JsonProperty("Title")
    private String Title;
    @JsonProperty("UserCodeMaximumLevel")
    private int UserCodeMaximumLevel;
    @JsonProperty("UserCodeWarningLevel")
    private int UserCodeWarningLevel;
    @JsonProperty("WebsCount")
    private int WebsCount;


    public String getArchiveStatus() {
        return ArchiveStatus;
    }

    public void setArchiveStatus(String archiveStatus) {
        ArchiveStatus = archiveStatus;
    }

    public boolean isTeamsConnected() {
        return IsTeamsConnected;
    }

    public void setTeamsConnected(boolean teamsConnected) {
        IsTeamsConnected = teamsConnected;
    }

    public int getAverageResourceUsage() {
        return AverageResourceUsage;
    }

    public void setAverageResourceUsage(int averageResourceUsage) {
        AverageResourceUsage = averageResourceUsage;
    }

    public int getCurrentResourceUsage() {
        return CurrentResourceUsage;
    }

    public void setCurrentResourceUsage(int currentResourceUsage) {
        CurrentResourceUsage = currentResourceUsage;
    }

    public int getDenyAddAndCustomizePages() {
        return DenyAddAndCustomizePages;
    }

    public void setDenyAddAndCustomizePages(int denyAddAndCustomizePages) {
        DenyAddAndCustomizePages = denyAddAndCustomizePages;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getExpireVersionsAfterDays() {
        return ExpireVersionsAfterDays;
    }

    public void setExpireVersionsAfterDays(int expireVersionsAfterDays) {
        ExpireVersionsAfterDays = expireVersionsAfterDays;
    }

    public boolean isHasHolds() {
        return HasHolds;
    }

    public void setHasHolds(boolean hasHolds) {
        HasHolds = hasHolds;
    }

    public boolean isGroupOwnerSiteAdmin() {
        return IsGroupOwnerSiteAdmin;
    }

    public void setGroupOwnerSiteAdmin(boolean groupOwnerSiteAdmin) {
        IsGroupOwnerSiteAdmin = groupOwnerSiteAdmin;
    }

    public boolean isTeamsChannelConnected() {
        return IsTeamsChannelConnected;
    }

    public void setTeamsChannelConnected(boolean teamsChannelConnected) {
        IsTeamsChannelConnected = teamsChannelConnected;
    }

    public String getLastContentModifiedDate() {
        return LastContentModifiedDate;
    }

    public void setLastContentModifiedDate(String lastContentModifiedDate) {
        LastContentModifiedDate = lastContentModifiedDate;
    }

    public int getLcid() {
        return Lcid;
    }

    public void setLcid(int lcid) {
        Lcid = lcid;
    }

    public String getLockState() {
        return LockState;
    }

    public void setLockState(String lockState) {
        LockState = lockState;
    }

    public String getNewUrl() {
        return NewUrl;
    }

    public void setNewUrl(String newUrl) {
        NewUrl = newUrl;
    }

    public int getPWAEnabled() {
        return PWAEnabled;
    }

    public void setPWAEnabled(int PWAEnabled) {
        this.PWAEnabled = PWAEnabled;
    }

    public boolean isRequestFilesLinkEnabled() {
        return RequestFilesLinkEnabled;
    }

    public void setRequestFilesLinkEnabled(boolean requestFilesLinkEnabled) {
        RequestFilesLinkEnabled = requestFilesLinkEnabled;
    }

    public int getRequestFilesLinkExpirationInDays() {
        return RequestFilesLinkExpirationInDays;
    }

    public void setRequestFilesLinkExpirationInDays(int requestFilesLinkExpirationInDays) {
        RequestFilesLinkExpirationInDays = requestFilesLinkExpirationInDays;
    }

    public boolean isSetOwnerWithoutUpdatingSecondaryAdmin() {
        return SetOwnerWithoutUpdatingSecondaryAdmin;
    }

    public void setSetOwnerWithoutUpdatingSecondaryAdmin(boolean setOwnerWithoutUpdatingSecondaryAdmin) {
        SetOwnerWithoutUpdatingSecondaryAdmin = setOwnerWithoutUpdatingSecondaryAdmin;
    }

    public String getSharingAllowedDomainList() {
        return SharingAllowedDomainList;
    }

    public void setSharingAllowedDomainList(String sharingAllowedDomainList) {
        SharingAllowedDomainList = sharingAllowedDomainList;
    }

    public String getSharingBlockedDomainList() {
        return SharingBlockedDomainList;
    }

    public void setSharingBlockedDomainList(String sharingBlockedDomainList) {
        SharingBlockedDomainList = sharingBlockedDomainList;
    }

    public int getSharingCapability() {
        return SharingCapability;
    }

    public void setSharingCapability(int sharingCapability) {
        SharingCapability = sharingCapability;
    }

    public int getSharingDomainRestrictionMode() {
        return SharingDomainRestrictionMode;
    }

    public void setSharingDomainRestrictionMode(int sharingDomainRestrictionMode) {
        SharingDomainRestrictionMode = sharingDomainRestrictionMode;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String status) {
        Status = status;
    }

    public long getStorageMaximumLevel() {
        return StorageMaximumLevel;
    }

    public void setStorageMaximumLevel(long storageMaximumLevel) {
        StorageMaximumLevel = storageMaximumLevel;
    }

    public String getStorageQuotaType() {
        return StorageQuotaType;
    }

    public void setStorageQuotaType(String storageQuotaType) {
        StorageQuotaType = storageQuotaType;
    }

    public long getStorageUsage() {
        return StorageUsage;
    }

    public void setStorageUsage(long storageUsage) {
        StorageUsage = storageUsage;
    }

    public long getStorageWarningLevel() {
        return StorageWarningLevel;
    }

    public void setStorageWarningLevel(long storageWarningLevel) {
        StorageWarningLevel = storageWarningLevel;
    }

    public String getTemplate() {
        return Template;
    }

    public void setTemplate(String template) {
        Template = template;
    }

    public int getTimeZoneId() {
        return TimeZoneId;
    }

    public void setTimeZoneId(int timeZoneId) {
        TimeZoneId = timeZoneId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public int getUserCodeMaximumLevel() {
        return UserCodeMaximumLevel;
    }

    public void setUserCodeMaximumLevel(int userCodeMaximumLevel) {
        UserCodeMaximumLevel = userCodeMaximumLevel;
    }

    public int getUserCodeWarningLevel() {
        return UserCodeWarningLevel;
    }

    public void setUserCodeWarningLevel(int userCodeWarningLevel) {
        UserCodeWarningLevel = userCodeWarningLevel;
    }

    public int getWebsCount() {
        return WebsCount;
    }

    public void setWebsCount(int websCount) {
        WebsCount = websCount;
    }
}
