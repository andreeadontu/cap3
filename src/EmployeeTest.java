package com.company;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee joe = new Employee("Elisabeth", "Janssen", 10000);
        Employee tod = new Employee("Adele", "Padalecki", 15500);
        System.out.println(joe.getFirstName() + "'s monthly salary is " + joe.getMonthlySalary());
        System.out.println(tod.getFirstName() + "'s monthly salary is " + tod.getMonthlySalary());
        joe.setMonthlySalary(joe.getMonthlySalary() * 1.1);
        tod.setMonthlySalary(tod.getMonthlySalary() * 1.1);
        System.out.println("Salary after 10% boost");
        System.out.println(joe.getFirstName() + "'s monthly salary is " + joe.getMonthlySalary());
        System.out.println(tod.getFirstName() + "'s monthly salary is " + tod.getMonthlySalary());
    }
}