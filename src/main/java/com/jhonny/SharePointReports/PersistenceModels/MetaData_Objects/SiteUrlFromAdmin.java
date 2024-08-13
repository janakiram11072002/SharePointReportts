package com.jhonny.SharePointReports.PersistenceModels.MetaData_Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class SiteUrlFromAdmin {
    @JsonProperty("PrimaryQueryResult")
    private PrimaryQueryResult primaryQueryResult;
    @JsonProperty("ElapsedTime")
    private int ElapsedTime;
    public PrimaryQueryResult getPrimaryQueryResult() {
        return primaryQueryResult;
    }

    public void setPrimaryQueryResult(PrimaryQueryResult primaryQueryResult) {
        this.primaryQueryResult = primaryQueryResult;
    }

    public int getElapsedTime() {
        return ElapsedTime;
    }

    public void setElapsedTime(int elapsedTime) {
        ElapsedTime = elapsedTime;
    }

    public List<Row> getRows()
    {
        return  primaryQueryResult.getRelevantResults().getTable().getRows();
    }
    public int getRowCount()
    {
        return primaryQueryResult.getRelevantResults().getRowCount();
    }
    public int getTotalRow()
    {
        return primaryQueryResult.getRelevantResults().getTotalRows();
    }
    public int getTotalRowsIncludingDuplicates()
    {
        return primaryQueryResult.getRelevantResults().getTotalRowsIncludingDuplicates();
    }
}
@JsonIgnoreProperties(ignoreUnknown = true)
class PrimaryQueryResult {
    @JsonProperty("RelevantResults")
    private RelevantResults relevantResults;

    public RelevantResults getRelevantResults() {
        return relevantResults;
    }

    public void setRelevantResults(RelevantResults relevantResults) {
        this.relevantResults = relevantResults;
    }
}
@JsonIgnoreProperties(ignoreUnknown = true)
class RelevantResults {
    @JsonProperty("Table")
    private Table table;

    @JsonProperty("RowCount")
    private int rowCount;

    @JsonProperty("TotalRows")
    private int totalRows;

    @JsonProperty("TotalRowsIncludingDuplicates")
    private int totalRowsIncludingDuplicates;

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public int getRowCount() {
        return rowCount;
    }

    public void setRowCount(int rowCount) {
        this.rowCount = rowCount;
    }

    public int getTotalRows() {
        return totalRows;
    }

    public void setTotalRows(int totalRows) {
        this.totalRows = totalRows;
    }

    public int getTotalRowsIncludingDuplicates() {
        return totalRowsIncludingDuplicates;
    }

    public void setTotalRowsIncludingDuplicates(int totalRowsIncludingDuplicates) {
        this.totalRowsIncludingDuplicates = totalRowsIncludingDuplicates;
    }
}
@JsonIgnoreProperties(ignoreUnknown = true)
class Table {
    @JsonProperty("Rows")
    private List<Row> rows;

    public List<Row> getRows() {
        return rows;
    }

    public void setRows(List<Row> rows) {
        this.rows = rows;
    }
}

