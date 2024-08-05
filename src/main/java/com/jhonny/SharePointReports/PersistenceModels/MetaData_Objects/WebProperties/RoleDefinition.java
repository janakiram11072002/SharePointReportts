package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleDefinition
{
    @JsonProperty("Description")
    private String Description;
    @JsonProperty("Hidden")
    private String Hidden;
    @JsonProperty("Id")
    private Long Id;
    @JsonProperty("Name")
    private String Name;
    @JsonProperty("Order")
    private Long Order;
    @JsonProperty("RoleTypeKind")
    private int RoleTypeKind;
}
