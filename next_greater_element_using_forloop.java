// using for loop
public class next_greater_element_using_forloop {
    public static int[] greater (int arr[]){
        int n=arr.length;
        int arr1[]=new int[arr.length];
        for(int i=0;i<n;i++){
            arr1[i]=-1;
            for(int j=i+1;j<n;j++){
                if (arr[i]<arr[j]){
                    arr1[i]=arr[j];
                    break;
                }
            }

        }
        return arr1;

    }
    public static void main(String[] args) {
        int arr[]={1,3,2,1,8,6,3,4};
        int res[]=greater(arr);
        for(int i=0;i<res.length;i++){
            System.out.print(res[i]+" ");
        }
    }
    
}

