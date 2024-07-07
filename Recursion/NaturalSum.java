public class NaturalSum {
    public static void main(String[] args){
        int n=10;
        int sum=sumOfN(n);
        System.out.println(sum);
    }
    public static int sumOfN(int num){
        if(num==1){
            return 1;
        }
        return (num+sumOfN(num-1));
    }
}
