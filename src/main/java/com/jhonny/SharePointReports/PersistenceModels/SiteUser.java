package com.jhonny.SharePointReports.PersistenceModels;

import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.Group;
import com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties.User;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Arrays;
import java.util.stream.Collectors;

@Entity
@Table(name = "site_user")
public class SiteUser
{
//    public String siteId;
//    public String webId;
//    public int id;
    @EmbeddedId
    public SiteUserKey key;

    public int siteType;
    public String geoLocation;
    public String email;
    public String userPrincipleName;
    @Column(columnDefinition = "TEXT")
    public String groups;
    public boolean isShareByEmailGuestUser;
    public boolean isSiteAdmin;
    public boolean isSiteOwner;
    public String userId_nameId;
    public String userId_nameIdUser;
    public String userId_typeId;
    public boolean isHiddenInUI;
    @Column(columnDefinition = "TEXT")
    public String loginName;
    public String title;
    public int principalType;
//    public String objectVersion;
    @Column(columnDefinition = "TEXT")
    public String webUrl;
    public String webTitle;
    public String siteUrl;
    public String siteTitle;

    public SiteUser()
    {

    }
    public SiteUser(Web webSource, User source, boolean isSiteOwner)
    {

//        this.siteId = webSource.siteId;
//        this.webId = webSource.id;
//        this.id = source.getId();

        this.key = new SiteUserKey(webSource.key.siteId, webSource.key.id, source.getId());

        this.siteType = webSource.siteType;
        this.geoLocation = webSource.geoLocation;
        this.email = source.getEmail();
        this.userPrincipleName = source.getUserPrincipalName();
        try {
            this.groups = Arrays.stream(source.getGroupCollection().getGroups()).map(Group::getLoginName).collect(Collectors.joining(", "));
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        this.isShareByEmailGuestUser = source.isShareByEmailGuestUser();
        this.isSiteAdmin = source.isSiteAdmin();
       this.isSiteOwner = isSiteOwner;
        try {
            this.userId_nameId = source.getUserId().getNameId();
            this.userId_nameIdUser = source.getUserId().getNameIdIssuer();
            this.userId_typeId = source.getUserId().getTypeId();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        this.isHiddenInUI = source.isHiddenInUI();
        this.loginName = source.getLoginName();
        this.title = source.getTitle();
        this.principalType = source.getPrincipalType();

//        this.objectVersion = source.;
        this.webUrl = webSource.url;
        this.webTitle = webSource.title;
        this.siteUrl = webSource.siteUrl;
        this.siteTitle = webSource.siteTitle;
    }
}
