package com.jhonny.SharePointReports.PersistenceModels;


import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SiteProperties.*;
// import com.jhonny.SharePointReports.Utils.enums.SiteType;
import com.jhonny.SharePointReports.Utils.CustomUtils;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Entity
@Table(name = "site")
public class Site
{
    // public String id;
    @EmbeddedId
    public SiteKey key;
    public String siteType; //pending 
    
    public Boolean AllowCreateDeclarativeWorkflow;
    public Boolean AllowDesigner;
    public Boolean AllowMasterPageEditing;
    public Boolean AllowRevertFromTemplate;
    public Boolean AllowSaveDeclarativeWorkflowAsTemplate;
    public Boolean AllowSavePublishDeclarativeWorkflow;
    public Boolean AllowSelfServiceUpgrade;
    public Boolean AllowSelfServiceUpgradeEvaluation;
    // "Audit": {
    //     "AuditFlags": 0
    // },
    public int AuditFlags;
    public String AuditLogTrimmingRetention;
    public String ChannelGroupId;
    public String Classification;
    public String CompatibilityLevel;
    public Boolean DisableAppViews;
    public Boolean DisableCompanyWideSharingLinks;
    public Boolean DisableFlows;
    public Boolean ExternalSharingTipsEnabled;
    public String GeoLocation;
    public String GroupId;
    public String HubSiteId;
    public Boolean IsHubSite;
    public Boolean IsRestrictedAccessControlPolicyEnforcedOnSite;
    public String LockIssue;
    public String MaxItemsPerThrottledOperation;
    public Boolean MediaTranscriptionDisabled;
    public Boolean NeedsB2BUpgrade;
    public String PrimaryUri;
    public Boolean ReadOnly;
    public String RequiredDesignerVersion;
    public int SandboxedCodeActivationCapability;
    public String SecondaryContactEmail;
    public String SensitivityLabelId;
    public String SensitivityLabel;
    public String ServerRelativeUrl;
    public Boolean ShareByEmailEnabled;
    public Boolean ShareByLinkEnabled;
    public Boolean ShowUrlStructure;
    public Boolean TrimAuditLog;
    public Boolean UIVersionConfigurationEnabled;
    public Date UpgradeReminderDate;
    public Boolean UpgradeScheduled;
    public Date UpgradeScheduledDate;
    public Boolean Upgrading;
    public String Url;
    public Boolean WriteLocked;


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
    public String Owner;
    public Boolean IsOwnerIssiteAdmin;
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
    public String UgrageInfoErrorFile;
    public int UgrageInfoErrors;
    public Date UgrageInfoLastUpdated;
    public String UgrageInfoLogFile;
    public Date UgrageInfoRequestDate;
    public int UgrageInfoRetryCount;
    public Date UgrageInfoStartTime;
    public int UgrageInfoStatus;
    public int UgrageInfoUpgradeType;
    public int UgrageInfoWarnings;
    //    "Usage": {
    //        "Bandwidth": "0",
    //        "DiscussionStorage": "0",
    //        "Hits": "0",
    //        "Storage": "2182772",
    //        "StoragePercentageUsed": 1.9852195691782982E-07,
    //        "Visits": "0"
    //    },
    public long UsageBandwidth;
    public long UsageDiscussionStorage;
    public long UsageHits;
    public long UsageStorage;
    public double UsageStoragePercentage;
    public long UsageVisits;





    /***
     * Below are the properteies obtained form TenantAdministration.SiteProperties
     */
    // "AllowDownloadingNonWebViewableFiles": false,
    // "AllowEditing": true,
    // "AnonymousLinkExpirationInDays": 0,
    // "ApplyToExistingDocumentLibraries": false,
    // "ApplyToNewDocumentLibraries": false,
    public String ArchiveStatus;
    // "AuthContextStrength": null,
    // "AuthenticationContextLimitedAccess": false,
    // "AuthenticationContextName": null,
    public int AverageResourceUsage;
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
    public int CurrentResourceUsage;
    // "DefaultLinkPermission": 0,
    // "DefaultLinkToExistingAccess": false,
    // "DefaultLinkToExistingAccessReset": false,
    // "DefaultShareLinkRole": 0,
    // "DefaultShareLinkScope": -1,
    // "DefaultSharingLinkType": 0,
    public int DenyAddAndCustomizePages;
    public String Description;
    // "EnableAutoExpirationVersionTrim": false,
    // "ExcludeBlockDownloadPolicySiteOwners": false,
    // "ExcludeBlockDownloadSharePointGroups": [],
    // "ExcludedBlockDownloadGroupIds": [],
    public int ExpireVersionsAfterDays;
    // "ExternalUserExpirationInDays": 0,
    // "GroupOwnerLoginName": "c:0o.c|federateddirectoryclaimprovider|31956366-7ce7-4b48-9f2c-16553af97d33_o",
    public boolean HasHolds;
    // "IBMode": "",
    // "IBSegments": [],
    // "IBSegmentsToAdd": null,
    // "IBSegmentsToRemove": null,
    // "InheritVersionPolicyFromTenant": false,
    public boolean IsGroupOwnerSiteAdmin;
    public boolean IsTeamsChannelConnected;
    public boolean IsTeamsConnected;
    public Date LastContentModifiedDate;
    public int Lcid; //get language using lcid
    // "LimitedAccessFileType": 1,
    // "ListsShowHeaderAndNavigation": false,
    // "LockReason": 0,
    public String LockState;
    // "LoopDefaultSharingLinkRole": 0,
    // "LoopDefaultSharingLinkScope": -1,
    // "MajorVersionLimit": 0,
    // "MajorWithMinorVersionsLimit": 0,
    // "MediaTranscription": 0,
    public String NewUrl;
    // "OverrideBlockUserInfoVisibility": 0,
    // "OverrideSharingCapability": false,
    // "OverrideTenantAnonymousLinkExpirationPolicy": false,
    // "OverrideTenantExternalUserExpirationPolicy": false,
    public int PWAEnabled;
    // "ReadOnlyAccessPolicy": false,
    // "ReadOnlyForBlockDownloadPolicy": false,
    // "ReadOnlyForUnmanagedDevices": false,
    // "RelatedGroupId": "/Guid(31956366-7ce7-4b48-9f2c-16553af97d33)/",
    public boolean RequestFilesLinkEnabled;
    public int RequestFilesLinkExpirationInDays;
    // "RestrictContentOrgWideSearch": false,
    // "RestrictedAccessControl": false,
    // "RestrictedAccessControlGroups": [
    // "/Guid(31956366-7ce7-4b48-9f2c-16553af97d33)/"
    // ],
    // "RestrictedAccessControlGroupsToAdd": null,
    // "RestrictedAccessControlGroupsToRemove": null,
    // "RestrictedToRegion": 3,
    // "SandboxedCodeActivationCapability": 2,
    public boolean SetOwnerWithoutUpdatingSecondaryAdmin;
    @Column(columnDefinition = "TEXT")
    public String SharingAllowedDomainList;
    @Column(columnDefinition = "TEXT")
    public String SharingBlockedDomainList;
    public int SharingCapability;
    public int SharingDomainRestrictionMode;
    // "SharingLockDownCanBeCleared": true,
    // "SharingLockDownEnabled": false,
    // "ShowPeoplePickerSuggestionsForGuestUsers": false,
    // "SiteDefinedSharingCapability": 2,
    // "SocialBarOnSitePagesDisabled": false,
    public String Status;
    public long StorageMaximumLevel;
    public String StorageQuotaType;
    public long StorageUsage;
    public long StorageWarningLevel;
    //"TeamsChannelType": 0,
    public String Template;
    public int TimeZoneId;
    public String Title;
    // "TitleTranslations": null,
    public int UserCodeMaximumLevel;
    public int UserCodeWarningLevel;
    public int WebsCount;
    //Extra properties
    public int WebDepth; //depth of subsites
    public int child; //subsites(webcounts-1)
    public boolean IsOverWarningQuota;
    public int InactiveDays;
    public double StoragePercentageUsedInTenant;

    public Site()
    {

    }

    public Site(SiteProperties source)
    {
        this.key = new SiteKey();
        this.key.id = source.getId();
        //siteType = source;
        AllowCreateDeclarativeWorkflow = source.isAllowCreateDeclarativeWorkflow();
        AllowDesigner = source.isAllowDesigner();
        AllowMasterPageEditing = source.isAllowMasterPageEditing();
        AllowRevertFromTemplate = source.isAllowRevertFromTemplate();
        AllowSaveDeclarativeWorkflowAsTemplate = source.isAllowSaveDeclarativeWorkflowAsTemplate();
        AllowSavePublishDeclarativeWorkflow = source.isAllowSavePublishDeclarativeWorkflow();
        AllowSelfServiceUpgrade = source.isAllowSelfServiceUpgrade();
        AllowSelfServiceUpgradeEvaluation = source.isAllowSelfServiceUpgradeEvaluation();
        try {
            AuditFlags = source.getAudit().getAuditFlags();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
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
        try {
            SecondaryContactEmail = source.getSecondaryContact().getEmail();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
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
        try {
            Owner = source.getOwner().getEmail();
            IsOwnerIssiteAdmin = source.getOwner().isSiteAdmin();
        }catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        try {
            UgrageInfoErrorFile = source.getUpgradeInfo().getErrorFile();
            UgrageInfoErrors = source.getUpgradeInfo().getErrors();
            UgrageInfoLastUpdated = source.getUpgradeInfo().getLastUpdated();
            UgrageInfoLogFile = source.getUpgradeInfo().getLogFile();
            UgrageInfoRequestDate = source.getUpgradeInfo().getRequestDate();
            UgrageInfoRetryCount = source.getUpgradeInfo().getRetryCount();
            UgrageInfoStartTime = source.getUpgradeInfo().getStartTime();
            UgrageInfoStatus = source.getUpgradeInfo().getStatus();
            UgrageInfoUpgradeType = source.getUpgradeInfo().getUpgradeType();
            UgrageInfoWarnings = source.getUpgradeInfo().getWarnings();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        try {
            UsageBandwidth = source.getUsage().getBandwidth();
            UsageDiscussionStorage = source.getUsage().getDiscussionStorage();
            UsageHits = source.getUsage().getHits();
            UsageStorage = source.getUsage().getStorage();
            UsageStoragePercentage = source.getUsage().getStoragePercentageUsed();
            UsageVisits = source.getUsage().getVisits();
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

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
        //LastContentModifiedDate = source.getLastContentModifiedDate();
        LastContentModifiedDate = CustomUtils.toDate(source.getLastContentModifiedDate());
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
