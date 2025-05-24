package CircularQ;

public class CircularQmain{
    public static void main(String[] args) throws Exception{
        // CustomCircularQ queue=new CustomCircularQ();
        // queue.insert(1);
        // queue.insert(2);
        // queue.insert(3);
        // queue.insert(4);
        // queue.insert(5);
        // queue.display();

        DynamicCircularQ queue=new DynamicCircularQ(5);
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println(queue.remove());


    }
}
