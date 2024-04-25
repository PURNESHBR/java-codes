import java.util.*;
public class hashmap_implementation {
    static class Myhaspmap<k,v>{//<k,v> is generic type we don't know the type of k and v value
        private class Node {
            k key;
            v value;


            public Node(k key,v value){
                this.key=key;
                this.value=value;
            }
        }
        private LinkedList<Node> buckets[];
        private int n;//n=no of nodes
        private int N;//n=bucket length
        @SuppressWarnings("unchecked")//to avoid warnings

        public Myhaspmap(){//to create empty linked list 
            this.N=4;
            this.buckets = new LinkedList[4];
            for(int i=0;i<4;i++){
                this.buckets[i]=new LinkedList<>();
            }
        }

        private int hashfunction(k key){
            int bi=key.hashCode();
            return Math.abs(bi)%N;//to get bi in 0 - N-1 range
        }

        private int searchinll(k key , int bi){
            LinkedList <Node> ll=buckets[bi];
            for(int i=0;i<ll.size();i++){
                if(ll.get(i).key==key){
                    return i;//di
                }
            }
            return -1;
        }

        private void  rehash(){
            LinkedList<Node> oldbuckets[]=buckets;//to store old buckets in another buckets and increase the size of old buckets 
            buckets=new LinkedList[N*2];
            for(int i=0;i<N*2;i++){
                buckets[i]=new LinkedList<>();
            } 
            for(int i=0;i<oldbuckets.length;i++){
                LinkedList<Node> ll=oldbuckets[i];
                for(int j=0;j<ll.size();j++){
                    Node node = ll.get(j); 
                    put(node.key, node.value);
                } 

            }
        }

        public void put(k key,v value){
            int bi=hashfunction(key);//bucket index 
            int di=searchinll(key,bi);//data index
            if(di==-1){//key does not exist and create new node
                buckets[bi].add(new Node(key,value)); //add new node 
                n++;
            }else{//node exist modify the value
                Node node=buckets[bi].get(di);
                node.value=value;
            }
            double lambda=(double)n/N;
            if(lambda>2.0){//k vaulue =2.0
                rehash();
            }
        }

        public v get(k key){
            int bi=hashfunction(key);
            int di=searchinll(key,bi);
            if(di==-1){
                return null;
            }else{
                Node node=buckets[bi].get(di);
                return node.value;
            }

        }

        public boolean containskey(k key){
            int bi=hashfunction(key);
            int di=searchinll(key,bi);
            if(di==-1){
                return false;
            }else{
                return true;
            }
        }

        public v remove(k key){
            int bi=hashfunction(key);
            int di=searchinll(key,bi);
            if(di==-1){
                return null;
            }else{//node exist modify the value
                Node node=buckets[bi].remove(di);
                n--;
                return node.value;
            }
        }

        public boolean isempty(){
            return n==0;
        }

        public ArrayList<k> keySet(){
            ArrayList<k> keys=new ArrayList<>();
            for(int i=0;i<buckets.length;i++){//bi
                LinkedList<Node> ll=buckets[i];
                for(int j=0;j<ll.size();j++){//di
                    Node node =ll.get(j);
                    keys.add(node.key);
                }
            }
            return keys;
        }

    }
    public static void main(String[] args) {
        HashMap<String,Integer> map=new HashMap<>();
        map.put("india",150);
        map.put("china",200);
        map.put("us",120);
        map.put("nepal",50); 
        ArrayList<String> keys= (ArrayList<String>) map.keySet();
        for(int i=0;i<keys.size();i++){
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
        map.remove("china");
        System.out.println(map.get("china"));
    }
}