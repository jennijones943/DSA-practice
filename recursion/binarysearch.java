class binary{
   int search(int arr[],int low,int high,int target){
       if(low<=high){
         int mid=(low+high)/2;
         if(arr[mid]==target){
            return 0;
         }
        else if(arr[mid]>target){
            return search(arr,low,mid-1,target);
         }
        else{
            return search(arr,mid+1,high,target);
        }
       }
       return -1;
   }
}
class oops{
    public static void main(String args[]){
        int[] arr={1,2,3,4,5,6};
        binary obj=new binary();
        int result=obj.search(arr,0,arr.length,5);
        if(result==-1){
          System.out.println("not found");
        }
        else{
            System.out.println("found");
        }
    }
}