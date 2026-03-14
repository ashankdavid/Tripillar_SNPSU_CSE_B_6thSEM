package DataStructures.Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

class Node{
    int data;
    Node left;
    Node right;

    Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

public class BinaryTree {
    static Node createNode(int val){
        return new Node(val);
    }

    static void BFS(Node root){
        Queue<Node> q = new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            Node front = q.poll();
            System.out.print(front.data + " ");
            if(front.left!=null){
                q.offer(front.left);
            }
            if(front.right!=null){
                q.offer(front.right);
            }
        }
    }

    static void DFS(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data + " ");
        DFS(root.left);
        DFS(root.right);
    }

    static int height(Node root){
        if(root==null){
            return 0;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight) + 1;
    }

    public static void main(String[] args) {
        Node root = createNode(1);
        root.left = createNode(2);
        root.right = createNode(3);
        root.left.left = createNode(4);
        root.left.right = createNode(5);
        root.right.left = createNode(6);
        root.right.right = createNode(7);
        root.left.right.left = createNode(8);
        root.right.left.left = createNode(15);
        root.right.left.right = createNode(9);

        System.out.println("DFS Traversal: ");
        DFS(root);
        System.out.println();
        System.out.println("BFS Traversal: ");
        BFS(root);
        System.out.println();
        System.out.println("Height of Our Tree: " + height(root));
    }
}
