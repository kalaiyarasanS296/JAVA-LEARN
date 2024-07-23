package Linklist;
    public class implementation_linkedlist {
        public class Node{
            int data;
            Node next;
        }
        public Node head;
        public Node tail;
        public int size;
        public void addlast(int item)
        {
            Node nn=new Node();
            nn.data=item;
            nn.next=null;
            if(this.size>=1)
            {
                this.tail.next=nn;
            }
            if(this.size==0)
            {
                this.head=nn;
                this.tail=nn;
                this.size++;
            }else {
                this.tail=nn;
                this.size++;
            }
        }
        public void addfirst(int item)
        {
            Node nn=new Node();
            nn.data=item;
            nn.next=null;
            if(this.size>=1)
                nn.next=this.head;
            if(this.size==0)
            {
                this.head=nn;
                this.tail=nn;
                this.size++;
            }
            else
            {
                this.head=nn;
                this.size++;
            }
        }
        public void display()
        {
            Node temp=this.head;
            while(temp!=null)
            {
                System.out.println(temp.data+" ");
                temp=temp.next;
            }
        }
        public Node getNodeAt(int idx)throws Exception
        {
            if(this.size==0)
                throw new Exception("ll is empty");
            if(idx<0||idx>this.size)
                throw new Exception("invalid index");
            Node temp=this.head;
            for(int i=1;i<idx;i++)
            {
                temp=temp.next;
            }
            return temp;
        }
        public int getfirst()throws Exception
        {
            if(this.size==0) {
                throw new Exception("ll is empty");
            }
            return head.data;
        }
        public int getlast()throws Exception
        {
            if(this.size==0)
                throw new Exception("ll is empty");
            return tail.data;
        }
        public int getAt(int idx)throws Exception
        {
            if(this.size==0) {
                throw new Exception("ll is empty");
            }
            if(idx<0||idx>=this.size) {
                throw new Exception("invalid index");
            }
            Node temp=this.head;
            for(int i=1;i<idx;i++) {
                temp = temp.next;
            }
            return temp.data;
        }
        public void removefirst()throws Exception
        {
            if(this.size==0)
                throw new Exception("ll is empty");
            if(this.size==1)
            {
                this.head=null;
                this.tail=null;
                this.size=0;
            }else
            {
                this.head=this.head.next;
                this.size--;
            }
        }
        public void removelast()throws Exception
        {
            if(this.size==0)
                throw new Exception("ll is empty");
            if(this.size==1)
            {
                this.head=null;
                this.tail=null;
                this.size=0;
            }
            Node sizem2=getNodeAt(this.size-1);
            this.tail=sizem2;
            this.tail.next=null;
            this.size--;
        }
        public void removeat(int idx)throws Exception
        {
            if(this.size==0)
                throw new Exception("ll is empty");
            if(this.size==1)
            {
                this.head=null;
                this.tail=null;
                this.size=0;
            }
            Node nm1=getNodeAt(idx-1);
            Node np1=getNodeAt(idx+1);
            nm1.next=np1;
            this.size--;
        }
    }
