import java.util.PriorityQueue;
import java.util.Queue;

public class LearningPriorityQueue {
    public static void main(String[] args)
    {
//        Queue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder()); //max heap
        Queue<Integer> q = new PriorityQueue<>(); //min heap

        q.offer(54);
        q.offer(5);
        q.offer(20);
        q.offer(22);
        System.out.println(q);
        q.poll();

        q.offer(4);
        q.offer(70);
        q.offer(8);

        System.out.println(q.peek());
        System.out.println(q.element());
        System.out.println(q);

    }
}
