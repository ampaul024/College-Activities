import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class ChatBot {
    public static void main(String[] args) throws InterruptedException {

        String date, first, avail, tuition, name;

        Scanner jp = new Scanner(System.in);

        System.out.println("Hello! This is Sti College Cubao\nWhat is Your Name?");
        name = jp.nextLine();
        Thread.sleep(2000);

        System.out.println("Nice to meet you, " + name + ". I'm Your Personal Ai Assistant.");
        System.out.println("\nHow Can i Help You?");

        System.out.println("What is the date of enrollment (A)");
        System.out.println("what is the first day of classes (B)");

        Thread.sleep(2000);
        String Letter = jp.nextLine();

        if (Letter.equalsIgnoreCase("A")) {
            System.out.println("\nthe date is june");

        } else if (Letter.equalsIgnoreCase("B")) {
            System.out.println("The first day of classes is june");

        } else {
            System.out.println("Sorry i cant answer your question");

        }
        Thread.sleep(2000);
        System.out.println("\nYou Wanna Know About Courses?");
        System.out.println("\nYes/No?");
        String question = jp.nextLine();
        
        if (question.equalsIgnoreCase("Yes")) {
            System.out.println("Great Press The Letter You Wanna Know About");
            System.out.println("Available Courses And Tuition Fee (A)");
            System.out.println("");
           
        }Thread.sleep(2000); 
        

    }
}
