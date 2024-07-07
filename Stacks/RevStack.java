import java.util.Stack;
public class RevStack {
    public static void revStack(Stack<Integer> s){
        if(s.isEmpty()){
            return;
        }
        //step-1 pop out the element
        int val=s.pop();
        revStack(s);
        PushToBottom(s, val);

    }
    public static void PushToBottom(Stack<Integer> s,int data){
        if(s.isEmpty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        PushToBottom(s,data);
        s.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> s =new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        revStack(s);
        while(!s.isEmpty()){
            System.out.println(s.pop());
        }
    }
}
