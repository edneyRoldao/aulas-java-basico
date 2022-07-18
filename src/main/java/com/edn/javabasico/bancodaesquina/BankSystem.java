package com.edn.javabasico.bancodaesquina;

public class BankSystem {

    public static void main(String[] args) {
        var ba1 = new BankAccount("Abner", AccountType.INVESTMENT);
        var ba2 = new BankAccount("Erick", 1000.0F, AccountType.NORMAL);

        BankService bankService = new BankServiceInterImpl();

        bankService.deposit(ba1, 500F);
        bankService.showBalance(ba1);

        bankService.withdraw(ba2, 300F);
        bankService.showBalance(ba2);

        bankService.transfer(ba2, ba1, 100F);
        bankService.showBalance(ba1);
        bankService.showBalance(ba2);
    }

}
