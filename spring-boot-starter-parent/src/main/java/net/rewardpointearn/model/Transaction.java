package net.rewardpointearn.model;

import java.util.Date;

public class Transaction {
    private String customerName;
    private double amount;
    private Date date;

    public Transaction(String customerName, double amount, Date date) {
this.customerName = customerName;
this.amount = amount;
this.date = date;
    }

    public String getCustomerName() {
        return customerName;
    }
    public double getAmount() {
        return amount;
    }

    public Date getDate() {
        return date;
    }
}
