public class ReverseBet {

       static Node head;

        public static class Node{
            int d;
            Node next;
            Node(int d){
                this.d=d;
                next = null;
            }
        }

    public Node reverseBetween(Node A, int m, int n) {
            Node dummy =new Node(-1);
            dummy.next=head;
            Node ptr=dummy;

            Node ptrprev=null;
            int i;
            for(i=0;i<m;i++){
                ptrprev =ptr;
                ptr=ptr.next;
            }
        Node ptr1=ptr;
        for(int j=i;j<n;j++){
            ptr1=ptr1.next;
        }
        Node last =ptr1.next;
        Node curr =ptr;
        Node next=null, prev=null;
        while(curr!=last){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        ptrprev.next=prev;
        ptr.next=curr;
        return dummy.next;
    }
        public static void main(String [] args){
            ReverseBet lc=new ReverseBet();
             head = new Node(1);
            head.next = new Node(2);
            head.next.next = new Node(3);
            head.next.next.next = new Node(4);
            head.next.next.next.next = new Node(5);

            Node ans = lc.reverseBetween(head, 2,4);
            Node d = ans;
            while(d!=null){
            System.out.print(d.d + "->");
            d=d.next;}
        }
    }


