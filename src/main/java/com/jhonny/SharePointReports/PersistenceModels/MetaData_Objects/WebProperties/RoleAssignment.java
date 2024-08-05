package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class RoleAssignment
{
//    private User Members;
//    private Group Members;
    private List<RoleDefinition> RoleDefinitionBindings;
}
