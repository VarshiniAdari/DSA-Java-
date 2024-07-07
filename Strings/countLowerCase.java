public class countLowerCase {
    public static int getLCcount(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(Character.isLowerCase(str.charAt(i))){
                count++;
            }
        }
        return count;
    }
    public static void main(String args[]){
        String str = "Some RanDOM name, say My MUMMMY or DAddy";
        System.out.println(getLCcount(str));
    }
    
}
