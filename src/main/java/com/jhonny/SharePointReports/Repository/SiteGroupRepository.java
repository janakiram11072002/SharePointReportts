package com.jhonny.SharePointReports.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.jhonny.SharePointReports.PersistenceModels.SiteGroup;
import com.jhonny.SharePointReports.PersistenceModels.SiteGroupKey;

public interface SiteGroupRepository extends CrudRepository<SiteGroup, SiteGroupKey>
{
    // // updating partitin id
    // @Modifying
    // @Transactional
    // @Query("UPDATE SiteGroup e SET e.partition = :newPartition WHERE e.partition = :oldPartition")
    // void updatePartition(@Param("oldPartition") int oldPartition, @Param("newPartition") int newPartition);

    // // Delete rows based on partition filter
    // @Modifying
    // @Transactional
    // @Query("DELETE FROM SiteGroup e WHERE e.partition = :partition")
    // void deleteByPartition(@Param("partition") int partition);
}
