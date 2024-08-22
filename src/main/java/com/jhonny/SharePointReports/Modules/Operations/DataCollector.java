package com.jhonny.SharePointReports.Modules.Operations;

import com.jhonny.SharePointReports.PersistenceModels.GeoInstances;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.GeoInstances.SPOTenantInstance;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.GeoInstances.TenantInstanceResponse;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SiteProperties.*;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SitePropertiesEnumerable;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.WebProperties;
import com.jhonny.SharePointReports.PersistenceModels.Site;
import com.jhonny.SharePointReports.PersistenceModels.Web;
import com.jhonny.SharePointReports.Utils.AuthClient;
import com.jhonny.SharePointReports.Utils.HttpUtils;
import com.jhonny.SharePointReports.Utils.JsonUtils;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.Cell;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.Row;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SiteUrlFromAdmin;
import com.jhonny.SharePointReports.Utils.AppConfig;

import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class DataCollector
{

    private static String TENANT_INSTANCES_XML_BODY = "<Request AddExpandoFieldTypeSuffix=\"true\" SchemaVersion=\"15.0.0.0\" LibraryVersion=\"16.0.0.0\" xmlns=\"http://schemas.microsoft.com/sharepoint/clientquery/2009\"> <Actions> <Query Id=\"2\" ObjectPathId=\"233\"> <Query SelectAllProperties=\"true\"> <Properties/> </Query> <ChildItemQuery SelectAllProperties=\"true\"> <Properties/> </ChildItemQuery> </Query> </Actions> <ObjectPaths> <Constructor Id=\"231\" TypeId=\"{268004ae-ef6b-4e9b-8425-127220d84719}\"/> <Method Id=\"233\" ParentId=\"231\" Name=\"GetTenantInstances\"/> </ObjectPaths> </Request>";
    private static String SITE_PROPERTY_EMULATED_XML_BODY = "<Request AddExpandoFieldTypeSuffix=\"true\" SchemaVersion=\"15.0.0.0\" LibraryVersion=\"16.0.0.0\" xmlns=\"http://schemas.microsoft.com/sharepoint/clientquery/2009\"><Actions><Query Id=\"1512\" ObjectPathId=\"1510\"><Query SelectAllProperties=\"false\"><Properties><Property Name=\"NextStartIndex\" ScalarProperty=\"true\" /><Property Name=\"NextStartIndexFromSharePoint\" ScalarProperty=\"true\" /></Properties></Query><ChildItemQuery SelectAllProperties=\"false\"><Properties><Property Name=\"ArchiveStatus\" ScalarProperty=\"true\" /><Property Name=\"AverageResourceUsage\" ScalarProperty=\"true\" /><Property Name=\"CurrentResourceUsage\" ScalarProperty=\"true\" /><Property Name=\"DenyAddAndCustomizePages\" ScalarProperty=\"true\" /><Property Name=\"Description\" ScalarProperty=\"true\" /><Property Name=\"ExpireVersionsAfterDays\" ScalarProperty=\"true\" /><Property Name=\"HasHolds\" ScalarProperty=\"true\" /><Property Name=\"IsGroupOwnerSiteAdmin\" ScalarProperty=\"true\" /><Property Name=\"IsTeamsChannelConnected\" ScalarProperty=\"true\" /><Property Name=\"IsTeamsConnected\" ScalarProperty=\"true\" /><Property Name=\"LastContentModifiedDate\" ScalarProperty=\"true\" /><Property Name=\"Lcid\" ScalarProperty=\"true\" /><Property Name=\"LockState\" ScalarProperty=\"true\" /><Property Name=\"PWAEnabled\" ScalarProperty=\"true\" /><Property Name=\"RequestFilesLinkEnabled\" ScalarProperty=\"true\" /><Property Name=\"RequestFilesLinkExpirationInDays\" ScalarProperty=\"true\" /><Property Name=\"SetOwnerWithoutUpdatingSecondaryAdmin\" ScalarProperty=\"true\" /><Property Name=\"SharingAllowedDomainList\" ScalarProperty=\"true\" /><Property Name=\"SharingBlockedDomainList\" ScalarProperty=\"true\" /><Property Name=\"SharingCapability\" ScalarProperty=\"true\" /><Property Name=\"SharingDomainRestrictionMode\" ScalarProperty=\"true\" /><Property Name=\"Status\" ScalarProperty=\"true\" /><Property Name=\"StorageMaximumLevel\" ScalarProperty=\"true\" /><Property Name=\"StorageQuotaType\" ScalarProperty=\"true\" /><Property Name=\"StorageUsage\" ScalarProperty=\"true\" /><Property Name=\"StorageWarningLevel\" ScalarProperty=\"true\" /><Property Name=\"Template\" ScalarProperty=\"true\" /><Property Name=\"TimeZoneId\" ScalarProperty=\"true\" /><Property Name=\"Title\" ScalarProperty=\"true\" /><Property Name=\"UserCodeMaximumLevel\" ScalarProperty=\"true\" /><Property Name=\"UserCodeWarningLevel\" ScalarProperty=\"true\" /><Property Name=\"WebsCount\" ScalarProperty=\"true\" /><Property Name=\"Url\" ScalarProperty=\"true\" /></Properties></ChildItemQuery></Query></Actions><ObjectPaths><Method Id=\"1510\" ParentId=\"1\" Name=\"GetSitePropertiesFromSharePointByFilters\"><Parameters><Parameter TypeId=\"{b92aeee2-c92c-4b67-abcc-024e471bc140}\"><Property Name=\"ArchiveStatus\" Type=\"Null\" /><Property Name=\"Filter\" Type=\"Null\" /><Property Name=\"GroupIdDefined\" Type=\"Int32\">0</Property><Property Name=\"IncludeDetail\" Type=\"Boolean\">true</Property><Property Name=\"IncludePersonalSite\" Type=\"Enum\">1</Property><Property Name=\"StartIndex\" Type=\"String\">0</Property><Property Name=\"Template\" Type=\"Null\" /></Parameter></Parameters></Method><Identity Id=\"1\" Name=\"b72946a1-0062-3000-a348-9807b48902da|908bed80-a04a-4433-b4a0-883d9847d110:%s&#xA;Tenant\" /></ObjectPaths></Request>\n";
    private static String TENANT_SITE_PROPERTIES_XML_BODY = "<Request AddExpandoFieldTypeSuffix=\"true\" SchemaVersion=\"15.0.0.0\" LibraryVersion=\"16.0.0.0\" xmlns=\"http://schemas.microsoft.com/sharepoint/clientquery/2009\"> <Actions> <Query Id=\"1\" ObjectPathId=\"9\"> <Query SelectAllProperties=\"false\"> <Properties> <Property Name=\"ArchiveStatus\" ScalarProperty=\"true\"/> <Property Name=\"AverageResourceUsage\" ScalarProperty=\"true\"/> <Property Name=\"CurrentResourceUsage\" ScalarProperty=\"true\"/> <Property Name=\"DenyAddAndCustomizePages\" ScalarProperty=\"true\"/> <Property Name=\"Description\" ScalarProperty=\"true\"/> <Property Name=\"ExpireVersionsAfterDays\" ScalarProperty=\"true\"/> <Property Name=\"HasHolds\" ScalarProperty=\"true\"/> <Property Name=\"IsGroupOwnerSiteAdmin\" ScalarProperty=\"true\"/> <Property Name=\"IsTeamsChannelConnected\" ScalarProperty=\"true\"/> <Property Name=\"IsTeamsConnected\" ScalarProperty=\"true\"/> <Property Name=\"LastContentModifiedDate\" ScalarProperty=\"true\"/> <Property Name=\"Lcid\" ScalarProperty=\"true\"/> <Property Name=\"LockState\" ScalarProperty=\"true\"/> <Property Name=\"PWAEnabled\" ScalarProperty=\"true\"/> <Property Name=\"RequestFilesLinkEnabled\" ScalarProperty=\"true\"/> <Property Name=\"RequestFilesLinkExpirationInDays\" ScalarProperty=\"true\"/> <Property Name=\"SetOwnerWithoutUpdatingSecondaryAdmin\" ScalarProperty=\"true\"/> <Property Name=\"SharingAllowedDomainList\" ScalarProperty=\"true\"/> <Property Name=\"SharingBlockedDomainList\" ScalarProperty=\"true\"/> <Property Name=\"SharingCapability\" ScalarProperty=\"true\"/> <Property Name=\"SharingDomainRestrictionMode\" ScalarProperty=\"true\"/> <Property Name=\"Status\" ScalarProperty=\"true\"/> <Property Name=\"StorageMaximumLevel\" ScalarProperty=\"true\"/> <Property Name=\"StorageQuotaType\" ScalarProperty=\"true\"/> <Property Name=\"StorageUsage\" ScalarProperty=\"true\"/> <Property Name=\"StorageWarningLevel\" ScalarProperty=\"true\"/> <Property Name=\"Template\" ScalarProperty=\"true\"/> <Property Name=\"TimeZoneId\" ScalarProperty=\"true\"/> <Property Name=\"Title\" ScalarProperty=\"true\"/> <Property Name=\"UserCodeMaximumLevel\" ScalarProperty=\"true\"/> <Property Name=\"UserCodeWarningLevel\" ScalarProperty=\"true\"/> <Property Name=\"WebsCount\" ScalarProperty=\"true\"/> </Properties> </Query> </Query> </Actions> <ObjectPaths> <Method Id=\"9\" ParentId=\"1\" Name=\"GetSitePropertiesByUrl\"> <Parameters> <Parameter Type=\"String\">%s</Parameter> <Parameter Type=\"Boolean\">true</Parameter> </Parameters> </Method> <Identity Id=\"1\" Name=\"75eb41a1-00e6-3000-9074-7235cb24d066|908bed80-a04a-4433-b4a0-883d9847d110:%s&#xA;Tenant\"/> </ObjectPaths> </Request>";
//    private static String WEB_PROPERTY_XML_BODY = "<Request AddExpandoFieldTypeSuffix=\"true\" SchemaVersion=\"15.0.0.0\" LibraryVersion=\"16.0.0.0\" xmlns=\"http://schemas.microsoft.com/sharepoint/clientquery/2009\"> <Actions> <Query Id=\"1\" ObjectPathId=\"15\"> <Query SelectAllProperties=\"false\"> <Properties> <Property Name=\"AllowAutomaticASPXPageIndexing\" ScalarProperty=\"true\"/> <Property Name=\"Author\" SelectAll=\"true\"> <Query SelectAllProperties=\"false\"> <Properties> <Property Name=\"Groups\"> <Query SelectAllProperties=\"false\"> <Properties/> </Query> <ChildItemQuery SelectAllProperties=\"false\"> <Properties> <Property Name=\"Id\" ScalarProperty=\"true\"/> <Property Name=\"IsHiddenInUI\" ScalarProperty=\"true\"/> <Property Name=\"LoginName\" ScalarProperty=\"true\"/> <Property Name=\"Title\" ScalarProperty=\"true\"/> <Property Name=\"PrincipalType\" ScalarProperty=\"true\"/> <Property Name=\"AllowMembersEditMembership\" ScalarProperty=\"true\"/> <Property Name=\"AllowRequestToJoinLeave\" ScalarProperty=\"true\"/> <Property Name=\"AutoAcceptRequestToJoinLeave\" ScalarProperty=\"true\"/> <Property Name=\"CanCurrentUserEditMembership\" ScalarProperty=\"true\"/> <Property Name=\"CanCurrentUserManageGroup\" ScalarProperty=\"true\"/> <Property Name=\"CanCurrentUserViewMembership\" ScalarProperty=\"true\"/> <Property Name=\"Description\" ScalarProperty=\"true\"/> <Property Name=\"OnlyAllowMembersViewMembership\" ScalarProperty=\"true\"/> <Property Name=\"Owner\"> <Query SelectAllProperties=\"false\"> <Properties> <Property Name=\"LoginName\" ScalarProperty=\"true\"/> </Properties> </Query> </Property> <Property Name=\"OwnerTitle\" ScalarProperty=\"true\"/> <Property Name=\"RequestToJoinLeaveEmailSetting\" ScalarProperty=\"true\"/> <Property Name=\"Users\"> <Query SelectAllProperties=\"false\"> <Properties/> </Query> <ChildItemQuery SelectAllProperties=\"false\"> <Properties> <Property Name=\"Id\" ScalarProperty=\"true\"/> <Property Name=\"AadObjectId\" ScalarProperty=\"true\"/> <Property Name=\"EmailWithFallback\" ScalarProperty=\"true\"/> <Property Name=\"HexCid\" ScalarProperty=\"true\"/> <Property Name=\"Groups\" SelectAll=\"true\"> <Query SelectAllProperties=\"false\"> <Properties/> </Query> </Property> <Property Name=\"Email\" ScalarProperty=\"true\"/> <Property Name=\"IsSiteAdmin\" ScalarProperty=\"true\"/> <Property Name=\"LoginName\" ScalarProperty=\"true\"/> <Property Name=\"Title\" ScalarProperty=\"true\"/> <Property Name=\"PrincipalType\" ScalarProperty=\"true\"/> <Property Name=\"UserId\" ScalarProperty=\"true\"/> <Property Name=\"UserPrincipalName\" ScalarProperty=\"true\"/> <Property Name=\"IsEmailAuthenticationGuestUser\" ScalarProperty=\"true\"/> <Property Name=\"IsHiddenInUI\" ScalarProperty=\"true\"/> <Property Name=\"IsShareByEmailGuestUser\" ScalarProperty=\"true\"/> <Property Name=\"Expiration\" ScalarProperty=\"true\"/> </Properties> </ChildItemQuery> </Property> </Properties> </ChildItemQuery> </Property> </Properties> </Query> </Property> <Property Name=\"AllowCreateDeclarativeWorkflowForCurrentUser\" ScalarProperty=\"true\"/> <Property Name=\"AllowDesignerForCurrentUser\" ScalarProperty=\"true\"/> <Property Name=\"AllowMasterPageEditingForCurrentUser\" ScalarProperty=\"true\"/> <Property Name=\"AllowRevertFromTemplateForCurrentUser\" ScalarProperty=\"true\"/> <Property Name=\"AllowRssFeeds\" ScalarProperty=\"true\"/> <Property Name=\"AllowSaveDeclarativeWorkflowAsTemplateForCurrentUser\" ScalarProperty=\"true\"/> <Property Name=\"AllowSavePublishDeclarativeWorkflowForCurrentUser\" ScalarProperty=\"true\"/> <Property Name=\"AllProperties\" SelectAll=\"true\"> <Query SelectAllProperties=\"false\"> <Properties/> </Query> </Property> <Property Name=\"AlternateCssUrl\" ScalarProperty=\"true\"/> <Property Name=\"AppInstanceId\" ScalarProperty=\"true\"/> <Property Name=\"AssociatedOwnerGroup\"> <Query SelectAllProperties=\"false\"> <Properties> <Property Name=\"Users\" SelectAll=\"true\"> <Query SelectAllProperties=\"false\"> <Properties/> </Query> </Property> </Properties> </Query> </Property> <Property Name=\"AssociatedMemberGroup\"> <Query SelectAllProperties=\"false\"> <Properties> <Property Name=\"AllowMembersEditMembership\" ScalarProperty=\"true\"/> </Properties> </Query> </Property> <Property Name=\"Configuration\" ScalarProperty=\"true\"/> <Property Name=\"ContainsConfidentialInfo\" ScalarProperty=\"true\"/> <Property Name=\"Created\" ScalarProperty=\"true\"/> <Property Name=\"CurrentUser\"> <Query SelectAllProperties=\"false\"> <Properties> <Property Name=\"LoginName\" ScalarProperty=\"true\"/> </Properties> </Query> </Property> <Property Name=\"CustomMasterUrl\" ScalarProperty=\"true\"/> <Property Name=\"Description\" ScalarProperty=\"true\"/> <Property Name=\"DesignerDownloadUrlForCurrentUser\" ScalarProperty=\"true\"/> <Property Name=\"DisableAppViews\" ScalarProperty=\"true\"/> <Property Name=\"DisableFlows\" ScalarProperty=\"true\"/> <Property Name=\"DocumentLibraryCalloutOfficeWebAppPreviewersDisabled\" ScalarProperty=\"true\"/> <Property Name=\"EnableMinimalDownload\" ScalarProperty=\"true\"/> <Property Name=\"ExcludeFromOfflineClient\" ScalarProperty=\"true\"/> <Property Name=\"Id\" ScalarProperty=\"true\"/> <Property Name=\"IsMultilingual\" ScalarProperty=\"true\"/> <Property Name=\"Language\" ScalarProperty=\"true\"/> <Property Name=\"LastItemModifiedDate\" ScalarProperty=\"true\"/> <Property Name=\"LastItemUserModifiedDate\" ScalarProperty=\"true\"/> <Property Name=\"Lists\"><Query SelectAllProperties=\"false\"><Properties/></Query> <ChildItemQuery SelectAllProperties=\"false\"><Properties><Property Name=\"AllowContentTypes\" ScalarProperty=\"true\"/> <Property Name=\"AllowDeletion\" ScalarProperty=\"true\"/> <Property Name=\"BaseTemplate\" ScalarProperty=\"true\"/> <Property Name=\"BaseType\" ScalarProperty=\"true\"/> <Property Name=\"BrowserFileHandling\" ScalarProperty=\"true\"/> <Property Name=\"ContentTypesEnabled\" ScalarProperty=\"true\"/> <Property Name=\"CrawlNonDefaultViews\" ScalarProperty=\"true\"/> <Property Name=\"CreatablesInfo\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties/></Query></Property> <Property Name=\"Created\" ScalarProperty=\"true\"/> <Property Name=\"DefaultContentApprovalWorkflowId\" ScalarProperty=\"true\"/> <Property Name=\"DefaultDisplayFormUrl\" ScalarProperty=\"true\"/> <Property Name=\"DefaultEditFormUrl\" ScalarProperty=\"true\"/> <Property Name=\"DefaultNewFormUrl\" ScalarProperty=\"true\"/> <Property Name=\"DefaultViewUrl\" ScalarProperty=\"true\"/> <Property Name=\"Description\" ScalarProperty=\"true\"/> <Property Name=\"Direction\" ScalarProperty=\"true\"/> <Property Name=\"DocumentTemplateUrl\" ScalarProperty=\"true\"/> <Property Name=\"DraftVersionVisibility\" ScalarProperty=\"true\"/> <Property Name=\"EnableAssignToEmail\" ScalarProperty=\"true\"/> <Property Name=\"EnableAttachments\" ScalarProperty=\"true\"/> <Property Name=\"EnableFolderCreation\" ScalarProperty=\"true\"/> <Property Name=\"EnableMinorVersions\" ScalarProperty=\"true\"/> <Property Name=\"EnableModeration\" ScalarProperty=\"true\"/> <Property Name=\"EnableVersioning\" ScalarProperty=\"true\"/> <Property Name=\"EntityTypeName\" ScalarProperty=\"true\"/> <Property Name=\"ExcludeFromOfflineClient\" ScalarProperty=\"true\"/> <Property Name=\"ExemptFromBlockDownloadOfNonViewableFiles\" ScalarProperty=\"true\"/> <Property Name=\"FileSavePostProcessingEnabled\" ScalarProperty=\"true\"/> <Property Name=\"ForceCheckout\" ScalarProperty=\"true\"/> <Property Name=\"HasExternalDataSource\" ScalarProperty=\"true\"/> <Property Name=\"Hidden\" ScalarProperty=\"true\"/> <Property Name=\"Id\" ScalarProperty=\"true\"/> <Property Name=\"ImageUrl\" ScalarProperty=\"true\"/> <Property Name=\"IrmEnabled\" ScalarProperty=\"true\"/> <Property Name=\"IrmExpire\" ScalarProperty=\"true\"/> <Property Name=\"IrmReject\" ScalarProperty=\"true\"/> <Property Name=\"IsApplicationList\" ScalarProperty=\"true\"/> <Property Name=\"IsCatalog\" ScalarProperty=\"true\"/> <Property Name=\"IsPrivate\" ScalarProperty=\"true\"/> <Property Name=\"IsSiteAssetsLibrary\" ScalarProperty=\"true\"/> <Property Name=\"IsSystemList\" ScalarProperty=\"true\"/> <Property Name=\"ItemCount\" ScalarProperty=\"true\"/> <Property Name=\"LastItemDeletedDate\" ScalarProperty=\"true\"/> <Property Name=\"LastItemModifiedDate\" ScalarProperty=\"true\"/> <Property Name=\"LastItemUserModifiedDate\" ScalarProperty=\"true\"/> <Property Name=\"ListExperienceOptions\" ScalarProperty=\"true\"/> <Property Name=\"ListItemEntityTypeFullName\" ScalarProperty=\"true\"/> <Property Name=\"MajorVersionLimit\" ScalarProperty=\"true\"/> <Property Name=\"MajorWithMinorVersionsLimit\" ScalarProperty=\"true\"/> <Property Name=\"MultipleDataList\" ScalarProperty=\"true\"/> <Property Name=\"NoCrawl\" ScalarProperty=\"true\"/> <Property Name=\"OnQuickLaunch\" ScalarProperty=\"true\"/> <Property Name=\"ParentWebUrl\" ScalarProperty=\"true\"/> <Property Name=\"ParserDisabled\" ScalarProperty=\"true\"/> <Property Name=\"ReadSecurity\" ScalarProperty=\"true\"/> <Property Name=\"ServerTemplateCanCreateFolders\" ScalarProperty=\"true\"/> <Property Name=\"TemplateFeatureId\" ScalarProperty=\"true\"/> <Property Name=\"Title\" ScalarProperty=\"true\"/> <Property Name=\"ValidationFormula\" ScalarProperty=\"true\"/> <Property Name=\"ValidationMessage\" ScalarProperty=\"true\"/> <Property Name=\"WriteSecurity\" ScalarProperty=\"true\"/> <Property Name=\"HasUniqueRoleAssignments\" ScalarProperty=\"true\"/></Properties></ChildItemQuery></Property> <Property Name=\"MasterUrl\" ScalarProperty=\"true\"/> <Property Name=\"MembersCanShare\" ScalarProperty=\"true\"/> <Property Name=\"NoCrawl\" ScalarProperty=\"true\"/> <Property Name=\"NotificationsInOneDriveForBusinessEnabled\" ScalarProperty=\"true\"/> <Property Name=\"NotificationsInSharePointEnabled\" ScalarProperty=\"true\"/> <Property Name=\"OverwriteTranslationsOnChange\" ScalarProperty=\"true\"/> <Property Name=\"ParentWeb\" SelectAll=\"true\"> <Query SelectAllProperties=\"false\"> <Properties/> </Query> </Property> <Property Name=\"PreviewFeaturesEnabled\" ScalarProperty=\"true\"/> <Property Name=\"QuickLaunchEnabled\" ScalarProperty=\"true\"/> <Property Name=\"RecycleBinEnabled\" ScalarProperty=\"true\"/> <Property Name=\"RequestAccessEmail\" ScalarProperty=\"true\"/> <Property Name=\"SaveSiteAsTemplateEnabled\" ScalarProperty=\"true\"/> <Property Name=\"ServerRelativeUrl\" ScalarProperty=\"true\"/> <Property Name=\"ShowUrlStructureForCurrentUser\" ScalarProperty=\"true\"/> <Property Name=\"SiteLogoDescription\" ScalarProperty=\"true\"/> <Property Name=\"SiteLogoUrl\" ScalarProperty=\"true\"/> <Property Name=\"RootFolder\" SelectAll=\"true\"> <Query SelectAllProperties=\"false\"> <Properties/> </Query> </Property> <Property Name=\"RoleAssignments\"><Query SelectAllProperties=\"false\"><Properties><Property Name=\"Groups\"><Query SelectAllProperties=\"false\"><Properties/></Query> <ChildItemQuery SelectAllProperties=\"false\"><Properties><Property Name=\"AllowMembersEditMembership\" ScalarProperty=\"true\"/> <Property Name=\"AllowRequestToJoinLeave\" ScalarProperty=\"true\"/> <Property Name=\"AutoAcceptRequestToJoinLeave\" ScalarProperty=\"true\"/> <Property Name=\"CanCurrentUserEditMembership\" ScalarProperty=\"true\"/> <Property Name=\"CanCurrentUserManageGroup\" ScalarProperty=\"true\"/> <Property Name=\"CanCurrentUserViewMembership\" ScalarProperty=\"true\"/> <Property Name=\"Description\" ScalarProperty=\"true\"/> <Property Name=\"Id\" ScalarProperty=\"true\"/> <Property Name=\"IsHiddenInUI\" ScalarProperty=\"true\"/> <Property Name=\"LoginName\" ScalarProperty=\"true\"/> <Property Name=\"OnlyAllowMembersViewMembership\" ScalarProperty=\"true\"/> <Property Name=\"Owner\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties/></Query></Property> <Property Name=\"OwnerTitle\" ScalarProperty=\"true\"/> <Property Name=\"PrincipalType\" ScalarProperty=\"true\"/> <Property Name=\"RequestToJoinLeaveEmailSetting\" ScalarProperty=\"true\"/> <Property Name=\"Title\" ScalarProperty=\"true\"/> <Property Name=\"Users\"><Query SelectAllProperties=\"false\"><Properties/></Query> <ChildItemQuery SelectAllProperties=\"false\"><Properties><Property Name=\"Id\" ScalarProperty=\"true\"/> <Property Name=\"Alerts\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties/></Query></Property> <Property Name=\"AadObjectId\" ScalarProperty=\"true\"/> <Property Name=\"EmailWithFallback\" ScalarProperty=\"true\"/> <Property Name=\"HexCid\" ScalarProperty=\"true\"/> <Property Name=\"Groups\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties/></Query></Property> <Property Name=\"Email\" ScalarProperty=\"true\"/> <Property Name=\"IsSiteAdmin\" ScalarProperty=\"true\"/> <Property Name=\"LoginName\" ScalarProperty=\"true\"/> <Property Name=\"Title\" ScalarProperty=\"true\"/> <Property Name=\"PrincipalType\" ScalarProperty=\"true\"/> <Property Name=\"UserId\" ScalarProperty=\"true\"/> <Property Name=\"UserPrincipalName\" ScalarProperty=\"true\"/> <Property Name=\"IsEmailAuthenticationGuestUser\" ScalarProperty=\"true\"/> <Property Name=\"IsHiddenInUI\" ScalarProperty=\"true\"/> <Property Name=\"IsShareByEmailGuestUser\" ScalarProperty=\"true\"/> <Property Name=\"Expiration\" ScalarProperty=\"true\"/></Properties></ChildItemQuery></Property></Properties></ChildItemQuery></Property></Properties></Query> <ChildItemQuery SelectAllProperties=\"false\"><Properties><Property Name=\"Member\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties/></Query></Property> <Property Name=\"RoleDefinitionBindings\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties/></Query></Property></Properties></ChildItemQuery></Property> <Property Name=\"RoleDefinitions\"><Query SelectAllProperties=\"false\"><Properties/></Query> <ChildItemQuery SelectAllProperties=\"false\"><Properties><Property Name=\"BasePermissions\" ScalarProperty=\"true\"/> <Property Name=\"Description\" ScalarProperty=\"true\"/> <Property Name=\"Hidden\" ScalarProperty=\"true\"/> <Property Name=\"Id\" ScalarProperty=\"true\"/> <Property Name=\"Name\" ScalarProperty=\"true\"/> <Property Name=\"Order\" ScalarProperty=\"true\"/> <Property Name=\"RoleTypeKind\" ScalarProperty=\"true\"/></Properties></ChildItemQuery></Property> <Property Name=\"SiteGroups\"><Query SelectAllProperties=\"false\"><Properties/></Query> <ChildItemQuery SelectAllProperties=\"false\"><Properties><Property Name=\"Id\" ScalarProperty=\"true\"/> <Property Name=\"IsHiddenInUI\" ScalarProperty=\"true\"/> <Property Name=\"LoginName\" ScalarProperty=\"true\"/> <Property Name=\"Title\" ScalarProperty=\"true\"/> <Property Name=\"PrincipalType\" ScalarProperty=\"true\"/> <Property Name=\"AllowMembersEditMembership\" ScalarProperty=\"true\"/> <Property Name=\"AllowRequestToJoinLeave\" ScalarProperty=\"true\"/> <Property Name=\"AutoAcceptRequestToJoinLeave\" ScalarProperty=\"true\"/> <Property Name=\"CanCurrentUserEditMembership\" ScalarProperty=\"true\"/> <Property Name=\"CanCurrentUserManageGroup\" ScalarProperty=\"true\"/> <Property Name=\"CanCurrentUserViewMembership\" ScalarProperty=\"true\"/> <Property Name=\"Description\" ScalarProperty=\"true\"/> <Property Name=\"OnlyAllowMembersViewMembership\" ScalarProperty=\"true\"/> <Property Name=\"Owner\"><Query SelectAllProperties=\"false\"><Properties><Property Name=\"LoginName\" ScalarProperty=\"true\"/></Properties></Query></Property> <Property Name=\"OwnerTitle\" ScalarProperty=\"true\"/> <Property Name=\"RequestToJoinLeaveEmailSetting\" ScalarProperty=\"true\"/> <Property Name=\"Users\"><Query SelectAllProperties=\"false\"><Properties/></Query> <ChildItemQuery SelectAllProperties=\"false\"><Properties><Property Name=\"Id\" ScalarProperty=\"true\"/> <Property Name=\"AadObjectId\" ScalarProperty=\"true\"/> <Property Name=\"EmailWithFallback\" ScalarProperty=\"true\"/> <Property Name=\"HexCid\" ScalarProperty=\"true\"/> <Property Name=\"Groups\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties/></Query></Property> <Property Name=\"Email\" ScalarProperty=\"true\"/> <Property Name=\"IsSiteAdmin\" ScalarProperty=\"true\"/> <Property Name=\"LoginName\" ScalarProperty=\"true\"/> <Property Name=\"Title\" ScalarProperty=\"true\"/> <Property Name=\"PrincipalType\" ScalarProperty=\"true\"/> <Property Name=\"UserId\" ScalarProperty=\"true\"/> <Property Name=\"UserPrincipalName\" ScalarProperty=\"true\"/> <Property Name=\"IsEmailAuthenticationGuestUser\" ScalarProperty=\"true\"/> <Property Name=\"IsHiddenInUI\" ScalarProperty=\"true\"/> <Property Name=\"IsShareByEmailGuestUser\" ScalarProperty=\"true\"/> <Property Name=\"Expiration\" ScalarProperty=\"true\"/></Properties></ChildItemQuery></Property></Properties></ChildItemQuery></Property> <Property Name=\"SiteUserInfoList\" SelectAll=\"true\"> <Query SelectAllProperties=\"false\"> <Properties/> </Query> </Property> <Property Name=\"SiteUsers\"><Query SelectAllProperties=\"false\"><Properties/></Query> <ChildItemQuery SelectAllProperties=\"false\"><Properties><Property Name=\"Id\" ScalarProperty=\"true\"/> <Property Name=\"Alerts\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties/></Query></Property> <Property Name=\"AadObjectId\" ScalarProperty=\"true\"/> <Property Name=\"EmailWithFallback\" ScalarProperty=\"true\"/> <Property Name=\"HexCid\" ScalarProperty=\"true\"/> <Property Name=\"Groups\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties/></Query></Property> <Property Name=\"Email\" ScalarProperty=\"true\"/> <Property Name=\"IsSiteAdmin\" ScalarProperty=\"true\"/> <Property Name=\"LoginName\" ScalarProperty=\"true\"/> <Property Name=\"Title\" ScalarProperty=\"true\"/> <Property Name=\"PrincipalType\" ScalarProperty=\"true\"/> <Property Name=\"UserId\" ScalarProperty=\"true\"/> <Property Name=\"UserPrincipalName\" ScalarProperty=\"true\"/> <Property Name=\"IsEmailAuthenticationGuestUser\" ScalarProperty=\"true\"/> <Property Name=\"IsHiddenInUI\" ScalarProperty=\"true\"/> <Property Name=\"IsShareByEmailGuestUser\" ScalarProperty=\"true\"/> <Property Name=\"Expiration\" ScalarProperty=\"true\"/></Properties></ChildItemQuery></Property> <Property Name=\"SupportedUILanguageIds\" ScalarProperty=\"true\"/> <Property Name=\"SyndicationEnabled\" ScalarProperty=\"true\"/> <Property Name=\"TenantTagPolicyEnabled\" ScalarProperty=\"true\"/> <Property Name=\"ThemedCssFolderUrl\" ScalarProperty=\"true\"/> <Property Name=\"ThirdPartyMdmEnabled\" ScalarProperty=\"true\"/> <Property Name=\"Title\" ScalarProperty=\"true\"/> <Property Name=\"TreeViewEnabled\" ScalarProperty=\"true\"/> <Property Name=\"UIVersion\" ScalarProperty=\"true\"/> <Property Name=\"UIVersionConfigurationEnabled\" ScalarProperty=\"true\"/> <Property Name=\"Url\" ScalarProperty=\"true\"/> <Property Name=\"UseAccessRequestDefault\" ScalarProperty=\"true\"/> <Property Name=\"Webs\"><Query SelectAllProperties=\"false\"><Properties/></Query> <ChildItemQuery SelectAllProperties=\"false\"><Properties><Property Name=\"Url\" ScalarProperty=\"true\"/> <Property Name=\"Id\" ScalarProperty=\"true\"/> <Property Name=\"Title\" ScalarProperty=\"true\"/></Properties></ChildItemQuery></Property> <Property Name=\"WebTemplate\" ScalarProperty=\"true\"/> <Property Name=\"HasUniqueRoleAssignments\" ScalarProperty=\"true\"/> </Properties> </Query> </Query> </Actions> <ObjectPaths><Property Id=\"15\" ParentId=\"1\" Name=\"Web\"/> <StaticProperty Id=\"1\" TypeId=\"{3747adcd-a3c3-41b9-bfab-4a64dd2f1e0a}\" Name=\"Current\"/></ObjectPaths> </Request>";
    private static String WEB_PROPERTY_XML_BODY = "<Request AddExpandoFieldTypeSuffix=\"true\" SchemaVersion=\"15.0.0.0\" LibraryVersion=\"16.0.0.0\" xmlns=\"http://schemas.microsoft.com/sharepoint/clientquery/2009\"><Actions><Query Id=\"17\" ObjectPathId=\"15\"><Query SelectAllProperties=\"false\"><Properties><Property Name=\"AllowAutomaticASPXPageIndexing\" ScalarProperty=\"true\" /><Property Name=\"Author\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties /></Query></Property><Property Name=\"AllowCreateDeclarativeWorkflowForCurrentUser\" ScalarProperty=\"true\" /><Property Name=\"AllowDesignerForCurrentUser\" ScalarProperty=\"true\" /><Property Name=\"AllowMasterPageEditingForCurrentUser\" ScalarProperty=\"true\" /><Property Name=\"AllowRevertFromTemplateForCurrentUser\" ScalarProperty=\"true\" /><Property Name=\"AllowRssFeeds\" ScalarProperty=\"true\" /><Property Name=\"AllowSaveDeclarativeWorkflowAsTemplateForCurrentUser\" ScalarProperty=\"true\" /><Property Name=\"AllowSavePublishDeclarativeWorkflowForCurrentUser\" ScalarProperty=\"true\" /><Property Name=\"AllProperties\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties /></Query></Property><Property Name=\"AlternateCssUrl\" ScalarProperty=\"true\" /><Property Name=\"AppInstanceId\" ScalarProperty=\"true\" /><Property Name=\"AssociatedOwnerGroup\"><Query SelectAllProperties=\"false\"><Properties><Property Name=\"Id\" ScalarProperty=\"true\" /><Property Name=\"Users\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties /></Query></Property></Properties></Query></Property><Property Name=\"AssociatedMemberGroup\"><Query SelectAllProperties=\"false\"><Properties><Property Name=\"Id\" ScalarProperty=\"true\" /><Property Name=\"AllowMembersEditMembership\" ScalarProperty=\"true\" /></Properties></Query></Property><Property Name=\"AssociatedVisitorGroup\"><Query SelectAllProperties=\"false\"><Properties><Property Name=\"Id\" ScalarProperty=\"true\" /></Properties></Query></Property><Property Name=\"Configuration\" ScalarProperty=\"true\" /><Property Name=\"ContainsConfidentialInfo\" ScalarProperty=\"true\" /><Property Name=\"Created\" ScalarProperty=\"true\" /><Property Name=\"CurrentUser\"><Query SelectAllProperties=\"false\"><Properties><Property Name=\"LoginName\" ScalarProperty=\"true\" /></Properties></Query></Property><Property Name=\"CustomMasterUrl\" ScalarProperty=\"true\" /><Property Name=\"Description\" ScalarProperty=\"true\" /><Property Name=\"DesignerDownloadUrlForCurrentUser\" ScalarProperty=\"true\" /><Property Name=\"DisableAppViews\" ScalarProperty=\"true\" /><Property Name=\"DisableFlows\" ScalarProperty=\"true\" /><Property Name=\"DocumentLibraryCalloutOfficeWebAppPreviewersDisabled\" ScalarProperty=\"true\" /><Property Name=\"EnableMinimalDownload\" ScalarProperty=\"true\" /><Property Name=\"ExcludeFromOfflineClient\" ScalarProperty=\"true\" /><Property Name=\"Id\" ScalarProperty=\"true\" /><Property Name=\"IsMultilingual\" ScalarProperty=\"true\" /><Property Name=\"Language\" ScalarProperty=\"true\" /><Property Name=\"LastItemModifiedDate\" ScalarProperty=\"true\" /><Property Name=\"LastItemUserModifiedDate\" ScalarProperty=\"true\" /><Property Name=\"Lists\"><Query SelectAllProperties=\"false\"><Properties /></Query><ChildItemQuery SelectAllProperties=\"false\"><Properties><Property Name=\"AllowContentTypes\" ScalarProperty=\"true\" /><Property Name=\"AllowDeletion\" ScalarProperty=\"true\" /><Property Name=\"BaseTemplate\" ScalarProperty=\"true\" /><Property Name=\"BaseType\" ScalarProperty=\"true\" /><Property Name=\"BrowserFileHandling\" ScalarProperty=\"true\" /><Property Name=\"ContentTypesEnabled\" ScalarProperty=\"true\" /><Property Name=\"CrawlNonDefaultViews\" ScalarProperty=\"true\" /><Property Name=\"CreatablesInfo\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties /></Query></Property><Property Name=\"Created\" ScalarProperty=\"true\" /><Property Name=\"DefaultContentApprovalWorkflowId\" ScalarProperty=\"true\" /><Property Name=\"DefaultDisplayFormUrl\" ScalarProperty=\"true\" /><Property Name=\"DefaultEditFormUrl\" ScalarProperty=\"true\" /><Property Name=\"DefaultNewFormUrl\" ScalarProperty=\"true\" /><Property Name=\"DefaultViewUrl\" ScalarProperty=\"true\" /><Property Name=\"Description\" ScalarProperty=\"true\" /><Property Name=\"Direction\" ScalarProperty=\"true\" /><Property Name=\"DocumentTemplateUrl\" ScalarProperty=\"true\" /><Property Name=\"DraftVersionVisibility\" ScalarProperty=\"true\" /><Property Name=\"EnableAssignToEmail\" ScalarProperty=\"true\" /><Property Name=\"EnableAttachments\" ScalarProperty=\"true\" /><Property Name=\"EnableFolderCreation\" ScalarProperty=\"true\" /><Property Name=\"EnableMinorVersions\" ScalarProperty=\"true\" /><Property Name=\"EnableModeration\" ScalarProperty=\"true\" /><Property Name=\"EnableVersioning\" ScalarProperty=\"true\" /><Property Name=\"EntityTypeName\" ScalarProperty=\"true\" /><Property Name=\"ExcludeFromOfflineClient\" ScalarProperty=\"true\" /><Property Name=\"ExemptFromBlockDownloadOfNonViewableFiles\" ScalarProperty=\"true\" /><Property Name=\"FileSavePostProcessingEnabled\" ScalarProperty=\"true\" /><Property Name=\"ForceCheckout\" ScalarProperty=\"true\" /><Property Name=\"HasExternalDataSource\" ScalarProperty=\"true\" /><Property Name=\"Hidden\" ScalarProperty=\"true\" /><Property Name=\"Id\" ScalarProperty=\"true\" /><Property Name=\"ImageUrl\" ScalarProperty=\"true\" /><Property Name=\"IrmEnabled\" ScalarProperty=\"true\" /><Property Name=\"IrmExpire\" ScalarProperty=\"true\" /><Property Name=\"IrmReject\" ScalarProperty=\"true\" /><Property Name=\"IsApplicationList\" ScalarProperty=\"true\" /><Property Name=\"IsCatalog\" ScalarProperty=\"true\" /><Property Name=\"IsPrivate\" ScalarProperty=\"true\" /><Property Name=\"IsSiteAssetsLibrary\" ScalarProperty=\"true\" /><Property Name=\"IsSystemList\" ScalarProperty=\"true\" /><Property Name=\"ItemCount\" ScalarProperty=\"true\" /><Property Name=\"LastItemDeletedDate\" ScalarProperty=\"true\" /><Property Name=\"LastItemModifiedDate\" ScalarProperty=\"true\" /><Property Name=\"LastItemUserModifiedDate\" ScalarProperty=\"true\" /><Property Name=\"ListExperienceOptions\" ScalarProperty=\"true\" /><Property Name=\"ListItemEntityTypeFullName\" ScalarProperty=\"true\" /><Property Name=\"MajorVersionLimit\" ScalarProperty=\"true\" /><Property Name=\"MajorWithMinorVersionsLimit\" ScalarProperty=\"true\" /><Property Name=\"MultipleDataList\" ScalarProperty=\"true\" /><Property Name=\"NoCrawl\" ScalarProperty=\"true\" /><Property Name=\"OnQuickLaunch\" ScalarProperty=\"true\" /><Property Name=\"ParentWebUrl\" ScalarProperty=\"true\" /><Property Name=\"ParserDisabled\" ScalarProperty=\"true\" /><Property Name=\"ReadSecurity\" ScalarProperty=\"true\" /><Property Name=\"ServerTemplateCanCreateFolders\" ScalarProperty=\"true\" /><Property Name=\"TemplateFeatureId\" ScalarProperty=\"true\" /><Property Name=\"Title\" ScalarProperty=\"true\" /><Property Name=\"ValidationFormula\" ScalarProperty=\"true\" /><Property Name=\"ValidationMessage\" ScalarProperty=\"true\" /><Property Name=\"WriteSecurity\" ScalarProperty=\"true\" /><Property Name=\"HasUniqueRoleAssignments\" ScalarProperty=\"true\" /></Properties></ChildItemQuery></Property><Property Name=\"MasterUrl\" ScalarProperty=\"true\" /><Property Name=\"MembersCanShare\" ScalarProperty=\"true\" /><Property Name=\"NoCrawl\" ScalarProperty=\"true\" /><Property Name=\"NotificationsInOneDriveForBusinessEnabled\" ScalarProperty=\"true\" /><Property Name=\"NotificationsInSharePointEnabled\" ScalarProperty=\"true\" /><Property Name=\"OverwriteTranslationsOnChange\" ScalarProperty=\"true\" /><Property Name=\"PreviewFeaturesEnabled\" ScalarProperty=\"true\" /><Property Name=\"QuickLaunchEnabled\" ScalarProperty=\"true\" /><Property Name=\"RecycleBinEnabled\" ScalarProperty=\"true\" /><Property Name=\"RecycleBin\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties /></Query></Property><Property Name=\"RequestAccessEmail\" ScalarProperty=\"true\" /><Property Name=\"SaveSiteAsTemplateEnabled\" ScalarProperty=\"true\" /><Property Name=\"ServerRelativeUrl\" ScalarProperty=\"true\" /><Property Name=\"ShowUrlStructureForCurrentUser\" ScalarProperty=\"true\" /><Property Name=\"SiteLogoDescription\" ScalarProperty=\"true\" /><Property Name=\"SiteLogoUrl\" ScalarProperty=\"true\" /><Property Name=\"RootFolder\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties /></Query></Property><Property Name=\"RoleAssignments\"><Query SelectAllProperties=\"false\"><Properties><Property Name=\"Groups\"><Query SelectAllProperties=\"false\"><Properties /></Query><ChildItemQuery SelectAllProperties=\"false\"><Properties><Property Name=\"AllowMembersEditMembership\" ScalarProperty=\"true\" /><Property Name=\"AllowRequestToJoinLeave\" ScalarProperty=\"true\" /><Property Name=\"AutoAcceptRequestToJoinLeave\" ScalarProperty=\"true\" /><Property Name=\"CanCurrentUserEditMembership\" ScalarProperty=\"true\" /><Property Name=\"CanCurrentUserManageGroup\" ScalarProperty=\"true\" /><Property Name=\"CanCurrentUserViewMembership\" ScalarProperty=\"true\" /><Property Name=\"Description\" ScalarProperty=\"true\" /><Property Name=\"Id\" ScalarProperty=\"true\" /><Property Name=\"IsHiddenInUI\" ScalarProperty=\"true\" /><Property Name=\"LoginName\" ScalarProperty=\"true\" /><Property Name=\"OnlyAllowMembersViewMembership\" ScalarProperty=\"true\" /><Property Name=\"Owner\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties /></Query></Property><Property Name=\"OwnerTitle\" ScalarProperty=\"true\" /><Property Name=\"PrincipalType\" ScalarProperty=\"true\" /><Property Name=\"RequestToJoinLeaveEmailSetting\" ScalarProperty=\"true\" /><Property Name=\"Title\" ScalarProperty=\"true\" /><Property Name=\"Users\"><Query SelectAllProperties=\"false\"><Properties /></Query><ChildItemQuery SelectAllProperties=\"false\"><Properties><Property Name=\"Id\" ScalarProperty=\"true\" /><Property Name=\"Alerts\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties /></Query></Property><Property Name=\"AadObjectId\" ScalarProperty=\"true\" /><Property Name=\"EmailWithFallback\" ScalarProperty=\"true\" /><Property Name=\"HexCid\" ScalarProperty=\"true\" /><Property Name=\"Groups\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties /></Query></Property><Property Name=\"Email\" ScalarProperty=\"true\" /><Property Name=\"IsSiteAdmin\" ScalarProperty=\"true\" /><Property Name=\"LoginName\" ScalarProperty=\"true\" /><Property Name=\"Title\" ScalarProperty=\"true\" /><Property Name=\"PrincipalType\" ScalarProperty=\"true\" /><Property Name=\"UserId\" ScalarProperty=\"true\" /><Property Name=\"UserPrincipalName\" ScalarProperty=\"true\" /><Property Name=\"IsEmailAuthenticationGuestUser\" ScalarProperty=\"true\" /><Property Name=\"IsHiddenInUI\" ScalarProperty=\"true\" /><Property Name=\"IsShareByEmailGuestUser\" ScalarProperty=\"true\" /><Property Name=\"Expiration\" ScalarProperty=\"true\" /></Properties></ChildItemQuery></Property></Properties></ChildItemQuery></Property></Properties></Query><ChildItemQuery SelectAllProperties=\"false\"><Properties><Property Name=\"Member\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties /></Query></Property><Property Name=\"RoleDefinitionBindings\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties /></Query></Property></Properties></ChildItemQuery></Property><Property Name=\"SiteGroups\"><Query SelectAllProperties=\"false\"><Properties /></Query><ChildItemQuery SelectAllProperties=\"false\"><Properties><Property Name=\"Id\" ScalarProperty=\"true\" /><Property Name=\"IsHiddenInUI\" ScalarProperty=\"true\" /><Property Name=\"LoginName\" ScalarProperty=\"true\" /><Property Name=\"Title\" ScalarProperty=\"true\" /><Property Name=\"PrincipalType\" ScalarProperty=\"true\" /><Property Name=\"AllowMembersEditMembership\" ScalarProperty=\"true\" /><Property Name=\"AllowRequestToJoinLeave\" ScalarProperty=\"true\" /><Property Name=\"AutoAcceptRequestToJoinLeave\" ScalarProperty=\"true\" /><Property Name=\"CanCurrentUserEditMembership\" ScalarProperty=\"true\" /><Property Name=\"CanCurrentUserManageGroup\" ScalarProperty=\"true\" /><Property Name=\"CanCurrentUserViewMembership\" ScalarProperty=\"true\" /><Property Name=\"Description\" ScalarProperty=\"true\" /><Property Name=\"OnlyAllowMembersViewMembership\" ScalarProperty=\"true\" /><Property Name=\"Owner\"><Query SelectAllProperties=\"false\"><Properties><Property Name=\"LoginName\" ScalarProperty=\"true\" /></Properties></Query></Property><Property Name=\"OwnerTitle\" ScalarProperty=\"true\" /><Property Name=\"RequestToJoinLeaveEmailSetting\" ScalarProperty=\"true\" /><Property Name=\"Users\"><Query SelectAllProperties=\"false\"><Properties /></Query><ChildItemQuery SelectAllProperties=\"false\"><Properties><Property Name=\"Id\" ScalarProperty=\"true\" /><Property Name=\"AadObjectId\" ScalarProperty=\"true\" /><Property Name=\"EmailWithFallback\" ScalarProperty=\"true\" /><Property Name=\"HexCid\" ScalarProperty=\"true\" /><Property Name=\"Groups\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties /></Query></Property><Property Name=\"Email\" ScalarProperty=\"true\" /><Property Name=\"IsSiteAdmin\" ScalarProperty=\"true\" /><Property Name=\"LoginName\" ScalarProperty=\"true\" /><Property Name=\"Title\" ScalarProperty=\"true\" /><Property Name=\"PrincipalType\" ScalarProperty=\"true\" /><Property Name=\"UserId\" ScalarProperty=\"true\" /><Property Name=\"UserPrincipalName\" ScalarProperty=\"true\" /><Property Name=\"IsEmailAuthenticationGuestUser\" ScalarProperty=\"true\" /><Property Name=\"IsHiddenInUI\" ScalarProperty=\"true\" /><Property Name=\"IsShareByEmailGuestUser\" ScalarProperty=\"true\" /><Property Name=\"Expiration\" ScalarProperty=\"true\" /></Properties></ChildItemQuery></Property></Properties></ChildItemQuery></Property><Property Name=\"SiteUserInfoList\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties /></Query></Property><Property Name=\"SiteUsers\"><Query SelectAllProperties=\"false\"><Properties /></Query><ChildItemQuery SelectAllProperties=\"false\"><Properties><Property Name=\"Id\" ScalarProperty=\"true\" /><Property Name=\"Alerts\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties /></Query></Property><Property Name=\"AadObjectId\" ScalarProperty=\"true\" /><Property Name=\"EmailWithFallback\" ScalarProperty=\"true\" /><Property Name=\"HexCid\" ScalarProperty=\"true\" /><Property Name=\"Groups\" SelectAll=\"true\"><Query SelectAllProperties=\"false\"><Properties /></Query></Property><Property Name=\"Email\" ScalarProperty=\"true\" /><Property Name=\"IsSiteAdmin\" ScalarProperty=\"true\" /><Property Name=\"LoginName\" ScalarProperty=\"true\" /><Property Name=\"Title\" ScalarProperty=\"true\" /><Property Name=\"PrincipalType\" ScalarProperty=\"true\" /><Property Name=\"UserId\" ScalarProperty=\"true\" /><Property Name=\"UserPrincipalName\" ScalarProperty=\"true\" /><Property Name=\"IsEmailAuthenticationGuestUser\" ScalarProperty=\"true\" /><Property Name=\"IsHiddenInUI\" ScalarProperty=\"true\" /><Property Name=\"IsShareByEmailGuestUser\" ScalarProperty=\"true\" /><Property Name=\"Expiration\" ScalarProperty=\"true\" /></Properties></ChildItemQuery></Property><Property Name=\"SupportedUILanguageIds\" ScalarProperty=\"true\" /><Property Name=\"SyndicationEnabled\" ScalarProperty=\"true\" /><Property Name=\"TenantTagPolicyEnabled\" ScalarProperty=\"true\" /><Property Name=\"ThemedCssFolderUrl\" ScalarProperty=\"true\" /><Property Name=\"ThirdPartyMdmEnabled\" ScalarProperty=\"true\" /><Property Name=\"Title\" ScalarProperty=\"true\" /><Property Name=\"TreeViewEnabled\" ScalarProperty=\"true\" /><Property Name=\"UIVersion\" ScalarProperty=\"true\" /><Property Name=\"UIVersionConfigurationEnabled\" ScalarProperty=\"true\" /><Property Name=\"Url\" ScalarProperty=\"true\" /><Property Name=\"UseAccessRequestDefault\" ScalarProperty=\"true\" /><Property Name=\"Webs\"><Query SelectAllProperties=\"false\"><Properties /></Query><ChildItemQuery SelectAllProperties=\"false\"><Properties><Property Name=\"Url\" ScalarProperty=\"true\" /><Property Name=\"Title\" ScalarProperty=\"true\" /><Property Name=\"Id\" ScalarProperty=\"true\" /></Properties></ChildItemQuery></Property><Property Name=\"WebTemplate\" ScalarProperty=\"true\" /><Property Name=\"HasUniqueRoleAssignments\" ScalarProperty=\"true\" /></Properties></Query></Query></Actions><ObjectPaths><Property Id=\"15\" ParentId=\"1\" Name=\"Web\" /><StaticProperty Id=\"1\" TypeId=\"{3747adcd-a3c3-41b9-bfab-4a64dd2f1e0a}\" Name=\"Current\" /></ObjectPaths></Request>";

    private AppConfig appConfig;
    private AuthClient token;
    
    public DataCollector()
    {
        this.appConfig = new AnnotationConfigApplicationContext(AppConfig.class).getBean(AppConfig.class);
        token = new AuthClient();
    }

    public void initilize()
    {
        getGeoInstances(appConfig.getTenantAdminSite());
    }

    private static String PrepGeoLocationXmlBody()
    {
        return TENANT_INSTANCES_XML_BODY;
    }
    private static Map<String, String> prepAdminSiteBody(int startInd)
    {
        /*
        https://42jghx-admin.sharepoint.com/_api/search/query
        ?querytext='(contentclass:STS_Site)'
        &trimduplicates=false
        &selectproperties='Title,Url,Path,ParentLink'
        &RowLimit=500
        &startrow=12400
         */
        Map<String, String> body = new HashMap<String, String>();
        body.put("querytext", "'(contentclass:STS_Site)'");
        body.put("trimduplicates","true");
        body.put("selectproperties", "'Title,Url,parentLink,SiteName,SPWebUrl,GeoLocationSource,SiteId,WebId,size'");
        body.put("RowLimit","10");
        body.put("startrow",String.valueOf(startInd));
        return body;

    }

    private static String getSitePropertyEmulatedXmlBody(String tenantId)
    {
        return String.format(SITE_PROPERTY_EMULATED_XML_BODY,tenantId);
    }

    private static Map<String, String> prepAdminWebBody(int startInd)
    {
        /*
        https://42jghx-admin.sharepoint.com/_api/search/querydd
        ?querytext='(contentclass:STS_Web)'
        &trimduplicates=false
        &selectproperties='Title,Url,Path,ParentLink'
        &RowLimit=500
        &startrow=12400
         */
        Map<String, String> body = new HashMap<String, String>();
        body.put("querytext", "'(contentclass:STS_Web)'");
        body.put("trimduplicates","false");
        body.put("selectproperties", "'Title,Url,parentLink,SiteName,SPWebUrl,GeoLocationSource,SiteId,WebId,size'");
        body.put("RowLimit","10");
        body.put("startrow",String.valueOf(startInd));
        return body;

    }
    private static Map<String, String> getSiteQuery()
    {
        /*
        select=AllowExternalEmbeddingWrapper,AllowedExternalDomains,CanSyncHubSitePermissions,CanUpgrade,CommentsOnSitePagesDisabled,ComplianceAttribute,CustomizedFormsPages,ExternalUserExpirationInDays,RelatedGroupId,SearchBoxInNavBar,SearchBoxPlaceholderText,SensitivityLabelId,ShowPeoplePickerSuggestionsForGuestUsers,SitePolicyEnabled,SocialBarOnSitePagesDisabled,StatusBarLink,StatusBarText,ThicketSupportDisabled,RelatedGroupId
        &
        expand=Owner,CustomScriptSafeDomains,SensitivityLabelInfo,ServerRelativePath,Usage,UpgradeInfo,Audit,SecondaryContact

         */
        Map<String, String> query = new HashMap<>();
        query.put("$expand","Owner,CustomScriptSafeDomains,SensitivityLabelInfo,ServerRelativePath,Usage,UpgradeInfo,Audit,SecondaryContact");
        query.put("$select","AllowExternalEmbeddingWrapper,AllowedExternalDomains,CanSyncHubSitePermissions,CanUpgrade,CommentsOnSitePagesDisabled,ComplianceAttribute,CustomizedFormsPages,ExternalUserExpirationInDays,RelatedGroupId,SearchBoxInNavBar,SearchBoxPlaceholderText,SensitivityLabelId,ShowPeoplePickerSuggestionsForGuestUsers,SitePolicyEnabled,SocialBarOnSitePagesDisabled,StatusBarLink,StatusBarText,ThicketSupportDisabled,RelatedGroupId");
        return query;
    }
    private static String getTenantSitePropXml(String url, String tenantId)
    {
        //return "<Request AddExpandoFieldTypeSuffix=\"true\" SchemaVersion=\"15.0.0.0\" LibraryVersion=\"16.0.0.0\" ApplicationName=\".NET Library\" xmlns=\"http://schemas.microsoft.com/sharepoint/clientquery/2009\"><Actions><Query Id=\"1\" ObjectPathId=\"12\"><Query SelectAllProperties=\"true\"><Properties/></Query></Query></Actions><ObjectPaths><Method Id=\"12\" ParentId=\"1\" Name=\"GetSitePropertiesByUrl\"><Parameters><Parameter Type=\"String\">%s</Parameter><Parameter Type=\"Boolean\"></Parameter></Parameters></Method><Identity Id=\"1\" Name=\"9f0341a1-90f2-3000-9074-7131eb48af00|908bed80-a04a-4433-b4a0-883d9847d110:%s&#xA;Tenant\"/></ObjectPaths></Request>";
        //return "<Request AddExpandoFieldTypeSuffix=\"true\" SchemaVersion=\"15.0.0.0\" LibraryVersion=\"16.0.0.0\" ApplicationName=\".NET Library\" xmlns=\"http://schemas.microsoft.com/sharepoint/clientquery/2009\"><Actions><Query Id=\"1\" ObjectPathId=\"9\"><Query SelectAllProperties=\"false\"><Properties><Property Name=\"ArchiveStatus\" ScalarProperty=\"true\" /><Property Name=\"AverageResourceUsage\" ScalarProperty=\"true\" /><Property Name=\"CurrentResourceUsage\" ScalarProperty=\"true\" /><Property Name=\"DenyAddAndCustomizePages\" ScalarProperty=\"true\" /><Property Name=\"Description\" ScalarProperty=\"true\" /><Property Name=\"ExpireVersionsAfterDays\" ScalarProperty=\"true\" /><Property Name=\"HasHolds\" ScalarProperty=\"true\" /><Property Name=\"IsGroupOwnerSiteAdmin\" ScalarProperty=\"true\" /><Property Name=\"IsTeamsChannelConnected\" ScalarProperty=\"true\" /><Property Name=\"IsTeamsConnected\" ScalarProperty=\"true\" /><Property Name=\"LastContentModifiedDate\" ScalarProperty=\"true\" /><Property Name=\"Lcid\" ScalarProperty=\"true\" /><Property Name=\"LockState\" ScalarProperty=\"true\" /><Property Name=\"PWAEnabled\" ScalarProperty=\"true\" /><Property Name=\"RequestFilesLinkEnabled\" ScalarProperty=\"true\" /><Property Name=\"RequestFilesLinkExpirationInDays\" ScalarProperty=\"true\" /><Property Name=\"SetOwnerWithoutUpdatingSecondaryAdmin\" ScalarProperty=\"true\" /><Property Name=\"SharingAllowedDomainList\" ScalarProperty=\"true\" /><Property Name=\"SharingBlockedDomainList\" ScalarProperty=\"true\" /><Property Name=\"SharingCapability\" ScalarProperty=\"true\" /><Property Name=\"SharingDomainRestrictionMode\" ScalarProperty=\"true\" /><Property Name=\"Status\" ScalarProperty=\"true\" /><Property Name=\"StorageMaximumLevel\" ScalarProperty=\"true\" /><Property Name=\"StorageQuotaType\" ScalarProperty=\"true\" /><Property Name=\"StorageUsage\" ScalarProperty=\"true\" /><Property Name=\"StorageWarningLevel\" ScalarProperty=\"true\" /><Property Name=\"Template\" ScalarProperty=\"true\" /><Property Name=\"TimeZoneId\" ScalarProperty=\"true\" /><Property Name=\"Title\" ScalarProperty=\"true\" /><Property Name=\"UserCodeMaximumLevel\" ScalarProperty=\"true\" /><Property Name=\"UserCodeWarningLevel\" ScalarProperty=\"true\" /><Property Name=\"WebsCount\" ScalarProperty=\"true\" /></Properties></Query></Query></Actions><ObjectPaths><Method Id=\"9\" ParentId=\"1\" Name=\"GetSitePropertiesByUrl\"><Parameters><Parameter Type=\"String\">https://42jghx.sharepoint.com/sites/1gate</Parameter><Parameter Type=\"Boolean\">true</Parameter></Parameters></Method><Method Id=\"11\" ParentId=\"1\" Name=\"GetSiteByUrl\"><Parameters><Parameter Type=\"String\">%s</Parameter></Parameters></Method><Identity Id=\"1\" Name=\"75eb41a1-00e6-3000-9074-7235cb24d066|908bed80-a04a-4433-b4a0-883d9847d110:%s&#xA;Tenant\" /></ObjectPaths></Request> ";
        return String.format(TENANT_SITE_PROPERTIES_XML_BODY,url,tenantId);
    }
    private static String getWebPropXml()
    {
        return WEB_PROPERTY_XML_BODY;
    }

    public void getGeoInstances(String Adminurl)
    {
        String endpoint = Adminurl+"/_vti_bin/client.svc/ProcessQuery";
        String response = new HttpUtils()
                .PostAsXML(
                        endpoint,
                        token.GetAdminToken(),
                        PrepGeoLocationXmlBody()
                ).body();
        System.out.println(response);
//        String breakResponse = response.split("},1,")[1];
//        TenantInstanceResponse instances = JsonUtils.toObject(
//                breakResponse.substring(0,breakResponse.length()-2),
//                TenantInstanceResponse.class);
        TenantInstanceResponse instances = JsonUtils.toObject(
                JsonUtils.getDataFromJson(response,2),
                TenantInstanceResponse.class);
        for(SPOTenantInstance instance : instances.get_Child_Items_())
        {
            GeoInstances geoInstance= new GeoInstances(instance);
            int Sites = getAllSitesFromAdminV2(instance.getTenantAdminUrl());
            geoInstance.updateSite(Sites);
            Sites += getAllWebsFromAdmin(instance.getTenantAdminUrl());
            geoInstance.updateWeb(Sites);
        }
    }

    private int getAllSitesFromAdmin(String AdminUrl)
    {
        String url =appConfig.getTenantAdminSite()+"/_api/search/query";
        int currentRow=0, end=0;
        do
        {
            String response = new HttpUtils().Get(url, token.GetAdminToken(), prepAdminSiteBody(currentRow)).body();
            SiteUrlFromAdmin sites = JsonUtils.toObject(response, SiteUrlFromAdmin.class);
            for(Row site : sites.getRows())
            {
                String siteUrl = "";
                String geoLocation = "";
                String siteId = "";
                for(Cell siteProp : site.getCells())
                {
                    if(siteProp.getKey().toLowerCase().equals("url")) siteUrl = siteProp.getValue();
                    else if(siteProp.getKey().toLowerCase().equals("geolocation")) geoLocation = siteProp.getValue();

                }
                if(siteUrl.length() > 0 && !siteUrl.contains("sites/contentTypeHub"))
                {
                    //getSiteProperties(siteUrl);
                }
            }
            currentRow += sites.getRowCount();
            end = sites.getTotalRow();
            System.out.println("row count : " + currentRow);

            System.out.println(new Date().getTime());
        }
        while(currentRow < end);

        System.out.println("Sites are Collected at " +new Date().getTime());
        return end;
    }

    private int getAllSitesFromAdminV2(String AdminUrl)
    {
        int startIndex = 0,siteCount = 0;
        String endpoint = AdminUrl+"/_vti_bin/client.svc/ProcessQuery";

        SitePropertiesEnumerable allSiteProp = null;
        while(allSiteProp == null || startIndex > 0)
        {
            String response = new HttpUtils().PostAsXML(endpoint, token.GetAdminToken(), getSitePropertyEmulatedXmlBody(appConfig.getTenatId())).body();

            allSiteProp = JsonUtils.toObject(JsonUtils.getDataFromJson(response,2), SitePropertiesEnumerable.class);
            for(TenantLevelSiteProperties siteProp : allSiteProp.getSites())
            {
                System.out.println("Sites are Collected for  " + siteProp);
                getSiteProperties(siteProp);
                siteCount++;
            }
        }

        System.out.println("Sites are Collected at " +new Date().getTime());
        return siteCount;
    }



    public int getAllWebsFromAdmin(String AdminUrl)
    {
        String url =appConfig.getTenantAdminSite()+"/_api/search/query";
        int currentRow=0, end=0;
        do
        {
            String response = new HttpUtils().Get(url, token.GetAdminToken(), prepAdminWebBody(currentRow)).body();
            SiteUrlFromAdmin sites = JsonUtils.toObject(response, SiteUrlFromAdmin.class);
            // update total web count
            end = sites.getTotalRow();
            for(Row site : sites.getRows())
            {
                String siteUrl = "", geoLocation = "", siteId="", siteName="";
                for(Cell siteProp : site.getCells())
                {
                    if(siteProp.getKey().toLowerCase().equals("url")) siteUrl = siteProp.getValue();
                    else if(siteProp.getKey().toLowerCase().equals("geolocation")) geoLocation = siteProp.getValue();
                    else if(siteProp.getKey().toLowerCase().equals("siteid")) siteId = siteProp.getValue();
                    else if(siteProp.getKey().toLowerCase().equals("siteName")) siteName = siteProp.getValue();
                }
                if(siteUrl.length() > 0)
                {
                    getWebProperties(siteId, siteName, geoLocation, siteUrl);
                }
                currentRow++;
            }
//            currentRow += sites.getRowCount();
            System.out.println("row count : " + currentRow);

//            System.out.println(new Date().getTime());
        }
        while(currentRow < end);

        System.out.println("WEbs are collected at "+ new Date().getTime());
        return end;
    }

    public void getSiteProperties(TenantLevelSiteProperties siteProp)
    {

        System.out.println(siteProp.getUrl());
        String endpoint = siteProp.getUrl()+"/_api/site";
        HttpResponse<String> response = new HttpUtils()
            .Get(
                    endpoint,
                    (siteProp.getUrl().contains("-my.sharepoint.com/personal")) ? token.GetOneDriveClientToken() : token.GetSiteClientToken(),
                    getSiteQuery());
        String siteResponse = response.body();

        if(response.statusCode() == 200)
        {
            Site site = new Site(JsonUtils.toObject(siteResponse, SiteProperties.class));
            //site.updateSiteProp(getSitePropertiesV2(appConfig.getTenantAdminSite(), url));
            site.updateSiteProp(siteProp);
            getWebProperties(site.id, site.Title, site.GeoLocation, siteProp.getUrl());
        }
        else return;

        //System.out.println(site);
    }

    public TenantLevelSiteProperties getSitePropertiesV2(String adminSite, String url)
    {
        String endpoint = adminSite+"/_vti_bin/client.svc/ProcessQuery";
        String response = new HttpUtils()
                .PostAsXML(endpoint,
                        token.GetAdminToken(),
                        getTenantSitePropXml(url,appConfig.getTenatId()))
                .body();
        System.out.println(response);
//        String breakResponse = response.split("},1,")[1];
//        TenantLevelSiteProperties siteProp = (JsonUtils.toObject(breakResponse.substring(0,breakResponse.length()-2), TenantLevelSiteProperties.class));
        TenantLevelSiteProperties siteProp = (JsonUtils.toObject(JsonUtils.getDataFromJson(response,2), TenantLevelSiteProperties.class));
        return siteProp;
    }

    public void getWebProperties(String siteId, String siteName, String geoLocation, String url)
    {
        String endpoint = url+"/_vti_bin/client.svc/ProcessQuery";
        String response = new HttpUtils()
                .PostAsXML(
                        endpoint,
                        url.contains("-my.sharepoint.com/personal") ? token.GetOneDriveClientToken() : token.GetSiteClientToken(),
                        getWebPropXml()
                ).body();
        System.out.println(response);
        //String breakResponse = response.split("},1,")[1];
//        WebProperties webProp = JsonUtils.toObject(breakResponse.substring(0,breakResponse.length()-2), WebProperties.class);
        WebProperties webProp = JsonUtils.toObject(JsonUtils.getDataFromJson(response,2), WebProperties.class);
        Web web = new Web(siteId, siteName, geoLocation, webProp);
        //return breakResponse;
    }

}
