public class LLstack {
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static class Stack{
        static Node head=null;
        //isEmpty function
        public boolean isEmpty(){
            return head==null;
        }
        //push fn
        public  void push(int data){
            Node newNode=new Node(data);
            if(isEmpty()){
                head=newNode;
                return;
            }
            newNode.next=head;
            head=newNode;         
        }
        //pop
        public  int pop(){
            if(isEmpty()){
                return -1;
            }
            int val=head.data;
            head=head.next;
            return val;    
        }
        //peek
        public  int peek(){
            if(isEmpty()){
                return -1;
            }
            return head.data;
        }
    }
    public static void main(String[] args){
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}