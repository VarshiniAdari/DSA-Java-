public class WordPalindrome {
    public static boolean isPalindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                return false;
            }
            
        }
        return true;
    }
    public static void main(String args[]){
        String str = "mappam";
        for(int i=0;i<=str.length()/2;i++){
            if(str.charAt(i)==str.charAt(str.length()-i-1)){
                
                if(i==str.length()/2){
                    System.out.println("It is a palidrome. True");
                }
                continue;
            }
            else{
                System.out.println("Not a Palindrome. False");
                break;
            }
            
        }
        //2nd way
        System.out.println(isPalindrome(str));
    }
    
}
