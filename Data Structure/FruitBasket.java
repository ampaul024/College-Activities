import java.util.Scanner;
import java.util.Stack;

public class FruitBasket {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<String> basket = new Stack<>();

        System.out.println("Enter (1-4) \n  Press A(apple), O(Orange) , M(Mango), G(Guava) ");

        System.out.print("Enter of no. fruits you want to eat: ");
        int num = Integer.parseInt(sc.nextLine());

        System.out.println("Choose a fruit to catch.: ");

        for (int i = 1; i <= num; i++) {
            System.out.println("Press A(apple), O(Orange) , M(Mango), G(Guava): ");
            System.out.print("Fruit " + i + " of " + num + ": ");

            char fruit = sc.next().charAt(0);

            if (fruit == 'A' || fruit == 'a') {
                basket.push("apple");

            } else if (fruit == 'O' || fruit == 'o') {
                basket.push("orange");

            } else if (fruit == 'M' || fruit == 'm') {
                basket.push("mango");

            } else if (fruit == 'G' || fruit == 'g') {
                basket.push("guava");
            }
            System.out.println("Your basket now has: " + basket);
            System.out.print("Press E to eat fruit: ");

            for (int n = 1; n <= num; n++) {

            }
            char eat = sc.next().charAt(0);
            basket.pop();

            System.out.println("Fruit(s) in the basket: " + basket);

            if (basket.empty()) {
                System.out.println("No more fruits");
            }

        }
    }
}