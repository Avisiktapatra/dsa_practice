public class AllPath {

    static Node root;
    public static void main(String [] args){
        AllPath path = new AllPath();
        path.root = new Node(10);
        path.root.left = new Node(8);
        path.root.right = new Node(2);
        path.root.left.left = new Node(3);
        path.root.left.right = new Node(5);
        path.root.right.left = new Node(2);
        path.root.right.right = new Node(9);
        path.root.right.right.left = new Node(16);
        int arr[] = new int[4];
        path.traverse(root, 0, arr);
    }

    public void traverse(Node root, int level, int[] arr){
        if(root == null)
            return;
        arr[level] = root.data;
        if(root.left == null && root.right == null){
             printArray(arr, level+1);
        }

        traverse(root.left, level+1, arr);
        traverse(root.right, level+1, arr);
    }

    public void printArray(int [] arr, int len){
        int i;
        for (i = 0; i < len; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }

}
