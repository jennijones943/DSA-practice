import java.util.*;
class infix{
    String exp;
    char[] stack;
    String postfix="";
    int top=-1;
   infix(String exp){
        this.exp=exp;
        stack=new char[exp.length()];
   }
   int presidence(char ch){
    if(ch=='+' || ch=='-') return 1;
    if(ch=='*' || ch=='/') return 2;
    if(ch=='^') return 3;
    return 0;
   }
   boolean isleft(char ch){
      return ch!='^';
   }
   void convert(){
    for(int i=0;i<exp.length();i++){
        char ch=exp.charAt(i);
        if(Character.isLetterOrDigit(ch)){
            postfix+=ch;
        }
        else if(ch == '('){
            stack[++top]=ch;
        }
        else if(ch == ')'){
            while(stack[top]!='(' && top!=-1){
                 postfix+=stack[top];
                 top--;
            }
            stack[top]=stack[--top];
        }
        else{
            while(top!=-1 && presidence(ch)<=presidence(stack[top]) && isleft(ch)){
            postfix+=stack[top];
            top--;
        }
        stack[++top]=ch;
        }
    }
    while(top!=-1){
        postfix+=stack[top];
        top--;
    }
    System.out.println(postfix+" ");
   }
}
class postfix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your infix expression");
        String exp=sc.next();
        infix obj=new infix(exp);
        obj.convert();
    }
}
