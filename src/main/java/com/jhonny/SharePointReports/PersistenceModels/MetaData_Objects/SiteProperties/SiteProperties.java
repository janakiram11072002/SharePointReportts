package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SiteProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteProperties
{
    @JsonProperty("AllowCreateDeclarativeWorkflow")
    private boolean AllowCreateDeclarativeWorkflow;
    @JsonProperty("AllowDesigner")
    private boolean AllowDesigner;
    @JsonProperty("AllowMasterPageEditing")
    private boolean AllowMasterPageEditing;
    @JsonProperty("AllowRevertFromTemplate")
    private boolean AllowRevertFromTemplate;
    @JsonProperty("AllowSaveDeclarativeWorkflowAsTemplate")
    private boolean AllowSaveDeclarativeWorkflowAsTemplate;
    @JsonProperty("AllowSavePublishDeclarativeWorkflow")
    private boolean AllowSavePublishDeclarativeWorkflow;
    @JsonProperty("AllowSelfServiceUpgrade")
    private boolean AllowSelfServiceUpgrade;
    @JsonProperty("AllowSelfServiceUpgradeEvaluation")
    private boolean AllowSelfServiceUpgradeEvaluation;
    @JsonProperty("Audit")
    private Audit Audit;
    @JsonProperty("AuditLogTrimmingRetention")
    private String AuditLogTrimmingRetention;
    @JsonProperty("ChannelGroupId")
    private String ChannelGroupId;
    @JsonProperty("Classification")
    private String Classification;
    @JsonProperty("CompatibilityLevel")
    private String CompatibilityLevel;
    @JsonProperty("DisableAppViews")
    private boolean DisableAppViews;
    @JsonProperty("DisableCompanyWideSharingLinks")
    private boolean DisableCompanyWideSharingLinks;
    @JsonProperty("DisableFlows")
    private boolean DisableFlows;
    @JsonProperty("ExternalSharingTipsEnabled")
    private boolean ExternalSharingTipsEnabled;
    @JsonProperty("GeoLocation")
    private String GeoLocation;
    @JsonProperty("GroupId")
    private String GroupId;
    @JsonProperty("HubSiteId")
    private String HubSiteId;
    @JsonProperty("Id")
    private String Id;
    @JsonProperty("IsHubSite")
    private boolean IsHubSite;
    @JsonProperty("IsRestrictedAccessControlPolicyEnforcedOnSite")
    private boolean IsRestrictedAccessControlPolicyEnforcedOnSite;
    @JsonProperty("LockIssue")
    private String LockIssue;
    @JsonProperty("MaxItemsPerThrottledOperation")
    private String MaxItemsPerThrottledOperation;
    @JsonProperty("MediaTranscriptionDisabled")
    private boolean MediaTranscriptionDisabled;
    @JsonProperty("NeedsB2BUpgrade")
    private boolean NeedsB2BUpgrade;
    @JsonProperty("Owner")
    private User Owner;
    @JsonProperty("PrimaryUri")
    private String PrimaryUri;
    @JsonProperty("ReadOnly")
    private boolean ReadOnly;
    @JsonProperty("RequiredDesignerVersion")
    private String RequiredDesignerVersion;
    @JsonProperty("SecondaryContact")
    private User SecondaryContact;
    @JsonProperty("SensitivityLabelId")
    private String SensitivityLabelId;
    @JsonProperty("SensitivityLabel")
    private String SensitivityLabel;
    @JsonProperty("SensitivityLabelInfo")
    private SensitivityLabelInfo SensitivityLabelInfo;
    @JsonProperty("SandboxedCodeActivationCapability")
    private int SandboxedCodeActivationCapability;
    @JsonProperty("ServerRelativeUrl")
    private String ServerRelativeUrl;
    @JsonProperty("ShareByEmailEnabled")
    private boolean ShareByEmailEnabled;
    @JsonProperty("ShareByLinkEnabled")
    private boolean ShareByLinkEnabled;
    @JsonProperty("ShowUrlStructure")
    private boolean ShowUrlStructure;
    @JsonProperty("TrimAuditLog")
    private boolean TrimAuditLog;
    @JsonProperty("UIVersionConfigurationEnabled")
    private boolean UIVersionConfigurationEnabled;
    @JsonProperty("UpgradeInfo")
    private UpgradeInfo UpgradeInfo;
    @JsonProperty("UpgradeReminderDate")
    private Date UpgradeReminderDate;
    @JsonProperty("UpgradeScheduled")
    private boolean UpgradeScheduled;
    @JsonProperty("UpgradeScheduledDate")
    private Date UpgradeScheduledDate;
    @JsonProperty("Upgrading")
    private boolean Upgrading;
    @JsonProperty("Url")
    private String Url;
    @JsonProperty("Usage")
    private Usage Usage;
    @JsonProperty("WriteLocked")
    private boolean WriteLocked;
    
    public boolean isAllowCreateDeclarativeWorkflow() {
        return AllowCreateDeclarativeWorkflow;
    }
    public void setAllowCreateDeclarativeWorkflow(boolean allowCreateDeclarativeWorkflow) {
        AllowCreateDeclarativeWorkflow = allowCreateDeclarativeWorkflow;
    }
    public boolean isAllowDesigner() {
        return AllowDesigner;
    }
    public void setAllowDesigner(boolean allowDesigner) {
        AllowDesigner = allowDesigner;
    }
    public boolean isAllowMasterPageEditing() {
        return AllowMasterPageEditing;
    }
    public void setAllowMasterPageEditing(boolean allowMasterPageEditing) {
        AllowMasterPageEditing = allowMasterPageEditing;
    }
    public boolean isAllowRevertFromTemplate() {
        return AllowRevertFromTemplate;
    }
    public void setAllowRevertFromTemplate(boolean allowRevertFromTemplate) {
        AllowRevertFromTemplate = allowRevertFromTemplate;
    }
    public boolean isAllowSaveDeclarativeWorkflowAsTemplate() {
        return AllowSaveDeclarativeWorkflowAsTemplate;
    }
    public void setAllowSaveDeclarativeWorkflowAsTemplate(boolean allowSaveDeclarativeWorkflowAsTemplate) {
        AllowSaveDeclarativeWorkflowAsTemplate = allowSaveDeclarativeWorkflowAsTemplate;
    }
    public boolean isAllowSavePublishDeclarativeWorkflow() {
        return AllowSavePublishDeclarativeWorkflow;
    }
    public void setAllowSavePublishDeclarativeWorkflow(boolean allowSavePublishDeclarativeWorkflow) {
        AllowSavePublishDeclarativeWorkflow = allowSavePublishDeclarativeWorkflow;
    }
    public boolean isAllowSelfServiceUpgrade() {
        return AllowSelfServiceUpgrade;
    }
    public void setAllowSelfServiceUpgrade(boolean allowSelfServiceUpgrade) {
        AllowSelfServiceUpgrade = allowSelfServiceUpgrade;
    }
    public boolean isAllowSelfServiceUpgradeEvaluation() {
        return AllowSelfServiceUpgradeEvaluation;
    }
    public void setAllowSelfServiceUpgradeEvaluation(boolean allowSelfServiceUpgradeEvaluation) {
        AllowSelfServiceUpgradeEvaluation = allowSelfServiceUpgradeEvaluation;
    }
    public Audit getAudit() {
        return Audit;
    }
    public void setAudit(Audit audit) {
        Audit = audit;
    }
    public String getAuditLogTrimmingRetention() {
        return AuditLogTrimmingRetention;
    }
    public void setAuditLogTrimmingRetention(String auditLogTrimmingRetention) {
        AuditLogTrimmingRetention = auditLogTrimmingRetention;
    }
    public String getChannelGroupId() {
        return ChannelGroupId;
    }
    public void setChannelGroupId(String channelGroupId) {
        ChannelGroupId = channelGroupId;
    }
    public String getClassification() {
        return Classification;
    }
    public void setClassification(String classification) {
        Classification = classification;
    }
    public String getCompatibilityLevel() {
        return CompatibilityLevel;
    }
    public void setCompatibilityLevel(String compatibilityLevel) {
        CompatibilityLevel = compatibilityLevel;
    }
    public boolean isDisableAppViews() {
        return DisableAppViews;
    }
    public void setDisableAppViews(boolean disableAppViews) {
        DisableAppViews = disableAppViews;
    }
    public boolean isDisableCompanyWideSharingLinks() {
        return DisableCompanyWideSharingLinks;
    }
    public void setDisableCompanyWideSharingLinks(boolean disableCompanyWideSharingLinks) {
        DisableCompanyWideSharingLinks = disableCompanyWideSharingLinks;
    }
    public boolean isDisableFlows() {
        return DisableFlows;
    }
    public void setDisableFlows(boolean disableFlows) {
        DisableFlows = disableFlows;
    }
    public boolean isExternalSharingTipsEnabled() {
        return ExternalSharingTipsEnabled;
    }
    public void setExternalSharingTipsEnabled(boolean externalSharingTipsEnabled) {
        ExternalSharingTipsEnabled = externalSharingTipsEnabled;
    }
    public String getGeoLocation() {
        return GeoLocation;
    }
    public void setGeoLocation(String geoLocation) {
        GeoLocation = geoLocation;
    }
    public String getGroupId() {
        return GroupId;
    }
    public void setGroupId(String groupId) {
        GroupId = groupId;
    }
    public String getHubSiteId() {
        return HubSiteId;
    }
    public void setHubSiteId(String hubSiteId) {
        HubSiteId = hubSiteId;
    }
    public String getId() {
        return Id;
    }
    public void setId(String id) {
        Id = id;
    }
    public boolean isIsHubSite() {
        return IsHubSite;
    }
    public void setIsHubSite(boolean isHubSite) {
        IsHubSite = isHubSite;
    }
    public boolean isIsRestrictedAccessControlPolicyEnforcedOnSite() {
        return IsRestrictedAccessControlPolicyEnforcedOnSite;
    }
    public void setIsRestrictedAccessControlPolicyEnforcedOnSite(boolean isRestrictedAccessControlPolicyEnforcedOnSite) {
        IsRestrictedAccessControlPolicyEnforcedOnSite = isRestrictedAccessControlPolicyEnforcedOnSite;
    }
    public String getLockIssue() {
        return LockIssue;
    }
    public void setLockIssue(String lockIssue) {
        LockIssue = lockIssue;
    }
    public String getMaxItemsPerThrottledOperation() {
        return MaxItemsPerThrottledOperation;
    }
    public void setMaxItemsPerThrottledOperation(String maxItemsPerThrottledOperation) {
        MaxItemsPerThrottledOperation = maxItemsPerThrottledOperation;
    }
    public boolean isMediaTranscriptionDisabled() {
        return MediaTranscriptionDisabled;
    }
    public void setMediaTranscriptionDisabled(boolean mediaTranscriptionDisabled) {
        MediaTranscriptionDisabled = mediaTranscriptionDisabled;
    }
    public boolean isNeedsB2BUpgrade() {
        return NeedsB2BUpgrade;
    }
    public void setNeedsB2BUpgrade(boolean needsB2BUpgrade) {
        NeedsB2BUpgrade = needsB2BUpgrade;
    }
    public User getOwner() {
        return Owner;
    }
    public void setOwner(User owner) {
        Owner = owner;
    }
    public String getPrimaryUri() {
        return PrimaryUri;
    }
    public void setPrimaryUri(String primaryUri) {
        PrimaryUri = primaryUri;
    }
    public boolean isReadOnly() {
        return ReadOnly;
    }
    public void setReadOnly(boolean readOnly) {
        ReadOnly = readOnly;
    }
    public String getRequiredDesignerVersion() {
        return RequiredDesignerVersion;
    }
    public void setRequiredDesignerVersion(String requiredDesignerVersion) {
        RequiredDesignerVersion = requiredDesignerVersion;
    }
    public User getSecondaryContact() {
        return SecondaryContact;
    }
    public void setSecondaryContact(User secondaryContact) {
        SecondaryContact = secondaryContact;
    }
    public String getSensitivityLabelId() {
        return SensitivityLabelId;
    }
    public void setSensitivityLabelId(String sensitivityLabelId) {
        SensitivityLabelId = sensitivityLabelId;
    }
    public String getSensitivityLabel() {
        return SensitivityLabel;
    }
    public void setSensitivityLabel(String sensitivityLabel) {
        SensitivityLabel = sensitivityLabel;
    }
    public SensitivityLabelInfo getSensitivityLabelInfo() {
        return SensitivityLabelInfo;
    }
    public void setSensitivityLabelInfo(SensitivityLabelInfo sensitivityLabelInfo) {
        SensitivityLabelInfo = sensitivityLabelInfo;
    }
    public int getSandboxedCodeActivationCapability() {
        return SandboxedCodeActivationCapability;
    }
    public void setSandboxedCodeActivationCapability(int sandboxedCodeActivationCapability) {
        SandboxedCodeActivationCapability = sandboxedCodeActivationCapability;
    }
    public String getServerRelativeUrl() {
        return ServerRelativeUrl;
    }
    public void setServerRelativeUrl(String serverRelativeUrl) {
        ServerRelativeUrl = serverRelativeUrl;
    }
    public boolean isShareByEmailEnabled() {
        return ShareByEmailEnabled;
    }
    public void setShareByEmailEnabled(boolean shareByEmailEnabled) {
        ShareByEmailEnabled = shareByEmailEnabled;
    }
    public boolean isShareByLinkEnabled() {
        return ShareByLinkEnabled;
    }
    public void setShareByLinkEnabled(boolean shareByLinkEnabled) {
        ShareByLinkEnabled = shareByLinkEnabled;
    }
    public boolean isShowUrlStructure() {
        return ShowUrlStructure;
    }
    public void setShowUrlStructure(boolean showUrlStructure) {
        ShowUrlStructure = showUrlStructure;
    }
    public boolean isTrimAuditLog() {
        return TrimAuditLog;
    }
    public void setTrimAuditLog(boolean trimAuditLog) {
        TrimAuditLog = trimAuditLog;
    }
    public boolean isUIVersionConfigurationEnabled() {
        return UIVersionConfigurationEnabled;
    }
    public void setUIVersionConfigurationEnabled(boolean uIVersionConfigurationEnabled) {
        UIVersionConfigurationEnabled = uIVersionConfigurationEnabled;
    }
    public UpgradeInfo getUpgradeInfo() {
        return UpgradeInfo;
    }
    public void setUpgradeInfo(UpgradeInfo upgradeInfo) {
        UpgradeInfo = upgradeInfo;
    }
    public Date getUpgradeReminderDate() {
        return UpgradeReminderDate;
    }
    public void setUpgradeReminderDate(Date upgradeReminderDate) {
        UpgradeReminderDate = upgradeReminderDate;
    }
    public boolean isUpgradeScheduled() {
        return UpgradeScheduled;
    }
    public void setUpgradeScheduled(boolean upgradeScheduled) {
        UpgradeScheduled = upgradeScheduled;
    }
    public Date getUpgradeScheduledDate() {
        return UpgradeScheduledDate;
    }
    public void setUpgradeScheduledDate(Date upgradeScheduledDate) {
        UpgradeScheduledDate = upgradeScheduledDate;
    }
    public boolean isUpgrading() {
        return Upgrading;
    }
    public void setUpgrading(boolean upgrading) {
        Upgrading = upgrading;
    }
    public String getUrl() {
        return Url;
    }
    public void setUrl(String url) {
        Url = url;
    }
    public Usage getUsage() {
        return Usage;
    }
    public void setUsage(Usage usage) {
        Usage = usage;
    }
    public boolean isWriteLocked() {
        return WriteLocked;
    }
    public void setWriteLocked(boolean writeLocked) {
        WriteLocked = writeLocked;
    }

    
}


/*

{
    "AllowCreateDeclarativeWorkflow": false,
    "AllowDesigner": true,
    "AllowMasterPageEditing": false,
    "AllowRevertFromTemplate": false,
    "AllowSaveDeclarativeWorkflowAsTemplate": false,
    "AllowSavePublishDeclarativeWorkflow": false,
    "AllowSelfServiceUpgrade": true,
    "AllowSelfServiceUpgradeEvaluation": true,
    "AuditLogTrimmingRetention": 90,
    "ChannelGroupId": "00000000-0000-0000-0000-000000000000",
    "Classification": "",
    "CompatibilityLevel": 15,
    "CurrentChangeToken": {
        "StringValue": "1;1;9372d741-3ce0-4eee-8349-f35cfd489061;638569202913400000;385148383"
    },
    "DisableAppViews": false,
    "DisableCompanyWideSharingLinks": false,
    "DisableFlows": false,
    "ExternalSharingTipsEnabled": false,
    "GeoLocation": "APC",
    "GroupId": "31956366-7ce7-4b48-9f2c-16553af97d33",
    "HubSiteId": "00000000-0000-0000-0000-000000000000",
    "Id": "9372d741-3ce0-4eee-8349-f35cfd489061",
    "SensitivityLabelId": "",
    "SensitivityLabel": "00000000-0000-0000-0000-000000000000",
    "IsHubSite": false,
    "IsRestrictedAccessControlPolicyEnforcedOnSite": false,
    "LockIssue": null,
    "MaxItemsPerThrottledOperation": 5000,
    "MediaTranscriptionDisabled": false,
    "NeedsB2BUpgrade": false,
    "ResourcePath": {
        "DecodedUrl": "https://42jghx.sharepoint.com/sites/1gate"
    },
    "PrimaryUri": "https://42jghx.sharepoint.com/sites/1gate",
    "ReadOnly": false,
    "RequiredDesignerVersion": "15.0.0.0",
    "SandboxedCodeActivationCapability": 2,
    "ServerRelativeUrl": "/sites/1gate",
    "ShareByEmailEnabled": true,
    "ShareByLinkEnabled": true,
    "ShowUrlStructure": false,
    "TrimAuditLog": true,
    "UIVersionConfigurationEnabled": false,
    "UpgradeReminderDate": "1899-12-30T00:00:00",
    "UpgradeScheduled": false,
    "UpgradeScheduledDate": "1753-01-01T00:00:00",
    "Upgrading": false,
    "Url": "https://42jghx.sharepoint.com/sites/1gate",
    "WriteLocked": false
}

 */