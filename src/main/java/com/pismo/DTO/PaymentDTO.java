package com.pismo.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class PaymentDTO {

    @JsonProperty("account_id")
    private Long accountId;

    @JsonProperty("amount")
    private Double amount;

    public PaymentDTO() {
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
