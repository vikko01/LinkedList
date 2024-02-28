package LinkedList;


public class AddFirst {
    public static class Node {
        int data;
        Node next;

        public Node (int data) {
            this.data = data;
            this.next = null;

        }
    }

    public static Node head;
    public static Node tail;

    public void addfirst(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public static void main(String[] args) {
        AddFirst ll = new AddFirst();

        ll.addfirst(1);
        ll.addfirst(2);
    }
}
