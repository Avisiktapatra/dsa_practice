public class Duplicate {

    static Node head;
    static class Node {
        int d;
        Node next;

         Node(int d) {
            this.d = d;
            next = null;
        }
    }

    public static Node remove(Node head){
        Node curr = head;
        Node n1;
        while( curr.next !=null){
            n1 = curr.next;

                if (curr.d == n1.d) {
                    curr.next = n1.next;
                } else
                    curr = curr.next;
            }

        return head;
    }
        public static void main(String[] args)
        {
           // System.out.println(PrintMinNumberForPattern("M"));
            head = new Node(11);
            head.next = new Node(11);
            head.next.next = new Node(11);
            head.next.next.next = new Node(21);
            head.next.next.next.next = new Node(43);
            head.next.next.next.next.next = new Node(43);
            head.next.next.next.next.next.next = new Node(60);
            Node nh = remove(head);

            while(nh!=null){
                System.out.print(nh.d + "->");
                nh = nh.next;
            }

        }
    }

