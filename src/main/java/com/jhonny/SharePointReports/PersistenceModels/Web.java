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

    public Web(Site siteSource, WebProperties source)
    {
        //siteType = source;
        siteId = siteSource.id;
        allowAutomaticASPXPageIndexing = source.isAllowAutomaticASPXPageIndexing();
        allowCreateDeclarativeWorkflowForCurrentUser = source.isAllowCreateDeclarativeWorkflowForCurrentUser();
        allowDesignerForCurrentUser = source.isAllowDesignerForCurrentUser();
        allowMasterPageEditingForCurrentUser = source.isAllowMasterPageEditingForCurrentUser();
        allowRevertFromTemplateForCurrentUser = source.isAllowRevertFromTemplateForCurrentUser();
        allowRssFeeds = source.isAllowRssFeeds();
        allowSaveDeclarativeWorkflowAsTemplateForCurrentUser = source.isAllowSaveDeclarativeWorkflowAsTemplateForCurrentUser();
        allowSavePublishDeclarativeWorkflowForCurrentUser = source.isAllowSavePublishDeclarativeWorkflowForCurrentUser();
        alternateCssUrl = source.getAlternateCssUrl();
        appInstanceId = source.getAppInstanceId();
        associatedOwnerGroup = source.getAlternateCssUrl();
        configuration = source.getConfiguration();
        containsConfidentialInfo = source.isContainsConfidentialInfo();
        created = CustomUtils.toDate(source.getCreated());
        currentUserInfo = source.getDesignerDownloadUrlForCurrentUser();
        customMasterUrl = source.getCustomMasterUrl();
        description = source.getDescription();
        designerDownloadUrlForCurrentUser = source.getDesignerDownloadUrlForCurrentUser();
        disableAppViews = source.isDisableAppViews();
        disableFlows = source.isDisableFlows();
        documentLibraryCalloutOfficeWebAppPreviewersDisabled = source.isDocumentLibraryCalloutOfficeWebAppPreviewersDisabled();
        enableMinimalDownload = source.isEnableMinimalDownload();
        excludeFromOfflineClient = source.isExcludeFromOfflineClient();
        id = source.getId();
        isMultilingual = source.isMultilingual();
//        language = source;
//        actualLanguage = source;
        lastItemModifiedDate = CustomUtils.toDate(source.getLastItemModifiedDate());
        lastItemUserModifiedDate = CustomUtils.toDate(source.getLastItemUserModifiedDate());
        masterUrl = source.getMasterUrl();
        membersCanShare = source.isMembersCanShare();
        noCrawl = source.isNoCrawl();
        notificationsInOneDriveForBusinessEnabled = source.isNotificationsInOneDriveForBusinessEnabled();
        notificationsInSharePointEnabled = source.isNotificationsInSharePointEnabled();
        overwriteTranslationsOnChange = source.isOverwriteTranslationsOnChange();
        previewFeaturesEnabled = source.isPreviewFeaturesEnabled();
        quickLaunchEnabled = source.isQuickLaunchEnabled();
        recycleBinEnabled = source.isRecycleBinEnabled();
        requestAccessEmail = source.getAlternateCssUrl();
        saveSiteAsTemplateEnabled = source.isSaveSiteAsTemplateEnabled();
        serverRelativeUrl = source.getServerRelativeUrl();
        showUrlStructureForCurrentUser = source.isShowUrlStructureForCurrentUser();
        siteLogoDescription = source.getDescription();
        siteLogoUrl = source.getSiteLogoUrl();
        supportedUILanguageIds = source.getAlternateCssUrl();
        syndicationEnabled = source.isSyndicationEnabled();
        tenantTagPolicyEnabled = source.isTenantTagPolicyEnabled();
        themedCssFolderUrl = source.getAlternateCssUrl();
        thirdPartyMdmEnabled = source.isThirdPartyMdmEnabled();
        title = source.getTitle();
        treeViewEnabled = source.isTreeViewEnabled();
        uIVersion = source.getUIVersion();
        uIVersionConfigurationEnabled = source.isUIVersionConfigurationEnabled();
        url = source.getUrl();
        //webs = source.getWebs().size();
        webTemplate = source.getWebTemplate();
        
//        level = source.getConfiguration();
//        child = source.getConfiguration();
        immediateChild = source.getWebs().size();
//        depth = source.getConfiguration();
//        parentId = source.;
//        parentUrl = source.getUrl();
//        parentTitle = source.getTitle();
//        userCount = source.getConfiguration();
//        uniqueInternalUserCount = source.getConfiguration();
//        uniqueExternalUserCount = source.getConfiguration();
//        externalOwnerCount = source.getConfiguration();
//        externalMemberCount = source.getConfiguration();
//        externalVisitorCount = source.getConfiguration();
//        externalAdminCount = source.getConfiguration();
//        externalMembershipCount = source.getConfiguration();
//        adminCount = source.getConfiguration();
//        ownerCount = source.getConfiguration();
//        memberCount = source.getConfiguration();
//        visitorCount = source.getConfiguration();
//        groupCount = source.getConfiguration();
        listCount = source.getLists().size();
//        documentLibraryCount = source.getConfiguration();
        siteUrl = siteSource.Url;
        siteTitle = siteSource.Title;
        hasUniqueRoleAssignments = source.isHasUniqueRoleAssignments();
        inactiveDays =  (int)TimeUnit.MILLISECONDS.toDays(new Date().getTime() - this.lastItemUserModifiedDate.getTime());
        if(source.getAssociatedMemberGroup() != null) {
            associatedMemberGroupAllowMembersEditMembership = source.getAssociatedMemberGroup().isAllowMembersEditMembership();
        }
        IsSitePublic = (source.getAllProperties().getGroupType().toLowerCase().equals("true"));
//        availableRetentionLable = source;
//        recycleBinSize = source;
        useAccessRequestDefault = source.isUseAccessRequestDefault();
//        guestUserCount = source;
//        guestUserInvititedByMail = source;
//        annonymousLinkCount = source;
//        emailAuthenticationGuestUser = source;
//        sharingCapability = siteSource.SharingCapability;

        for(User user : source.getUsers())
        {
            SiteUsers siteUser= new SiteUsers(siteId, id, user);
        }
        for(Group group : source.getGroups())
        {
            SiteGroups sitegroup = new SiteGroups(siteId, id, group);
        }
        for(SiteList siteList : source.getLists())
        {
            List list = new List(siteId, id, siteList);
        }
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