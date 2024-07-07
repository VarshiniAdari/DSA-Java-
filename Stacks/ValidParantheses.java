import java.util.Stack;
public class ValidParantheses{
    public static boolean isValid(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            if(curr=='('||curr=='{'||curr=='['){
                s.push(curr);
            }
            else{
                if(s.isEmpty()){
                    return false;
                }
                if(curr==')'){
                    if(s.pop()!='('){
                        return false;
                    }
                }
                if(curr==']'){
                    if(s.pop()!='['){
                        return false;
                    }
                }
                if(curr=='}'){
                    if(s.pop()!='{'){
                        return false;
                    }
                }
            }
        }
        if(!s.isEmpty()){
            return false;
        }
        return true;
    }
    public static void main(String[] args){
        String str="{([])}";
        System.out.println(isValid(str));
    }
}