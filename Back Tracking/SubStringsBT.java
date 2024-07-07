public class SubStringsBT{
    public static void main(String[] args){
        String str="abc";
        findSubStr(str,"",0);
    }
    public static void findSubStr(String str, String ans,int i){
        //Base Case
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("Null");
            }
            else{
                System.out.println(ans);
            }
            return;
        }
        // Recursive calls
        //choice yes
        findSubStr(str,ans+str.charAt(i),i+1);
        //choice no
        findSubStr(str,ans,i+1);
    }
}