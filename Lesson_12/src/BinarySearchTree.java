public class BinarySearchTree {

    //Duyệt pre_order : Duyệt tiền thứ tự
    public void preOrder(TreeNode root){
        if(root == null){
            return;
        }

        //Duyệt gốc
        System.out.print(root.value + "\t");
        //duyệt bên trái
        preOrder(root.left);

        //duyệt bên phải
        preOrder(root.right);
    }

    //Duyệt in order: Duyệt trung thứ tụ
    public void inOrder(TreeNode root){
        if(root == null){
            return;
        }
        //Duyệt bên trái
        inOrder(root.left);
        //Duyệt gốc
        System.out.print(root.value +"\t");
        //Duyệt bên phải
        inOrder(root.right);
    }

    //Duyệt hậu thứ tự: post order
    public void postOrder(TreeNode root){
        if(root == null){
            return;
        }

        //Duyệt trái
        postOrder(root.left);
        //Duyệt phải
        postOrder(root.right);
        //Duyệt gốc
        System.out.print(root.value +"\t");
    }

    public TreeNode insert(TreeNode root, int value){
        TreeNode newNode = new TreeNode(value);
        if(root == null){
            root = newNode;
            return root;
        }else {
            TreeNode temp = root;
            while (true){
                if(value > temp.value){
                    if(temp.right == null){
                        temp.right = newNode;
                        break;
                    }else {
                        temp = temp.right;
                    }
                }else { //value <tem.value
                    if (temp.left == null){
                        temp.left = newNode;
                        break;
                    }else {
                        temp = temp.left;
                    }
                }
            }
        }
        return root;
    }

    public TreeNode remove(TreeNode root, int key){
        if(root == null){
            return null;
        }
        System.out.println();
        //B1: Tìm node cần xoá
        if (key < root.value){//key nằm bên trái node gốc
            root.left = remove(root.left, key);
        }else if(key > root.value) {//key nằm phía bên phải node gốc
            root.right = remove(root.right, key);
        }else {// key = root.value tìm được node cần xoá
            //TH1: node cần xoá là node lá
            if(root.left == null && root.right == null){
                return null;
            }
            //TH2: node cần xoá có 1 node con
            if(root.left != null && root.right == null){ //node con nằm bên trái
                return root.left;
            }
            if(root.left == null && root.right != null){ //node con nằm bên phải
                return root.right;
            }
            //Th3: node cần xoá có 2 node con
            TreeNode leftNode = findLeftNode(root.right);
            root.value = leftNode.value;
            root.right = remove(root.right, leftNode.value);

        }
        return root;
    }

    public TreeNode findLeftNode(TreeNode root){
        if(root == null){
            return null;
        }

        TreeNode leftNode = root;
        while (leftNode.left != null){
            leftNode = leftNode.left;
        }

        return leftNode;
    }
}
