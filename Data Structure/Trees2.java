import java.util.Scanner;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Trees2 {

    public static void main(String[] args) {

        Scanner jp = new Scanner(System.in);
        Stack<String> book = new Stack<>();
        Queue<String> books = new LinkedList<>();

        System.out.println("Enter Four Book Title\n ");

        String a;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter Book " + i + " of 4:");
            a = jp.nextLine();
            book.push(a);
        }
        for (int i = 1; i <= 4; i++) {
            books.offer(book.pop());
        }
        System.out.println("New order of Books: ");
        System.out.print(books);

    }

}
