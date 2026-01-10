class recursion{
    int febi(int n){
        if(n==1 || n==0){
            return n;
        }
        return  febi(n-1)+febi(n-2);
    }
}
class oops{
    public static void main(String args[]){
        recursion obj=new recursion();
        int n=6;
        for(int i=0;i<n;i++){
        int val=obj.febi(i);
        System.out.println(val);
        }
    }
}
