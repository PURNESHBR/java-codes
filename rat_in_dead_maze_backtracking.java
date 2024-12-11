public class rat_in_dead_maze_backtracking {
    public static void main(String[] args) {
        int row=3;
        int colm=4;
        int maze[][]={{1,0,1,1},
                      {1,1,1,1},
                      {1,1,0,1}};//0 means where the rat can't go only can go to 1  
        print(0,0,row-1,colm-1,"",maze);
    }
    public static void print (int sr, int sc, int er, int ec,String s,int maze[][]){
        if(sr<0 || sc<0) return ;
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0) return;
        if(maze[sr][sc]==-1) return;
        maze[sr][sc]=-1;
        //right
        print(sr,sc+1,er,ec,s+"R",maze);
        //down
        print(sr+1,sc,er,ec,s+"D",maze);
        //left
        print(sr,sc-1,er,ec,s+"L",maze);
        //up
        print(sr-1,sc,er,ec,s+"U",maze);
        //backtracking
        maze[sr][sc]=1;
    }
    
}
