public class changeCase {
    public static String doCaseChange(String str){
        // Character.toUpperCase(str.charAt(0));
        // for(int i=0;i<str.length()-1;i++){
        //     if(str.charAt(i)==' '){
        //         System.out.println("change");
        //         Character.toUpperCase(str.charAt(i+1));
        //     }
        // }
        // return str;
        //the above code is COMPLETELY WROMG. BCOZ STRINGS ARE IMMUTABLE.
        StringBuilder sb= new StringBuilder("");
        sb.append(Character.toUpperCase(str.charAt(0))); 
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' '&&i<str.length()-1){
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            }
            else{
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "hi, i am shradha khapra";   //we want to change it to "I Am, Shradha Khapra"
        System.out.println("After changing the case the new string is");
        System.out.println(doCaseChange(str));
        
    }
    
}
