package DataStructures.LinkedList.Problems.LinkedList;

class Node{
    char data;
    Node next;
    Node prev;

    Node(char data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

public class DLL {
    Node head;

    DLL() {
        head = null;
    }

    void insertAtHead(char val) {
        Node n = new Node(val);
        if (head != null) {
            n.next = head;
            head.prev = n;
        }
        head = n;
    }

    void RotateByN(int N){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = head;
        head.prev = temp;

        while(N-- > 0){
            head = head.next;
            temp = temp.next;
        }
        temp.next = null;
        head.prev = null;
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

class Driver1{
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertAtHead('e');
        dll.insertAtHead('d');
        dll.insertAtHead('c');
        dll.insertAtHead('b');
        dll.insertAtHead('a');
        dll.display();
        int N = 3;
        dll.RotateByN(N);
        dll.display();
    }
}