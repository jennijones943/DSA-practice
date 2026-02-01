class sb{
    void subset(int arr[],int ans[],int i,int l){
        if(i==arr.length){
            for(int j=0;j<l;j++){
                System.out.print(ans[j]+"");
            }
            System.out.println();
            return;
        }
        ans[l]=arr[i];
        subset(arr,ans,i+1,l+1);
        subset(arr,ans,i+1,l);
    }
}
class oops {
    public static void main(String[] args) {

        sb obj = new sb();
        int[] arr = {1, 2, 3};
        int[] ans = new int[arr.length];

        obj.subset(arr, ans, 0, 0);
    }
}

