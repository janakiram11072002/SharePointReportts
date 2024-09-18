package com.jhonny.SharePointReports.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.jhonny.SharePointReports.PersistenceModels.Site;
import com.jhonny.SharePointReports.PersistenceModels.SiteKey;

public interface SiteRepository  extends CrudRepository<Site, SiteKey>
{
    // // updating partitin id
    // @Modifying
    // @Transactional
    // @Query("UPDATE Site e SET e.key.partitionId = :newPartition WHERE e.key.partitionId = :oldPartition")
    // void updatePartition(@Param("oldPartition") int oldPartition, @Param("newPartition") int newPartition);

    // // Delete rows based on partition filter
    // @Modifying
    // @Transactional
    // @Query("DELETE FROM Site e WHERE e.key.partitionId = :partition")
    // void deleteByPartition(@Param("partition") int partition);
}
