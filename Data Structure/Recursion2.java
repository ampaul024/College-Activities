import java.util.Scanner;

public class Recursion2 {

    public static void display_num(int n) {

        if (n >= 1) {

            display_num(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {

        Scanner jp = new Scanner(System.in);

        System.out.print("Enter Max Number To Display: ");
        int x = jp.nextInt();

        if (x < 1) {

            System.out.println("Wrong Input.....");

        } else {
            display_num(x);
        }
    }
}
