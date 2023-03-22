import java.security.KeyPair;
import java.util.*;

public class MapInterface {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Map<Integer, Integer> mp = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        int n = input.nextInt();
        for (int i = 0; i < n; i++)
            list.add(input.nextInt());
        for (Integer i : list) {
            if (mp.containsKey(i))
                mp.put(i, mp.get(i) + 1);
            else
                mp.put(i, 1);
        }
        for (Integer i : mp.keySet())
        {
            int occurrence =  mp.get(i);
            System.out.println("Key : "+i+" Value : "+occurrence);
        }
        System.out.println("Key "+mp.keySet());
        System.out.println("Value "+mp.values());
        System.out.println("Size "+mp.size());
        mp.remove(3);
        System.out.println("Key "+mp.keySet());
        System.out.println("Value "+mp.values());
    }
}
