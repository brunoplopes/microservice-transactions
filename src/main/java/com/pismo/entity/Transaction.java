package com.pismo.entity;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "Transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Transaction_ID")
    private Long id;

    @Column(name = "Account_ID")
    private Long accountId;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name="OperationType_ID")
    private OperationType operationType;

    @Column(name = "Amount")
    private Double amount;

    @Column(name = "Balance")
    private Double balance;

    @Column(name = "EventDate")
    private Date eventDate;

    @Column(name = "DueDate")
    private Date dueDate;

    public Transaction() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public OperationType getOperationType() {
        return operationType;
    }

    public void setOperationType(OperationType operationType) {
        this.operationType = operationType;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Date getEventDate() {
        return eventDate;
    }

    public void setEventDate(Date eventDate) {
        this.eventDate = eventDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
}
