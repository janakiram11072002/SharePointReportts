package com.jhonny.SharePointReports.PersistenceModels;

import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.SiteList;
import com.jhonny.SharePointReports.Utils.CustomUtils;

import java.util.Date;
import java.util.concurrent.TimeUnit;

public class List
{
//    public String siteId;
//    public String webId;
//    public String id;
    public ListKey key;
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

    public List()
    {

    }

    public List(Web webSource, SiteList source)
    {
//        this.siteId = webSource.siteId;
//        this.webId = webSource.id;
//        this.id = webSource.id;
        this.key = new ListKey(webSource.key.siteId, webSource.key.id, webSource.key.id);

        this.webUrl = webSource.url;

        this.webTitle = webSource.title;
        this.siteUrl = webSource.siteUrl;
        this.siteTitle = webSource.siteTitle;

        this.allowContentTypes = source.isAllowContentTypes();
        this.allowDeletion = source.isAllowDeletion();
        this.baseTemplate = source.getBaseTemplate();
        this.baseType = source.getBaseType();
        this.browserFileHandling = source.getBaseTemplate();
        this.contentTypesEnabled = source.isContentTypesEnabled();
        this.crawlNonDefaultViews = source.isCrawlNonDefaultViews();
        this.defaultContentApprovalWorkflowId = source.getDefaultContentApprovalWorkflowId();
        this.defaultDisplayFormUrl = source.getDefaultDisplayFormUrl();
        this.defaultEditFormUrl = source.getDefaultEditFormUrl();
        this.defaultNewFormUrl = source.getDefaultNewFormUrl();
        this.defaultViewUrl = source.getDefaultViewUrl();
        this.description = source.getDescription();
        this.direction = source.getDirection();
        this.documentTemplateUrl = source.getDocumentTemplateUrl();
        this.draftVersionVisibility = source.getDraftVersionVisibility();
        this.enableAssignToEmail = source.isEnableAssignToEmail();
        this.enableAttachments = source.isEnableAttachments();
        this.enableFolderCreation = source.isEnableFolderCreation();
        this.enableMinorVersions = source.isEnableMinorVersions();
        this.enableModeration = source.isEnableModeration();
        this.enableVersioning = source.isEnableVersioning();
        this.entityTypeName = source.getEntityTypeName();
        this.excludeFromOfflineClient = source.isExcludeFromOfflineClient();
        this.exemptFromBlockDownloadOfNonViewableFiles = source.isExemptFromBlockDownloadOfNonViewableFiles();
        this.fileSavePostProcessingEnabled = source.isFileSavePostProcessingEnabled();
        this.forceCheckout = source.isForceCheckout();
        this.hasExternalDataSource = source.isHasExternalDataSource();
        this.hidden = source.isHidden();
        this.imageUrl = source.getImageUrl();
        this.irmEnabled = source.isIrmEnabled();
        this.irmExpire = source.isIrmExpire();
        this.irmReject = source.isIrmReject();
        this.isApplicationList = source.isApplicationList();
        this.isCatalog = source.isCatalog();
        this.ispublic = !source.isPrivate();
        this.isSiteAssetsLibrary = source.isSiteAssetsLibrary();
        this.isSystemList = source.isSystemList();
        this.itemCount = source.getItemCount();
        this.listExperienceOptions = source.getListExperienceOptions();
        this.listItemEntityTypeFullName = source.getListItemEntityTypeFullName();
        this.majorVersionLimit = source.getMajorVersionLimit();
        this.majorWithMinorVersionsLimit = source.getMajorWithMinorVersionsLimit();
        this.multipleDataList = source.isMultipleDataList();
        this.noCrawl = source.isNoCrawl();
        this.onQuickLaunch = source.isOnQuickLaunch();
        this.parentWebUrl = source.getParentWebUrl();
        this.parserDisabled = source.isParserDisabled();
        this.readSecurity = source.getReadSecurity();
        this.serverTemplateCanCreateFolders = source.isServerTemplateCanCreateFolders();
        this.templateFeatureId = source.getTemplateFeatureId();
        this.title = source.getTitle();
        this.validationFormula = source.getValidationFormula();
        this.validationMessage = source.getValidationMessage();
        this.writeSecurity = source.getWriteSecurity();
        this.hasUniqueRoleAssignments = source.isHasUniqueRoleAssignments();

        //Date
        this.created = CustomUtils.toDateFromInt(source.getCreated());
        this.lastItemDeletedDate = CustomUtils.toDateFromInt(source.getLastItemDeletedDate());
        this.lastItemModifiedDate = CustomUtils.toDateFromInt(source.getLastItemModifiedDate());
        this.lastItemUserModifiedDate = CustomUtils.toDateFromInt(source.getLastItemUserModifiedDate());
        this.inactiveDays = (int) TimeUnit.MILLISECONDS.toDays(new Date().getTime() - this.lastItemUserModifiedDate.getTime());
    }

}
