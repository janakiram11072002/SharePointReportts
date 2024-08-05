package com.jhonny.SharePointReports.Utils;

public class enums 
{
    public static enum SiteType
    {
        SharePoint,
        OneDrive;
    }
}

/*

public enum AuditMaskType
  {
    All = -1, // 0xFFFFFFFF
    None = 0,
    CheckOut = 1,
    CheckIn = 2,
    View = 4,
    ObjectDelete = 8,
    Update = 16, // 0x00000010
    ProfileChange = 32, // 0x00000020
    ChildDelete = 64, // 0x00000040
    SchemaChange = 128, // 0x00000080
    SecurityChange = 256, // 0x00000100
    Undelete = 512, // 0x00000200
    Workflow = 1024, // 0x00000400
    Copy = 2048, // 0x00000800
    Move = 4096, // 0x00001000
    Search = 8192, // 0x00002000
  }
  public enum UpgradeStatus
  {
    None,
    InProgress,
    Failed,
    Completed,
  }
  public enum UpgradeType
  {
    BuildUpgrade,
    VersionUpgrade,
  }
  public enum SandboxedCodeActivationCapabilities
  {
    Check = 1,
    Disabled = 2,
    Enabled = 3,
  }
  public enum PrincipalType
    {
        None = 0,
        User = 1,
        DistributionList = 2,
        SecurityGroup = 4,
        SharePointGroup = 8,
        All = 15,
        ReservedForFutureUse = 16
    }
    public enum PWAEnabledStatus
  {
    Unknown,
    Disabled,
    Enabled,
  }
  public enum SharingCapabilities
  {
    Disabled,
    ExternalUserSharingOnly,
    ExternalUserAndGuestSharing,
    ExistingExternalUserSharingOnly,
  }
  public enum SharingDomainRestrictionModes
  {
    None,
    AllowList,
    BlockList,
  }
  public enum SharingLinkType
  {
    None,
    Direct,
    Internal,
    AnonymousAccess,
  }
  public enum SharingPermissionType
  {
    None,
    View,
    Edit,
  }

  public enum ListExperience
{
    Auto,
    NewExperience,
    ClassicExperience
}
public enum BaseType
{
    None = -1,
    GenericList,
    DocumentLibrary,
    Unused,
    DiscussionBoard,
    Survey,
    Issue
}
public enum BrowserFileHandling
{
    Permissive,
    Strict
}
public enum DraftVisibilityType
{
    Reader,
    Author,
    Approver
}
public enum spoSiteType
{
    SharepointSite = 1,
    OneDriveSite = 2
}

public string webtemplate
{
    "GLOBAL#0": "Global template",
    "STS#0": "Team site",
    "STS#1": "Blank Site",
    "STS#2": "Document Workspace",
    "STS#3": "Team site (no Microsoft 365 group)",
    "MPS#0": "Basic Meeting Workspace",
    "MPS#1": "Blank Meeting Workspace",
    "MPS#2": "Decision Meeting Workspace",
    "MPS#3": "Social Meeting Workspace",
    "MPS#4": "Multipage Meeting Workspace",
    "CENTRALADMIN#0": "Central Admin Site",
    "WIKI#0": "Wiki Site",
    "BLOG#0": "Blog",
    "SGS#0": "Group Work Site",
    "TENANTADMIN#0": "Tenant Admin Site",
    "APP#0": "App Template",
    "APPCATALOG#0": "App Catalog Site",
    "ACCSRV#0": "Access Services Site",
    "ACCSVC#0": "Access Services Site Internal",
    "ACCSVC#1": "Access Services Site",
    "BDR#0": "Document Center",
    "TBH#0": "In-Place Hold Policy Center",
    "DEV#0": "Developer Site",
    "EDISC#0": "eDiscovery Center",
    "EDISC#1": "eDiscovery Case",
    "EXPRESS#0": "Express Team Site",
    "FunSite#0": "SharePoint Online Tenant Fundamental Site",
    "OFFILE#0": "Records Center",
    "OFFILE#1": "Records Center",
    "EHS#0": "Express Hosted Site",
    "EHS#2": "Public Publishing Portal",
    "EHS#1": "Team Site   SharePoint Online configuration",
    "OSRV#0": "Shared Services Administration Site",
    "PPSMASite#0": "PerformancePoint",
    "BICenterSite#0": "Business Intelligence Center",
    "PWA#0": "Project Web App Site",
    "PWS#0": "Microsoft Project Site",
    "REVIEWCTR#0": "Review Center",
    "RedirectSite#0": "Redirect Site",
    "POLICYCTR#0": "Compliance Policy Center",
    "SPS#0": "SharePoint Portal Server Site",
    "SPSPERS#0": "SharePoint Portal Server Personal Space",
    "SPSMSITE#0": "Personalization Site",
    "SPSTOC#0": "Contents area Template",
    "SPSTOPIC#0": "Topic area template",
    "SPSNEWS#0": "News Site",
    "CMSPUBLISHING#0": "Publishing Site",
    "BLANKINTERNET#0": "Publishing Site",
    "BLANKINTERNET#1": "Press Releases Site",
    "BLANKINTERNET#2": "Publishing Site with Workflow",
    "SPSNHOME#0": "News Site",
    "SPSSITES#0": "Site Directory",
    "SPSCOMMU#0": "Community area template",
    "SPSREPORTCENTER#0": "Report Center",
    "SPSPORTAL#0": "Collaboration Portal",
    "SRCHCEN#0": "Search Center with Tabs",
    "PROFILES#0": "Profiles",
    "BLANKINTERNETCONTAINER#0": "Publishing Portal",
    "SPSMSITEHOST#0": "My Site Host",
    "SRCHCENTERLITE#0": "Search Center",
    "SRCHCENTERLITE#1": "Search Center",
    "SPSBWEB#0": "SharePoint Portal Server Bucket Web Template",
    "ENTERWIKI#0": "Enterprise Wiki",
    "PROJECTSITE#0": "Project Site",
    "PRODUCTCATALOG#0": "Product Catalog",
    "COMMUNITY#0": "Community Site",
    "COMMUNITYPORTAL#0": "Community Portal",
    "GROUP#0": "Team Site (with O365 group)",
    "POINTPUBLISHINGHUB#0": "PointPublishing Hub",
    "POINTPUBLISHINGPERSONAL#0": "Personal blog",
    "POINTPUBLISHINGPERSONAL#1": "Personal blog",
    "POINTPUBLISHINGTOPIC#0": "PointPublishing Topic",
    "SITEPAGEPUBLISHING#0": "Communication site",
    "TenantAdminSpo#0": "SharePoint Online TenantAdmin",
    "visprus#0": "Visio Process Repository",
    "SAPWorkflowSite#0": "SAP Workflow Site",
    "TEAMCHANNEL#0": "Team channel",
    "TEAMCHANNEL#1": "Team channel"

  }

 public string lcid {
    "0": "No specified",
    "1024": "No proofing",
    "10241": "Arabic Syria",
    "10249": "English Belize",
    "1025": "Arabic",
    "10250": "Spanish Peru",
    "10252": "French Senegal",
    "1026": "Bulgarian",
    "1027": "Catalan",
    "1028": "Traditional Chinese",
    "1029": "Czech",
    "1030": "Danish",
    "1031": "German",
    "1032": "Greek",
    "1033": "English US",
    "1034": "Spanish",
    "1035": "Finnish",
    "1036": "French",
    "1037": "Hebrew",
    "1038": "Hungarian",
    "1039": "Icelandic",
    "1040": "Italian",
    "1041": "Japanese",
    "1042": "Korean",
    "1043": "Dutch",
    "1044": "Norwegian Bokmol",
    "1045": "Polish",
    "1046": "Portuguese (Brazil)",
    "1047": "Rhaeto Romanic",
    "1048": "Romanian",
    "1049": "Russian",
    "1050": "Croatian",
    "1051": "Slovak",
    "1052": "Albanian",
    "1053": "Swedish",
    "1054": "Thai",
    "1055": "Turkish",
    "1056": "Urdu",
    "1057": "Indonesian",
    "1058": "Ukrainian",
    "1059": "Belarusian",
    "1060": "Slovenian",
    "1061": "Estonian",
    "1062": "Latvian",
    "1063": "Lithuanian",
    "1064": "Tajik",
    "1065": "Farsi",
    "1066": "Vietnamese",
    "1067": "Armenian",
    "1068": "Azerbaijani Latin",
    "1069": "Basque (Basque)",
    "1070": "Sorbian",
    "1071": "Macedonian FYROM",
    "1072": "Sesotho/Sutu",
    "1073": "Tsonga",
    "1074": "Tswana",
    "1075": "Venda",
    "1076": "Xhosa",
    "1077": "Zulu",
    "1078": "Afrikaans",
    "1079": "Georgian",
    "1080": "Faeroese",
    "1081": "Hindi",
    "1082": "Maltese",
    "1083": "Sami Lappish",
    "1084": "Scottish Gaelic",
    "1085": "Yiddish",
    "1086": "Malaysian",
    "1087": "Kazakh",
    "1088": "Kirghiz/Kyrgyz",
    "1089": "Swahili",
    "1090": "Turkmen",
    "1091": "Uzbek Latin",
    "1092": "Tatar",
    "1093": "Bengali",
    "1094": "Punjabi",
    "1095": "Gujarati",
    "1096": "Odia",
    "1097": "Tamil",
    "1098": "Telugu",
    "1099": "Kannada",
    "1100": "Malayalam",
    "1101": "Assamese",
    "1102": "Marathi",
    "1103": "Sanskrit",
    "1104": "Mongolian",
    "1105": "Tibetan",
    "1106": "Welsh",
    "1107": "Khmer",
    "1108": "Lao",
    "1109": "Burmese",
    "1110": "Galician",
    "1111": "Konkani",
    "1112": "Manipuri",
    "1113": "Sindhi",
    "1114": "Syriac",
    "1115": "Sinhalese",
    "1116": "Cherokee",
    "1117": "Inuktitut",
    "1118": "Amharic",
    "1119": "Tamazight",
    "1120": "Kashmiri",
    "1121": "Nepali",
    "1122": "Frisian Netherlands",
    "1123": "Pashto",
    "1124": "Filipino",
    "1125": "Divehi",
    "1126": "Edo",
    "11265": "Arabic Jordan",
    "1127": "Fulfulde",
    "11273": "English Trinidad Tobago",
    "11274": "Spanish Argentina",
    "11276": "French Cameroon",
    "1128": "Hausa",
    "1129": "Ibibio",
    "1130": "Yoruba",
    "1131": "Quechua Bolivia",
    "1132": "Sepedi",
    "1136": "Igbo",
    "1137": "Kanuri",
    "1138": "Oromo",
    "1139": "Tigrigna Ethiopic",
    "1140": "Guarani",
    "1141": "Hawaiian",
    "1142": "Latin",
    "1143": "Somali",
    "1144": "Yi",
    "1153": "Maori",
    "12289": "Arabic Lebanon",
    "12297": "English Zimbabwe",
    "12298": "Spanish Ecuador",
    "12300": "French Coted Ivoire",
    "13313": "Arabic Kuwait",
    "13321": "English Philippines",
    "13322": "Spanish Chile",
    "13324": "French Mali",
    "14337": "Arabic UAE",
    "14345": "English Indonesia",
    "14346": "Spanish Uruguay",
    "14348": "French Morocco",
    "15361": "Arabic Bahrain",
    "15370": "Spanish Paraguay",
    "15372": "French Haiti",
    "16385": "Arabic Qatar",
    "16394": "Spanish Bolivia",
    "17418": "Spanish El Salvador",
    "18442": "Spanish Honduras",
    "19466": "Spanish Nicaragua",
    "-2": "Mixed",
    "2049": "Arabic Iraq",
    "20490": "Spanish Puerto Rico",
    "2052": "Simplified Chinese",
    "2055": "Swiss German",
    "2057": "English UK",
    "2058": "Mexican Spanish",
    "2060": "Belgian French",
    "2064": "Swiss Italian",
    "2067": "Belgian Dutch",
    "2068": "Norwegian Nynorsk",
    "2070": "Portuguese",
    "2072": "Romanian Moldova",
    "2073": "Russian Moldova",
    "2074": "Serbian Latin",
    "2077": "Swedish Finland",
    "2092": "Azerbaijani Cyrillic",
    "2108": "Irish (Ireland)",
    "2110": "Malay Brunei Darussalam",
    "2115": "Uzbek Cyrillic",
    "2137": "Sindhi Pakistan",
    "2143": "Tamazight Latin",
    "2144": "Kashmiri Devanagari",
    "2155": "Quechua Ecuador",
    "2163": "Tigrigna Eritrea",
    "3073": "Arabic Egypt",
    "3076": "Chinese Hong Kong SAR",
    "3079": "German Austria",
    "3081": "English AUS",
    "3082": "Spanish Modern Sort",
    "3084": "French Canadian",
    "3098": "Serbian Cyrillic",
    "3179": "Quechua Peru",
    "4097": "Arabic Libya",
    "4100": "Chinese Singapore",
    "4103": "German Luxembourg",
    "4105": "English Canadian",
    "4106": "Spanish Guatemala",
    "4108": "Swiss French",
    "4122": "Bosnian",
    "5121": "Arabic Algeria",
    "5124": "Chinese Macao SAR",
    "5127": "German Liechtenstein",
    "5129": "English NewZealand",
    "5130": "Spanish Costa Rica",
    "5132": "French Luxembourg",
    "5146": "Bosnian Bosnia Herzegovina Latin",
    "6145": "Arabic Morocco",
    "6153": "English Ireland",
    "6154": "Spanish Panama",
    "6156": "French Monaco",
    "6170": "Serbian Bosnia Herzegovina Latin",
    "7169": "Arabic Tunisia",
    "7177": "English South Africa",
    "7178": "Spanish Dominican Republic",
    "7180": "French West Indies",
    "7194": "Serbian Bosnia Herzegovina Cyrillic",
    "8193": "Arabic Oman",
    "8201": "English Jamaica",
    "8202": "Spanish Venezuela",
    "8204": "French Reunion",
    "8218": "Bosnian Bosnia Herzegovina Cyrillic",
    "9217": "Arabic Yemen",
    "9225": "English Caribbean",
    "9226": "Spanish Colombia",
    "9228": "French Congo DRC"
  }


 */