package com.pismo.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionDTO {

    @JsonProperty("account_id")
    private Long accountId;

    @JsonProperty("operation_type_id")
    private int operationTypeId;

    @JsonProperty("amount")
    private Double amount;

    public TransactionDTO() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public int getOperationTypeId() {
        return operationTypeId;
    }

    public void setOperationTypeId(int operationTypeId) {
        this.operationTypeId = operationTypeId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
