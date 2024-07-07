import java.util.*;
public class LinearSearch{
    public static int LnrSrch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key)
            {
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int numbers[] = new int[10];
        for(int i=0;i<numbers.length;i++){
            numbers[i]=sc.nextInt();
        }
        int key=10;
        int index=LnrSrch(numbers,key);
        if(index==-1){
            System.out.println("Key not found");
        }
        else{
            System.out.println("Key found at "+index);
        }
        sc.close();
    }
}