package com.company;
import java.util.Scanner;

public class HeartRateTest{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        // get user information
        System.out.print("Enter first name: ");
        String fName = input.nextLine();

        System.out.print("Enter last name: ");
        String lName = input.nextLine();

        System.out.print("Enter Date of birth dd mm yyyy: ");
        int[] tmpdob = new int[3];

        for(int i=0; i<3; i++){
            tmpdob[i] = input.nextInt();
        }

        HeartRate user1 = new HeartRate(fName, lName, tmpdob[0], tmpdob[1], tmpdob[2]);

        printInfo(user1);
    }
    private static void printInfo(HeartRate user){
        System.out.printf("%s %s\n%s - %d years \nMax HeartRate: %d\n",
                user.getFirstName(), user.getLastName(), user.getDOB(),
                user.getAge(), user.getMaxHeartRate());

        System.out.printf("Target Heart Rate Range: %s\n", user.getTargetHeartRate());
    }
}