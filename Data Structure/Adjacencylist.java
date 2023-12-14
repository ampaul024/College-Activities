//in this code i made i only follow the example code in handout 9

import java.util.ArrayList;

public class Adjacencylist {
    public static void main(String[] args) {

        ArrayList<ArrayList> jp = new ArrayList<>();

        // list of my vertices
        char[] vertices = { 'A', 'B', 'C', 'D', 'E', 'F', 'G' };

        int num = 7; // number of how many vertices i have

        for (int i = 0; i < num; i++) {
            jp.add(new ArrayList<>());
        }

        jp.get(0).add('B');
        jp.get(1).add('A');
        jp.get(1).add('C');
        jp.get(2).add('B');
        jp.get(2).add('D');
        jp.get(3).add('C');
        jp.get(3).add('E');
        jp.get(3).add('F');
        jp.get(3).add('G');
        jp.get(4).add('C');
        jp.get(4).add('D');
        jp.get(4).add('F');
        jp.get(5).add('D');
        jp.get(5).add('E');
        jp.get(6).add('D');

        int v = 0;// to display the letters

        // this will print the output i made
        for (int i = 0; i < num; i++, v++) {
            System.out.println(vertices[v] + ": " + jp.get(i));
        }
    }
}