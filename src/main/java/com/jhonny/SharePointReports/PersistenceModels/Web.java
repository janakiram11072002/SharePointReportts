package com.jhonny.SharePointReports.PersistenceModels;

import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SiteProperties.SiteProperties;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.Group;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.SiteList;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.User;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.WebProperties;
import com.jhonny.SharePointReports.Utils.CustomUtils;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Web
{
    public int siteType;
    public String siteId;
    public String geoLocation;
    public boolean allowAutomaticASPXPageIndexing;
    public boolean allowCreateDeclarativeWorkflowForCurrentUser;
    public boolean allowDesignerForCurrentUser;
    public boolean allowMasterPageEditingForCurrentUser;
    public boolean allowRevertFromTemplateForCurrentUser;
    public boolean allowRssFeeds;
    public boolean allowSaveDeclarativeWorkflowAsTemplateForCurrentUser;
    public boolean allowSavePublishDeclarativeWorkflowForCurrentUser;
    public String alternateCssUrl;
    public String appInstanceId;
    public String associatedOwnerGroup;
    public int configuration;
    public boolean containsConfidentialInfo;
    public Date created;
    public String currentUserInfo;
    public String customMasterUrl;
    public String description;
    public String designerDownloadUrlForCurrentUser;
    public boolean disableAppViews;
    public boolean disableFlows;
    public boolean documentLibraryCalloutOfficeWebAppPreviewersDisabled;
    public boolean enableMinimalDownload;
    public boolean excludeFromOfflineClient;
    public String id;
    public boolean isMultilingual;
    public int language;
    public String actualLanguage;
    public Date lastItemModifiedDate;
    public Date lastItemUserModifiedDate;
    public String masterUrl;
    public boolean membersCanShare;
    public boolean noCrawl;
    public boolean notificationsInOneDriveForBusinessEnabled;
    public boolean notificationsInSharePointEnabled;
    public boolean overwriteTranslationsOnChange;
    public boolean previewFeaturesEnabled;
    public boolean quickLaunchEnabled;
    public boolean recycleBinEnabled;
    public String requestAccessEmail;
    public boolean saveSiteAsTemplateEnabled;
    public String serverRelativeUrl;
    public boolean showUrlStructureForCurrentUser;
    public String siteLogoDescription;
    public String siteLogoUrl;
    public String supportedUILanguageIds;
    public boolean syndicationEnabled;
    public boolean tenantTagPolicyEnabled;
    public String themedCssFolderUrl;
    public boolean thirdPartyMdmEnabled;
    public String title;
    public boolean treeViewEnabled;
    public int uIVersion;
    public boolean uIVersionConfigurationEnabled;
    public String url;
    public int webs;
    public String webTemplate;
    public int level;
    public int child;
    public int immediateChild;
    public int depth;
    public String parentId;
    public String parentUrl;
    public String parentTitle;
    public int userCount;
    public int uniqueInternalUserCount;
    public int uniqueExternalUserCount;
    public int externalOwnerCount;
    public int externalMemberCount;
    public int externalVisitorCount;
    public int externalAdminCount;
    public int externalMembershipCount;
    public int adminCount;
    public int ownerCount;
    public int memberCount;
    public int visitorCount;
    public int groupCount;
    public int listCount;
    public int documentLibraryCount;
    public String siteUrl;
    public String siteTitle;
    public boolean hasUniqueRoleAssignments;
    public boolean Webs;
    public int inactiveDays;
    public boolean associatedMemberGroupAllowMembersEditMembership;
    public boolean IsSitePublic;
//    public String availableRetentionLable;
//    public long recycleBinSize;
    public boolean useAccessRequestDefault;
//    public int guestUserCount;
//    public int guestUserInvititedByMail;
//    public int annonymousLinkCount;
//    public int emailAuthenticationGuestUser;
    public int sharingCapability;

    public Web(String siteId, String siteName, String geoLocation, WebProperties source)
    {
        this.siteType = (source.getUrl().toLowerCase().contains("-my.sharepoint.com/personal/")) ? 1 : 0;
        this.siteId = siteId;
        this.id = CustomUtils.toGuid(source.getId());
        this.geoLocation = geoLocation;


        this.allowAutomaticASPXPageIndexing = source.isAllowAutomaticASPXPageIndexing();
        this.allowCreateDeclarativeWorkflowForCurrentUser = source.isAllowCreateDeclarativeWorkflowForCurrentUser();
        this.allowDesignerForCurrentUser = source.isAllowDesignerForCurrentUser();
        this.allowMasterPageEditingForCurrentUser = source.isAllowMasterPageEditingForCurrentUser();
        this.allowRevertFromTemplateForCurrentUser = source.isAllowRevertFromTemplateForCurrentUser();
        this.allowRssFeeds = source.isAllowRssFeeds();
        this.allowSaveDeclarativeWorkflowAsTemplateForCurrentUser = source.isAllowSaveDeclarativeWorkflowAsTemplateForCurrentUser();
        this.allowSavePublishDeclarativeWorkflowForCurrentUser = source.isAllowSavePublishDeclarativeWorkflowForCurrentUser();
        this.alternateCssUrl = source.getAlternateCssUrl();
        this.appInstanceId = source.getAppInstanceId();
        this.associatedOwnerGroup = source.getAlternateCssUrl();
        this.configuration = source.getConfiguration();
        this.containsConfidentialInfo = source.isContainsConfidentialInfo();
        this.created = CustomUtils.toDate(source.getCreated());
        this.currentUserInfo = source.getDesignerDownloadUrlForCurrentUser();
        this.customMasterUrl = source.getCustomMasterUrl();
        this.description = source.getDescription();
        this.designerDownloadUrlForCurrentUser = source.getDesignerDownloadUrlForCurrentUser();
        this.disableAppViews = source.isDisableAppViews();
        this.disableFlows = source.isDisableFlows();
        this.documentLibraryCalloutOfficeWebAppPreviewersDisabled = source.isDocumentLibraryCalloutOfficeWebAppPreviewersDisabled();
        this.enableMinimalDownload = source.isEnableMinimalDownload();
        this.excludeFromOfflineClient = source.isExcludeFromOfflineClient();
        this.isMultilingual = source.isMultilingual();
//        this.language = source;
//        this.actualLanguage = source;
        this.lastItemModifiedDate = CustomUtils.toDate(source.getLastItemModifiedDate());
        this.lastItemUserModifiedDate = CustomUtils.toDate(source.getLastItemUserModifiedDate());
        this.masterUrl = source.getMasterUrl();
        this.membersCanShare = source.isMembersCanShare();
        this.noCrawl = source.isNoCrawl();
        this.notificationsInOneDriveForBusinessEnabled = source.isNotificationsInOneDriveForBusinessEnabled();
        this.notificationsInSharePointEnabled = source.isNotificationsInSharePointEnabled();
        this.overwriteTranslationsOnChange = source.isOverwriteTranslationsOnChange();
        this.previewFeaturesEnabled = source.isPreviewFeaturesEnabled();
        this.quickLaunchEnabled = source.isQuickLaunchEnabled();
        this.recycleBinEnabled = source.isRecycleBinEnabled();
        this.requestAccessEmail = source.getAlternateCssUrl();
        this.saveSiteAsTemplateEnabled = source.isSaveSiteAsTemplateEnabled();
        this.serverRelativeUrl = source.getServerRelativeUrl();
        this.showUrlStructureForCurrentUser = source.isShowUrlStructureForCurrentUser();
        this.siteLogoDescription = source.getDescription();
        this.siteLogoUrl = source.getSiteLogoUrl();
        this.supportedUILanguageIds = source.getAlternateCssUrl();
        this.syndicationEnabled = source.isSyndicationEnabled();
        this.tenantTagPolicyEnabled = source.isTenantTagPolicyEnabled();
        this.themedCssFolderUrl = source.getAlternateCssUrl();
        this.thirdPartyMdmEnabled = source.isThirdPartyMdmEnabled();
        this.title = source.getTitle();
        this.treeViewEnabled = source.isTreeViewEnabled();
        this.uIVersion = source.getUIVersion();
        this.uIVersionConfigurationEnabled = source.isUIVersionConfigurationEnabled();
        this.url = source.getUrl();
        this.webTemplate = source.getWebTemplate();

        // Webs Stats
        try {
            this.webs = source.getWebCollection().getWebs().length;
//          this.level = source.getConfiguration();
            this.child = source.getWebCollection().getWebs().length - 1;
            this.immediateChild = source.getWebCollection().getWebs().length;
//          this.depth = source.getConfiguration();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

        //Parent Info
        String[] host = source.getUrl().split("/");
        try
        {
            this.parentId = source.getParentWeb().getId();
            this.parentUrl = host[2] + source.getParentWeb().getServerRelativeUrl();
            this.parentTitle = source.getParentWeb().getTitle();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        // Site properties
        this.siteUrl = host[2]+"/"+host[3];
        this.siteTitle = siteName;

//        this.userCount = source.getConfiguration();
//        this.uniqueInternalUserCount = source.getConfiguration();
//        this.uniqueExternalUserCount = source.getConfiguration();
//        this.externalOwnerCount = source.getConfiguration();
//        this.externalMemberCount = source.getConfiguration();
//        this.externalVisitorCount = source.getConfiguration();
//        this.externalAdminCount = source.getConfiguration();
//        this.externalMembershipCount = source.getConfiguration();
//        this.adminCount = source.getConfiguration();
//        this.ownerCount = source.getConfiguration();
//        this.memberCount = source.getConfiguration();
//        this.visitorCount = source.getConfiguration();
//        this.groupCount = source.getConfiguration();
//        this.listCount = source.getLists().size();
//        this.documentLibraryCount = source.getConfiguration();


        hasUniqueRoleAssignments = source.isHasUniqueRoleAssignments();
        inactiveDays =  (int)TimeUnit.MILLISECONDS.toDays(new Date().getTime() - this.lastItemUserModifiedDate.getTime());
        if(source.getAssociatedMemberGroup() != null) {
            associatedMemberGroupAllowMembersEditMembership = source.getAssociatedMemberGroup().isAllowMembersEditMembership();
        }
        try {
            IsSitePublic = (source.getAllProperties().getGroupType().toLowerCase().equals("private"));
        }
        catch (Exception e)
        {
            IsSitePublic = true;
            System.out.println(e.getMessage());
        }

//        availableRetentionLable = source;
//        recycleBinSize = source;
        useAccessRequestDefault = source.isUseAccessRequestDefault();
//        guestUserCount = source;
//        guestUserInvititedByMail = source;
//        annonymousLinkCount = source;
//        emailAuthenticationGuestUser = source;
        //sharingCapability = siteSource.SharingCapability;

        for(User user : source.getUserCollection().getUsers())
        {
            SiteUsers siteUser= new SiteUsers(this, user);
        }
        System.out.println("Site Users data are Collected");
        for(Group group : source.getGroupCollection().getGroups())
        {
            SiteGroups sitegroup = new SiteGroups(this, group);
        }
        System.out.println("Site Group and Group members date are collected.");
        for(SiteList siteList : source.getListCollection().getLists())
        {
            List list = new List(this, siteList);
        }
        System.out.println("Site list data are collected.");
    }

}

/*
    site type,
    site id,
    allowAutomaticASPXPageIndexing,
    allowCreateDeclarativeWorkflowForCurrentUser,
    allowDesignerForCurrentUser,
    allowMasterPageEditingForCurrentUser,
    allowRevertFromTemplateForCurrentUser,
    allowRssFeeds,
    allowSaveDeclarativeWorkflowAsTemplateForCurrentUser,
    allowSavePublishDeclarativeWorkflowForCurrentUser,
    alternateCssUrl,
    appInstanceId,
    associatedOwnerGroup,
    configuration,
    containsConfidentialInfo
    ,DateTime created,
    currentUserInfo,
    customMasterUrldescription,
    designerDownloadUrlForCurrentUser,
    disableAppViews,
    disableFlows,
    documentLibraryCalloutOfficeWebAppPreviewersDisabled,
    enableMinimalDownload,
    excludeFromOfflineClient,
    id,isMultilingual,
    language,
    actualLanguage,
    DateTime 
    lastItemModifiedDate,DateTime 
    lastItemUserModifiedDate,
    masterUrl,membersCanShare,
    noCrawl,
    notificationsInOneDriveForBusinessEnabled,
    notificationsInSharePoEnabled,
    overwriteTranslationsOnChange,
    previewFeaturesEnabled,
    quickLaunchEnabled,
    recycleBinEnabled,
    requestAccessEmail,
    saveSiteAsTemplateEnabled,
    serverRelativeUrl,
    showUrlStructureForCurrentUser,
    siteLogoDescription,
    siteLogoUrl,
    supportedUILanguageIds,
    syndicationEnabled,
    tenantTagPolicyEnabled,
    themedCssFolderUrl,
    thirdPartyMdmEnabled,
    title,
    treeViewEnabled,
    uIVersion,
    uIVersionConfigurationEnabled,
    url,
    webs,
    webTemplate,
    level,
    child,
    immediateChild,
    depth,
    parentId,
    parentUrl,
    parentTitle,
    userCount,
    uniqueInternalUserCount,
    uniqueExternalUserCount,
    externalOwnerCount,
    externalMemberCount,
    externalVisitorCount,
    externalAdminCount,
    externalMembershipCount,
    adminCount,
    ownerCount,
    memberCount,
    visitorCount,
    groupCount,
    listCount,
    documentLibraryCount,
    siteUrl,
    siteTitle,
    hasUniqueRoleAssignments,
    rootWeb,
    inactiveDays,
    associatedMemberGroupAllowMembersEditMembership,
    IsSitePublic,
    availableRetentionLable,
    recycleBinSize,
    useAccessRequestDefault,
    guestUserCount,
    guestUserInvititedByMail,
    annonymousLinkCount,e
    mailAuthenticationGuestUser,
    sharingCapability



 */