package com.jhonny.SharePointReports.PersistenceModels;

import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SiteProperties.SiteProperties;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.Group;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.Owner;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.SiteList;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.User;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.WebProperties;
import com.jhonny.SharePointReports.Services.DbService;
import com.jhonny.SharePointReports.Utils.CustomUtils;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Date;
import java.util.HashSet;
import java.util.concurrent.TimeUnit;

@Entity
@Table(name = "web")
public class Web
{
//    public String siteId;
//    public String id;
    @EmbeddedId
    public WebKey key;

    public int siteType;
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
    @Column(columnDefinition = "TEXT")
    public String associatedOwnerGroup;
    public int configuration;
    public boolean containsConfidentialInfo;
    public Date created;
    public String currentUserInfo;
    @Column(columnDefinition = "TEXT")
    public String customMasterUrl;
    @Column(columnDefinition = "TEXT")
    public String description;
    public String designerDownloadUrlForCurrentUser;
    public boolean disableAppViews;
    public boolean disableFlows;
    public boolean documentLibraryCalloutOfficeWebAppPreviewersDisabled;
    public boolean enableMinimalDownload;
    public boolean excludeFromOfflineClient;
    public boolean isMultilingual;
    public int language;
    public String actualLanguage;
    public Date lastItemModifiedDate;
    public Date lastItemUserModifiedDate;
    @Column(columnDefinition = "TEXT")
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
    @Column(columnDefinition = "TEXT")
    public String serverRelativeUrl;
    public boolean showUrlStructureForCurrentUser;
    @Column(columnDefinition = "TEXT")
    public String siteLogoDescription;
    public String siteLogoUrl;
    @Column(columnDefinition = "TEXT")
    public String supportedUILanguageIds;
    public boolean syndicationEnabled;
    public boolean tenantTagPolicyEnabled;
    public String themedCssFolderUrl;
    public boolean thirdPartyMdmEnabled;
    public String title;
    public boolean treeViewEnabled;
    public int uIVersion;
    public boolean uIVersionConfigurationEnabled;
    @Column(columnDefinition = "TEXT")
    public String url;
    public int webs;
    public String webTemplate;
    public int level;
    public int child;
    public int immediateChild;
    public int depth;
    public String parentId;
    @Column(columnDefinition = "TEXT")
    public String parentUrl;
    public String parentTitle;
    public int userCount;
    // public int uniqueInternalUserCount;
    // public int uniqueExternalUserCount;
    // public int externalOwnerCount;
    // public int externalMemberCount;
    // public int externalVisitorCount;
    // public int externalAdminCount;
    // public int externalMembershipCount;
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
    //public boolean Webs;
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

    public Web()
    {
        
    }
    public Web(String siteId, String siteName, String geoLocation, WebProperties source, DbService dbManager)
    {
        this.siteType = (source.getUrl().toLowerCase().contains("-my.sharepoint.com/personal/")) ? 1 : 0;
//        this.siteId = siteId;
//        this.id = CustomUtils.toGuid(source.getId());

        this.key = new WebKey(siteId, CustomUtils.toGuid(source.getId()));
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
        if(host.length >= 5)
        {
            this.siteUrl = host[2] + "/" + host[3];
        }
        else this.siteUrl = source.getUrl();
        this.siteTitle = siteName;




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

        HashSet<String> siteOwnersList = new HashSet<>();
        HashSet<String> siteOwners = new HashSet<>();
        HashSet<String> siteMembers = new HashSet<>();
        HashSet<String> siteVisitor = new HashSet<>();
        HashSet<String> siteAdmins = new HashSet<>();
        HashSet<String> groupOwners = new HashSet<>();

        for(Group group : source.getGroupCollection().getGroups())
        {
            SiteGroup sitegroup = new SiteGroup(this, group);
            if(group.getTitle().equals(group.getOwnerTitle()))
            {
                for(User user : group.getUserCollection().getUsers())
                {
                    groupOwners.add(user.getLoginName());
                }
            }
            for(User user : source.getUserCollection().getUsers())
            {
                boolean isMember = false;
                boolean isVisitor = false;
                boolean isOwner = false;

                if(source.getAssociatedMemberGroup() != null && source.getAssociatedMemberGroup().getId() == group.getId())
                {
                    siteMembers.add(user.getLoginName());
                    isMember = true;
                }
                else if(source.getAssociatedVisitorGroup()!= null && source.getAssociatedVisitorGroup().getId() == group.getId())
                {
                    siteVisitor.add(user.getLoginName());
                    isVisitor = true;
                }
                if(user.isSiteAdmin())
                {
                    siteAdmins.add(user.getLoginName());
                }
                if(groupOwners.contains(user.getLoginName()) || (source.getAssociatedOwnerGroup() != null && source.getAssociatedOwnerGroup().getId() == group.getId()))
                {
                    siteOwners.add(user.getLoginName());
                    isOwner = true;
                }
                SiteGroupMember groupMembers = new SiteGroupMember(sitegroup, user, isOwner, isMember,isVisitor);
                dbManager.saveMember(groupMembers);
            }
            dbManager.saveGroup(sitegroup);
            this.groupCount++;
        }

       this.adminCount = siteAdmins.size();
       this.ownerCount = siteOwners.size();
       this.memberCount = siteMembers.size();
       this.visitorCount = siteVisitor.size();

       try {
           for (User user : source.getAssociatedOwnerGroup().getUserCollection().getUsers()) {
               siteOwnersList.add(user.getLoginName());
           }
       }
       catch(Exception e)
        {
            System.out.println(e.getMessage());
        }

        for(User user : source.getUserCollection().getUsers())
        {
            SiteUsers siteUser= new SiteUsers(this, user, siteOwnersList.contains(user.getLoginName()));
            this.userCount++;
            dbManager.saveUser(siteUser);
        }
        System.out.println("Site Users data are Collected");
        
        System.out.println("Site Group and Group members date are collected.");
        for(SiteList siteList : source.getListCollection().getLists())
        {
            List list = new List(this, siteList);
            if(list.baseType == 0) this.listCount++;
            else if(list.baseType == 1) this.documentLibraryCount++;
            dbManager.saveList(list);
        }
        System.out.println("Site list data are collected.");
    }

}

/*
        For Site Permission
foreach (var roleAssignment in source.RoleAssignments)
{
    var roles = "";
    try
    {
        // if the group/user has only Limited Access or Web-only limited access then they were excluded.
        roles = string.Join(", ", roleAssignment.RoleDefinitionBindings.Where(a => (!a.Name.Equals("Limited Access")) && (!a.Name.Equals("Web-Only Limited Access"))).Select(a => a.Name).ToList());
        //roles = string.Join(", ", roleAssignment.RoleDefinitionBindings.Select(a => a.Name).ToList());
        if (roles != null && roles.Length > 0)
        {
            var sitepermission = new PersistentObjects.SpoSitePermission(tenantId, siteId, source.Id, roleAssignment, roles);
            dataUpdater.UpdateSitePermission(sitepermission);
        }
        else
        {
            Log.Info($"Either the user/group has only Limited Access to the site");
        }
    }
    catch(Exception e)
    {
        Log.Info($"Error Message : {e.Message}");
    }
}*/