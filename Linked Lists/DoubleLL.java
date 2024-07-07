public class DoubleLL {
    public class Node{
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }
    public int removeFirst(){
        if(head==null){
            System.out.println("Doubly LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=head.data;
        head=head.next;
        head.prev=null;
        size--;
        return val;
    }
    public void addLast(int data){
        Node newNode=new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        tail.next=newNode;
        newNode.prev=tail;
        tail=newNode;
    }
    public int removeLast(){
        if(head==null){
            System.out.println("Doubly LL is empty");
            return Integer.MIN_VALUE;
        }
        if(size==1){
            int val=head.data;
            head=tail=null;
            size--;
            return val;
        }
        int val=tail.data;
        tail=tail.prev;
        tail.next=null;
        return val;
    }
    public void printDblLL(){
        if(head==null){
            System.out.println("Double LL is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"<->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void reverseDoublyLL(){
        Node curr=head;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            curr.prev=next;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public static void main(String[] args){
        DoubleLL dll=new DoubleLL();
        dll.printDblLL();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.addFirst(0);
        // dll.printDblLL();
        // System.out.println(size);
        // dll.removeFirst();
        // dll.printDblLL();
        // System.out.println(size);
        dll.addLast(4);
        dll.addLast(5);
        dll.printDblLL();
        // System.out.println(size);
        // System.out.println(dll.removeLast());
        dll.reverseDoublyLL();
        dll.printDblLL();
    }
    
}
