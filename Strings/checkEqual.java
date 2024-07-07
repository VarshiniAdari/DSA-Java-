public class checkEqual {
    public static void main(String args[]){
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if(s1==s2){
            System.out.println("s1 is equal to s2");
        }
        else{
            System.out.println("s1 not equal to s2");
        }
        if(s1==s3){
            System.out.println("s1 is equal to s3 is given");
        }
        else{
            System.out.println("s1 is not equal to s3 is returned as object is not given");
        }
        if(s1.equals(s3)){
            System.out.println("Using function equals() s1 is equal to s3");
        }
        else{
            System.out.println("Using function equals() s1 is not equal to s3");
        }
        
    }
    
}
