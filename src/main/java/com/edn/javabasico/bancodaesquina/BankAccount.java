package com.edn.javabasico.bancodaesquina;

import java.util.Objects;
import java.util.Random;

public class BankAccount {

    private Float balance;
    private String customer;
    private AccountType type;
    private final Integer number;

    public BankAccount(String customer, Float balance, AccountType type) {
        this.customer = customer;
        this.balance = balance;
        this.type = type;
        this.number = new Random().nextInt(10000) + 1;
    }

    public BankAccount(String customer, AccountType type) {
        this.customer = customer;
        this.type = type;
        balance = 0.0F;
        number = new Random().nextInt(10000) + 1;
    }

    public Integer getNumber() {
        return number;
    }

    public String getCustomer() {
        return customer;
    }

    public BankAccount setCustomer(String customer) {
        this.customer = customer;
        return this;
    }

    public Float getBalance() {
        return balance;
    }

    public BankAccount setBalance(Float balance) {
        this.balance = balance;
        return this;
    }

    public AccountType getType() {
        return type;
    }

    public BankAccount setType(AccountType type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "number=" + number +
                ", customer='" + customer + '\'' +
                ", balance=" + balance +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Objects.equals(number, that.number) && Objects.equals(customer, that.customer) && Objects.equals(balance, that.balance) && type == that.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, customer, balance, type);
    }

}
