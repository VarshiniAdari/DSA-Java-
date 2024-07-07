public class LinkedList{
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    public static Node head;
    public static Node tail; 
    public static int size;
    public void addFirst(int data){
        //step-1 create new node
        Node newNode= new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step-2 new node's next=head
        newNode.next=head;

        //step-3 head is newNode
        head=newNode;
    }
    public void addLast(int data){
        //step-1-create a node object
        Node newNode = new Node(data);
        size++;
        if(head==null){
            head=tail=newNode;
            return;
        }
        //step-2tail.next=newNode
        tail.next=newNode;
        //step-3 tail is new node
        tail=newNode;
    }
    public void printLL(){
        Node temp=head;
        if(head==null){
            System.out.println("Linked list is empty");
            return;
        }
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp=temp.next;
        }
        System.out.println("null");
    }
    public void add(int data,int idx){
        if(idx==0){
            addFirst(data);
            return;
        }
        if(idx==size-1){
            addLast(data);
            return;
        }
        Node newNode=new Node(data);
        size++;
        int i=0;
        Node temp=head;
        while(i<idx-1){
            temp=temp.next;
            i++;
        }
        //inserting
        newNode.next=temp.next;
        temp.next=newNode;
    }
    public int removeFirst(){
        if(size==0){
            System.out.println("LL is empty");
            int val=Integer.MIN_VALUE;
            return val;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        int val = head.data;
        head=head.next;
        size--;
        return val;
    }
    public int removeLast(){
        if(size==0){
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        }
        else if(size==1){
            int val=head.data;
            head=tail=null;
            size=0;
            return val;
        }
        Node prev=head;
        for(int i=0;i<size-2;i++){
            prev=prev.next; 
        }
        int val=prev.next.data; //or tail.data
        prev.next=null;
        tail=prev;
        return val;
    }
    public int SearchItrtv(int key){
        Node temp=head;
        int idx=0;
        while(temp!=null){
            if(temp.data==key){
                return idx;
            }
            idx++;
            temp=temp.next;
        }
        return -1;
    }
    public int helpRecSearch(Node head,int key){
        if(head==null){
            return -1;
        }
        if(head.data==key){
            return 0;
        }
        int idx=helpRecSearch(head.next,key);
        if(idx==-1){
            return -1;
        }
        return idx+1;
    }
    public int recSearch(int key){
        return helpRecSearch(head,key);
    }
    public void RevLL(){
        Node prev=null;
        Node curr =tail=head;
        Node nxtNode;
        while(curr!=null){
            nxtNode = curr.next;
            curr.next=prev;
            prev=curr;
            curr=nxtNode;
        }
        head=prev;
    }
    public void removeNthFromEnd(int n){
        //calculating size
        int sz=0;
        Node temp=head;
        while(temp!=null){
            sz++;
            temp=temp.next;
        }
        //edge case
        if(n==sz){
            head=head.next;
        }
        //sz-n is prev node for nth from end
        int i=1;
        Node prev=head;
        while(i<sz-n){
            prev=prev.next;
            i++;
        }
        prev.next=prev.next.next;
    }
    public Node findMidNode(Node head){//helper to find palindrome
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next; //+1
            fast=fast.next.next;//+2
        }
        return slow; //slow is mid Node
    }
    public boolean isPalindrome(){
        if(head==null||head.next==null){
            return true;
        }
        //step-1 Find the midNode 
        Node mid=findMidNode(head);
        //step-2 reverse 2nd half
        Node prev=null;
        Node curr=mid;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        Node left=head;
        Node right=prev;
        //step-3 check left and right half are same 
        while(left!=null){
            if(left.data!=right.data){
                return false;  
            }
            left=left.next;
            right=right.next;           
        }
        return true;
    }
    public boolean isCycle(){
        Node slow=head;
        Node fast=head;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){//cycle exist           
                return true;
            }
        }
        return false;
    }
    public void removeCycle(){
        //step-1 detect cycle
        Node slow=head;
        Node fast=head;
        boolean cycle=false;
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                cycle=true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //step-2 find meeting point
        slow=head;
        Node prev=fast;
        while(slow!=fast){
            slow=slow.next;
            prev=fast;
            fast=fast.next;
        }
        //last.next=null removes cycle
        prev.next=null; //Bcoz prev is LastNode
    }
    private Node getMid(Node head){
        Node slow=head;
        Node fast=head.next; //For even LL to avoid stack overflow
        while(fast!=null&&fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private Node merge(Node head1, Node head2){
        Node mergedLL=new Node(-1);//dummy value
        Node temp=mergedLL;
        while(head1!=null&&head2!=null){
            if(head1.data<=head2.data){
                temp.next=head1;
                head1=head1.next;
                temp=temp.next;
            }
            else{
                temp.next=head2;
                head2=head2.next;
                temp=temp.next;
            }
        }
        //for left over
        while(head1!=null){
            temp.next=head1;
            head1=head1.next;
            temp=temp.next;
        }
        while(head2!=null){
            temp.next=head2;
            head2=head2.next;
            temp=temp.next;
        }
        return mergedLL.next;
    } 
    public Node mergeSort(Node head){
        if(head==null||head.next==null){
            return head;
        }
        //find mid
        Node mid=getMid(head);
        //div left and right to sort
        Node rightHead=mid.next;
        mid.next=null;
        Node newLeft=mergeSort(head);
        Node newRight=mergeSort(rightHead);
        //merge left and right
        return merge(newLeft,newRight);
    }
    public void zigZagLL(){
        //stp-1 Find middle node
        Node slow=head;
        Node fast=head.next;
        while(fast!=null&&fast.next!=null){
            slow =slow.next;
            fast=fast.next.next;
        }
        Node mid = slow;
        //step-2 Reverse 2nd half of LL
        Node rHead=mid.next;
        mid.next=null;
        Node curr=rHead;
        Node prev=null;
        Node next;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        //step-3 Alternate merging or zig-zag merging
        Node lHead=head;
        rHead=prev;
        Node nextL;
        Node nextR;
        while(lHead!=null&&rHead!=null){
            nextL=lHead.next;
            lHead.next=rHead;
            nextR=rHead.next;
            rHead.next=nextL;

            lHead=nextL;
            rHead=nextR;
        }
    }
    public static void main(String args[]){
        LinkedList ll =new LinkedList();
        // ll.printLL();
        // ll.addFirst(1);
        // ll.addFirst(0);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addLast(5);
        // ll.printLL();
        // ll.add(9,2);
        // ll.printLL();
        // System.out.println(ll.size);
        // ll.removeFirst();
        // ll.printLL();
        // System.out.println(" New size "+size);
        // System.out.println(ll.removeFirst());
        // ll.printLL();
        // System.out.println(" New size "+size);
        // System.out.println(ll.removeLast());
        // ll.printLL();
        // ll.removeLast();
        // ll.printLL();
        // System.out.println(ll.SearchItrtv(9));
        // System.out.println(ll.recSearch( 3));
        // System.out.println(ll.recSearch( 12));
        // ll.RevLL();
        // ll.printLL();
        // ll.removeNthFromEnd(3);
        // ll.printLL();
        // ll.addFirst(1);
        // ll.addLast(2);
        // ll.addLast(3);
        // ll.addLast(4);
        // ll.addLast(3);
        // ll.addLast(2);
        // ll.addLast(1);
        // ll.printLL();
        // System.out.println(ll.isPalindrome());
        // head=new Node(1);
        // Node temp=new Node(2);
        // head.next=temp;
        // head.next.next=new Node(3);
        // head.next.next.next=temp;
        // // ll.printLL();  infinite o/p
        // System.out.println(ll.isCycle());
        // ll.removeCycle();
        // System.out.println(ll.isCycle());
        // ll.printLL();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        ll.printLL();
        //5->4->3->2->1
        // ll.head=ll.mergeSort(ll.head);
        ll.zigZagLL();
        ll.printLL();

    }
}