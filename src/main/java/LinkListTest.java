public class LinkListTest {
    public static void main(String[] args) {
        Linklist ll = new Linklist();
        ll.addnode(new Node(10));
        ll.addnode(new Node(13));
        ll.addnode(new Node(56));

        ll.display();

    }
}


class Linklist {
    Node head;

    void addnode(Node node) {
        if (head == null) {
            head = node;
            head.next = null;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}