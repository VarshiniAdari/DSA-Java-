public class LongestWord {
    static class Node {
        Node children[] = new Node[26];
        boolean eow = false;//endOfWord
        
        Node() {
            for(int i=0; i<26; i++) {
                children[i] = null;
            }
        }
    }
    public static Node root = new Node();
    public static void insert(String word) {
        Node curr = root;
        for(int level = 0; level < word.length(); level++) {
            int idx = word.charAt(level) - 'a';
            if(curr.children[idx] == null) {
                curr.children[idx] = new Node();
            }
            curr = curr.children[idx];
        }
        curr.eow = true;
    }
    public static boolean search(String key) {
        Node curr = root;
        for(int level = 0; level < key.length(); level++) {
            int idx = key.charAt(level) - 'a';
            if(curr.children[idx] == null) {
                return false;
            }
            curr = curr.children[idx];
        }
        return curr.eow == true;
    }
    public static String ans="";
    public static void longestWord(Node root, StringBuilder tmp){
        if(root==null){
            return;
        }
        for(int i=0;i<26;i++){
            if(root.children[i]!=null&&root.children[i].eow==true){
                char ch=(char)(i+'a');
                tmp.append(ch);
                if(tmp.length()>ans.length()){
                    ans=tmp.toString();
                }
                longestWord(root.children[i], tmp);
                tmp.deleteCharAt(tmp.length()-1); //backtrack
            }
        }
    }
    public static void main(String[] args) {
        String[] words={"a","banana","ap","app","appl","apply","apple"};
        for(int i=0;i<words.length;i++){
            insert(words[i]);
        }
        longestWord(root, new StringBuilder(""));
        System.out.println(ans);
    }
}
