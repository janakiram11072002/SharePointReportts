package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class UserInfoList
{
    @JsonProperty("AllowContentTypes")
    private boolean AllowContentTypes;
    @JsonProperty("BaseTemplate")
    private int BaseTemplate;
    @JsonProperty("BaseType")
    private int BaseType;
    @JsonProperty("ContentTypesEnabled")
    private boolean ContentTypesEnabled;
    @JsonProperty("CrawlNonDefaultViews")
    private boolean CrawlNonDefaultViews;
    @JsonProperty("Created")
    private String Created;
    @JsonProperty("DefaultContentApprovalWorkflowId")
    private String DefaultContentApprovalWorkflowId;
    @JsonProperty("DefaultItemOpenUseListSetting")
    private boolean DefaultItemOpenUseListSetting;
    @JsonProperty("Description")
    private String Description;
    @JsonProperty("Direction")
    private String Direction;
    @JsonProperty("DisableCommenting")
    private boolean DisableCommenting;
    @JsonProperty("DisableGridEditing")
    private boolean DisableGridEditing;
    @JsonProperty("DocumentTemplateUrl")
    private boolean DocumentTemplateUrl;
    @JsonProperty("DraftVersionVisibility")
    private boolean DraftVersionVisibility;
    @JsonProperty("EnableAttachments")
    private boolean EnableAttachments;
    @JsonProperty("EnableFolderCreation")
    private boolean EnableFolderCreation;
    @JsonProperty("EnableMinorVersions")
    private boolean EnableMinorVersions;
    @JsonProperty("EnableModeration")
    private boolean EnableModeration;
    @JsonProperty("EnableRequestSignOff")
    private boolean EnableRequestSignOff;
    @JsonProperty("EnableVersioning")
    private boolean EnableVersioning;
    @JsonProperty("EntityTypeName")
    private String EntityTypeName;
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
    @JsonProperty("DefaultSensitivityLabelForLibrary")
    private String DefaultSensitivityLabelForLibrary;
    @JsonProperty("SensitivityLabelToEncryptOnDownloadForLibrary")
    private boolean SensitivityLabelToEncryptOnDownloadForLibrary;
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
    @JsonProperty("ItemCount")
    private boolean ItemCount;
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
    @JsonProperty("ParentWebUrl")
    private String ParentWebUrl;
    @JsonProperty("ParserDisabled")
    private boolean ParserDisabled;
    @JsonProperty("ServerTemplateCanCreateFolders")
    private boolean ServerTemplateCanCreateFolders;
    @JsonProperty("TemplateFeatureId")
    private String TemplateFeatureId;
    @JsonProperty("Title")
    private String Title;

}
