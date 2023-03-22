import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetInterface {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the length of Set");
        int size = input.nextInt();
        System.out.println("Enter the Set Element");

        for (int i = 0; i < size; i++) {
            set.add(input.nextInt());
        }

        System.out.println("Set contains 1 " + set.contains(1));
        System.out.println("Set remove 2 " + set.remove(2));
        System.out.println("Checking set is Empty or not " + set.isEmpty());
        System.out.println("Set Size " + set.size());

        Set<Integer> set2 = new HashSet<>();

        set2.add(9);
        set2.add(8);
        set2.add(7);

        set.addAll(set2);


        for (Integer str : set) {
            System.out.print(" " + str);
        }
        set.clear();
    }
}
