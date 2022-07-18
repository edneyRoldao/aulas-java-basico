package com.edn.javabasico.bancodaesquina;

public class BankServiceInterImpl implements BankService {

    @Override
    public void showBalance(BankAccount account) {
        System.out.println(account.getBalance());
    }

    @Override
    public void deposit(BankAccount account, Float amount) {
        account.setBalance(account.getBalance() + amount);
    }

    @Override
    public void withdraw(BankAccount account, Float amount) {
        if (amount <= account.getBalance()) {
            account.setBalance(account.getBalance() - amount);
        }
    }

    @Override
    public void transfer(BankAccount origin, BankAccount target, Float amount) {
        withdraw(origin, amount);
        deposit(target, amount);
    }

}
