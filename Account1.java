package com.package1;

//Parent class
class BankAccount {
 protected double balance;

 public BankAccount(double initialBalance) {
     this.balance = initialBalance;
 }

 // Method to deposit money into the account
 public void deposit(double amount) {
     balance += amount;
     System.out.println("Deposit: $" + amount);
 }

 // Method to withdraw money from the account (to be overridden by subclasses)
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawal: $" + amount);
     } else {
         System.out.println("Insufficient funds");
     }
 }

 // Method to display balance
 public void displayBalance() {
     System.out.println("Current Balance: $" + balance);
 }
}

//Subclass SavingsAccount
class SavingsAccount extends BankAccount {
 private double withdrawalLimit;

 public SavingsAccount(double initialBalance, double withdrawalLimit) {
     super(initialBalance);
     this.withdrawalLimit = withdrawalLimit;
 }

 // Override withdraw method for SavingsAccount
 @Override
 public void withdraw(double amount) {
     if (amount <= balance && amount <= withdrawalLimit) {
         balance -= amount;
         System.out.println("Withdrawal: $" + amount);
     } else if (amount > withdrawalLimit) {
         System.out.println("Withdrawal limit exceeded");
     } else {
         System.out.println("Insufficient funds");
     }
 }
}

//Subclass CheckingAccount
class CheckingAccount extends BankAccount {
 private double overdraftFee;

 public CheckingAccount(double initialBalance, double overdraftFee) {
     super(initialBalance);
     this.overdraftFee = overdraftFee;
 }

 // Override withdraw method for CheckingAccount
 @Override
 public void withdraw(double amount) {
     if (amount <= balance) {
         balance -= amount;
         System.out.println("Withdrawal: $" + amount);
     } else {
         double overdraftAmount = amount - balance;
         balance = 0;
         System.out.println("Overdraft fee applied: $" + overdraftFee);
         System.out.println("Withdrawal: $" + (amount - overdraftAmount));
     }
 }
}

public class Account1 {
 public static void main(String[] args) {
     SavingsAccount savingsAccount = new SavingsAccount(2000, 400);
     CheckingAccount checkingAccount = new CheckingAccount(2000, 40);

     savingsAccount.displayBalance();
     savingsAccount.deposit(300);
     savingsAccount.withdraw(400);
     savingsAccount.withdraw(500);

     checkingAccount.displayBalance();
     checkingAccount.deposit(300);
     checkingAccount.withdraw(400);
     checkingAccount.withdraw(1300);
 }
}
