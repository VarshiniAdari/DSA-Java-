public class    DuplicateString{
    public static void main(String[]args){
        String str="appnnacollege";
        duplcStr(str,0,new StringBuilder(""),new boolean[26]);
    }
    public static void duplcStr(String str,int idx,StringBuilder newStr,boolean map[]){
        if(idx==str.length()){
            System.out.println(newStr);
            return;
        }
        char currChar=str.charAt(idx);
        if(map[currChar-'a']==true){
            duplcStr(str,idx+1,newStr,map);
        }
        else{
            map[currChar-'a']=true;
            duplcStr(str,idx+1,newStr.append(currChar),map);
        }
    }
}