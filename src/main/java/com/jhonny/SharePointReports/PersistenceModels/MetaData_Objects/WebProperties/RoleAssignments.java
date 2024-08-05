package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleAssignments
{
    @JsonProperty("groups")
    private List<Group> groups;
    @JsonProperty("RoleAssignments")
    private List<RoleAssignment> RoleAssignments;

}
