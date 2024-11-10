package SinglyLinkedList;

public class LinkedList {

    Node head = null;

    // insert At the beginning of linkedlist
    public void insertAtBeginning(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // insert at the end of the linked list
    public void insertAtEnd(int item) {
        Node newNode = new Node(item);
        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // insert at the specific position oif the linked list
    public void insertAtPosition(int item, int position) {
        Node newNode = new Node(item);
        if (position < 0) {
            System.out.println("Invalid Position");
            return;
        }

        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return;
        }

        Node temp = head;
        int index = 0;
        while (temp != null && index < position - 1) {
            temp = temp.next;
            index++;
        }
        if (temp == null) {
            System.out.println("Position exceeds the list of linkedlist");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete at the beginning of the linke dlist
    public void deleteAtBeginning() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        }

        head = head.next;
    }

    // Delete at the end of the linked list
    public void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is Empty");
            return;
        } else if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }

        temp.next = null;

    }

    // Delete at the specific position of the linked list
    public void deleteAtPosition(int position) {
        if (position < 0) {
            System.out.println("invalid position");
            return;
        }

        if (position == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 0; i < position - 1; i++) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Position is out of bound");
            return;
        }
        temp.next = temp.next.next;

    }

    // searching data in linbked list
    public boolean searchData(int data){
        Node temp = head;
        while(temp!=null){
            if(temp.data==data){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    // / *********** Print the linked list ************/
    public void printLinkedList() {
        if (head == null) {
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.next != null) {
                System.out.print(temp.data + "=>");
            }
            if (temp.next == null) {
                System.out.print(temp.data);
            }
            temp = temp.next;
        }
        System.out.println();
    }
}
