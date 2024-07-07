import java.util.*;
public class StringBasic {
    public static void stringFunctions(){
        //For Length
        String full_name;
        full_name ="Tony Stark";
        System.out.println(full_name.length());
        //To concate
        String firstName;
        firstName = "Shradha";
        String lastName = "Khapra";
        String fullName = firstName+" "+lastName;
        System.out.println(fullName);
        //charAt function
        System.out.println(fullName.charAt(0));
        //printing whole string using charAt function
        for(int i=0;i<fullName.length();i++){
            System.out.print(fullName.charAt(i));
        }
        System.out.println();
    }
    public static void main(String args[]){
        //different ways of declaring a string 
        char alpha[] = {'a','b','c','d'};
        String str1 = "abcd";
        String str2 =  new String("xyz");
        System.out.println("Enter a word");
        Scanner sc = new Scanner (System.in);
        String str3 = sc.next();
        System.out.println("Enter a line");
        Scanner sc1 = new Scanner (System.in);
        String str4 = sc1.nextLine();
        System.out.println(alpha);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        sc.close();
        sc1.close();
        //String functions
        stringFunctions();
    }
    
}
