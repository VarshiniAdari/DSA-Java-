import java.util.Stack;
public class DuplicateParantheses {
    public static boolean isDuplicate(String str){
        Stack<Character> s=new Stack<>();
        for(int i=0;i<str.length();i++){
            char curr=str.charAt(i);
            //closing conditions
            if(curr==')'){
                int count=0;
                if(s.pop()!='('){
                    count++;
                }
                if(count==0){
                    return true;//duplicte exists
                }
            }
            else{
                s.push(curr);
            }
        }
        return false;
    }
    public static void main(String[] args){
        String str1="(a+b)+((c+d))";
        String str2="(((a+b)+(c)))";
        System.out.println(isDuplicate(str1));
        System.out.println(isDuplicate(str2));
    }
}
