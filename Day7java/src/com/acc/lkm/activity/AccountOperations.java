package com.acc.lkm.activity;

public interface AccountOperations {
 default void printStatement() {
     System.out.println("Account Statement: ");
     System.out.println("Account Type: Savings");
     System.out.println("Balance: " + getBalance());
 }
 
 static void bankname() {
     System.out.println("Bank Name: HelloBank");
 }
 
 double getBalance();
}
