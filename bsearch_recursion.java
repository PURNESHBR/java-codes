import java.util.*;
public class bsearch_recursion {
    public static int search(int arr[],int target,int s,int e){
        if(s>e)
           return -1;
        int m=s+(e-s)/2;
        if(arr[m]==target)
            return m;
        if(arr[m]>target)
            return search(arr,target,s,m-1);
        return search(arr,target,m+1,e);
    }
    public static int sum(int num){
        if (num==0)
            return 0;
        return num%10+sum(num/10);
    }
    public static int product(int num){
        if (num==0)
            return 1;
        return num%10*product(num/10);
    }
    static int sum=0;
    public static void reverse(int n){
        if(n==0)
            return;
        int rem=n%10;
        sum=sum*10+rem;
        reverse(n/10);
    }
    public static int count(int num,int count){
        if(num==0)
            return count;
        int rem=num%10;
        num/=10;
        if(rem==0)
           count++;
        return count(num,count);
    }
    public static boolean sorted(int arr[],int i){
        if(i==arr.length)
            return true;
        if(arr[i]>arr[i-1])
            return sorted(arr,i+1);
        else
            return false;
    } 
    public static boolean search (int arr[],int i,int target){
        if(i==arr.length)
            return false;
        if(arr[i]==target)
            return true;
        else
            return search(arr,i+1,target);
    }
    public static ArrayList<Integer> searchall(int arr[],int i,int target,ArrayList<Integer> ans){
        if(i==arr.length)
            return ans;
        if(arr[i]==target)
            ans.add(i);
        return searchall(arr, i+1, target, ans);
    }
    public static ArrayList<Integer> searchall2(int arr[],int i,int target){
        ArrayList<Integer> ans = new ArrayList<>();
        if(i==arr.length)
            return ans;
        if(arr[i]==target)
            ans.add(i);
        ans=searchall(arr, i+1, target, ans);
        return ans;
    }
    public static void pattern1(int r,int c){
        if(r==0)
           return;
        if(c<r){
            System.out.print("*");
            pattern1(r, c+1);
        }else{
            System.out.println();
            pattern1(r-1, 0);
        }
    } 
    public static void bubblesort(int r,int c,int arr[]){
        if(r==0)
           return;
        if(c<r){
            if(arr[c]>arr[c+1]){
                int temp=arr[c];
                arr[c]=arr[c+1];
                arr[c+1]=temp;
            }
            bubblesort(r, c+1,arr);
        }else{
            bubblesort(r-1, 0,arr);
        }
    } 
    public static void selectionsort(int r,int c,int arr[],int max){
        if(r==0)
           return;
        if(c<r){
            if(arr[c]>arr[max])
                selectionsort(r, c+1,arr,c);
            else 
                selectionsort(r, c+1,arr,max);
        }else{
            int temp=arr[max];
            arr[max]=arr[r-1];
            arr[r-1]=temp;
            selectionsort(r-1, 0,arr,0);
        }
    } 
    public static void skip (String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        if(ch=='a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }
    public static String skipword(String up){
        if(up.isEmpty()){
            return "";
        }
        if(up.startsWith("apple")){
            return skipword(up.substring(5));
        }else{
            return up.charAt(0)+skipword(up.substring(1));
        }

    }
    public static void subsequence(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        subsequence(p, up.substring(1));
        subsequence(p+ch, up.substring(1));
    }
    public static ArrayList<String> subsequence2(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> left=subsequence2(p, up.substring(1));
        ArrayList<String> right=subsequence2(p+ch, up.substring(1));
        left.addAll(right);
        return left;
    }
    public static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0, i);
            String s=p.substring(i,p.length());
            permutation(f+ch+s, up.substring(1));
        }
    }
    public static ArrayList<String> permutationlist(String p,String up){
        if(up.isEmpty()){
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0, i);
            String s=p.substring(i,p.length());
            ans.addAll(permutationlist(f+ch+s, up.substring(1)));
        }
        return ans;
    }
    public static int noofpermutation(String p,String up){
        if(up.isEmpty()){
            return 1;
        }
        char ch=up.charAt(0);
        int count=0;
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0, i);
            String s=p.substring(i,p.length());
            count=count+(noofpermutation(f+ch+s, up.substring(1)));
        }
        return count;
    }
    public static ArrayList<String> phoneno(String p,String up){//if letters start from 1
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        int digit=up.charAt(0)-'0';//to convert char to int eg='2'to 2 using this 
        for(int i=(digit-1)*3;i<digit*3;i++){
            char ch=(char)('a'+i);
            ans.addAll(phoneno(p+ch, up.substring(1)));
        }
        return ans;
    }
    public static ArrayList<String> phoneno2(String p,String up){//if letters start from 2
        if(up.isEmpty()){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        int digit=up.charAt(0)-'0';//to convert char to int eg='2'to 2 using this 
        if(digit==7){
            for(int i=(digit-2)*3;i<=(digit-1)*3;i++){
                char ch=(char)('a'+i);
                ans.addAll(phoneno2(p+ch, up.substring(1)));
            }
        }
        else if(digit==8){
            for(int i=0;i<3;i++){
                char ch=(char)('t'+i);
                ans.addAll(phoneno2(p+ch, up.substring(1)));
            }
        }
        else if(digit==9){
            for(int i=0;i<4;i++){
                char ch=(char)('w'+i);
                ans.addAll(phoneno2(p+ch, up.substring(1)));
            }
        }
        else{
            for(int i=(digit-2)*3;i<(digit-1)*3;i++){
                char ch=(char)('a'+i);
                ans.addAll(phoneno2(p+ch, up.substring(1)));
            }
        }
        return ans;
    }
    public static ArrayList<String> dice(String p,int target ){
        if(target==0){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        for(int i=1;i<7&&i<=target;i++){
            ans.addAll(dice(p+i, target-i));
        }
        return ans;
    }
    public static int mazecount (int r,int c){
        if(r==1||c==1)
            return 1;
        int left=mazecount(r-1,c);
        int right=mazecount(r,c-1);
        return left+right;
    }
    public static ArrayList<String> maze(String p,int r,int c){
        if(r==1&&c==1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(r>1){
            ans.addAll(maze(p+'V', r-1, c));
        }
        if(c>1){
            ans.addAll(maze(p+'H', r, c-1));
        }
        if(r>1&&c>1){
            ans.addAll(maze(p+'D', r-1, c-1));
        }
        return ans;
    }
    public static ArrayList<String> mazerestrict(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1&&c==maze[0].length-1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(!maze[r][c])
            return ans;
        if(r<maze.length-1){
            ans.addAll(mazerestrict(p+'V',maze, r+1, c));
        }
        if(c<maze[0].length-1){
            ans.addAll(mazerestrict(p+'H',maze, r, c+1));
        }
        if(r<maze.length-1&&c<maze[0].length-1){
            ans.addAll(mazerestrict(p+'D',maze, r+1, c+1));
        }
        return ans;
    }
    public static ArrayList<String> mazealldirection(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1&&c==maze[0].length-1){
            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans=new ArrayList<>();
        if(!maze[r][c])
            return ans;
        maze[r][c]=false;//making the path as visited
        if(r<maze.length-1){
            ans.addAll(mazealldirection(p+'D',maze, r+1, c));
        }
        if(c<maze[0].length-1){
            ans.addAll(mazealldirection(p+'R',maze, r, c+1));
        }
        if(r>0){
            ans.addAll(mazealldirection(p+'U', maze, r-1, c));
        }
        if(c>0){
            ans.addAll(mazealldirection(p+'L', maze, r, c-1));
        }
        maze[r][c]=true;//backtracking, marking the path as unvisited
        return ans;
    }
    public static void mazealldirection2(String p,boolean[][] maze,int r,int c){
        if(r==maze.length-1&&c==maze[0].length-1){
            System.out.println(p);
            return ;
        }
        if(!maze[r][c])
            return ;
        maze[r][c]=false;
        if(r<maze.length-1){
            mazealldirection2(p+'D',maze, r+1, c);
        }
        if(c<maze[0].length-1){
            mazealldirection2(p+'R',maze, r, c+1);
        }
        if(r>0){
            mazealldirection2(p+'U', maze, r-1, c);
        }
        if(c>0){
            mazealldirection2(p+'L', maze, r, c-1);
        }
        maze[r][c]=true;//backtracking, marking back to true 
    }
    public static void printmazepathandmatrix (String p,boolean [][] maze,int r,int c,int [][]path,int count){
        if(r==maze.length-1&&c==maze[0].length-1){
            path[r][c]=count;
            System.out.println(p);
            for(int []arr:path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println();
            return;
        }
        if(!maze[r][c])
            return ;
        maze[r][c]=false;
        path[r][c]=count;
        if(r<maze.length-1){
            printmazepathandmatrix(p+'D',maze, r+1, c,path,count+1);
        }
        if(c<maze[0].length-1){
            printmazepathandmatrix(p+'R', maze, r, c+1,path, count+1);
        }
        if(r>0){
            printmazepathandmatrix(p+'U', maze, r-1, c,path,count+1);
        }
        if(c>0){
            printmazepathandmatrix(p+'L', maze, r, c-1,path,count+1);
        }
        maze[r][c]=true;
        path[r][c]=0;//backtracking, marking back to true 
    }
    public static int nqueens(boolean [][]board,int row){
        if(row==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count=0;
        for(int col=0;col<board.length;col++){
            if(issafe(board,row,col)){
                board[row][col]=true;
                count+=nqueens(board, row+1);
                board[row][col]=false;
            }
        }
        return count;
    }
    public static void display(boolean[][]board){
        for(boolean[]row:board){
            for(boolean ele:row){
                if(ele==true)
                    System.out.print("Q ");
                else 
                    System.out.print("X ");
            }
            System.out.println();
        }
    }
    public static boolean issafe(boolean[][]board,int row,int col){
        //vertical check
        for(int i=0;i<row;i++){
            if(board[i][col])
                return false;
        }
        //left diagonal
        int maxleft=Math.min(row,col);
        for(int i=1;i<=maxleft;i++){
            if(board[row-i][col-i])
                return false;
        }
        //right diagonal
        int maxright=Math.min(row,board.length-col-1);
        for(int i=1;i<=maxright;i++){
            if(board[row-i][col+i])
                return false;
        }
        return true;
    }
    public static void nknights(boolean[][]board,int row,int col,int knights){
        if(knights==0){
            displayknights(board);
            System.out.println();
            return;
        }
        if(row==board.length-1&&col==board.length){
            return; 
        }
        if(col==board.length){
            nknights(board, row+1, 0, knights);
            return;
        }
        if(knightsissafe(board,row,col)){
            board[row][col]=true;
            nknights(board, row, col+1, knights-1);
            board[row][col]=false;
        }
        nknights(board, row, col+1, knights);
    }
    public static void displayknights(boolean[][]board){
        for(boolean[]row:board){
            for(boolean ele:row){
                if(ele==true)
                    System.out.print("K ");
                else 
                    System.out.print("X ");
            }
            System.out.println();
        }
    }
    public static boolean knightsissafe(boolean[][]board,int row,int col){
        if(isvalid(board, row-2, col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if(isvalid(board, row-1, col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if(isvalid(board, row-2, col+1)){
            if(board[row-2][col+1]){
                return false;
            }
        }
        if(isvalid(board, row-1, col+2)){
            if(board[row-1][col+2]){
                return false;
            }
        }
        return true;
    }
    public static boolean isvalid(boolean[][]board,int row,int col){
        if(row>=0&&row<board.length&&col>=0&&col<board.length)
             return true;
        return false;
    }
    public static boolean solvesuduku(int [][]board){
        int n=board.length;
        int row=-1,col=-1;
        boolean emptyleft=true;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==0){
                    row=i;
                    col=j;
                    emptyleft=false;
                    break;
                }
            }
            if(emptyleft==false){
                break;
            }
        }
        if(emptyleft==true)
            return true;
        for(int number=1;number<=9;number++){
            if(issafesusuku(board, row, col, number)){
                board[row][col]=number;
                if(solvesuduku(board)){
                    return true;
                }
                else
                    board[row][col]=0;
            }
        }
        return false;
    }
    public static void displaysuduku(int [][]board){
        for(int[]row:board){
            for(int col:row){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
    public static boolean issafesusuku(int [][]board,int row,int col,int num){
        for(int i=0;i<board.length;i++){
            if(board[row][col]==num)
                return false;
        }
        for(int nums[]:board){
            if(nums[col]==num)
                return false;
        }
        int sqrt=(int)(Math.sqrt(board.length));
        int rowstart=row-row%sqrt;
        int colstart=col-col%sqrt;
        for(int r=rowstart;r<rowstart+sqrt;r++){
            for(int c=colstart;c<colstart+sqrt;c++){
                if(board[r][c]==num)
                    return false;
            }
        }
        return true;
    }
    public List<List<Integer>> subsets(int[] nums) {//all possible subset
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        backtrack1(list, new ArrayList<>(), nums, 0);
        return list;
    }
    
    private void backtrack1(List<List<Integer>> list , List<Integer> tempList, int [] nums, int start){
        list.add(new ArrayList<>(tempList));
        for(int i = start; i < nums.length; i++){
            tempList.add(nums[i]);
            backtrack1(list, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(candidates);
        combinationarray(result,new ArrayList<Integer>(),candidates,target,0);
        return result;
    }
    public void combinationarray(List<List<Integer>> result,ArrayList<Integer> temp,int []cand,int target,int start){
        if(target<0)
            return;
        if(target==0){
            result.add(new ArrayList<>(temp));
            return;
        }
        else{
            for(int i=start;i<cand.length;i++){
                temp.add(cand[i]);
                combinationarray(result,temp,cand,target-cand[i],i);
                temp.remove(temp.size()-1);
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,4,5,6};
        int a[]={9,4,3,7,4,2,1,0};
        int b[]={8,4,9,6,7,2,0,1};
        ArrayList<Integer> ans=new ArrayList<>();
        ArrayList<String> ans1=new ArrayList<>();
        ArrayList<String> ans2=new ArrayList<>();
        ArrayList<String> ans3=new ArrayList<>();
        ArrayList<String> ans4=new ArrayList<>();
        ArrayList<String> ans5=new ArrayList<>();
        ArrayList<String> ans6=new ArrayList<>();
        int target=4;
        int i=1302005;
        System.out.println(search(arr,target,0,arr.length));
        System.out.println(sum(i));
        System.out.println(product(i));
        reverse(i);
        System.out.println(sum);
        System.out.println(count(i, 0));
        System.out.println(sorted(arr, 1));
        System.out.println(search(arr, 0, 9));
        System.out.println(searchall(arr, 0, target, ans));
        System.out.println(searchall2(arr, 0, target));
        pattern1(4, 0);
        bubblesort(a.length-1, 0, a);
        System.out.println(Arrays.toString(a));//to print the elements of array
        selectionsort(b.length, 0, b, 0);
        System.out.println(Arrays.toString(b));
        skip("", "baccab");
        System.out.println(skipword("bcappledb"));
        subsequence("", "abc");
        ans1=subsequence2("", "abc");
        System.out.println(ans1);
        permutation("", "abc");
        ans2=permutationlist("", "abc");
        System.out.println(ans2);
        System.out.println("no of permutations = "+noofpermutation("", "abc"));
        ans3=phoneno("", "12");
        System.out.println(ans3);
        ans4=phoneno2("", "79");
        System.out.println(ans4);
        ans5=dice("", 4);
        System.out.println(ans5);
        System.out.println("no of ways in maze = "+mazecount(3, 3));
        ans6=maze("", 3, 3);
        System.out.println(ans6);
        boolean [][]board={
            {true,true,true},
            {true,true,true},
            {true,true,true},
        };
        int [][]board1={
            {0,0,0},
            {0,0,0},
            {0,0,0},
        };
        System.out.println("no of paths after restrictions is "+ mazerestrict("", board, 0, 0));
        System.out.println("no of paths for all direction is "+mazealldirection("", board, 0, 0));
        mazealldirection2("", board, 0, 0);
        printmazepathandmatrix("", board, 0, 0, board1,1);
        int n=4;
        boolean [][] qboard=new boolean[n][n];
        System.out.println("no of ways for "+n+" queens are "+nqueens(qboard, 0));
        //nknights(qboard, 0, 0, n);
        int [][] sudukuboard=new int[][]{
            {5,3,0,0,7,0,0,0,0}
            ,{6,0,0,1,9,5,0,0,0}
            ,{0,9,8,0,0,0,0,6,0}
            ,{8,0,0,0,6,0,0,0,3}
            ,{4,0,0,8,0,3,0,0,1}
            ,{7,0,0,0,2,0,0,0,6}
            ,{0,6,0,0,0,0,2,8,0}
            ,{0,0,0,4,1,9,0,0,5}
            ,{0,0,0,0,8,0,0,7,9}
        };
        if(solvesuduku(sudukuboard)){
            displaysuduku(sudukuboard);
        }
        else{
            System.out.println("can't solve");
        }
    } 
}