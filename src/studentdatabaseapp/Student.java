package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private int studentID;
    private String courses;
    private int tuitionBalance;
    private int costOfCourse = 600;

    // constructor to get name and year from student
    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = sc.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = sc.nextLine();

        System.out.println("Enter student class year");
        this.gradeYear = sc.nextInt();

        System.out.println(firstName + lastName + gradeYear);


    }


    // generate 5 digit unique ID with first number as grade level

    // enroll in courses

    // pay tuition

    // show status

}
