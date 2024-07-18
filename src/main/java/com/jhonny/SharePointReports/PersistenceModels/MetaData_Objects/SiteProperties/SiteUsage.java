package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SiteProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteUsage 
{
    @JsonProperty("Bandwidth")
    private long Bandwidth;
    @JsonProperty("DiscussionStorage")
    private long DiscussionStorage;
    @JsonProperty("Hits")
    private long Hits;
    @JsonProperty("Storage")
    private long Storage;
    @JsonProperty("StoragePercentageUsed")
    private double StoragePercentageUsed;
    @JsonProperty("Visits")
    private long Visits;

    public long getBandwidth() {
        return Bandwidth;
    }
    public void setBandwidth(long bandwidth) {
        Bandwidth = bandwidth;
    }
    public long getDiscussionStorage() {
        return DiscussionStorage;
    }
    public void setDiscussionStorage(long discussionStorage) {
        DiscussionStorage = discussionStorage;
    }
    public long getHits() {
        return Hits;
    }
    public void setHits(long hits) {
        Hits = hits;
    }
    public long getStorage() {
        return Storage;
    }
    public void setStorage(long storage) {
        Storage = storage;
    }
    public double getStoragePercentageUsed() {
        return StoragePercentageUsed;
    }
    public void setStoragePercentageUsed(double storagePercentageUsed) {
        StoragePercentageUsed = storagePercentageUsed;
    }
    public long getVisits() {
        return Visits;
    }
    public void setVisits(long visits) {
        Visits = visits;
    }
}

/*
 *  <d:Bandwidth m:type="Edm.Int64">0</d:Bandwidth>
    <d:DiscussionStorage m:type="Edm.Int64">0</d:DiscussionStorage>
    <d:Hits m:type="Edm.Int64">0</d:Hits>
    <d:Storage m:type="Edm.Int64">967069894</d:Storage>
    <d:StoragePercentageUsed m:type="Edm.Double">3.5181797793484291E-05</d:StoragePercentageUsed>
    <d:Visits m:type="Edm.Int64">0</d:Visits>
 */
