package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.SiteProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SensitivityLabelInfo
{
    @JsonProperty("DisplayName")
    private String DisplayName;
    @JsonProperty("Id")
    private String Id;
    @JsonProperty("MembersCanShare")
    private String MembersCanShare;

    public String getDisplayName() {
        return DisplayName;
    }

    public void setDisplayName(String displayName) {
        DisplayName = displayName;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getMembersCanShare() {
        return MembersCanShare;
    }

    public void setMembersCanShare(String membersCanShare) {
        MembersCanShare = membersCanShare;
    }
}
