class recursion{
    void print(int n){
        if(n<0){
            return;//base condition first 
        }
        System.out.println(n+"");
        print(n-1);//recursive call after
    }
}
class oops{
    public static void main(String args[]){
        recursion obj=new recursion();
        obj.print(9);
    }
}
