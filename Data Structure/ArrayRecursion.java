import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayRecursion {
        public static void main(String args[]) {

                Integer arr[] = { 1, 2, 3, 4, 5, };
                int arlen = arr.length;

                ArrayList<Integer> arrL = new ArrayList<>(Arrays.asList(arr));
                arrL.add(6);

                Iterator<Integer> ListE = null;

                ListE = arrL.listIterator();
                System.out.println("The length of the arrays is: " + arrL.size());

                while (ListE.hasNext()) {
                        System.out.println(ListE.next());
                        recur(ListE);
                }

        }

        static void recur(Iterator<Integer> ListE) {

        }
}
