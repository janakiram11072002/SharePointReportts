package com.jhonny.SharePointReports.PersistenceModels;

import java.io.Serializable;

import jakarta.persistence.Embeddable;

@Embeddable
public class SiteKey implements Serializable, IPartition
{
    
    public String id;
}
