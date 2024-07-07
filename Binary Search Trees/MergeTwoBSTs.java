import java.util.*;
public class MergeTwoBSTs {
        static class Node{
            int data;
            Node left;
            Node right;
            Node(int data){
                this.data=data;
            }
        }
        public static void getInorder(Node root,ArrayList<Integer> inorder){
            if(root==null){
                return;
            }
            getInorder(root.left, inorder);
            inorder.add(root.data);
            getInorder(root.right, inorder);
        }
        public static Node mergingBST(Node root1, Node root2){
            //step1: getinorder of 1st bst
            ArrayList<Integer> arr1=new ArrayList<>();
            getInorder(root1,arr1);
            //step2: getinorder of 2nd bst
            ArrayList<Integer> arr2=new ArrayList<>();
            getInorder(root2,arr2);
            //merge
            ArrayList<Integer> finalArr=new ArrayList<>();
            int i=0,j=0;
            while(i<arr1.size()&&j<arr2.size()){
                if(arr1.get(i)<=arr2.get(j)){
                    finalArr.add(arr1.get(i));
                    i++;
                }else{
                    finalArr.add(arr2.get(j));
                    j++;
                }
            }
            while (i<arr1.size()) {
                finalArr.add(arr1.get(i));
                i++;
            }
            while (j<arr2.size()) {
                finalArr.add(arr2.get(j));
                j++;
            }
            return createBST(finalArr,0,finalArr.size()-1);
        }
        public static Node createBST(ArrayList<Integer> finalArr,int st,int end){
            if(st>end){
                return null;
            }
            int mid=(st+end)/2;
            Node root=new Node(finalArr.get(mid));
            root.left=createBST(finalArr,st,mid-1);
            root.right=createBST(finalArr,mid+1,end);
            return root;
        }
        public static void inorder(Node root){
            if(root==null){
                return;
            }
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
        public static void preorder(Node root){
            if(root==null){
                return;
            }
            System.out.print(root.data+" ");
            preorder(root.left);
            preorder(root.right);
        }
        public static void main(String[] args) {
            /*
                            2
                           / \
                          1   4 
             */
            Node root1=new Node(2);
            root1.left=new Node(1);
            root1.right=new Node(4);
            /*
                            9
                          /   \
                         3     12 
             */
            Node root2=new Node(9);
            root2.left=new Node(3);
            root2.right=new Node(12);
            Node root=mergingBST(root1, root2);
            inorder(root);
            System.out.println();
            preorder(root);
            System.out.println();
        }
}