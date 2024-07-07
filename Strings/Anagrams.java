import java.util.Arrays;

public class Anagrams {
    public static boolean checkAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        char[] str1charArray=str1.toCharArray();
        char[] str2charArray=str2.toCharArray();
        Arrays.sort(str1charArray);
        Arrays.sort(str2charArray);
        boolean result = Arrays.equals(str1charArray,str2charArray);
        return result;
    }
    public static void main(String args[]){
        String str1 = "race";
        String str2 = "care";
        if(checkAnagram(str1,str2)){
            System.out.println("They are anagrams");

        }
        else{
            System.out.println("They are not anagrams");
        }
    }
    
}
