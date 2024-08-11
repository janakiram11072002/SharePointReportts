package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.WebProperties;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SPUserCollection
{
    @JsonProperty("_Child_Items_")
    private User[] Users;

    public User[] getUsers() {
        return Users;
    }

    public void setUsers(User[] users) {
        Users = users;
    }

}