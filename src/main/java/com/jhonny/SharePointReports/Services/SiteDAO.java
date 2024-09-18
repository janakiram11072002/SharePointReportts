// package com.jhonny.SharePointReports.Services;

// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Repository;
// import org.springframework.transaction.annotation.Transactional;

// import com.jhonny.SharePointReports.PersistenceModels.Site;

// import jakarta.persistence.EntityManager;
// import jakarta.persistence.PersistenceContext;

// @Repository
// public class SiteDAO implements IEntity_DAO<Site>
// {
//     //@PersistenceContext
//     private EntityManager entityManager;

//     @Autowired
//     public SiteDAO(EntityManager manager)
//     {
//         this.entityManager = manager;
//     }

//     @Override
//     @Transactional
//     public void save(Site site) 
//     {
//         if (site.key == null || entityManager.find(Site.class, site.key) == null) {
//             entityManager.persist(site);
//         }
//     }

//     // @Override
//     // @Transactional
//     // public void save(Site entity)
//     // {
//     //     entityManager.persist(entity);
//     // }
// }
