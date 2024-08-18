package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebProperties
{
    @JsonProperty("AllowAutomaticASPXPageIndexing")
    private boolean AllowAutomaticASPXPageIndexing;
    @JsonProperty("Author")
    private User Author;
    @JsonProperty("AllowCreateDeclarativeWorkflowForCurrentUser")
    private boolean AllowCreateDeclarativeWorkflowForCurrentUser;
    @JsonProperty("AllowDesignerForCurrentUser")
    private boolean AllowDesignerForCurrentUser;
    @JsonProperty("AllowMasterPageEditingForCurrentUser")
    private boolean AllowMasterPageEditingForCurrentUser;
    @JsonProperty("AllowRevertFromTemplateForCurrentUser")
    private boolean AllowRevertFromTemplateForCurrentUser;
    @JsonProperty("AllowRssFeeds")
    private boolean AllowRssFeeds;
    @JsonProperty("AllowSaveDeclarativeWorkflowAsTemplateForCurrentUser")
    private boolean AllowSaveDeclarativeWorkflowAsTemplateForCurrentUser;
    @JsonProperty("AllowSavePublishDeclarativeWorkflowForCurrentUser")
    private boolean AllowSavePublishDeclarativeWorkflowForCurrentUser;
    @JsonProperty("AllProperties")
    private AllProperties AllProperties;
    @JsonProperty("AlternateCssUrl")
    private String AlternateCssUrl;
    @JsonProperty("AppInstanceId")
    private String AppInstanceId;
    @JsonProperty("AssociatedOwnerGroup")
    private Group AssociatedOwnerGroup;
    @JsonProperty("AssociatedMemberGroup")
    private Group AssociatedMemberGroup;
    @JsonProperty("AssociatedVisitorGroup")
    private Group AssociatedVisitorGroup;
    @JsonProperty("Configuration")
    private int Configuration;
    @JsonProperty("ContainsConfidentialInfo")
    private boolean ContainsConfidentialInfo;
    @JsonProperty("Created")
    private String Created;
    @JsonProperty("CurrentUser")
    private User CurrentUser;
    @JsonProperty("CustomMasterUrl")
    private String CustomMasterUrl;
    @JsonProperty("Description")
    private String Description;
    @JsonProperty("DesignerDownloadUrlForCurrentUser")
    private String DesignerDownloadUrlForCurrentUser;
    @JsonProperty("DisableAppViews")
    private boolean DisableAppViews;
    @JsonProperty("DisableFlows")
    private boolean DisableFlows;
    @JsonProperty("DocumentLibraryCalloutOfficeWebAppPreviewersDisabled")
    private boolean DocumentLibraryCalloutOfficeWebAppPreviewersDisabled;
    @JsonProperty("EnableMinimalDownload")
    private boolean EnableMinimalDownload;
    @JsonProperty("ExcludeFromOfflineClient")
    private boolean ExcludeFromOfflineClient;
    @JsonProperty("Id")
    private String Id;
    @JsonProperty("IsMultilingual")
    private boolean IsMultilingual;
    @JsonProperty("Language")
    private int Language;
    @JsonProperty("LastItemModifiedDate")
    private String LastItemModifiedDate;
    @JsonProperty("LastItemUserModifiedDate")
    private String LastItemUserModifiedDate;
    @JsonProperty("Lists")
    private SPListCollection ListCollection;
    @JsonProperty("MasterUrl")
    private String MasterUrl;
    @JsonProperty("MembersCanShare")
    private boolean MembersCanShare;
    @JsonProperty("NoCrawl")
    private boolean NoCrawl;
    @JsonProperty("NotificationsInOneDriveForBusinessEnabled")
    private boolean NotificationsInOneDriveForBusinessEnabled;
    @JsonProperty("NotificationsInSharePointEnabled")
    private boolean NotificationsInSharePointEnabled;
    @JsonProperty("OverwriteTranslationsOnChange")
    private boolean OverwriteTranslationsOnChange;
    @JsonProperty("ParentWeb")
    private WebInformation ParentWeb;
    @JsonProperty("PreviewFeaturesEnabled")
    private boolean PreviewFeaturesEnabled;
    @JsonProperty("QuickLaunchEnabled")
    private boolean QuickLaunchEnabled;
    @JsonProperty("RecycleBinEnabled")
    private boolean RecycleBinEnabled;
    @JsonProperty("RequestAccessEmail")
    private String RequestAccessEmail;
    @JsonProperty("SaveSiteAsTemplateEnabled")
    private boolean SaveSiteAsTemplateEnabled;
    @JsonProperty("ServerRelativeUrl")
    private String ServerRelativeUrl;
    @JsonProperty("ShowUrlStructureForCurrentUser")
    private boolean ShowUrlStructureForCurrentUser;
    @JsonProperty("SiteLogoDescription")
    private boolean SiteLogoDescription;
    @JsonProperty("SiteLogoUrl")
    private String SiteLogoUrl;
    @JsonProperty("RootFolder")
    private RootFolder RootFolder;
//    @JsonProperty("RoleAssignments")
//    private RoleAssignments RoleAssignments;
//    @JsonProperty("RoleDefinitions")
//    private List<RoleDefinition> RoleDefinitions;
    @JsonProperty("SiteGroups")
    private SPGroupCollection GroupCollection;
    @JsonProperty("SiteUserInfoList")
    private UserInfoList UserInfoList;
    @JsonProperty("SiteUsers")
    private SPUserCollection UserCollection;
    @JsonProperty("SupportedUILanguageIds")
    private int[] SupportedUILanguageIds;
    @JsonProperty("SyndicationEnabled")
    private boolean SyndicationEnabled;
    @JsonProperty("TenantTagPolicyEnabled")
    private boolean TenantTagPolicyEnabled;
    @JsonProperty("ThemedCssFolderUrl")
    private String ThemedCssFolderUrl;
    @JsonProperty("ThirdPartyMdmEnabled")
    private boolean ThirdPartyMdmEnabled;
    @JsonProperty("Title")
    private String Title;
    @JsonProperty("TreeViewEnabled")
    private boolean TreeViewEnabled;
    @JsonProperty("UIVersion")
    private int UIVersion;
    @JsonProperty("UIVersionConfigurationEnabled")
    private boolean UIVersionConfigurationEnabled;
    @JsonProperty("Url")
    private String Url;
    @JsonProperty("UseAccessRequestDefault")
    private boolean UseAccessRequestDefault;
    @JsonProperty("Webs")
    private SPWebsCollection WebCollection;
    @JsonProperty("WebTemplate")
    private String WebTemplate;
    @JsonProperty("HasUniqueRoleAssignments")
    private boolean HasUniqueRoleAssignments;

    public boolean isAllowAutomaticASPXPageIndexing() {
        return AllowAutomaticASPXPageIndexing;
    }

    public void setAllowAutomaticASPXPageIndexing(boolean allowAutomaticASPXPageIndexing) {
        AllowAutomaticASPXPageIndexing = allowAutomaticASPXPageIndexing;
    }

    public User getAuthor() {
        return Author;
    }

    public void setAuthor(User author) {
        Author = author;
    }

    public boolean isAllowCreateDeclarativeWorkflowForCurrentUser() {
        return AllowCreateDeclarativeWorkflowForCurrentUser;
    }

    public void setAllowCreateDeclarativeWorkflowForCurrentUser(boolean allowCreateDeclarativeWorkflowForCurrentUser) {
        AllowCreateDeclarativeWorkflowForCurrentUser = allowCreateDeclarativeWorkflowForCurrentUser;
    }

    public boolean isAllowDesignerForCurrentUser() {
        return AllowDesignerForCurrentUser;
    }

    public void setAllowDesignerForCurrentUser(boolean allowDesignerForCurrentUser) {
        AllowDesignerForCurrentUser = allowDesignerForCurrentUser;
    }

    public boolean isAllowMasterPageEditingForCurrentUser() {
        return AllowMasterPageEditingForCurrentUser;
    }

    public void setAllowMasterPageEditingForCurrentUser(boolean allowMasterPageEditingForCurrentUser) {
        AllowMasterPageEditingForCurrentUser = allowMasterPageEditingForCurrentUser;
    }

    public boolean isAllowRevertFromTemplateForCurrentUser() {
        return AllowRevertFromTemplateForCurrentUser;
    }

    public void setAllowRevertFromTemplateForCurrentUser(boolean allowRevertFromTemplateForCurrentUser) {
        AllowRevertFromTemplateForCurrentUser = allowRevertFromTemplateForCurrentUser;
    }

    public boolean isAllowRssFeeds() {
        return AllowRssFeeds;
    }

    public void setAllowRssFeeds(boolean allowRssFeeds) {
        AllowRssFeeds = allowRssFeeds;
    }

    public boolean isAllowSaveDeclarativeWorkflowAsTemplateForCurrentUser() {
        return AllowSaveDeclarativeWorkflowAsTemplateForCurrentUser;
    }

    public void setAllowSaveDeclarativeWorkflowAsTemplateForCurrentUser(boolean allowSaveDeclarativeWorkflowAsTemplateForCurrentUser) {
        AllowSaveDeclarativeWorkflowAsTemplateForCurrentUser = allowSaveDeclarativeWorkflowAsTemplateForCurrentUser;
    }

    public boolean isAllowSavePublishDeclarativeWorkflowForCurrentUser() {
        return AllowSavePublishDeclarativeWorkflowForCurrentUser;
    }

    public void setAllowSavePublishDeclarativeWorkflowForCurrentUser(boolean allowSavePublishDeclarativeWorkflowForCurrentUser) {
        AllowSavePublishDeclarativeWorkflowForCurrentUser = allowSavePublishDeclarativeWorkflowForCurrentUser;
    }

    public com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.AllProperties getAllProperties() {
        return AllProperties;
    }

    public void setAllProperties(com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.AllProperties allProperties) {
        AllProperties = allProperties;
    }

    public String getAlternateCssUrl() {
        return AlternateCssUrl;
    }

    public void setAlternateCssUrl(String alternateCssUrl) {
        AlternateCssUrl = alternateCssUrl;
    }

    public String getAppInstanceId() {
        return AppInstanceId;
    }

    public void setAppInstanceId(String appInstanceId) {
        AppInstanceId = appInstanceId;
    }

    public Group getAssociatedOwnerGroup() {
        return AssociatedOwnerGroup;
    }

    public void setAssociatedOwnerGroup(Group associatedOwnerGroup) {
        AssociatedOwnerGroup = associatedOwnerGroup;
    }

    public Group getAssociatedMemberGroup() {
        return AssociatedMemberGroup;
    }

    public void setAssociatedMemberGroup(Group associatedMemberGroup) {
        AssociatedMemberGroup = associatedMemberGroup;
    }

    public Group getAssociatedVisitorGroup() {
        return AssociatedVisitorGroup;
    }

    public void setAssociatedVisitorGroup(Group associatedVisitorGroup) {
        AssociatedVisitorGroup = associatedVisitorGroup;
    }

    public int getConfiguration() {
        return Configuration;
    }

    public void setConfiguration(int configuration) {
        Configuration = configuration;
    }

    public boolean isContainsConfidentialInfo() {
        return ContainsConfidentialInfo;
    }

    public void setContainsConfidentialInfo(boolean containsConfidentialInfo) {
        ContainsConfidentialInfo = containsConfidentialInfo;
    }

    public String getCreated() {
        return Created;
    }

    public void setCreated(String created) {
        Created = created;
    }

    public User getCurrentUser() {
        return CurrentUser;
    }

    public void setCurrentUser(User currentUser) {
        CurrentUser = currentUser;
    }

    public String getCustomMasterUrl() {
        return CustomMasterUrl;
    }

    public void setCustomMasterUrl(String customMasterUrl) {
        CustomMasterUrl = customMasterUrl;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDesignerDownloadUrlForCurrentUser() {
        return DesignerDownloadUrlForCurrentUser;
    }

    public void setDesignerDownloadUrlForCurrentUser(String designerDownloadUrlForCurrentUser) {
        DesignerDownloadUrlForCurrentUser = designerDownloadUrlForCurrentUser;
    }

    public boolean isDisableAppViews() {
        return DisableAppViews;
    }

    public void setDisableAppViews(boolean disableAppViews) {
        DisableAppViews = disableAppViews;
    }

    public boolean isDisableFlows() {
        return DisableFlows;
    }

    public void setDisableFlows(boolean disableFlows) {
        DisableFlows = disableFlows;
    }

    public boolean isDocumentLibraryCalloutOfficeWebAppPreviewersDisabled() {
        return DocumentLibraryCalloutOfficeWebAppPreviewersDisabled;
    }

    public void setDocumentLibraryCalloutOfficeWebAppPreviewersDisabled(boolean documentLibraryCalloutOfficeWebAppPreviewersDisabled) {
        DocumentLibraryCalloutOfficeWebAppPreviewersDisabled = documentLibraryCalloutOfficeWebAppPreviewersDisabled;
    }

    public boolean isEnableMinimalDownload() {
        return EnableMinimalDownload;
    }

    public void setEnableMinimalDownload(boolean enableMinimalDownload) {
        EnableMinimalDownload = enableMinimalDownload;
    }

    public boolean isExcludeFromOfflineClient() {
        return ExcludeFromOfflineClient;
    }

    public void setExcludeFromOfflineClient(boolean excludeFromOfflineClient) {
        ExcludeFromOfflineClient = excludeFromOfflineClient;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public boolean isMultilingual() {
        return IsMultilingual;
    }

    public void setMultilingual(boolean multilingual) {
        IsMultilingual = multilingual;
    }

    public int getLanguage() {
        return Language;
    }

    public void setLanguage(int language) {
        Language = language;
    }

    public String getLastItemModifiedDate() {
        return LastItemModifiedDate;
    }

    public void setLastItemModifiedDate(String lastItemModifiedDate) {
        LastItemModifiedDate = lastItemModifiedDate;
    }

    public String getLastItemUserModifiedDate() {
        return LastItemUserModifiedDate;
    }

    public void setLastItemUserModifiedDate(String lastItemUserModifiedDate) {
        LastItemUserModifiedDate = lastItemUserModifiedDate;
    }

    public SPListCollection getListCollection() {
        return ListCollection;
    }

    public void setListCollection(SPListCollection listCollection) {
        ListCollection = listCollection;
    }

    public String getMasterUrl() {
        return MasterUrl;
    }

    public void setMasterUrl(String masterUrl) {
        MasterUrl = masterUrl;
    }

    public boolean isMembersCanShare() {
        return MembersCanShare;
    }

    public void setMembersCanShare(boolean membersCanShare) {
        MembersCanShare = membersCanShare;
    }

    public boolean isNoCrawl() {
        return NoCrawl;
    }

    public void setNoCrawl(boolean noCrawl) {
        NoCrawl = noCrawl;
    }

    public boolean isNotificationsInOneDriveForBusinessEnabled() {
        return NotificationsInOneDriveForBusinessEnabled;
    }

    public void setNotificationsInOneDriveForBusinessEnabled(boolean notificationsInOneDriveForBusinessEnabled) {
        NotificationsInOneDriveForBusinessEnabled = notificationsInOneDriveForBusinessEnabled;
    }

    public boolean isNotificationsInSharePointEnabled() {
        return NotificationsInSharePointEnabled;
    }

    public void setNotificationsInSharePointEnabled(boolean notificationsInSharePointEnabled) {
        NotificationsInSharePointEnabled = notificationsInSharePointEnabled;
    }

    public boolean isOverwriteTranslationsOnChange() {
        return OverwriteTranslationsOnChange;
    }

    public void setOverwriteTranslationsOnChange(boolean overwriteTranslationsOnChange) {
        OverwriteTranslationsOnChange = overwriteTranslationsOnChange;
    }

    public WebInformation getParentWeb() {
        return ParentWeb;
    }

    public void setParentWeb(WebInformation parentWeb) {
        ParentWeb = parentWeb;
    }

    public boolean isPreviewFeaturesEnabled() {
        return PreviewFeaturesEnabled;
    }

    public void setPreviewFeaturesEnabled(boolean previewFeaturesEnabled) {
        PreviewFeaturesEnabled = previewFeaturesEnabled;
    }

    public boolean isQuickLaunchEnabled() {
        return QuickLaunchEnabled;
    }

    public void setQuickLaunchEnabled(boolean quickLaunchEnabled) {
        QuickLaunchEnabled = quickLaunchEnabled;
    }

    public boolean isRecycleBinEnabled() {
        return RecycleBinEnabled;
    }

    public void setRecycleBinEnabled(boolean recycleBinEnabled) {
        RecycleBinEnabled = recycleBinEnabled;
    }

    public String getRequestAccessEmail() {
        return RequestAccessEmail;
    }

    public void setRequestAccessEmail(String requestAccessEmail) {
        RequestAccessEmail = requestAccessEmail;
    }

    public boolean isSaveSiteAsTemplateEnabled() {
        return SaveSiteAsTemplateEnabled;
    }

    public void setSaveSiteAsTemplateEnabled(boolean saveSiteAsTemplateEnabled) {
        SaveSiteAsTemplateEnabled = saveSiteAsTemplateEnabled;
    }

    public String getServerRelativeUrl() {
        return ServerRelativeUrl;
    }

    public void setServerRelativeUrl(String serverRelativeUrl) {
        ServerRelativeUrl = serverRelativeUrl;
    }

    public boolean isShowUrlStructureForCurrentUser() {
        return ShowUrlStructureForCurrentUser;
    }

    public void setShowUrlStructureForCurrentUser(boolean showUrlStructureForCurrentUser) {
        ShowUrlStructureForCurrentUser = showUrlStructureForCurrentUser;
    }

    public boolean isSiteLogoDescription() {
        return SiteLogoDescription;
    }

    public void setSiteLogoDescription(boolean siteLogoDescription) {
        SiteLogoDescription = siteLogoDescription;
    }

    public String getSiteLogoUrl() {
        return SiteLogoUrl;
    }

    public void setSiteLogoUrl(String siteLogoUrl) {
        SiteLogoUrl = siteLogoUrl;
    }

    public com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.RootFolder getRootFolder() {
        return RootFolder;
    }

    public void setRootFolder(com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.RootFolder rootFolder) {
        RootFolder = rootFolder;
    }

    public SPGroupCollection getGroupCollection() {
        return GroupCollection;
    }

    public void setGroupCollection(SPGroupCollection groupCollection) {
        GroupCollection = groupCollection;
    }

    public com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.UserInfoList getUserInfoList() {
        return UserInfoList;
    }

    public void setUserInfoList(com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.UserInfoList userInfoList) {
        UserInfoList = userInfoList;
    }

    public SPUserCollection getUserCollection() {
        return UserCollection;
    }

    public void setUserCollection(SPUserCollection userCollection) {
        UserCollection = userCollection;
    }

    public int[] getSupportedUILanguageIds() {
        return SupportedUILanguageIds;
    }

    public void setSupportedUILanguageIds(int[] supportedUILanguageIds) {
        SupportedUILanguageIds = supportedUILanguageIds;
    }

    public boolean isSyndicationEnabled() {
        return SyndicationEnabled;
    }

    public void setSyndicationEnabled(boolean syndicationEnabled) {
        SyndicationEnabled = syndicationEnabled;
    }

    public boolean isTenantTagPolicyEnabled() {
        return TenantTagPolicyEnabled;
    }

    public void setTenantTagPolicyEnabled(boolean tenantTagPolicyEnabled) {
        TenantTagPolicyEnabled = tenantTagPolicyEnabled;
    }

    public String getThemedCssFolderUrl() {
        return ThemedCssFolderUrl;
    }

    public void setThemedCssFolderUrl(String themedCssFolderUrl) {
        ThemedCssFolderUrl = themedCssFolderUrl;
    }

    public boolean isThirdPartyMdmEnabled() {
        return ThirdPartyMdmEnabled;
    }

    public void setThirdPartyMdmEnabled(boolean thirdPartyMdmEnabled) {
        ThirdPartyMdmEnabled = thirdPartyMdmEnabled;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public boolean isTreeViewEnabled() {
        return TreeViewEnabled;
    }

    public void setTreeViewEnabled(boolean treeViewEnabled) {
        TreeViewEnabled = treeViewEnabled;
    }

    public int getUIVersion() {
        return UIVersion;
    }

    public void setUIVersion(int UIVersion) {
        this.UIVersion = UIVersion;
    }

    public boolean isUIVersionConfigurationEnabled() {
        return UIVersionConfigurationEnabled;
    }

    public void setUIVersionConfigurationEnabled(boolean UIVersionConfigurationEnabled) {
        this.UIVersionConfigurationEnabled = UIVersionConfigurationEnabled;
    }

    public String getUrl() {
        return Url;
    }

    public void setUrl(String url) {
        Url = url;
    }

    public boolean isUseAccessRequestDefault() {
        return UseAccessRequestDefault;
    }

    public void setUseAccessRequestDefault(boolean useAccessRequestDefault) {
        UseAccessRequestDefault = useAccessRequestDefault;
    }

    public SPWebsCollection getWebCollection() {
        return WebCollection;
    }

    public void setWebCollection(SPWebsCollection webCollection) {
        WebCollection = webCollection;
    }

    public String getWebTemplate() {
        return WebTemplate;
    }

    public void setWebTemplate(String webTemplate) {
        WebTemplate = webTemplate;
    }

    public boolean isHasUniqueRoleAssignments() {
        return HasUniqueRoleAssignments;
    }

    public void setHasUniqueRoleAssignments(boolean hasUniqueRoleAssignments) {
        HasUniqueRoleAssignments = hasUniqueRoleAssignments;
    }
}