public class MaxPathSum {
   TreeNode root;
        int max_sum = Integer.MIN_VALUE;

        public int max_gain(TreeNode node) {
            if (node == null) return 0;

            // max sum on the left and right sub-trees of node
            int left_gain = Math.max(max_gain(node.left), 0);
            int right_gain = Math.max(max_gain(node.right), 0);

            // the price to start a new path where `node` is a highest node
            int price_newpath = node.val + left_gain + right_gain;

            // update max_sum if it's better to start a new path
            max_sum = Math.max(max_sum, price_newpath);

            // for recursion :
            // return the max gain if continue the same path
           // return node.val + Math.max(left_gain, right_gain);
            return max_sum;
        }

        public int maxPathSum(TreeNode root) {
            max_gain(root);
            return max_sum;
        }
    }

     class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }


    public static void main(String[] args){
        MaxPathSum mps = new MaxPathSum();
      mps.root = new TreeNode(-10);
        mps.root.left = new TreeNode(9);
        mps.root.right = new TreeNode(20);
        mps.root.right.left = new TreeNode(15);
        mps.root.right.right = new TreeNode(7);
       int ans = mps.maxPathSum(mps.root);
       System.out.println(ans);
    }
}

