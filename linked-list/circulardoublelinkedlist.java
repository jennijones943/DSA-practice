class linked{
    class node{
        int data;
        node prev,next;
        node(int data){
            this.data=data;
            this.prev=null;
            this.next=null;
        }
    }
        node head,temp,newnode,current,prev;
        void create(int data){
            node newnode=new node(data);
            newnode.next=newnode;
            newnode.prev=newnode;
            head=newnode;
        }
        void insertlast(int data){
            node newnode=new node(data);
            if(head==null){
                create(data);
                return;
            }
            temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            newnode.prev=temp;
            temp.next=newnode;
            newnode.next=head;
            head.prev=newnode;

        }
        void insertbig(int data){
            node newnode=new node(data);
            head=temp;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=newnode;
            newnode.next=head;
            newnode.prev=temp;
            head=newnode;

        }
        void insertpos(int pos,int data){
            node newnode=new node(data);
            if(head==null){
                create(data);
                return;
            }
            int i=0;
            temp=head;
            while(i<pos-1 && temp.next!=head){
                temp=temp.next;
                i++;
            }
            temp.next.prev=newnode;
            newnode.next=temp.next;
            temp.next=newnode;
            newnode.prev=temp;
        }
        void deletepos(int pos){
            if(head==null){
                return;
            }
            int i=0;
            temp=head;
            while(pos>i && temp.next!=head){
               temp=temp.next;
               i++;
            }
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
        }
        void deletebig(){
            if(head==null){
                return;
            }
            temp=head;
            while(temp.next!=head){
                temp=temp.next;
            }
            temp.next=head.next;
            head.next.prev=temp;
            head=head.next;

        }
        void reverse(){
            current=head;
            prev=head;
            do{
               current=current.next;
               prev.prev=prev.next;
               prev.next=current;
               prev=current;
            }
            while(current!=head);
            head=head.next;
        }
        void print(){
            System.out.println("your data");
            temp=head;
            do{
                System.out.println(temp.data+" ");
                temp=temp.next;
            }while(temp!=head);
        }
}
class list{
    public static void main(String args[]){
        linked no=new linked();
        no.create(1);
        no.insertlast(2);
        no.insertlast(3);
        no.print();
        no.insertbig(0);
        no.print();
        no.deletebig();
        no.print();
        no.deletepos(2);
        no.print();
        no.insertpos(1,3);
        no.print();
        no.reverse();
        no.print();
    }
}
