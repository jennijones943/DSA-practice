class sorted{
    boolean issorted(int arr[],int n){
        if(n==0 || n==1){
            return true;
        }
        return arr[n-1]>=arr[n-2] && issorted(arr,n-1);
    }
}
class oops{
    public static void main(String args[]){
        int[] arr={1,2,8,4};
        sorted obj=new sorted();
        System.out.println(obj.issorted(arr,arr.length));
    }
}
