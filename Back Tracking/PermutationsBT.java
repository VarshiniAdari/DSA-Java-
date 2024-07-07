public class PermutationsBT {
    public static void main(String[] args){
        String str="abc";
        findPerm(str,"");
    }
    public static void findPerm(String str, String ans){
        //Base case
        if(str.length()==0){
            System.out.println(ans);
            return;
        }

        //Loop for calls
        for(int i=0;i<str.length();i++){
            //curr is the char included in answer
            char curr=str.charAt(i);
            //now new str will have all chars except curr
            String NewStr=str.substring(0, i)+str.substring(i+1);
            //Recursive calls
            findPerm(NewStr, ans+curr);
        }
    }
    
}
