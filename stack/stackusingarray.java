class stack{
   int maxsize;
   int[] arr;
   int top;
   stack(int maxsize){
    this.maxsize=maxsize;
    arr=new int[maxsize];
    top=-1;
   }
   void push(int data){
    if(top==maxsize-1){
        System.out.println("overflow");
        return;
    }
    arr[++top]=data;
    System.out.println(data+"  pushed");
   }
   void pop(){
    if(top==-1){
        System.out.println("underflow");
        return;
    }
    System.out.println(arr[top]+" popped element");
    top--;
    }
    void peek(){
    if(top==-1){
        System.out.println("stack is empty");
        return;
    }
    System.out.println(arr[top]+" is the peek element");
    }
     void print(){
    int temp;
    temp=top;
    while(temp>=0){
        System.out.println(arr[temp]+" ");
        temp--;
    }
   }
   }
class stackk{
    public static void main(String args[]){
        stack arr=new stack(4);
    arr.push(1);
    arr.push(2);
    arr.push(3);
    arr.push(4);
    arr.print();
    arr.pop();
    arr.peek();
    arr.print();
    }
}
