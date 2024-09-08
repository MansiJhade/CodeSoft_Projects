package com.company;

import java.util.Scanner;

public class MJ_106_Student_Grade_Calculator {
    public static void main(String[] args) {
        System.out.println("************** Student Grade Calculator ****************");
        System.out.println(" ");

        System.out.println("___________ Note : ");
        System.out.println(" --> This Student Grading System is for 5 Subjects   ");


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your Name : ");
        String n = sc.nextLine();

        System.out.println("Enter your Roll No. : ");
        int  r = sc.nextInt();

        System.out.println("Enter number of First Subject : ");
        float a = sc.nextFloat();

        System.out.println("Enter number of Second Subject : ");
        float b = sc.nextFloat();

        System.out.println("Enter number of third Subject : ");
        float c = sc.nextFloat();

        System.out.println("Enter number of fourth Subject : ");
        float d = sc.nextFloat();

        System.out.println("Enter number of fifth Subject : ");
        float e = sc.nextFloat();

        System.out.println(" ");

        float sum = a+b+c+d+e;

        float percent = sum/5;

        System.out.println(" Name : " + n);
        System.out.println(" ");

        System.out.println("Roll no. : " + r);
        System.out.println(" ");

        System.out.println("Totle Sum of your Numbers is : " + sum);
        System.out.println(" ");

        System.out.println("Average percent   is : " + percent + " % ");
        System.out.println(" ");

        if(percent==100){
            System.out.println(" Grade = A++");
        }
        else if (percent >= 90 ) {

            System.out.println(" Grade = A+");
        }
        else if (percent >= 80 ) {

            System.out.println(" Grade = B+");
        }
        else if (percent >= 70 ) {

            System.out.println(" Grade = B");
        }
        else if (percent >=60  ) {

            System.out.println(" Grade = c+");
        }
        else if  (percent >=50 ) {

            System.out.println(" Grade = c");
        }
        else if (percent >=40  ) {

            System.out.println(" Grade = D+");
        }
        else if (percent >=35 ) {
            System.out.println(" Grade = D");
        }
        else if  ( percent < 35) {
            System.out.println(" Grade = Fail");
        }






    }
}

