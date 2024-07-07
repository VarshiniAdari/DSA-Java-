import java.util.Stack;
public class ReverseString {
    public static String revStr(String str){
        Stack<Character> s=new Stack<>();
        int idx=0;
        while(idx<str.length()){
            char curr=str.charAt(idx);
            s.push(curr);
            idx++;
        }
        StringBuilder ans=new StringBuilder("");
        while(!s.isEmpty()){
            char ch=s.pop();
            ans.append(ch);
        }
        return ans.toString();
    }
    public static void main(String[] args){
        String str="Hare Krishna";
        System.out.println(revStr(str));
    }
}
