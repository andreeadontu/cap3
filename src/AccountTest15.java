package com.company;
import java.util.Scanner;
public class AccountTest15 {
    public static void main(String[] args){
        ex15 account1 = new ex15("Elisabeth Janssen", 500.00);
        ex15 account2 = new ex15("Adele Padalecki", -10.50);
        System.out.printf("%s balance: $%1.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%1.2f%n", account2.getName(), account2.getBalance());
        Scanner input=new Scanner(System.in);
        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble();
        System.out.printf("%naddig %1.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);
        System.out.printf("%s balance: $%1.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%1.2f%n", account2.getName(), account2.getBalance());
        System.out.print("Enter deposit amount for account 2: ");
        depositAmount = input.nextDouble();
        System.out.printf("%nadding %1.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);
        System.out.printf("%s balance: $%1.2f%n", account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%1.2f%n", account2.getName(), account2.getBalance());
    }
}
