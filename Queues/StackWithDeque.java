import java.util.*;
public class StackWithDeque {
    static class Stack{
        Deque<Integer> dq=new LinkedList<>();
        public void push(int data){
            dq.addLast(data);
        }
        public int pop(){
            if(dq.isEmpty()){
                return -1;
            }
            return dq.removeLast();
        }
        public int peek(){
            if(dq.isEmpty()){
                return -1;
            }
            return dq.getLast();
        }
    }
    public static void main(String[] args){
        Stack s= new Stack();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println("Peek = "+s.peek());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}