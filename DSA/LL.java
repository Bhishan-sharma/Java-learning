package DSA;

public class LL {
    Node head;
    public class Node{
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node CurrNode = head;
        while(CurrNode.next != null){
            CurrNode = CurrNode.next;
        }
        CurrNode.next = newNode;
    }
    public void printList(){
        if (head == null){
            System.out.println("No data");
            return;
        }

        Node CurrNode = head;
        while(CurrNode != null){
            System.out.print(CurrNode.data + "-->");
            CurrNode = CurrNode.next;
        }

        System.out.print("Null");
    }

    public static void main(String[] args) {
        LL list = new LL();
        list.addFirst("hello");
        list.addLast("there");
        list.addFirst("Hi,");
        list.printList();
    }
}
