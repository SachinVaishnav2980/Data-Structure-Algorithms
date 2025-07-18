import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;
import java.util.Stack;

public class ReverseKqueue {
    public static void main(String[] args) {
        Queue<Integer> queue=new ArrayDeque<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);
        System.out.println(reverseFirstK(queue, 3));
    }

    public static Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {

        if(q.isEmpty() || k>q.size() || k<=0){
            return q;
        }
        Stack<Integer> stack =new Stack<>();
        for(int i=0;i<k;i++){
            stack.push(q.poll());
        }
        while (!stack.isEmpty()) {
            q.offer(stack.pop());
        }
        int size=q.size();
        for(int i=0;i<size-k;i++){
            q.offer(q.poll());
        }

        return q;
    }
}
