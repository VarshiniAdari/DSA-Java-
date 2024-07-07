public class stringCompression {// amazon interview question
    public static String doCompress(String str){
        StringBuilder sb = new StringBuilder("");
        char ch = str.charAt(0);
        sb.append(ch);
        int count=1;
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
            else{
                if(count>1){
                    sb.append(count);
                }
                count=1;
                ch=str.charAt(i);
                sb.append(ch);

            }
        }
        if(count>1){
            sb.append(count);
        }
        return sb.toString();
    }
    public static void main(String args[]){
        String str = "aaaabbbbbcccc";
        System.out.println("Before compression "+str  );
        System.err.println(doCompress(str)); 
    }
    
}
