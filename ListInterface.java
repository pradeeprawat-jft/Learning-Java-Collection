import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListInterface {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> v = new ArrayList<>();
        System.out.println("Enter the length of array");
        int size = input.nextInt();
        System.out.println("Enter the Array Element");

        for (int i = 0; i < size; i++) {
            v.add(input.nextInt());
        }
        v.remove(0); // remove element on 0th index.
        for (Integer i : v) {
            System.out.print(i + " ");
        }

        System.out.println();
        v.add(1, 20); // insert 20 at index 1
        int length = v.size();  //get size of List
        v.set(0, 10); // replace 10 at index 0
        List<Integer> v2 = new ArrayList<>();
        v2.add(40);
        v2.add(50);
        v2.add(60);
        v.addAll(v2); // adding new arrayList(v2) to old arrayList(v)
        System.out.println("element of index 3 is " + v.get(3)); // get element in index 3
        v.sort(Collections.reverseOrder());
        for (Integer i : v) {
            System.out.print(i + " ");
        }

        System.out.println();
        Collections.sort(v);
        for (Integer i : v) {
            System.out.print(i + " ");
        }
    }
}
