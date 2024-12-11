import java.util.*;
public class four_direction_maze_path_backtracking {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in); 
        System.out.println("enter the number of rows");
        int rows=in.nextInt();
        System.out.println("enter the number of column");
        int colm=in.nextInt();
        boolean isvisited[][]=new boolean [rows][colm];
        print(0,0,rows-1,colm-1,"",isvisited);
    }
    public static void print(int sr,int sc,int er , int ec,String s,boolean isvisited[][]){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(isvisited[sr][sc]==true) return;
        if (sr==er && sc==ec) {
            System.out.println(s);
            return;
        } 
        isvisited[sr][sc]=true;
        //right
        print(sr,sc+1,er,ec,s+"R",isvisited);
        //down
        print(sr+1,sc,er,ec,s+"D",isvisited);
        //left
        print(sr,sc-1,er,ec,s+"L",isvisited);
        //up
        print(sr-1,sc,er,ec,s+"U",isvisited);
        //backtracking
        isvisited[sr][sc]=false;
    }
    
}
