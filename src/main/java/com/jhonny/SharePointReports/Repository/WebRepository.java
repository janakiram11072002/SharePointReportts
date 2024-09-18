package com.jhonny.SharePointReports.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.repository.CrudRepository;
import com.jhonny.SharePointReports.PersistenceModels.Web;
import com.jhonny.SharePointReports.PersistenceModels.WebKey;

public interface WebRepository extends CrudRepository<Web, WebKey>
{
    // // updating partitin id
    // @Modifying
    // @Transactional
    // @Query("UPDATE Web e SET e.partition = :newPartition WHERE e.partition = :oldPartition")
    // void updatePartition(@Param("oldPartition") int oldPartition, @Param("newPartition") int newPartition);

    // // Delete rows based on partition filter
    // @Modifying
    // @Transactional
    // @Query("DELETE FROM Web e WHERE e.partition = :partition")
    // void deleteByPartition(@Param("partition") int partition);
}
