public class isSubTree {
    Node root;

        static class Node{
            Node left, right;
            int d;
            Node(int d){
                this.d = d;
                left = right =null;
            }
        }

        public void inorderTraversal(Node root){
            if(root == null)
                return;
            inorderTraversal(root.left);
            System.out.print(root.d + " ");
            inorderTraversal(root.right);
        }

        public boolean isSubTree(Node s, Node t){
            if(s == null && t == null)
                return true;
            if(s == null || t == null)
                return false;
            boolean left = isSubTree(s.left, t.left);
            boolean right = isSubTree(s.right, t.right);
           return (s.d == t.d && left && right);
        }

        public boolean findSubTree(Node t, Node s) {

            if (t == null)
                return false;

            /* Check the tree with root as current node */
            if (isSubTree(t, s))
                return true;

        /* If the tree with root as current node doesn't match then
           try left and right subtrees one by one */
            //In your case you have the expression (subTree(t1.left, t2) || subTree(t1.right, t2))
            // in which the two operands will be evaluated to boolean and you will apply an logical OR on
            // them only if the first evaluates to false. If the first operand evaluates to true the second
            // will not be evaluated and true will be returned.
            return findSubTree(t.left, s) || findSubTree(t.right, s);
        }

        public static void main(String [] args){
            isSubTree dbt = new isSubTree();
            isSubTree dbt1 = new isSubTree();
            dbt.root = new Node(3);
            dbt.root.left = new Node(4);
            dbt.root.right = new Node(5);
            dbt.root.left.left = new Node(1);
            dbt.root.left.right = new Node(2);
            dbt1.root = new Node(4);
            dbt1.root.left = new Node(1);
            dbt1.root.right = new Node(2);

//        dbt.root.right.left = new Node(5);
//        dbt.root.right.right = new Node(6);
            // dbt.inorderTraversal(dbt.root);
          //  Node s1 = dbt.findSubTree(dbt.root, dbt1.root);
            boolean ans = dbt.findSubTree(dbt.root, dbt1.root);
            System.out.println(ans);
        }
    }


