package com.acc.lkm.activity;


public class Main {
 public static void main(String[] args) {
     BankAccount savingsAccount = new BankAccount();
     BankAccount checkingAccount = new BankAccount();

     savingsAccount.deposit(1000);
     savingsAccount.printStatement();
     savingsAccount.withdraw(500);
     savingsAccount.printStatement();

     checkingAccount.deposit(2000);
     checkingAccount.printStatement();
     checkingAccount.withdraw(1500);
     checkingAccount.printStatement();

     AccountOperations.bankname(); // Static method
 }
}
