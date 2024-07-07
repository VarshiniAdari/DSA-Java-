import java.util.*;
public class BinarySearch {
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,7,8,9,10};
        int start,end;
        start=0;
        end=numbers.length-1;
        System.out.println("Enter key value");
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(key==numbers[mid]){
                System.out.println("Key "+key+" found at "+mid);
                break;
            }
            else if(key<numbers[mid]){
               
                end=mid-1;
            }
            else{
                start=mid+1;
                
            }

        }
        sc.close();
    }
    
}
//In this logic key not found is not there