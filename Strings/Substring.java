public class Substring {
    public static String getSubstring(String str,int si,int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr+=str.charAt(i);

        }
        return substr;
    }
    public static void main(String args[]){
        String str = "HelloWorld";
        System.out.println("Extracted string is  "+getSubstring(str,0,5));
        //string, si-starting index, ei-ending index
        //Using substring function
        System.out.println("Using built-in function "+str.substring(0,5));
    }
    
}
