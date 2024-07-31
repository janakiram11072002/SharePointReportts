package com.jhonny.SharePointReports.PersistenceModels;


import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SiteProperties.*;
import com.jhonny.SharePointReports.Utils.enums.SiteType;

import java.util.Date;

public class Site
{
    private String id;
    private String siteType; //pending 
    
    private Boolean AllowCreateDeclarativeWorkflow;
    private Boolean AllowDesigner;
    private Boolean AllowMasterPageEditing;
    private Boolean AllowRevertFromTemplate;
    private Boolean AllowSaveDeclarativeWorkflowAsTemplate;
    private Boolean AllowSavePublishDeclarativeWorkflow;
    private Boolean AllowSelfServiceUpgrade;
    private Boolean AllowSelfServiceUpgradeEvaluation;
    // "Audit": {
    //     "AuditFlags": 0
    // },
    private int AuditFlags;
    private String AuditLogTrimmingRetention;
    private String ChannelGroupId;
    private String Classification;
    private String CompatibilityLevel;
    private Boolean DisableAppViews;
    private Boolean DisableCompanyWideSharingLinks;
    private Boolean DisableFlows;
    private Boolean ExternalSharingTipsEnabled;
    private String GeoLocation;
    private String GroupId;
    private String HubSiteId;
    private Boolean IsHubSite;
    private Boolean IsRestrictedAccessControlPolicyEnforcedOnSite;
    private String LockIssue;
    private String MaxItemsPerThrottledOperation;
    private Boolean MediaTranscriptionDisabled;
    private Boolean NeedsB2BUpgrade;
    private String PrimaryUri;
    private Boolean ReadOnly;
    private String RequiredDesignerVersion;
    private int SandboxedCodeActivationCapability;
    private String SecondaryContactEmail;
    private String SensitivityLabelId;
    private String SensitivityLabel;
    private String ServerRelativeUrl;
    private Boolean ShareByEmailEnabled;
    private Boolean ShareByLinkEnabled;
    private Boolean ShowUrlStructure;
    private Boolean TrimAuditLog;
    private Boolean UIVersionConfigurationEnabled;
    private Date UpgradeReminderDate;
    private Boolean UpgradeScheduled;
    private Date UpgradeScheduledDate;
    private Boolean Upgrading;
    private String Url;
    private Boolean WriteLocked;


    //"CustomScriptSafeDomains": [],

    // "Owner": {
    //     "Id": 10,
    //     "IsHiddenInUI": false,
    //     "LoginName": "i:0#.f|membership|jh@42jghx.onmicrosoft.com",
    //     "Title": "Jhonny",
    //     "PrincipalType": 1,
    //     "Email": "JH@42jghx.onmicrosoft.com",
    //     "Expiration": "",
    //     "IsEmailAuthenticationGuestUser": false,
    //     "IsShareByEmailGuestUser": false,
    //     "IsSiteAdmin": true,
    //     "UserId": {
    //     "NameId": "1003200263675b60",
    //     "NameIdIssuer": "urn:federation:microsoftonline"
    //     },
    //     "UserPrincipalName": "jh@42jghx.onmicrosoft.com"
    // },
    private String Owner;
    private Boolean IsOwnerIssiteAdmin;
    // "SensitivityLabelInfo": {
    //     "DisplayName": "",
    //     "Id": "",
    //     "MembersCanShare": "None"
    // },

    // "UpgradeInfo": {
    //     "ErrorFile": "_catalogs/MaintenanceLogs/20240727-053143-847-error.txt",
    //     "Errors": 0,
    //     "LastUpdated": "2024-07-27T12:35:05.397",
    //     "LogFile": "_catalogs/MaintenanceLogs/20240727-053143-847.txt",
    //     "RequestDate": "2024-07-26T11:47:42.617",
    //     "RetryCount": 0,
    //     "StartTime": "2024-07-27T12:31:43.837",
    //     "Status": 3,
    //     "UpgradeType": 0,
    //     "Warnings": 4
    // },
    private String UgrageInfoErrorFile;
    private int UgrageInfoErrors;
    private Date UgrageInfoLastUpdated;
    private String UgrageInfoLogFile;
    private Date UgrageInfoRequestDate;
    private int UgrageInfoRetryCount;
    private Date UgrageInfoStartTime;
    private int UgrageInfoStatus;
    private int UgrageInfoUpgradeType;
    private int UgrageInfoWarnings;
    //    "Usage": {
    //        "Bandwidth": "0",
    //        "DiscussionStorage": "0",
    //        "Hits": "0",
    //        "Storage": "2182772",
    //        "StoragePercentageUsed": 1.9852195691782982E-07,
    //        "Visits": "0"
    //    },
    private long UsageBandwidth;
    private long UsageDiscussionStorage;
    private long UsageHits;
    private long UsageStorage;
    private double UsageStoragePercentage;
    private long UsageVisits;





    /***
     * Below are the properteies obtained form TenantAdministration.SiteProperties
     */
    // "AllowDownloadingNonWebViewableFiles": false,
    // "AllowEditing": true,
    // "AnonymousLinkExpirationInDays": 0,
    // "ApplyToExistingDocumentLibraries": false,
    // "ApplyToNewDocumentLibraries": false,
    private String ArchiveStatus;
    // "AuthContextStrength": null,
    // "AuthenticationContextLimitedAccess": false,
    // "AuthenticationContextName": null,
    private int AverageResourceUsage;
    // "BlockDownloadLinksFileType": 1,
    // "BlockDownloadMicrosoft365GroupIds": null,
    // "BlockDownloadPolicy": false,
    // "BlockDownloadPolicyFileTypeIds": null,
    // "BlockGuestsAsSiteAdmin": 0,
    // "BonusDiskQuota": 652877,
    // "ClearRestrictedAccessControl": false,
    // "CommentsOnSitePagesDisabled": false,
    // "CompatibilityLevel": 15,
    // "ConditionalAccessPolicy": 0,
    private int CurrentResourceUsage;
    // "DefaultLinkPermission": 0,
    // "DefaultLinkToExistingAccess": false,
    // "DefaultLinkToExistingAccessReset": false,
    // "DefaultShareLinkRole": 0,
    // "DefaultShareLinkScope": -1,
    // "DefaultSharingLinkType": 0,
    private int DenyAddAndCustomizePages;
    private String Description;
    // "EnableAutoExpirationVersionTrim": false,
    // "ExcludeBlockDownloadPolicySiteOwners": false,
    // "ExcludeBlockDownloadSharePointGroups": [],
    // "ExcludedBlockDownloadGroupIds": [],
    private int ExpireVersionsAfterDays;
    // "ExternalUserExpirationInDays": 0,
    // "GroupOwnerLoginName": "c:0o.c|federateddirectoryclaimprovider|31956366-7ce7-4b48-9f2c-16553af97d33_o",
    private boolean HasHolds;
    // "IBMode": "",
    // "IBSegments": [],
    // "IBSegmentsToAdd": null,
    // "IBSegmentsToRemove": null,
    // "InheritVersionPolicyFromTenant": false,
    private boolean IsGroupOwnerSiteAdmin;
    private boolean IsTeamsChannelConnected;
    private boolean IsTeamsConnected;
    private Date LastContentModifiedDate;
    private int Lcid; //get language using lcid
    // "LimitedAccessFileType": 1,
    // "ListsShowHeaderAndNavigation": false,
    // "LockReason": 0,
    private String LockState;
    // "LoopDefaultSharingLinkRole": 0,
    // "LoopDefaultSharingLinkScope": -1,
    // "MajorVersionLimit": 0,
    // "MajorWithMinorVersionsLimit": 0,
    // "MediaTranscription": 0,
    private String NewUrl;
    // "OverrideBlockUserInfoVisibility": 0,
    // "OverrideSharingCapability": false,
    // "OverrideTenantAnonymousLinkExpirationPolicy": false,
    // "OverrideTenantExternalUserExpirationPolicy": false,
    private int PWAEnabled;
    // "ReadOnlyAccessPolicy": false,
    // "ReadOnlyForBlockDownloadPolicy": false,
    // "ReadOnlyForUnmanagedDevices": false,
    // "RelatedGroupId": "/Guid(31956366-7ce7-4b48-9f2c-16553af97d33)/",
    private boolean RequestFilesLinkEnabled;
    private int RequestFilesLinkExpirationInDays;
    // "RestrictContentOrgWideSearch": false,
    // "RestrictedAccessControl": false,
    // "RestrictedAccessControlGroups": [
    // "/Guid(31956366-7ce7-4b48-9f2c-16553af97d33)/"
    // ],
    // "RestrictedAccessControlGroupsToAdd": null,
    // "RestrictedAccessControlGroupsToRemove": null,
    // "RestrictedToRegion": 3,
    // "SandboxedCodeActivationCapability": 2,
    private boolean SetOwnerWithoutUpdatingSecondaryAdmin;
    private String SharingAllowedDomainList;
    private String SharingBlockedDomainList;
    private int SharingCapability;
    private int SharingDomainRestrictionMode;
    // "SharingLockDownCanBeCleared": true,
    // "SharingLockDownEnabled": false,
    // "ShowPeoplePickerSuggestionsForGuestUsers": false,
    // "SiteDefinedSharingCapability": 2,
    // "SocialBarOnSitePagesDisabled": false,
    private String Status;
    private long StorageMaximumLevel;
    private String StorageQuotaType;
    private long StorageUsage;
    private long StorageWarningLevel;
    //"TeamsChannelType": 0,
    private String Template;
    private int TimeZoneId;
    private String Title;
    // "TitleTranslations": null,
    private int UserCodeMaximumLevel;
    private int UserCodeWarningLevel;
    private int WebsCount;
    //Extra properties
    private int WebDepth; //depth of subsites
    private int child; //subsites(webcounts-1)
    private boolean IsOverWarningQuota;
    private int InactiveDays;
    private double StoragePercentageUsedInTenant;


    public Site(SiteProperties source)
    {
        id = source.getId();
        //siteType = source;
        AllowCreateDeclarativeWorkflow = source.isAllowCreateDeclarativeWorkflow();
        AllowDesigner = source.isAllowDesigner();
        AllowMasterPageEditing = source.isAllowMasterPageEditing();
        AllowRevertFromTemplate = source.isAllowRevertFromTemplate();
        AllowSaveDeclarativeWorkflowAsTemplate = source.isAllowSaveDeclarativeWorkflowAsTemplate();
        AllowSavePublishDeclarativeWorkflow = source.isAllowSavePublishDeclarativeWorkflow();
        AllowSelfServiceUpgrade = source.isAllowSelfServiceUpgrade();
        AllowSelfServiceUpgradeEvaluation = source.isAllowSelfServiceUpgradeEvaluation();
        AuditFlags = source.getAudit().getAuditFlags();
        AuditLogTrimmingRetention = source.getAuditLogTrimmingRetention();
        ChannelGroupId = source.getChannelGroupId();
        Classification = source.getClassification();
        CompatibilityLevel = source.getCompatibilityLevel();
        DisableAppViews = source.isDisableAppViews();
        DisableCompanyWideSharingLinks = source.isDisableCompanyWideSharingLinks();
        DisableFlows = source.isDisableFlows();
        ExternalSharingTipsEnabled = source.isExternalSharingTipsEnabled();
        GeoLocation = source.getGeoLocation();
        GroupId = source.getGroupId();;
        HubSiteId = source.getHubSiteId();
        IsHubSite = source.isIsHubSite();
        IsRestrictedAccessControlPolicyEnforcedOnSite = source.isIsRestrictedAccessControlPolicyEnforcedOnSite();
        LockIssue = source.getLockIssue();
        MaxItemsPerThrottledOperation = source.getMaxItemsPerThrottledOperation();
        MediaTranscriptionDisabled = source.isMediaTranscriptionDisabled();
        NeedsB2BUpgrade = source.isNeedsB2BUpgrade();
        PrimaryUri = source.getPrimaryUri();
        ReadOnly = source.isReadOnly();
        RequiredDesignerVersion = source.getRequiredDesignerVersion();
        SandboxedCodeActivationCapability = source.getSandboxedCodeActivationCapability();
        SecondaryContactEmail = source.getSecondaryContact().getEmail();
        SensitivityLabelId = source.getSensitivityLabelId();
        SensitivityLabel = source.getSensitivityLabel();
        ServerRelativeUrl = source.getServerRelativeUrl();
        ShareByEmailEnabled = source.isShareByEmailEnabled();
        ShareByLinkEnabled = source.isShareByLinkEnabled();
        ShowUrlStructure = source.isShowUrlStructure();
        TrimAuditLog = source.isTrimAuditLog();
        UIVersionConfigurationEnabled = source.isUIVersionConfigurationEnabled();
        UpgradeReminderDate = source.getUpgradeReminderDate();
        UpgradeScheduled = source.isUpgradeScheduled();
        UpgradeScheduledDate = source.getUpgradeScheduledDate();
        Upgrading = source.isUpgrading();
        Url = source.getUrl();
        WriteLocked = source.isWriteLocked();
        Owner = source.getOwner().getEmail();
        IsOwnerIssiteAdmin = source.getOwner().isSiteAdmin();
        UgrageInfoErrorFile = source.getUpgradeInfo().getErrorFile();
        UgrageInfoErrors = source.getUpgradeInfo().getErrors();
        UgrageInfoLastUpdated =  source.getUpgradeInfo().getLastUpdated();
        UgrageInfoLogFile =  source.getUpgradeInfo().getLogFile();
        UgrageInfoRequestDate =  source.getUpgradeInfo().getRequestDate();
        UgrageInfoRetryCount =  source.getUpgradeInfo().getRetryCount();
        UgrageInfoStartTime =  source.getUpgradeInfo().getStartTime();
        UgrageInfoStatus =  source.getUpgradeInfo().getStatus();
        UgrageInfoUpgradeType =  source.getUpgradeInfo().getUpgradeType();
        UgrageInfoWarnings =  source.getUpgradeInfo().getWarnings();
        UsageBandwidth = source.getUsage().getBandwidth();
        UsageDiscussionStorage = source.getUsage().getDiscussionStorage();
        UsageHits = source.getUsage().getHits();
        UsageStorage = source.getUsage().getStorage();
        UsageStoragePercentage = source.getUsage().getStoragePercentageUsed();
        UsageVisits = source.getUsage().getVisits();

    }

    // Site Audit
    public void updateSiteProp(TenantLevelSiteProperties source)
    {
        ArchiveStatus = source.getArchiveStatus();
        AverageResourceUsage = source.getAverageResourceUsage();
        CurrentResourceUsage = source.getCurrentResourceUsage();
        DenyAddAndCustomizePages = source.getDenyAddAndCustomizePages();
        Description = source.getDescription();
        ExpireVersionsAfterDays = source.getExpireVersionsAfterDays();
        HasHolds = source.isHasHolds();
        IsGroupOwnerSiteAdmin = source.isGroupOwnerSiteAdmin();
        IsTeamsChannelConnected = source.isTeamsChannelConnected();
        IsTeamsConnected = source.isTeamsConnected();
        LastContentModifiedDate = source.getLastContentModifiedDate();
        Lcid = source.getLcid();
        LockState = source.getLockState();
        NewUrl = source.getNewUrl();
        PWAEnabled = source.getPWAEnabled();
        RequestFilesLinkEnabled = source.isRequestFilesLinkEnabled();
        RequestFilesLinkExpirationInDays = source.getRequestFilesLinkExpirationInDays();
        SetOwnerWithoutUpdatingSecondaryAdmin = source.isSetOwnerWithoutUpdatingSecondaryAdmin();
        SharingAllowedDomainList = source.getSharingAllowedDomainList();
        SharingBlockedDomainList = source.getSharingBlockedDomainList();
        SharingCapability = source.getSharingCapability();
        SharingDomainRestrictionMode = source.getSharingDomainRestrictionMode();
        Status = source.getStatus();
        StorageMaximumLevel = source.getStorageWarningLevel();
        StorageQuotaType = source.getStorageQuotaType();
        StorageUsage = source.getStorageUsage();
        StorageWarningLevel = source.getStorageWarningLevel();
        Template = source.getTemplate();
        TimeZoneId = source.getTimeZoneId();
        Title = source.getTitle();
        UserCodeMaximumLevel = source.getUserCodeMaximumLevel();
        UserCodeWarningLevel = source.getUserCodeWarningLevel();
        WebsCount = source.getWebsCount();
    }

}
