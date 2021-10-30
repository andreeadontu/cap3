package com.company;

public class ex15 {
    private String name;
    private double balance;
    public ex15(String name, double balance){
        this.name=name;
        if(balance>0){
            this.balance=balance;
        }
    }
    public void deposit(double depositAmount){
        if(depositAmount > 0){
            balance+=depositAmount;
        }
    }
    public double getBalance(){
        return balance;
    }
    public void setName(String newName){
        this.name=name;
    }
    public String getName(){
        return name;
    }
}