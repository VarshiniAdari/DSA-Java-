public class NumWords {
    static String nums[]={"zero","one","two","three","four","five","six","seven","eight","nine"};
    public static void main(String[]args){
        int num=1947;
        printNumInWord(num);
    }
    public static void printNumInWord(int n){
        
        if(n==0){
            return;
        }
        int dig=n%10;
        printNumInWord(n/10);
        System.out.print(nums[dig]+" ");
        // switch(dig){
        //     case 1:{
        //         System.out.print("one ");
        //         break;
        //     }
        //     case 2:{
        //         System.out.print("two ");
        //         break;
        //     }
        //     case 3:{
        //         System.out.print("three ");
        //         break;
        //     }
        //     case 4:{
        //         System.out.print("four ");
        //         break;
        //     }
        //     case 5:{
        //         System.out.print("five ");
        //         break;
        //     }
        //     case 6:{
        //         System.out.print("six ");
        //         break;
        //     }
        //     case 7:{
        //         System.out.print("seven ");
        //         break;
        //     }
        //     case 8:{
        //         System.out.print("eight ");
        //         break;
        //     }
        //     case 9:{
        //         System.out.print("nine ");
        //         break;
        //     }
        //     default:{
        //         System.out.print("zero ");
        //         break;
        //     }           

        }
       
    }
