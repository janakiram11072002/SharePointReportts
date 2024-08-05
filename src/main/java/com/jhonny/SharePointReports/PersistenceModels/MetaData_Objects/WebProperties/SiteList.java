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

}
