public class ListCycle {
Node head;

public static class Node{
    int d;
    Node next;
    Node(int d){
        this.d=d;
        next = null;
    }
}

    public Node detectCycle(Node head) {
        Node sp = head;
        Node fp = head;
        Node curr = head;
        if(head == null) return null;
        if(cyclePresent(head, sp, fp)){
            Node fp1 = fp;
            while(curr!=fp1){
                curr=curr.next;
                fp1=fp1.next;
            }
        }
        else return null;


        return curr;
    }
    public boolean cyclePresent(Node head, Node sp, Node fp) {

        while (fp != sp ) {
            sp = sp.next;
            fp = fp.next.next;
            if (fp == null || fp.next == null)
                return false;

        }
        return true;
    }
    public static void main(String [] args){
    Node head = new Node(3);
    head.next = new Node(2);
    head.next.next = new Node(0);
    head.next.next.next = new Node(-4);
    head.next.next.next.next = head.next;
        ListCycle lc=new ListCycle();
       Node ans = lc.detectCycle(head);
       System.out.print(ans.d);
    }
}
