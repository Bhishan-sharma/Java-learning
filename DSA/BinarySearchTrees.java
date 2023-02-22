package DSA;

import java.util.Scanner;

public class BinarySearchTrees {
    TreeNode root;
    public class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data = data;
            this.left = this.right = null;
        }
    }
    BinarySearchTrees(){
        root = null;
    }

    public TreeNode insert(TreeNode root, int data){
        if (root == null){
            root = new TreeNode(data);
            return root;
        }
        if (root.data > data){
            root.left = insert(root.left , data);
        }
        else if(root.data < data){
            root.right = insert(root.right , data);
        }
        return root;
    }

    public TreeNode search(TreeNode root , int data){
        if (root == null || root.data == data){
            return root;
        }
        if (root.data > data){
            return search(root.left,data);
        }
        return search(root.right,data);
    }

    public void inorder(TreeNode root){
        if (root == null){
            return;
        }
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }
    public void Preorder(TreeNode root){
        if (root == null){
            return;
        }
        System.out.println(root.data+" ");
        Preorder(root.left);
        Preorder(root.right);
    }
    public void Postorder(TreeNode root){
        if (root == null){
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.println(root.data+" ");
    }

    public void insertIntoTree(int data){ root = insert(root, data); }
    public TreeNode searchTree(int data){
        return search(root, data);
    }
    public void inOrderTraversal(){
        inorder(root);
    }
    public void PreOrderTraversal(){
        Preorder(root);
    }
    public void PostOrderTraversal(){
        Postorder(root);
    }

    public static void main(String[] args) {
        BinarySearchTrees list = new BinarySearchTrees();
        int n , num;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many numbers to be input");
        n = sc.nextInt();
        System.out.println("Enter " +n+ " numbers : ");
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            list.insertIntoTree(num);
        }
        System.out.println("Tree insertion done");

        System.out.println("Enter number to be searched");
        n = sc.nextInt();
        if (list.searchTree(n) != null){
            System.out.println("Number found");
        }else{
            System.out.println("Number not found");
        }

        System.out.println("PreOrder traversal of binary search tree");
        list.PreOrderTraversal();

        System.out.println("InOrder traversal of binary search tree");
        list.inOrderTraversal();

        System.out.println("PostOrder traversal of binary search tree");
        list.PostOrderTraversal();
    }
}