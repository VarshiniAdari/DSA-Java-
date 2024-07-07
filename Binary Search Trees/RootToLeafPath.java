import java.util.*;
public class RootToLeafPath {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    public static Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        if(root.data>val){
            //leftSubTree
            root.left=insert(root.left,val);
        }
        else{
            //rightSubTree
            root.right=insert(root.right,val);
        }
        return root;
    }
    public static void printRoot2Leaf(Node root,ArrayList<Integer> path){
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null&&root.right==null){
            printPath(path);
        }
        printRoot2Leaf(root.left, path);
        printRoot2Leaf(root.right, path);
        path.remove(path.size()-1);
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void printPath(ArrayList<Integer> path){
        for(int i=0;i<path.size();i++){
            System.out.print(path.get(i)+"->");
        }
        System.out.println("Null");
    }
    public static void main(String[] args) {
        int values[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<values.length;i++){
            root=insert(root,values[i]);
        }
        inorder(root);
        System.out.println();
        printRoot2Leaf(root,new ArrayList<>());
        int values1[]={8,5,3,6,10,11,14};
        Node root1=null;
        for(int i=0;i<values1.length;i++){
            root1=insert(root1,values1[i]);
        }
        inorder(root1);
        System.out.println();
        printRoot2Leaf(root1,new ArrayList<>());

    }
}
