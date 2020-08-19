public class MergeTwoLists {
    Node head;
   static class Node{
       int data;
       Node next;
       Node(int x){
           data = x;
           next = null;
       }
    }

    public static void printList(Node n1){
       while(n1 != null) {
           System.out.print(n1.data + "->");
           n1=n1.next;
       }
    }
    static Node mergeTwo(Node n1, Node n2) {
        if (n1 == null)
            return n2;
        else if (n2 == null)
            return n1;
        else if (n1.data <= n2.data) {
            n1.next = mergeTwo(n1.next, n2);
            return n1;
        } else {
            n2.next = mergeTwo(n1, n2.next);
            return n2;
        }
    }
    public static void main(String [] args){
        MergeTwoLists mtl = new MergeTwoLists();
        mtl.head = new Node(1);
        mtl.head.next = new Node(2);
        mtl.head.next.next = new Node(4);

        MergeTwoLists mtl2 = new MergeTwoLists();
        mtl2.head = new Node(1);
        mtl2.head.next = new Node(3);
        mtl2.head.next.next = new Node(4);

        Node res = mergeTwo(mtl.head,mtl2.head);
        printList(res);
    }
}
