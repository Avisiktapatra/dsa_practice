public class skewedTree {

        public boolean isSkewedTree(Node root){
            if(root == null)
                return true;
            if(isLeaf(root) || root.left!=null && root.right==null || root.left==null && root.right!=null){
                return (isSkewedTree(root.left) && isSkewedTree(root.right));
            }
            return false;
        }
        public boolean isLeaf(Node root){
            if(root.right==null && root.left==null)
                return true;
            return false;
        }

        public static void main (String args[]){
            skewedTree ft = new skewedTree();
            Node root = new Node(5);
            root.left = new Node(4);
            // root.right = new Node(3);
           // root.left.left = new Node(4);
            root.left.right = new Node(3);
            root.left.right.left = new Node(2);
            //root.left.right.right = new Node(7);
            boolean ans = ft.isSkewedTree(root);
            System.out.println(ans);
        }

    }


