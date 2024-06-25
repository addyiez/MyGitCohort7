package com.acc.lkm.activity;

public class BankAccount implements BankTransaction, AccountOperations {
 private double balance;

 @Override
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposited: " + amount);
 }

 @Override
 public void withdraw(double amount) {
     if (balance >= amount) {
         balance -= amount;
         System.out.println("Withdrawn: " + amount);
     } else {
         System.out.println("Insufficient balance");
     }
 }

 @Override
 public double getBalance() {
     return balance;
 }
}
