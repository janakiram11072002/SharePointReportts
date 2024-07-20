package com.jhonny.SharePointReports.PersistenceModels;


import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SiteProperties.*;
import com.jhonny.SharePointReports.Utils.enums.SiteType;

import java.util.Date;

public class Site
{
    private String id;
    private String siteType;
    private boolean allowCreateDeclarativeWorkflow;
    private boolean allowDesigner;
    private boolean allowMasterPageEditing;
    private boolean allowRevertFromTemplate;
    private boolean allowSaveDeclarativeWorkflowAsTemplate;
    private boolean allowSavePublishDeclarativeWorkflow;
    private boolean allowSelfServiceUpgrade;
    private boolean allowSelfServiceUpgradeEvaluation;
    private int auditLogTrimmingRetention;
    private String channelGroupId;
    private String classification;
    private int compatibilityLevel;
    private boolean disableAppViews;
    private boolean disableCompanyWideSharingLinks;
    private boolean disableFlows;
    private boolean externalSharingTipsEnabled;
    private String geoLocation;
    private String groupId;
    private String hubSiteId;
    private boolean isHubSite;
    private boolean isRestrictedAccessControlPolicyEnforcedOnSite;
    private String lockIssue;
    private int maxItemsPerThrottledOperation;
    private boolean mediaTranscriptionDisabled;
    private boolean needsB2BUpgrade;
    private String primaryUri;
    private boolean readOnly;
    private String requiredDesignerVersion;
    private String sandboxedCodeActivationCapability;
    private String serverRelativeUrl;
    private boolean shareByEmailEnabled;
    private boolean shareByLinkEnabled;
    private String sensitivityLabelId;
    private String sensitivityLabel;
    private boolean showUrlStructure;
    private boolean trimAuditLog;
    private boolean uIVersionConfigurationEnabled;
    private Date upgradeReminderDate;
    private boolean upgradeScheduled;
    private Date upgradeScheduledDate;
    private boolean upgrading;
    private String url;
    private boolean writeLocked;

    // Site Audit
    private int auditFlags;

    //Site Owners
    private String owner;
    private boolean ownerIsSiteAdmin;

    //Secondary Contact
    private String secondaryContact;

    // Site Usage
    private long storage;
    private double storagePercentage;

    public Site(SiteProperties source)
    {
        
        this.url = source.getUrl();
        this.siteType = (source.getUrl().contains("-my") || source.getUrl().contains("-my.sharepoint.com/personal")) ? SiteType.OneDrive.toString() : SiteType.SharePoint.toString();
        this.allowCreateDeclarativeWorkflow = source.isAllowCreateDeclarativeWorkflow();
        this.allowDesigner = source.isAllowDesigner();
        this.allowMasterPageEditing = source.isAllowMasterPageEditing();
        this.allowRevertFromTemplate = source.isAllowRevertFromTemplate();
        this.allowSaveDeclarativeWorkflowAsTemplate = source.isAllowSavePublishDeclarativeWorkflow();
        this.allowSavePublishDeclarativeWorkflow = source.isAllowSavePublishDeclarativeWorkflow();
        this.allowSelfServiceUpgrade = source.isAllowSelfServiceUpgrade();
        this.allowSelfServiceUpgradeEvaluation = source.isAllowSelfServiceUpgradeEvaluation();
        this.auditLogTrimmingRetention = source.getAuditLogTrimmingRetention();
        this.channelGroupId = source.getChannelGroupId();
        this.classification = source.getClassification();
        this.compatibilityLevel = source.getCompatibilityLevel();
        this.disableAppViews = source.isDisableAppViews();
        this.disableCompanyWideSharingLinks = source.isDisableCompanyWideSharingLinks();
        this.disableFlows = source.isDisableFlows();
        this.externalSharingTipsEnabled = source.isExternalSharingTipsEnabled();
        this.geoLocation = source.getGeoLocation();
        this.groupId = source.getGroupId();
        this.hubSiteId = source.getHubSiteId();
        this.id = source.getId();
        this.isHubSite = source.isHubSite();
        this.isRestrictedAccessControlPolicyEnforcedOnSite = source.isRestrictedAccessControlPolicyEnforcedOnSite();
        this.lockIssue = source.getLockIssue();
        this.maxItemsPerThrottledOperation = source.getMaxItemsPerThrottledOperation();
        this.mediaTranscriptionDisabled = source.isMediaTranscriptionDisabled();
        this.needsB2BUpgrade = source.isNeedsB2BUpgrade();
        this.primaryUri = source.getPrimaryUri();
        this.readOnly = source.isReadOnly();
        this.requiredDesignerVersion = source.getRequiredDesignerVersion();
        this.sandboxedCodeActivationCapability = source.getSandboxedCodeActivationCapability();
        this.serverRelativeUrl = source.getServerRelativeUrl();
        this.shareByEmailEnabled = source.isShareByEmailEnabled();
        this.shareByLinkEnabled = source.isShareByLinkEnabled();
        this.sensitivityLabelId = source.getSensitivityLabelId();
        this.sensitivityLabel = source.getSensitivityLabel();
        this.showUrlStructure = source.isShowUrlStructure();
        this.trimAuditLog = source.isTrimAuditLog();
        this.uIVersionConfigurationEnabled = source.isUIVersionConfigurationEnabled();
        this.upgradeReminderDate = source.getUpgradeReminderDate();
        this.upgradeScheduled = source.isUpgradeScheduled();
        this.upgradeScheduledDate = source.getUpgradeScheduledDate();
        this.upgrading = source.isUpgrading();
        this.writeLocked = source.isWriteLocked();
    }

    // Site Audit
    public void updateAudit(SiteAudit source)
    {
        this.auditFlags = source.getAuditFlags();
    }

    //Site Owners
    public void updateOwner(SiteOwners source)
    {
        this.owner = source.getEmail();
        this.ownerIsSiteAdmin = source.isSiteAdmin();
    }

    public void updateSecondaryContact(SiteSecondaryContact source)
    {
        this.secondaryContact = source.getSecondaryContact();
    }

    public void updateUsage(SiteUsage source)
    {
        this.storage = source.getStorage();
        this.storagePercentage = source.getStoragePercentageUsed();
    }

}
