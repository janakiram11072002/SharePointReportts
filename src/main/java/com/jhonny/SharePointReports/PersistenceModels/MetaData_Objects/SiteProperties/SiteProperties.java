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
    private Owner Owner;
    @JsonProperty("PrimaryUri")
    private String PrimaryUri;
    @JsonProperty("ReadOnly")
    private boolean ReadOnly;
    @JsonProperty("RequiredDesignerVersion")
    private String RequiredDesignerVersion;
    @JsonProperty("SecondaryContact")
    private SecondaryContact SecondaryContact;
    @JsonProperty("SensitivityLabelId")
    private String SensitivityLabelId;
    @JsonProperty("SensitivityLabel")
    private String SensitivityLabel;
    @JsonProperty("")
    private SensitivityLabelInfo SensitivityLabelInfo;
    @JsonProperty("SensitivityLabelInfo")
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