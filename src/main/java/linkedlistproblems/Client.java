package linkedlistproblems;

import java.util.LinkedList;

public class Client {

    void printingLL(Node node){
       Node  temp=node;
        while (temp != null){
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
    void addHead(Node nn,Node mn,int idx){
        Node temp= mn;
        if(idx==0){
            nn=mn;
        }else{
            Node n=mn;
            for (int i = 1; i <idx-1 ; i++) {
             n=n.next;
            }
            nn.next=n.next;
            n.next=nn;

        }
    }
    void deleteNode(Node mn,int idx){
        Node temp=mn;

        if(idx == 0){
            temp=mn.next;
        }else{
            Node temp1 =mn;
            for(int i=0;i<idx;i++){
                temp1 =mn.next;
            }
            temp1.next=temp1.next.next;

        }
    }
    Node reverseLL(Node node){
        Node c=node;
        Node p=null;
        while(c!=null){
            Node n=c.next;
            c.next=p;
            p=c;
            c=n;
        }
        return p;
    }
    Boolean cycleDeduction(Node head){
        Node slow=head;
        Node fast= head;
        while (fast.next !=null && fast.next.next != null){
            slow=slow.next;
            fast= fast.next.next;
            if(slow == fast){
                System.out.println("Cycle is true");
                return true;

            }
        }
        return false;
    }

    Node break_cycle(Node head){
        Node slow= head;
        Node fast= head;

        while(fast.next !=null && fast.next.next!= null){
            slow=slow.next;
            fast=fast.next.next;
            if(slow==fast){
                break;
            }
        }
        Node s1=head, s2=slow;
        while (s1.next!= s1 ){
            s1=s1.next;
            s2=s2.next;
        }
        s1.next=null;
        return s2;
    }




    public static void main(String[] args) {
        Client c= new Client();
            Node firstaddress= new Node(5);
            firstaddress.next= new Node(7);
            firstaddress.next.next= new Node(8);
            Node newnode= new Node(6);
            c.printingLL(firstaddress);
            c.addHead(newnode,firstaddress,2);
            c.printingLL(firstaddress);
            c.deleteNode(firstaddress,3);
            c.printingLL(firstaddress);
            Node n= c.reverseLL(firstaddress);
            System.out.println("After reversed");
            c.printingLL(n);
            Node head = new Node(1);
            Node second = new Node(2);
            Node third = new Node(3);
            Node fourth = new Node(4);
            Node fifth = new Node(5);
            head.next = second;
            second.next = third;
            third.next = fourth;
            fourth.next = fifth;
            fifth.next = third;
            c.cycleDeduction(head);
            c.break_cycle(head);
            c.printingLL(head);





    }
}
