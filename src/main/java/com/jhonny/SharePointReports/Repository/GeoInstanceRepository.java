package com.jhonny.SharePointReports.Repository;

import org.springframework.data.repository.CrudRepository;

import com.jhonny.SharePointReports.PersistenceModels.GeoInstanceKey;
import com.jhonny.SharePointReports.PersistenceModels.GeoInstance;

public interface GeoInstanceRepository extends CrudRepository<GeoInstance, GeoInstanceKey>
{
    // // updating partitin id
    // @Modifying
    // @Transactional
    // @Query("UPDATE List e SET e.partition = :newPartition WHERE e.partition = :oldPartition")
    // void updatePartition(@Param("oldPartition") int oldPartition, @Param("newPartition") int newPartition);

    // // Delete rows based on partition filter
    // @Modifying
    // @Transactional
    // @Query("DELETE FROM List e WHERE e.partition = :partition")
    // void deleteByPartition(@Param("partition") int partition);
}