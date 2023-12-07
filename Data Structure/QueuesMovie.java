import java.util.Queue;
import java.util.Scanner;
import java.util.LinkedList;

public class QueuesMovie {

    public static void main(String[] args) {
        Scanner jp = new Scanner(System.in);
        Queue<String> movies = new LinkedList<>();
        Queue<String> snacks = new LinkedList<>();

        for (int i = 1; i <= 3; i++) {
            System.out.print("Enter Movie " + i + " of 3:");
            String amp = jp.nextLine();
            movies.offer(amp);
        }

        for (int a = 1; a <= 3; a++) {
            System.out.print("Enter Snacks " + a + " of 3: ");
            String paul = jp.nextLine();
            snacks.offer(paul);
        }

        System.out.println("Movies to watch are:" + movies);
        System.out.println("Snacks Available are: " + snacks);

        System.out.println("Press S each time you finish a snack");

        while (true) {
            char a1 = jp.next().charAt(0);

            if (a1 == 'S' || a1 == 's') {

                snacks.poll();
            }

            if (snacks.isEmpty()) {
                System.out.print("No more snacks");
                break;
            }
            System.out.println("deque " + snacks);
        }
    }
}