package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects.GeoInstances;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TenantInstanceResponse
{
    @JsonProperty("_Child_Items_")
    private List<SPOTenantInstance> _Child_Items_;

    public List<SPOTenantInstance> get_Child_Items_() {
        return _Child_Items_;
    }

    public void set_Child_Items_(List<SPOTenantInstance> _Child_Items_) {
        this._Child_Items_ = _Child_Items_;
    }
}
