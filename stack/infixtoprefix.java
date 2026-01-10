import java.util.*;
class infix{
    String exp;
    char[] stack;
    int top=-1;
    String prefix="";
    infix(String exp){
       this.exp=exp;
       stack=new char[exp.length()];
    }
    int presidence(char ch){
        if(ch=='+' || ch=='-')return 1;
        if(ch=='*' || ch=='/')return 2;
        if(ch=='^') return 3;
        return 0;
    }
    boolean isleft(char ch){
        return ch!='^';
    }
    void convert(){
        exp=new StringBuilder(exp).reverse().toString();
        for(int i=0;i<exp.length();i++){
            char ch=exp.charAt(i);
            if(Character.isLetterOrDigit(ch)){
                prefix+=ch;
            }
            else if(ch==')'){
                stack[++top]=ch;
            }
            else if(ch=='('){
                while(top!=-1 && stack[top]!=')'){
                    prefix+=stack[top];
                    top--;
                }
                top--;
            }
            else{
                while(top!=-1 && isleft(ch) && presidence(ch)<=presidence(stack[top])) {
                    prefix+=stack[top];
                    top--;
                }
                stack[++top]=ch;
            }
        }
        while(top!=-1){
            prefix+=stack[top];
            top--;
        }
    prefix=new StringBuilder(prefix).reverse().toString();
    System.out.println(prefix+" ");
    }
}
class prefix{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the expression");
        String exp=sc.next();
        infix obj=new infix(exp);
        obj.convert();
    }
}
