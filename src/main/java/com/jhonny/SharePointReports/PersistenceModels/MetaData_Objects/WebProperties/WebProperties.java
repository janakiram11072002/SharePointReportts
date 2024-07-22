package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

@JsonIgnoreProperties(ignoreUnknown = true)
public class WebProperties
{
    @JsonProperty("AllowRssFeeds")
    private boolean AllowRssFeeds;
    @JsonProperty("AlternateCssUrl")
    private String AlternateCssUrl;
    @JsonProperty("AppInstanceId")
    private String AppInstanceId;
    @JsonProperty("ClassicWelcomePage")
    private String ClassicWelcomePage;
    @JsonProperty("Configuration")
    private int Configuration;
    @JsonProperty("Created")
    private Date Created;
    @JsonProperty("CustomMasterUrl")
    private String CustomMasterUrl;
    @JsonProperty("Description")
    private String Description;
    @JsonProperty("DesignPackageId")
    private String DesignPackageId;
    @JsonProperty("DocumentLibraryCalloutOfficeWebAppPreviewersDisabled")
    private boolean DocumentLibraryCalloutOfficeWebAppPreviewersDisabled;
    @JsonProperty("EnableMinimalDownload")
    private boolean EnableMinimalDownload;
    @JsonProperty("FooterEmphasis")
    private int FooterEmphasis;
    @JsonProperty("FooterEnabled")
    private boolean FooterEnabled;
    @JsonProperty("FooterLayout")
    private int FooterLayout;
    @JsonProperty("HeaderEmphasis")
    private int HeaderEmphasis;
    @JsonProperty("HeaderLayout")
    private int HeaderLayout;
    @JsonProperty("HideTitleInHeader")
    private boolean HideTitleInHeader;
    @JsonProperty("HorizontalQuickLaunch")
    private boolean HorizontalQuickLaunch;
    @JsonProperty("Id")
    private String Id;
    @JsonProperty("IsEduClass")
    private boolean  IsEduClass;
    @JsonProperty("IsEduClassProvisionChecked")
    private boolean  IsEduClassProvisionChecked;
    @JsonProperty("IsEduClassProvisionPending")
    private boolean  IsEduClassProvisionPending;
    @JsonProperty("IsHomepageModernized")
    private boolean  IsHomepageModernized;
    @JsonProperty("IsMultilingual")
    private boolean  IsMultilingual;
    @JsonProperty("IsRevertHomepageLinkHidden")
    private boolean  IsRevertHomepageLinkHidden;
    @JsonProperty("Language")
    private int Language;
    @JsonProperty("LastItemModifiedDate")
    private Date LastItemModifiedDate;
    @JsonProperty("LastItemUserModifiedDate")
    private Date LastItemUserModifiedDate;
    @JsonProperty("LogoAlignment")
    private int LogoAlignment;
    @JsonProperty("MasterUrl")
    private String MasterUrl;
    @JsonProperty("MegaMenuEnabled")
    private boolean MegaMenuEnabled;
    @JsonProperty("NavAudienceTargetingEnabled")
    private boolean NavAudienceTargetingEnabled;
    @JsonProperty("NoCrawl")
    private boolean NoCrawl;
    @JsonProperty("ObjectCacheEnabled")
    private boolean ObjectCacheEnabled;
    @JsonProperty("OverwriteTranslationsOnChange")
    private boolean OverwriteTranslationsOnChange;
    @JsonProperty("QuickLaunchEnabled")
    private boolean QuickLaunchEnabled;
    @JsonProperty("RecycleBinEnabled")
    private boolean RecycleBinEnabled;
    @JsonProperty("SearchScope")
    private int SearchScope;
    @JsonProperty("ServerRelativeUrl")
    private String ServerRelativeUrl;
    @JsonProperty("SiteLogoUrl")
    private String SiteLogoUrl;
    @JsonProperty("SyndicationEnabled")
    private boolean SyndicationEnabled;
    @JsonProperty("TenantAdminMembersCanShare")
    private int TenantAdminMembersCanShare;
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
    @JsonProperty("WebTemplate")
    private String WebTemplate;
    @JsonProperty("WelcomePage")
    private String WelcomePage;

}

/*
    {
        "AllowRssFeeds": true,
        "AlternateCssUrl": "",
        "AppInstanceId": "00000000-0000-0000-0000-000000000000",
        "ClassicWelcomePage": null,
        "Configuration": 0,
        "Created": "2023-11-25T12:25:04.757",
        "CurrentChangeToken": {
            "StringValue": "1;2;2ff69ca1-2187-472d-9315-708235bb9c15;638571409112970000;385943427"
        },
        "CustomMasterUrl": "/sites/1gate/_catalogs/masterpage/seattle.master",
        "Description": "for testing permission matrix in SharegateProduct.",
        "DesignPackageId": "00000000-0000-0000-0000-000000000000",
        "DocumentLibraryCalloutOfficeWebAppPreviewersDisabled": false,
        "EnableMinimalDownload": false,
        "FooterEmphasis": 0,
        "FooterEnabled": false,
        "FooterLayout": 0,
        "HeaderEmphasis": 0,
        "HeaderLayout": 2,
        "HideTitleInHeader": false,
        "HorizontalQuickLaunch": false,
        "Id": "2ff69ca1-2187-472d-9315-708235bb9c15",
        "IsEduClass": false,
        "IsEduClassProvisionChecked": false,
        "IsEduClassProvisionPending": false,
        "IsHomepageModernized": false,
        "IsMultilingual": true,
        "IsRevertHomepageLinkHidden": false,
        "Language": 1033,
        "LastItemModifiedDate": "2024-07-16T13:57:10Z",
        "LastItemUserModifiedDate": "2024-05-16T10:53:14Z",
        "LogoAlignment": 0,
        "MasterUrl": "/sites/1gate/_catalogs/masterpage/seattle.master",
        "MegaMenuEnabled": false,
        "NavAudienceTargetingEnabled": false,
        "NoCrawl": false,
        "ObjectCacheEnabled": false,
        "OverwriteTranslationsOnChange": false,
        "ResourcePath": {
            "DecodedUrl": "https://42jghx.sharepoint.com/sites/1gate"
        },
        "QuickLaunchEnabled": true,
        "RecycleBinEnabled": true,
        "SearchScope": 0,
        "ServerRelativeUrl": "/sites/1gate",
        "SiteLogoUrl": "/sites/1gate/_api/GroupService/GetGroupImage?id='91a5d335-8d68-4633-a13f-3029deb30240'&hash=638379705452068262",
        "SyndicationEnabled": true,
        "TenantAdminMembersCanShare": 0,
        "Title": "1gate",
        "TreeViewEnabled": false,
        "UIVersion": 15,
        "UIVersionConfigurationEnabled": false,
        "Url": "https://42jghx.sharepoint.com/sites/1gate",
        "WebTemplate": "GROUP",
        "WelcomePage": "SitePages/CollabHome.aspx"
    }
*/