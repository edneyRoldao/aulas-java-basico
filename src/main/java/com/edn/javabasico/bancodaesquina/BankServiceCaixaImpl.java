package com.edn.javabasico.bancodaesquina;

public class BankServiceCaixaImpl implements BankService {

    @Override
    public void showBalance(BankAccount account) {
        System.out.println(account.getBalance());
    }

    @Override
    public void deposit(BankAccount account, Float amount) {
        if (amount > 10000F) {
            System.out.println("sou um banco de bosta, vc nao pode fazer esse deposito");
        } else {
            account.setBalance(account.getBalance() + amount);
        }
    }

    @Override
    public void withdraw(BankAccount account, Float amount) {
        if (amount > 100) {
            System.out.println("sou um banco de bosta, vc nao pode sacar esse valor pq nao vai sobrar para os outros");
        } else if (amount > account.getBalance()) {
            System.out.println("vc nao tem saldo para sacar");
        } else {
            account.setBalance(account.getBalance() - amount);
            System.out.println("saldo atual: " + account.getBalance());
        }
    }

    @Override
    public void transfer(BankAccount origin, BankAccount target, Float amount) {
        withdraw(origin, amount);
        deposit(target, amount);
    }

}
