public class AlphaPattern{
    public static void main(String args[]){
        char ch='A';
        
        for (int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++,ch++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}