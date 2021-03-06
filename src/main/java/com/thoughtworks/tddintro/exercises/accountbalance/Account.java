package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {

    private int balance;

    public Account(int startingBalance){
        this.balance = startingBalance;
    }

    public void deposit(int amount){
        this.balance += amount;
    }

    public void withdraw(int amount){
        if (amount < balance){
            this.balance -= amount;
        }
    }

    public int getBalance(){
        return this.balance;
    }

}
