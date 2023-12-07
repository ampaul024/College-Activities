import java.util.Scanner;

public class Recursion {
    public static void main(String[] args) {
        Scanner jp = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int x = jp.nextInt();

        System.out.print("Enter 2nd Number: ");
        int y = jp.nextInt();

        if (x > y) {
            System.out.println(x + " is greater than " + y);

        } else if (x == y) {
            System.out.println(x + " is equal to " + y);
        } else {
            System.out.println(x + " is less than to " + y);
        }

    }
}
