import java.util.*;

public class Bt {

    static Scanner sc = null;
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        Node root = createTree();  
    }

    static Node createTree(){
        Node root = null;
        System.out.println("Enter Data");
        int data = sc.nextInt();

        if(data == -1){
            return null;
        }
        root = new Node(data);

        System.out.println("Enter left for " + data);
        root.left = createTree();
        System.out.println("Enter right for " + data);
        root.right = createTree();

        return root;
    }

    static void inOrder(Node root){
        if(root == null) return;
        inOrder(root.left);
        System.out.println(root.data);
        inOrder(root.right);
    }
    static void PreOrder(Node root){
        if(root == null) return;
        System.out.println(root.data);
        PreOrder(root.left);
        PreOrder(root.right);
    }
    static void PostOrder(Node root){
        if(root == null) return;
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.println(root.data);
    }
}

class Node {
    Node left,right;
    int data;
    public Node(int data){
        this.data = data;
    }
}