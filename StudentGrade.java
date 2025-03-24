import java.util.*;

public class StudentGrade
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Subjects");
        int n = sc.nextInt();
        int total = 0;

        int marks[] = new int[n];
        for(int i = 0; i<n ; i++)
        {
            System.out.println("Enter marks of Subject" + (i+1) + "out of 100");
            marks[i]= sc.nextInt();
            total = total + marks[i];
        }     
        double avg = total/n;

        char grade;
        if (avg >= 90) {
            grade = 'A';
        } else if (avg >= 80) {
            grade = 'B';
        } else if (avg >= 70) {
            grade = 'C';
        } else if (avg >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Total marks : "+ total);
        System.out.println("Averge Persentage : "+ avg);
        System.out.println("Grade Obtained : "+ grade);


        sc.close();
    }
}