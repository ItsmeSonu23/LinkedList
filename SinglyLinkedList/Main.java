package SinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        linkedList.insertAtBeginning(2);
        linkedList.insertAtEnd(3);
        linkedList.insertAtBeginning(1);
        linkedList.insertAtPosition(4, 3);
        // linkedList.deleteAtBeginning();
        // linkedList.deleteAtEnd();
        // linkedList.deleteAtPosition(2);
        boolean val =  linkedList.searchData(2);
        System.out.println(val);
        linkedList.printLinkedList();
    }
}
