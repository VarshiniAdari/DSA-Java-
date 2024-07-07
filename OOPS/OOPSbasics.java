public class OOPSbasics{
    
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.newColor("Black");
        System.out.println(p1.color);
        p1.tip=5;
        System.out.println(p1.tip);
        p1.newTipRead(10);
        System.out.println(p1.tip);
        BankAccount myAcc = new BankAccount();
        myAcc.username="Varshi";
        //myAcc.password="abcd"; --->error password not visible
        myAcc.setPassword("abcd");
        Student s1 = new Student();
        Student s2 = new Student("Varsh");
        Student s3 = new Student(123);
        Student s4 = new Student("Krish",21);
        

    }
}
class BankAccount{
    public String username;
    private String password;
    public void setPassword(String pwd){
        password=pwd;
    }
} 

class Pen{
    String color;
    int tip;
    void newColor(String newColor){
        color = newColor;
    }
    void newTipRead(int newTip){
        tip=newTip;
    }

}
class Student{
    String name;
    int roll;
     Student(){
        System.out.println();
    } 
     /* default constructor for s1 not created as there 
            are other parametrized constructors. Uncomment defaults 
            constructor to remove error*/ 
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
    Student(String name,int roll){
        this.name=name;
        this.roll=roll;

    }
}