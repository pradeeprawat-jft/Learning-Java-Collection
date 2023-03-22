import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class QueueInterface {
    public static void main(String[] args)
    {
        Queue<Integer> q = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        for (int i = 0 ;i<n;i++)
        {
            q.offer(input.nextInt());
        }
        for (int i = 0;i<n;i++)
        {
            q.add(input.nextInt());
        }
        System.out.println("Before " + q);
        System.out.println("removed Element with poll and element is " + q.poll());
        System.out.println("removed Element with Remove and element is " + q.remove());
        System.out.println("Front Element is with element " + q.element());
        System.out.println("Front Element is with peek " + q.peek());

        System.out.println("After " + q);




    }
}
