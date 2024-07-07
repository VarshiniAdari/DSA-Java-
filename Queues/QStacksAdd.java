import java.util.*;
public class QStacksAdd {
    static class Queue{
        Stack<Integer> s1=new Stack<>();
        Stack<Integer> s2=new Stack<>();
        public boolean isEmpty(){
            return s1.isEmpty();
        }
        //add-O(n)
        public void add(int data){
            if(isEmpty()){
                s1.push(data);
                return;
            }
            //send to s2
            while(!s1.isEmpty()){
                s2.push(s1.pop());
            }
            //push new one in s1
            s1.push(data);
            //send back to s1
            while(!s2.isEmpty()){
                s1.push(s2.pop());
            }
        }
        //remove
        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }
    }
    public static void main(String[] args){
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        while(!q.isEmpty()){
            System.out.println(q.remove());
        }
    }
    
}
