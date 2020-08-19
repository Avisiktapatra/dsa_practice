public class Rotate {

    static Node head;

    public static class Node{
        int d;
        Node next;
        Node(int d){
            this.d=d;
            next = null;
        }
    }
    public Node rotateRight(Node head, int k) {
        if(head==null) return null;
        if(k == 0 ) return head;
        int ct=1;
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
            ct++;
        }
        Node curr1=head;
        for(int i=1;i<ct-k%ct;i++){
            curr1=curr1.next;
        }
        if(curr==curr1) return head;
        Node first = curr1.next;
        curr1.next=null;
        curr.next=head;
        head = first;
        return head;
    }

    public static void main(String [] args){
        Rotate lc=new Rotate();
        head = new Node(1);
        head.next = new Node(2);
//        head.next.next = new Node(3);
//        head.next.next.next = new Node(4);
//        head.next.next.next.next = new Node(5);

        Node ans = lc.rotateRight(head, 1);
        Node d = ans;
        while(d!=null){
            System.out.print(d.d + "->");
            d=d.next;}
    }
}
