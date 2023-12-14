import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ChatBot {

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        System.out.print("Hello! This is STI College AI");

        System.out.println("\nWhat Is Your Name? ");
        String name = sc.nextLine();
        Thread.sleep(1500);

        System.out.println("\nNice To Meet You " + name);
        System.out.println("What can i do for you?");
        String school = sc.nextLine();
        Thread.sleep(1500);

        if (school.equalsIgnoreCase("Enrollment")) {
            System.out.println("\nSure! I'll Help You With That");

            System.out.println("Fill Up This Form Please: ");

            System.out.print("\nYour Full Name: ");
            String a1 = sc.nextLine();
            System.out.print("Course: ");
            String a2 = sc.nextLine();
            System.out.print("Section: ");
            String a3 = sc.nextLine();
            System.out.print("Email Address ");
            String a4 = sc.nextLine();
            Thread.sleep(2500);

            System.out.println("\nThank You For Enrolling In STI College\n Here Is Your Form");
            System.out.println(a1);
            System.out.println(a2);
            System.out.println(a3);
            System.out.println(a4);
            System.out.println("Please Proceed To The Cashier and Registrar for your payment");

        } else if (school.equalsIgnoreCase("Transfer")) {
            System.out.println("\nSure! I'll Help You With That");

            System.out.println("Fill Up This Form Please: ");

            System.out.print("\nYour Full Name: ");
            String b1 = sc.nextLine();
            System.out.print("Course: ");
            String b2 = sc.nextLine();
            System.out.print("Section: ");
            String b3 = sc.nextLine();
            System.out.print("Email Address: ");
            String b4 = sc.nextLine();
            Thread.sleep(2500);

            System.out.println("\nThank You For Enrolling In STI College\n Here Is Your Form");
            System.out.println(b1);
            System.out.println(b2);
            System.out.println(b3);
            System.out.println(b4);
            System.out.println("Please Proceed To The Cashier and Registrar for more assistant");

        } else {
            System.out.println("\nSorry I Can't Help You, You Can Ask The Registrar For Assistant");
            System.out.println("I Can Help for Enrollment And Transfer Only, Thank You");
        }

    }

}
