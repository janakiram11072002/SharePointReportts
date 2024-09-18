package com.jhonny.SharePointReports.PersistenceModels;

import java.util.Date;

public class SitePermissions
{
    public String siteId;
    public String webId;
    public String ListId;
    public int id;
    public String displayName;
    public String email;
    public String loginName;
    public int memberType;
    public String domain;
    public Date insertedTime;
    public boolean isExternalUser;
    public String sharedSource;
    public boolean isSiteAdmin;
    public String role;
    public String ownerTitle;

    public SitePermissions()
    {
//        this.siteId = siteId;
//        this.webId = webId;
//
//            #region common properties
//        this.id = roleAssignment.Member.Id;
//        this.displayName = roleAssignment.Member.Title;
//        this.loginName = roleAssignment.Member.LoginName;
//        this.insertedTime = DateTime.Now;
//        this.sharedSource = "site";
//        this.role = roles;
//            #endregion
//
//            #region Split and caste Member to SiteUser/SiteGroup to get the propeties of SiteUser/SiteGroup
//        if (roleAssignment.Member is Microsoft.SharePoint.Client.User)
//        {
//            try
//            {
//                var siteUser = (Microsoft.SharePoint.Client.User)roleAssignment.Member;
//                this.memberType = (int)MemberType.User;
//                this.email = siteUser.UserPrincipalName;
//                if (this.email != null && this.email.Contains("@"))
//                {
//                    this.domain = this.email.Split('@')[1];
//                }
//                this.isExternalUser = (this.loginName.ToLower().Contains("#ext#"));
//                this.isSiteAdmin = siteUser.IsSiteAdmin;
//            }
//            catch (Exception e)
//            {
//                Log.Info($"Some properties of Site User is empty or ot initilized. Error message : {e.Message}");
//            }
//        }
//            else if(roleAssignment.Member is Microsoft.SharePoint.Client.Group)
//        {
//            try
//            {
//                var siteGroup = (Microsoft.SharePoint.Client.Group)roleAssignment.Member;
//                this.memberType =(int) ((siteGroup.PrincipalType.ToString().ToLower().Equals("sharepointgroup")) ? MemberType.SharePointGroup : MemberType.Group);
//                this.ownerTitle = siteGroup.OwnerTitle;
//            }
//            catch (Exception e)
//            {
//                Log.Info($"Some properties of Site Group is empty or ot initilized. Error message : {e.Message}");
//            }
//        }
//            else
//        {
//            Log.Info("unknown Type of entry under RoleAssignment's member property");
//        }

    }

}
