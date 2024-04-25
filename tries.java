public class tries {
    static class node{
        node[] children;
        boolean eow;

        public node(){
            children=new node[26];//a to z
            for(int i=0;i<26;i++){
                children[i]=null;
            }
            eow=false;
        }
    }
    static node root=new node();//creation of new root node
    public static void insert(String word){
        node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null){
                //add new node
                curr.children[idx]=new node();
            }
            if(i==word.length()-1){
                curr.children[idx].eow=true;
            }
            curr=curr.children[idx];
        }
    }
    public static boolean search (String word){
        node curr=root;
        for(int i=0;i<word.length();i++){
            int idx=word.charAt(i)-'a';
            if(curr.children[idx]==null)
                return false;
            if(i==word.length()-1&&curr.children[idx].eow==false)
                return false;
            curr =curr.children[idx];
        }
        return true;
    }
    public static boolean wordbreak(String key){
        if(key.length()==0){
            return true;
        }
        for(int i=1;i<=key.length();i++){
            String firstpart=key.substring(0, i);
            String secondpart=key.substring(i);
            if(search(firstpart)&&wordbreak(secondpart)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        //String words[]={"the","a","there","their","any"};
       // for(int i=0;i<words.length;i++){
        //    insert(words[i]);
        //}
        //System.out.println(search("their"));
        //System.out.println(search("thor"));
        //System.out.println(search("a"));
        String word[]={"i","like","sam","samsung","mobile"};
        String key="ilikesamsung";
        for(int i=0;i<word.length;i++){
            insert(word[i]);
        }
        System.out.println(wordbreak(key));
    }
    
}
