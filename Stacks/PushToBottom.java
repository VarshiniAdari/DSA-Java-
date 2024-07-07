import java.util.*;
public class PushToBottom {
    public static void pushToBttm(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        pushToBttm(s, data);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> s=new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        pushToBttm(s,0);
        while(!s.isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
    
}
