public class InsertionDLL {
    public static void main(String[] args) {
        DLL list=new DLL();
        list.insertFirst(88);
        list.insertFirst(89);
        list.insertFirst(90);
        list.insertFirst(100);
        list.insertLast(120);
        list.insertAtPos(200, 2);
        list.insertAfter(90, 75);
        list.display();
    }
}
