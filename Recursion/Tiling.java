public class Tiling {
    public static void main(String[] args){
        int n=4;
        System.out.println(tile(n));
    }
    public static int tile(int n){
        if(n==0||n==1){
            return 1;
        }
        
        return tile(n-1)+tile(n-2);
        //n-1 for vertical. n-2 for horizontal
    }
}
