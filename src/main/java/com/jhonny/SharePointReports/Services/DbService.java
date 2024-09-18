package com.jhonny.SharePointReports.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jhonny.SharePointReports.PersistenceModels.List;
import com.jhonny.SharePointReports.PersistenceModels.Site;
import com.jhonny.SharePointReports.PersistenceModels.SiteGroup;
import com.jhonny.SharePointReports.PersistenceModels.SiteGroupMember;
import com.jhonny.SharePointReports.PersistenceModels.SiteUsers;
import com.jhonny.SharePointReports.PersistenceModels.Web;
import com.jhonny.SharePointReports.Repository.ListRepository;
import com.jhonny.SharePointReports.Repository.SiteGroupMemberRepository;
import com.jhonny.SharePointReports.Repository.SiteGroupRepository;
import com.jhonny.SharePointReports.Repository.SiteRepository;
import com.jhonny.SharePointReports.Repository.SiteUserRepository;
import com.jhonny.SharePointReports.Repository.WebRepository;

@Service
public class DbService
{
    //@Autowired(required=true)
    private SiteRepository site;
    private WebRepository web;
    private ListRepository list;
    private SiteUserRepository user;
    private SiteGroupRepository group;
    private SiteGroupMemberRepository member;

    @Autowired(required=true)
    public DbService(SiteRepository siterepo, WebRepository web, ListRepository list, SiteUserRepository user, SiteGroupRepository group, SiteGroupMemberRepository member)
    {
        this.site = siterepo;
        this.web = web;
        this.list = list;
        this.user = user;
        this.group = group;
        this.member = member;
    }

    @Transactional
    public void saveSite(Site site) {
        this.site.save(site);
    }

    @Transactional
    public void saveWeb(Web web)
    {
        this.web.save(web);
    }

    @Transactional
    public void saveList(List list)
    {
        this.list.save(list);
    }

    @Transactional
    public void saveUser(SiteUsers user)
    {
        this.user.save(user);
    }

    @Transactional
    public void saveGroup (SiteGroup group)
    {
        this.group.save(group);
    }

    @Transactional
    public void saveMember(SiteGroupMember member)
    {
        this.member.save(member);
    }

    @Transactional
    public void createPartition(int id) throws Exception
    {
        try
        {
        //    this.site.updatePartition(0, id);
        //    this.web.updatePartition(0, id);
        //    this.list.updatePartition(0, id);
        //    this.user.updatePartition(0, id);
        //    this.group.updatePartition(0, id);
        //    this.member.updatePartition(0, id);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            throw new Exception();
        }
    }

    @Transactional
    public void DeleteOldPartition(int id) throws Exception
    {
        try
        {
        //    this.site.deleteByPartition(id);
        //    this.web.deleteByPartition(id);
        //    this.list.deleteByPartition(id);
        //    this.user.deleteByPartition(id);
        //    this.group.deleteByPartition(id);
        //    this.member.deleteByPartition(id);
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
            throw new Exception();
        }
    }
}
 