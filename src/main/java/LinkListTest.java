public class LinkListTest {
    public static void main(String[] args) {
        Linklist ll = new Linklist();
        ll.addnode(new Node(1));
        ll.addnode(new Node(2));
        ll.addnode(new Node(3));
        ll.addnode(new Node(4));
        ll.addnode(new Node(5));

        ll.display();
        ll.reverseRecursive(ll.head);
        ll.display();
//        ll.reversespecific(2,4);

//        ll.display();

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

//        System.out.println();
//        System.out.println();
//        System.out.println();
    }

    void reverse(){
        // take 2 node:
        Node prev = null;
        Node next =null;
        Node current =head;

        while(current!=null){
            next = current.next;
            current.next =prev;
            prev=current;
            current=next;



        }
        head=prev;

    }


    void reversespecific(int start, int end){
        // take 2 node:
        Node prev = null;
        Node next =null;
        Node current =head;
        boolean s= false;

        while(current!=null ){
            if (current.data== start ){
                s = true;
                while (s) {

                    if (current.data == end) {
                        s = false;
                        break;
                    }
                    next = current.next;
                    current.next = prev;
                    prev = current;
                    current = next;
                    continue;
                }

            }
            if(!s) {
                next = current.next;
//            current.next=prev;
                prev = current;
                current = next;
            }



        }
        //head=prev;

    }
    Node prev1=null;
    Node curret=head;
    void reverseRecursive(Node node){


        if(curret==null){
            head=prev1;
            return;

        }
        Node next = curret.next;
        curret.next=prev1;
        prev1 =curret;
        curret=next;
        reverseRecursive(curret);
    }
}

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
    }
}