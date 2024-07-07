import java.util.*;
public class PQforObj {
    public static class Student implements Comparable<Student>
    {
        //overriding
        String name;
        int rank;
        public Student(String name, int rank){
            this.name=name;
            this.rank=rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank-s2.rank;
        }
    }
    public static void main(String[] args) {
        
        PriorityQueue<Student> pq=new PriorityQueue<>();
        pq.add(new Student("Varsh",4));//O(log n)
        pq.add(new Student("Neha", 1));
        pq.add(new Student("Divya", 2));
        pq.add(new Student("Natasha", 3));      
        while(!pq.isEmpty()){
            System.out.println(pq.peek().name+"-->"+pq.peek().rank);//O(1)
            pq.remove();//O(log n)
        }
    }
}