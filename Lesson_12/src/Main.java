public class Main {
    public static void main(String... args) {
        TreeNode n6 = new TreeNode(6);
        TreeNode n2 = new TreeNode(2);
        TreeNode n9 = new TreeNode(9);
        TreeNode n1 = new TreeNode(1);
        TreeNode n4 = new TreeNode(4);
        TreeNode n7 = new TreeNode(7);
        TreeNode n10 = new TreeNode(10);
        TreeNode n0 = new TreeNode(0);
        TreeNode n3 = new TreeNode(3);
        TreeNode n5 = new TreeNode(5);

        n6.left = n2;  n6.right = n9;
        n2.left = n1; n2.right = n4;
        n1.left = n0;
        n4.left = n3; n4.right = n5;
        n9.left = n7; n9.right = n10;

        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.preOrder(n6);
        System.out.println();
        binarySearchTree.inOrder(n6);
        System.out.println();
        binarySearchTree.postOrder(n6);
        System.out.println();


        binarySearchTree.insert(n6, 8);
        binarySearchTree.inOrder(n6);
        System.out.println();

        binarySearchTree.remove(n6, 2);
        binarySearchTree.inOrder(n6);

        System.out.println();
        binarySearchTree.preOrder(n6);
        method(2,3,4);
        method(1,2,3,4,5);
        var a = "123";
        var y = 4;
    }

    public static void method(int... a){

    }
}