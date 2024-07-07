public class LexicalLarge {
    public static String getLarge(String[] fruits){
        String large=fruits[0];
        for(int i=1;i<fruits.length;i++){
            if(large.compareTo(fruits[i])<0){
                large = fruits[i];
            }
        }
        return large;
    }
    public static void main(String args[]){
        String fruits[]={"banana","apple","mango","grapes"};
        System.out.println("Largest string in the set is "+getLarge(fruits));
        
    }
    
}
