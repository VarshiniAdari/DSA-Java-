
public class RevVar {//reversed and stored in a new variable
    public static void main(String args[]){
        int num=12345;
        int rev=0;
        while(num>0){
            rev=rev*10+num%10;
            num/=10;
        }
        System.out.println("Reversed number is "+rev);

    }
    
}
