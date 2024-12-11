import java.util.*;
public class graph1 {
    static class edge {
        int src;//source 
        int dest;//destination
        int wt;//weight
        //constructor
        public edge(int s,int d,int w){
            src=s;
            dest=d;
            wt=w;
        }
    }
    public static void creategraph(ArrayList<edge> graph[]){
        for(int i=0;i<graph.length;i++)//this is to make null list to empty list 
            graph[i]=new ArrayList<edge>();
        graph[0].add(new edge(0, 1,0));
        graph[0].add(new edge(0, 2,0));

        graph[1].add(new edge(1, 0,0));
        graph[1].add(new edge(1, 3,0));

        graph[2].add(new edge(2, 0,0));
        graph[2].add(new edge(2, 4,0));

        graph[3].add(new edge(3, 1,0));
        graph[3].add(new edge(3, 4,0));
        graph[3].add(new edge(3, 5,0));
        
        graph[4].add(new edge(4, 2,0));
        graph[4].add(new edge(4, 3,0));
        graph[4].add(new edge(4, 5,0));

        graph[5].add(new edge(5, 3,0));
        graph[5].add(new edge(5, 4,0));
        graph[5].add(new edge(5, 6,0));

        graph[6].add(new edge(6, 5,0));

    }
    public static void bfs(ArrayList<edge> graph[],int v){//o(v+e)
        Queue <Integer> q=new LinkedList<>();
        boolean vis[]=new boolean[v];
        edge e=graph[0].get(0);
        q.add(e.src);
        while(!q.isEmpty()){
            int curr=q.remove();
            if(vis[curr]==false){
                System.out.print(curr+" ");
                vis[curr]=true;
                for(int i=0;i<graph[curr].size();i++){
                    edge nei=graph[curr].get(i);
                    q.add(nei.dest);
                }
            }
        }
    }
    public static void dfs(ArrayList<edge> graph[],int curr,boolean vis[]){
        System.out.print(curr+" ");
        vis[curr]=true;
        for(int i=0;i<graph[curr].size();i++){
            edge e=graph[curr].get(i);
            if(vis[e.dest]==false)
                dfs(graph,e.dest,vis);
        }

    }
    public static void printallpath(ArrayList<edge> graph[],int curr,String path,boolean vis[],int tar){
        if(curr==tar){
            System.out.println(path);
            return;
        }
        for(int i=0;i<graph[curr].size();i++){
            edge e =graph[curr].get(i);
            if(vis[e.dest]==false){
                vis[curr]=true;
                printallpath(graph, e.dest, path+e.dest, vis, tar);
                vis[curr]=false;
            }
        }
    }
    public static void main(String[] args) {
        int v=7;
        ArrayList<edge> graph[]=new ArrayList[v];
        creategraph(graph);
        //printing neighbours of 2 
        /*for(int i=0;i<graph[2].size();i++){
            //edge e=graph[2].get(i);
            //System.out.println(e.dest+" "+e.wt);
        }*/
        //bfs(graph, v);
        boolean vis[]=new boolean[v];
        /*for(int i=0;i<v;i++){//for non connected graph
            if (vis[i]==false)
                dfs(graph, i, vis);
        }*/
        int src=0,tar=5;
        printallpath(graph, src, "0", vis, tar);

        
    }
    
}
