import java.util.*;
class Solution{
    static void merge(int[] arr,int start,int mid,int end){
        int i=start;
        int j=mid+1;
        List<Integer> ans=new ArrayList<>();
        while(i<=mid && j<=end){
            if(arr[i]<=arr[j]){
               ans.add(arr[i]);
               i++;
            }
            else{
               ans.add(arr[j]);
               j++;
            }
        }
        while(i<=mid){
            ans.add(arr[i]);
            i++;
        }
        while(j<=end){
            ans.add(arr[j]);
            j++;
        }
        for(int k=0;k<ans.size();k++){
            arr[k+start]=ans.get(k);
        }
    }
    static void mergesort(int[] arr,int start,int end){
        if(start>=end){
            return;
        }
        int mid=start+((end-start)/2);
        mergesort(arr,start,mid);
        mergesort(arr,mid+1,end);
        merge(arr,start,mid,end);
    }
    public static void main(String args[]){
        int[] arr={12, 31, 35, 8, 32, 17};
        mergesort(arr,0,arr.length-1);
        for(int n:arr){
            System.out.println(n);
        }
    }
}