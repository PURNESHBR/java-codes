import java.util.*;

public class countingstring {
    public static int mostWordsFound(String[] sentences) {
        int ger=0;
        //StringBuilder st=new StringBuilder();//we can pass any string variable inside it to store in it ); in string builder we can get operations like append, trim, delete ect  
        //StringBuffer st1=new StringBuffer();
        //String s=""; string class contain length , concatenate ect   
        String s="purnesh b r      ";
        String s1="";
        char ch='p';
        char d[]=s.toCharArray();
        StringBuilder st=new StringBuilder();
        st.equals(s);
        s.contains(st);
        System.out.println(s.substring(0, 4));//begin_index is included end_index is excluded
        String p[]=s.split(" ");
        st.equals(p);
        System.out.println(p[0]);
        String a[]={"flower","flow","flight"};
        Arrays.sort(a);
        System.out.println(a[1]);
        for(int i=0;i<sentences.length;i++){
            int cou=0;
            for(int j=0;j<sentences[i].length();j++){
                if(sentences[i].equals(' ')||j==sentences[i].length()-1){
                    cou++;
                }
            }
            if(cou>ger){
                ger=cou;
            }
        }
        return ger;

    }
    public static void main(String[] args) {
        String sr[]={"purn","sai","ayus"};
        int num=mostWordsFound(sr);
        System.out.println(num);
    }
}

