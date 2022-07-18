package com.edn.javabasico.bancodaesquina;

public interface BankService {

    void showBalance(BankAccount account);

    void deposit(BankAccount account, Float amount);

    void withdraw(BankAccount account, Float amount);

    void transfer(BankAccount origin, BankAccount target, Float amount);

    default void validate() {

    }

}
