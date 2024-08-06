package com.jhonny.SharePointReports.PersistenceModels;

import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.SiteList;

import java.util.Date;

public class List
{
    public String siteId;
    public String webId;
    public String id;
    public boolean allowContentTypes;
    public boolean allowDeletion;
    public int baseTemplate;
    public int baseType;
    public int browserFileHandling;
    public boolean contentTypesEnabled;
    public boolean crawlNonDefaultViews;
    public Date created;
    public String defaultContentApprovalWorkflowId;
    public String defaultDisplayFormUrl;
    public String defaultEditFormUrl;
    public String defaultNewFormUrl;
    public String defaultViewUrl;
    public String description;
    public String direction;
    public String documentTemplateUrl;
    public int draftVersionVisibility;
    public boolean enableAssignToEmail;
    public boolean enableAttachments;
    public boolean enableFolderCreation;
    public boolean enableMinorVersions;
    public boolean enableModeration;
    public boolean enableVersioning;
    public String entityTypeName;
    public boolean excludeFromOfflineClient;
    public boolean exemptFromBlockDownloadOfNonViewableFiles;
    public boolean fileSavePostProcessingEnabled;
    public boolean forceCheckout;
    public boolean hasExternalDataSource;
    public boolean hidden;
    public String imageUrl;
    public boolean irmEnabled;
    public boolean irmExpire;
    public boolean irmReject;
    public boolean isApplicationList;
    public boolean isCatalog;
    public boolean ispublic;
    public boolean isSiteAssetsLibrary;
    public boolean isSystemList;
    public int itemCount;
    public Date lastItemDeletedDate;
    public Date lastItemModifiedDate;
    public Date lastItemUserModifiedDate;
    public int listExperienceOptions;
    public String listItemEntityTypeFullName;
    public int majorVersionLimit;
    public int majorWithMinorVersionsLimit;
    public boolean multipleDataList;
    public boolean noCrawl;
    public boolean onQuickLaunch;
    public String parentWebUrl;
    public boolean parserDisabled;
    public int readSecurity;
    public boolean serverTemplateCanCreateFolders;
    public String templateFeatureId;
    public String title;
    public String validationFormula;
    public String validationMessage;
    public int writeSecurity;
    public boolean hasUniqueRoleAssignments;
    public String webUrl;
    public String webTitle;
    public String siteUrl;
    public int inactiveDays;
    public String siteTitle;

    public List(String siteId, String webId, SiteList source)
    {

    }

}
