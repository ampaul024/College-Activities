import java.util.PriorityQueue;
import java.util.Scanner;

public class PrioQueue {

    public static void main(String[] args) {

        PriorityQueue<String> CM = new PriorityQueue<>();

        Scanner jp = new Scanner(System.in);

        System.out.println("Enter the nicknames of 4 of your classmates: ");
        for (int i = 0; i < 4; i++) {

            CM.add(jp.nextLine());

        }
        System.out.println("Press H to say Hi to each of them. H");
        while (!CM.isEmpty()) {
            jp.nextLine();

            System.out.print("Hi " + CM.peek());
            CM.poll();
            if (CM.isEmpty()) {
                System.out.println("\nDone Saying Hi");

            } else {
                System.out.println(" ");
            }

        }

    }
}
