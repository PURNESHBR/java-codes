public class circular_queue_using_array {
    public static class cqa{
        int f = 0;
        int r=-1;
        int size = 0;
        int arr[]=new int[8];
        public void add(int val)throws Exception{
            if(size==arr.length){
                throw new Exception("queue is full");
            }
            else if(size==0){//base case
                r=0;
                arr[0]=val;
            }
            else if(r<arr.length-1){//normal case
                arr[++r]=val;
            }
            else if(r==arr.length-1){
                r=0;
                arr[0]=val;
            }
            size++;
        }
        public int remove()throws Exception{
            if(size==0){
                throw new Exception("queue is empty");
            }
            else{
                int val=arr[f];
                if(f==arr.length-1) f=0;
                else f++;
                size--;
                return val;
            }
        }
        public int peek()throws Exception{
            if(size==0){
                throw new Exception("queue is empty");
            }
            else return arr[f];
        }
        public void display(){
            if (size==0) System.out.println("queue is empty");
            else if(f<=r){
                for (int i=f;i<r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            else{//r<f
                for(int i=f;i<arr.length-1;i++){
                    System.out.print(arr[i]+" ");
                }
                for(int i=0;i<r;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args)throws Exception {
        cqa q=new cqa();
        q.display();
        q.add(1);
        //q.add(1);
        //q.add(1);
        //q.add(1);
        q.display();
    }
}
