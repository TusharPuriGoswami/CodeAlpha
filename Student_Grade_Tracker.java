package com.codsoft;
import java.util.Scanner;

public class Student_Grade_Tracker {
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter The Number Of Subject : ");
        int subject = sc.nextInt();

        int marks[] = new int[subject];
        int totalmarks = 0;

        for (int i = 0 ; i<subject ; i++)
        {
            System.out.println("Enter Marks Of " + (i+1) + " Subject : " + "(out of 100)");
            marks[i] = sc.nextInt();
            totalmarks = totalmarks + marks[i];
        }
        double averagePercentage = (double) totalmarks / subject;
        //Grade 90-100% = A ,80-90% = B, 70-80% = C , 60-70% = D, 50-60% = E , <=50 = Fail...
        char grade;

        if (averagePercentage >=90)
        {
           grade = 'A';
        }
        else if (averagePercentage >=80)
        {
            grade = 'B';
        }
        else if (averagePercentage >=70)
        {
           grade = 'C';
        }
        else if (averagePercentage >=60)
        {
            grade = 'D';
        }
        else if (averagePercentage >=50)
        {
            grade = 'E';
        }
        else
        {
         grade = 'F';
        }
        System.out.println("Total Marks: " + totalmarks);
        System.out.printf("Average Percentage: %.2f%%\n" , averagePercentage);
        System.out.println("Grade: " + grade);

    }
}
