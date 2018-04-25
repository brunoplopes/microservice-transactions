package com.pismo.entity;

import javax.persistence.*;

@Entity(name = "OperationsTypes")
public class OperationType {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "OperationType_ID")
    private Long id;

    @Column(name = "Description")
    private String description;

    @Column(name = "ChargeOrder")
    private int chargeOrder;

    public OperationType() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getChargeOrder() {
        return chargeOrder;
    }

    public void setChargeOrder(int chargeOrder) {
        this.chargeOrder = chargeOrder;
    }
}
