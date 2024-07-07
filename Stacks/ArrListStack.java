import java.util.ArrayList;
public class ArrListStack{
    public static class Stack{
        static ArrayList<Integer> list=new ArrayList<>();
    
        //isEmpty
        public  boolean isEmpty(){
            if(list.size()==0){
                return true;
            }
            return false;
        }
        //push
        public  void push(int data){
            list.add(data);
            return;
        }
        //pop
        public  int pop(){
            if(isEmpty()){
                return -1;
            }

            int val=list.get(list.size()-1);
            list.remove(list.size()-1);
            return val;
        }
        //peek
        public  int peek(){
            if(isEmpty()){
                return -1;
            }
            int val=list.get(list.size()-1);
            return val;
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