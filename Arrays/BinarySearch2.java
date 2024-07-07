import java.util.*;
public class BinarySearch2 {
    public static int search(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;
        int mid;
        while(start<=end){
            mid=(start+end)/2;
            if(key==numbers[mid]){
                return mid;
            }
            else if(key<numbers[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[]={0,1,2,3,4,5,6,7,8,9};
        Scanner sc=new Scanner(System.in);
        int key=sc.nextInt();
        if(search(numbers,key)==-1){
            System.out.println("Key not found in the given array");
        }
        else{
            System.out.println("Key "+key+" found at "+search(numbers,key));
        }
        sc.close();
    }
}
