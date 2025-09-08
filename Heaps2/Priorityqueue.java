package Heaps2;
import java.util.PriorityQueue;
public class Priorityqueue{
    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
       queue.offer(10);
       queue.offer(9);
       queue.offer(90);
       System.out.println(queue.poll());
       System.out.println(queue.peek());

    }
}