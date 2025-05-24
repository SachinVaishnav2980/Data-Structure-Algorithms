public class LLRecursion {
    public static void main(String[] args) {
        LL list =new LL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);
        list.insertLast(99);
        list.insertRec(88, 3);
        // list.insertAtPos(100, 3);
        // list.deleteFirst()
        list.display();
    }
}
