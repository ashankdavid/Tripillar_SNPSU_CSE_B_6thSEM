package DataStructures.Trees.BinarySearchTree;

class Node{
    int key;
    Node left;
    Node right;

    Node(int key){
        this.key = key;
        this.left = null;
        this.right = null;
    }
}

public class BST {
    Node root;

    // Default Constructor
    BST(){
        root = null;
    }

    void DFS(Node root){
        if(root==null){
            return;
        }
        DFS(root.left);
        System.out.print(root.key + " ");
        DFS(root.right);
    }


    // Helper insert Function
    private Node insertRec(Node root, int key){
        if(root==null){
            return new Node(key);
        }
        if(key < root.key){
            root.left = insertRec(root.left, key);
        }else if(key > root.key){
            root.right = insertRec(root.right, key);
        }
        return root;
    }

    // Main callable ()
    public void insert(int key){
        root = insertRec(root, key);
    }

    private boolean searchRec(Node root, int key){
        if(root==null){
            return false;
        }
        if(key==root.key){
            return true;
        }else if (key < root.key){
            return searchRec(root.left, key);
        }else{
            return searchRec(root.right, key);
        }
    }

    public boolean search(int key){
        return searchRec(root, key);
    }
    private Node findSuccessor(Node node){
        while(node.left!=null){
            node = node.left;
        }
        return node;
    }

    private Node removeRec(Node root, int key){
        if(root==null){
            return null;
        }
        if(key < root.key){
            root.left = removeRec(root.left, key);
        }else if(key > root.key){
            root.right = removeRec(root.right, key);
        }else{
            // you found the key to be deleted
            // case 1 - node with 0 or 1 child
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            // case 2 - node with 2 children
            Node successor = findSuccessor(root.right);
            root.key = successor.key;
            root.right = removeRec(root.right, successor.key);
        }
        return root;
    }

    public void remove(int key){
        root = removeRec(root, key);
    }
}



class Driver{
    public static void main(String[] args) {
        BST bst = new BST();
        bst.insert(100);
        bst.insert(80);
        bst.insert(50);
        bst.insert(90);
        bst.insert(180);
        bst.DFS(bst.root);
        int key = 90;
        System.out.println(bst.search(key));
        bst.remove(key);
        bst.DFS(bst.root);
    }
}