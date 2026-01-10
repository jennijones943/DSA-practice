class recursion{
    int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }

}
class oops{
    public static void main(String args[]){
         recursion obj=new recursion();
         int val=obj.fact(3);
         System.out.println(val);
    }
}
