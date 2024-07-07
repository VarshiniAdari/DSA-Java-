
public class ReverseArray {
    public static void main(String args[]){
        int numbers[]={1,2,3,4,5,6,7,8,9,0};
        int first=0;
        int last=(numbers.length-1);
        while(first<last){
            int temp=numbers[first];
            numbers[first]=numbers[last];
            numbers[last]=temp;
            first++;
            last--;
        }
        System.out.println("Array after reversing is:");
        for(int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]);
        }
    }
}
