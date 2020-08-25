package studentdatabaseapp;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int gradeYear;
    private String studentID;
    private String courses = null;
    private int tuitionBalance = 0;
    private int costOfCourse = 600;
    private static int id = 1000;

    // constructor to get name and year from student
    public Student() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter student first name: ");
        this.firstName = sc.nextLine();

        System.out.println("Enter student last name: ");
        this.lastName = sc.nextLine();

        System.out.println("Enter student class year");
        this.gradeYear = sc.nextInt();

        setID();

    }


    // generate 5 digit unique ID with first number as grade level
    private void setID() {
        // grade year + id
        id++;
        this.studentID = gradeYear + "" + id;

    }
    // enroll in courses

    public void enroll() {
        // get inside a loop when user hits 0 when done enrolling
        do {
            System.out.println("enter course to enroll (Q to quit)");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n" + course;
                tuitionBalance = tuitionBalance + costOfCourse;
            } else {
                break;
            }
        } while (1 != 0);

    }

    // view balance
    public void viewBalance() {
        System.out.println("Balance is " + tuitionBalance);
    }
    // pay tuition

    public void payTuition() {
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your payment: ");
        int payment = in.nextInt();
        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you for your payment of " + payment);
        viewBalance();
    }

    // show status
    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nCourses Enrolled: " + courses +
                "\nBalance: $" + tuitionBalance;

    }

}
