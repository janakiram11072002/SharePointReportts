package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteList
{
    @JsonProperty("AllowContentTypes")
    private boolean AllowContentTypes;
    @JsonProperty("AllowDeletion")
    private boolean AllowDeletion;
    @JsonProperty("BaseTemplate")
    private int BaseTemplate;
    @JsonProperty("BaseType")
    private int BaseType;
    @JsonProperty("BrowserFileHandling")
    private boolean BrowserFileHandling;
    @JsonProperty("ContentTypesEnabled")
    private boolean ContentTypesEnabled;
    @JsonProperty("CrawlNonDefaultViews")
    private boolean CrawlNonDefaultViews;
    @JsonProperty("CreatablesInfo")
    private CreatablesInfo CreatablesInfo;
    @JsonProperty("Created")
    private String Created;
    @JsonProperty("DefaultContentApprovalWorkflowId")
    private String DefaultContentApprovalWorkflowId;
    @JsonProperty("DefaultDisplayFormUrl")
    private String DefaultDisplayFormUrl;
    @JsonProperty("DefaultEditFormUrl")
    private String DefaultEditFormUrl;
    @JsonProperty("DefaultNewFormUrl")
    private String DefaultNewFormUrl;
    @JsonProperty("DefaultViewUrl")
    private String DefaultViewUrl;
    @JsonProperty("Description")
    private String Description;
    @JsonProperty("Direction")
    private String Direction;
    @JsonProperty("DocumentTemplateUrl")
    private String DocumentTemplateUrl;
    @JsonProperty("DraftVersionVisibility")
    private int DraftVersionVisibility;
    @JsonProperty("EnableAssignToEmail")
    private boolean EnableAssignToEmail;
    @JsonProperty("EnableAttachments")
    private boolean EnableAttachments;
    @JsonProperty("EnableFolderCreation")
    private boolean EnableFolderCreation;
    @JsonProperty("EnableMinorVersions")
    private boolean EnableMinorVersions;
    @JsonProperty("EnableModeration")
    private boolean EnableModeration;
    @JsonProperty("EnableVersioning")
    private boolean EnableVersioning;
    @JsonProperty("EntityTypeName")
    private String EntityTypeName;
    @JsonProperty("ExcludeFromOfflineClient")
    private boolean ExcludeFromOfflineClient;
    @JsonProperty("ExemptFromBlockDownloadOfNonViewableFiles")
    private boolean ExemptFromBlockDownloadOfNonViewableFiles;
    @JsonProperty("FileSavePostProcessingEnabled")
    private boolean FileSavePostProcessingEnabled;
    @JsonProperty("ForceCheckout")
    private boolean ForceCheckout;
    @JsonProperty("HasExternalDataSource")
    private boolean HasExternalDataSource;
    @JsonProperty("Hidden")
    private boolean Hidden;
    @JsonProperty("Id")
    private String Id;
    @JsonProperty("ImageUrl")
    private String ImageUrl;
    @JsonProperty("IrmEnabled")
    private boolean IrmEnabled;
    @JsonProperty("IrmExpire")
    private boolean IrmExpire;
    @JsonProperty("IrmReject")
    private boolean IrmReject;
    @JsonProperty("IsApplicationList")
    private boolean IsApplicationList;
    @JsonProperty("IsCatalog")
    private boolean IsCatalog;
    @JsonProperty("IsPrivate")
    private boolean IsPrivate;
    @JsonProperty("IsSiteAssetsLibrary")
    private boolean IsSiteAssetsLibrary;
    @JsonProperty("IsSystemList")
    private boolean IsSystemList;
    @JsonProperty("ItemCount")
    private int ItemCount;
    @JsonProperty("LastItemDeletedDate")
    private String LastItemDeletedDate;
    @JsonProperty("LastItemModifiedDate")
    private String LastItemModifiedDate;
    @JsonProperty("LastItemUserModifiedDate")
    private String LastItemUserModifiedDate;
    @JsonProperty("ListExperienceOptions")
    private int ListExperienceOptions;
    @JsonProperty("ListItemEntityTypeFullName")
    private String ListItemEntityTypeFullName;
    @JsonProperty("MajorVersionLimit")
    private int MajorVersionLimit;
    @JsonProperty("MajorWithMinorVersionsLimit")
    private int MajorWithMinorVersionsLimit;
    @JsonProperty("MultipleDataList")
    private boolean MultipleDataList;
    @JsonProperty("NoCrawl")
    private boolean NoCrawl;
    @JsonProperty("OnQuickLaunch")
    private boolean OnQuickLaunch;
    @JsonProperty("ParentWebUrl")
    private String ParentWebUrl;
    @JsonProperty("ParserDisabled")
    private boolean ParserDisabled;
    @JsonProperty("ReadSecurity")
    private int ReadSecurity;
    @JsonProperty("ServerTemplateCanCreateFolders")
    private boolean ServerTemplateCanCreateFolders;
    @JsonProperty("TemplateFeatureId")
    private String TemplateFeatureId;
    @JsonProperty("Title")
    private String Title;
    @JsonProperty("ValidationFormula")
    private String ValidationFormula;
    @JsonProperty("ValidationMessage")
    private String ValidationMessage;
    @JsonProperty("WriteSecurity")
    private int WriteSecurity;
    @JsonProperty("HasUniqueRoleAssignments")
    private boolean HasUniqueRoleAssignments;

    public boolean isAllowContentTypes() {
        return AllowContentTypes;
    }

    public void setAllowContentTypes(boolean allowContentTypes) {
        AllowContentTypes = allowContentTypes;
    }

    public boolean isAllowDeletion() {
        return AllowDeletion;
    }

    public void setAllowDeletion(boolean allowDeletion) {
        AllowDeletion = allowDeletion;
    }

    public int getBaseTemplate() {
        return BaseTemplate;
    }

    public void setBaseTemplate(int baseTemplate) {
        BaseTemplate = baseTemplate;
    }

    public int getBaseType() {
        return BaseType;
    }

    public void setBaseType(int baseType) {
        BaseType = baseType;
    }

    public boolean isBrowserFileHandling() {
        return BrowserFileHandling;
    }

    public void setBrowserFileHandling(boolean browserFileHandling) {
        BrowserFileHandling = browserFileHandling;
    }

    public boolean isContentTypesEnabled() {
        return ContentTypesEnabled;
    }

    public void setContentTypesEnabled(boolean contentTypesEnabled) {
        ContentTypesEnabled = contentTypesEnabled;
    }

    public boolean isCrawlNonDefaultViews() {
        return CrawlNonDefaultViews;
    }

    public void setCrawlNonDefaultViews(boolean crawlNonDefaultViews) {
        CrawlNonDefaultViews = crawlNonDefaultViews;
    }

    public com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.CreatablesInfo getCreatablesInfo() {
        return CreatablesInfo;
    }

    public void setCreatablesInfo(com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.CreatablesInfo creatablesInfo) {
        CreatablesInfo = creatablesInfo;
    }

    public String getCreated() {
        return Created;
    }

    public void setCreated(String created) {
        Created = created;
    }

    public String getDefaultContentApprovalWorkflowId() {
        return DefaultContentApprovalWorkflowId;
    }

    public void setDefaultContentApprovalWorkflowId(String defaultContentApprovalWorkflowId) {
        DefaultContentApprovalWorkflowId = defaultContentApprovalWorkflowId;
    }

    public String getDefaultDisplayFormUrl() {
        return DefaultDisplayFormUrl;
    }

    public void setDefaultDisplayFormUrl(String defaultDisplayFormUrl) {
        DefaultDisplayFormUrl = defaultDisplayFormUrl;
    }

    public String getDefaultEditFormUrl() {
        return DefaultEditFormUrl;
    }

    public void setDefaultEditFormUrl(String defaultEditFormUrl) {
        DefaultEditFormUrl = defaultEditFormUrl;
    }

    public String getDefaultNewFormUrl() {
        return DefaultNewFormUrl;
    }

    public void setDefaultNewFormUrl(String defaultNewFormUrl) {
        DefaultNewFormUrl = defaultNewFormUrl;
    }

    public String getDefaultViewUrl() {
        return DefaultViewUrl;
    }

    public void setDefaultViewUrl(String defaultViewUrl) {
        DefaultViewUrl = defaultViewUrl;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getDirection() {
        return Direction;
    }

    public void setDirection(String direction) {
        Direction = direction;
    }

    public String getDocumentTemplateUrl() {
        return DocumentTemplateUrl;
    }

    public void setDocumentTemplateUrl(String documentTemplateUrl) {
        DocumentTemplateUrl = documentTemplateUrl;
    }

    public int getDraftVersionVisibility() {
        return DraftVersionVisibility;
    }

    public void setDraftVersionVisibility(int draftVersionVisibility) {
        DraftVersionVisibility = draftVersionVisibility;
    }

    public boolean isEnableAssignToEmail() {
        return EnableAssignToEmail;
    }

    public void setEnableAssignToEmail(boolean enableAssignToEmail) {
        EnableAssignToEmail = enableAssignToEmail;
    }

    public boolean isEnableAttachments() {
        return EnableAttachments;
    }

    public void setEnableAttachments(boolean enableAttachments) {
        EnableAttachments = enableAttachments;
    }

    public boolean isEnableFolderCreation() {
        return EnableFolderCreation;
    }

    public void setEnableFolderCreation(boolean enableFolderCreation) {
        EnableFolderCreation = enableFolderCreation;
    }

    public boolean isEnableMinorVersions() {
        return EnableMinorVersions;
    }

    public void setEnableMinorVersions(boolean enableMinorVersions) {
        EnableMinorVersions = enableMinorVersions;
    }

    public boolean isEnableModeration() {
        return EnableModeration;
    }

    public void setEnableModeration(boolean enableModeration) {
        EnableModeration = enableModeration;
    }

    public boolean isEnableVersioning() {
        return EnableVersioning;
    }

    public void setEnableVersioning(boolean enableVersioning) {
        EnableVersioning = enableVersioning;
    }

    public String getEntityTypeName() {
        return EntityTypeName;
    }

    public void setEntityTypeName(String entityTypeName) {
        EntityTypeName = entityTypeName;
    }

    public boolean isExcludeFromOfflineClient() {
        return ExcludeFromOfflineClient;
    }

    public void setExcludeFromOfflineClient(boolean excludeFromOfflineClient) {
        ExcludeFromOfflineClient = excludeFromOfflineClient;
    }

    public boolean isExemptFromBlockDownloadOfNonViewableFiles() {
        return ExemptFromBlockDownloadOfNonViewableFiles;
    }

    public void setExemptFromBlockDownloadOfNonViewableFiles(boolean exemptFromBlockDownloadOfNonViewableFiles) {
        ExemptFromBlockDownloadOfNonViewableFiles = exemptFromBlockDownloadOfNonViewableFiles;
    }

    public boolean isFileSavePostProcessingEnabled() {
        return FileSavePostProcessingEnabled;
    }

    public void setFileSavePostProcessingEnabled(boolean fileSavePostProcessingEnabled) {
        FileSavePostProcessingEnabled = fileSavePostProcessingEnabled;
    }

    public boolean isForceCheckout() {
        return ForceCheckout;
    }

    public void setForceCheckout(boolean forceCheckout) {
        ForceCheckout = forceCheckout;
    }

    public boolean isHasExternalDataSource() {
        return HasExternalDataSource;
    }

    public void setHasExternalDataSource(boolean hasExternalDataSource) {
        HasExternalDataSource = hasExternalDataSource;
    }

    public boolean isHidden() {
        return Hidden;
    }

    public void setHidden(boolean hidden) {
        Hidden = hidden;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getImageUrl() {
        return ImageUrl;
    }

    public void setImageUrl(String imageUrl) {
        ImageUrl = imageUrl;
    }

    public boolean isIrmEnabled() {
        return IrmEnabled;
    }

    public void setIrmEnabled(boolean irmEnabled) {
        IrmEnabled = irmEnabled;
    }

    public boolean isIrmExpire() {
        return IrmExpire;
    }

    public void setIrmExpire(boolean irmExpire) {
        IrmExpire = irmExpire;
    }

    public boolean isIrmReject() {
        return IrmReject;
    }

    public void setIrmReject(boolean irmReject) {
        IrmReject = irmReject;
    }

    public boolean isApplicationList() {
        return IsApplicationList;
    }

    public void setApplicationList(boolean applicationList) {
        IsApplicationList = applicationList;
    }

    public boolean isCatalog() {
        return IsCatalog;
    }

    public void setCatalog(boolean catalog) {
        IsCatalog = catalog;
    }

    public boolean isPrivate() {
        return IsPrivate;
    }

    public void setPrivate(boolean aPrivate) {
        IsPrivate = aPrivate;
    }

    public boolean isSiteAssetsLibrary() {
        return IsSiteAssetsLibrary;
    }

    public void setSiteAssetsLibrary(boolean siteAssetsLibrary) {
        IsSiteAssetsLibrary = siteAssetsLibrary;
    }

    public boolean isSystemList() {
        return IsSystemList;
    }

    public void setSystemList(boolean systemList) {
        IsSystemList = systemList;
    }

    public int getItemCount() {
        return ItemCount;
    }

    public void setItemCount(int itemCount) {
        ItemCount = itemCount;
    }

    public String getLastItemDeletedDate() {
        return LastItemDeletedDate;
    }

    public void setLastItemDeletedDate(String lastItemDeletedDate) {
        LastItemDeletedDate = lastItemDeletedDate;
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

    public int getListExperienceOptions() {
        return ListExperienceOptions;
    }

    public void setListExperienceOptions(int listExperienceOptions) {
        ListExperienceOptions = listExperienceOptions;
    }

    public String getListItemEntityTypeFullName() {
        return ListItemEntityTypeFullName;
    }

    public void setListItemEntityTypeFullName(String listItemEntityTypeFullName) {
        ListItemEntityTypeFullName = listItemEntityTypeFullName;
    }

    public int getMajorVersionLimit() {
        return MajorVersionLimit;
    }

    public void setMajorVersionLimit(int majorVersionLimit) {
        MajorVersionLimit = majorVersionLimit;
    }

    public int getMajorWithMinorVersionsLimit() {
        return MajorWithMinorVersionsLimit;
    }

    public void setMajorWithMinorVersionsLimit(int majorWithMinorVersionsLimit) {
        MajorWithMinorVersionsLimit = majorWithMinorVersionsLimit;
    }

    public boolean isMultipleDataList() {
        return MultipleDataList;
    }

    public void setMultipleDataList(boolean multipleDataList) {
        MultipleDataList = multipleDataList;
    }

    public boolean isNoCrawl() {
        return NoCrawl;
    }

    public void setNoCrawl(boolean noCrawl) {
        NoCrawl = noCrawl;
    }

    public boolean isOnQuickLaunch() {
        return OnQuickLaunch;
    }

    public void setOnQuickLaunch(boolean onQuickLaunch) {
        OnQuickLaunch = onQuickLaunch;
    }

    public String getParentWebUrl() {
        return ParentWebUrl;
    }

    public void setParentWebUrl(String parentWebUrl) {
        ParentWebUrl = parentWebUrl;
    }

    public boolean isParserDisabled() {
        return ParserDisabled;
    }

    public void setParserDisabled(boolean parserDisabled) {
        ParserDisabled = parserDisabled;
    }

    public int getReadSecurity() {
        return ReadSecurity;
    }

    public void setReadSecurity(int readSecurity) {
        ReadSecurity = readSecurity;
    }

    public boolean isServerTemplateCanCreateFolders() {
        return ServerTemplateCanCreateFolders;
    }

    public void setServerTemplateCanCreateFolders(boolean serverTemplateCanCreateFolders) {
        ServerTemplateCanCreateFolders = serverTemplateCanCreateFolders;
    }

    public String getTemplateFeatureId() {
        return TemplateFeatureId;
    }

    public void setTemplateFeatureId(String templateFeatureId) {
        TemplateFeatureId = templateFeatureId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getValidationFormula() {
        return ValidationFormula;
    }

    public void setValidationFormula(String validationFormula) {
        ValidationFormula = validationFormula;
    }

    public String getValidationMessage() {
        return ValidationMessage;
    }

    public void setValidationMessage(String validationMessage) {
        ValidationMessage = validationMessage;
    }

    public int getWriteSecurity() {
        return WriteSecurity;
    }

    public void setWriteSecurity(int writeSecurity) {
        WriteSecurity = writeSecurity;
    }

    public boolean isHasUniqueRoleAssignments() {
        return HasUniqueRoleAssignments;
    }

    public void setHasUniqueRoleAssignments(boolean hasUniqueRoleAssignments) {
        HasUniqueRoleAssignments = hasUniqueRoleAssignments;
    }
}
