class recursion{
    int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }

}
class oops{
    public static void main(String args[]){
        recursion obj=new recursion();
        int sum=obj.sum(10);
        System.out.println(sum);
    }
}
