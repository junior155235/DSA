import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class BinarySearchTree {
    Node root;

    public void insert(Node node) {
        root = insertHelper(root, node);
    }

    private Node insertHelper(Node root, Node node) {
        int data = node.data;
        if (root == null) {
            root = node;
            return root;
        } else if (data < root.data) {
            root.left = insertHelper(root.left, node);
        } else {
            root.right = insertHelper(root.right, node);
        }

        return root;
    }

    public boolean search(int data) {
        return searchHelper(root, data);
    }

    private boolean searchHelper(Node root, int data) {
        if (root == null) {
            return false;
        } else if (root.data == data) {
            return true;
        } else if (root.data > data) {
            return searchHelper(root.left, data);
        } else {
            return searchHelper(root.right, data);
        }
    }

    public void remove(int data) {
        if (search(data)) {
            removeHelper(root, data);
        } else {
            System.out.println("data not find");
        }
    }

    public Node removeHelper(Node root, int data) {
        if (root == null) {
            return root;
        } else if (data < root.data) {
            root.left = removeHelper(root.left, data);
        } else if (data > root.data) {
            root.right = removeHelper(root.right, data);
        } else {
            if (root.left == null && root.right == null) {
                root = null;
            } else if (root.right != null) {
                root.data = successor(root);
                root.right = removeHelper(root.right, root.data);
            } else {
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }

    private int successor(Node root) {
        //找出右subtree中最小的
        root = root.right;
        while (root.left != null) {
            root = root.left;
        }
        return root.data;
    }

    private int predecessor(Node root) {
        //找出左subtree中最大的
        root = root.left;
        while (root.right != null) {
            root = root.right;
        }
        return root.data;
    }
    public void inOrder(Node root)
    {
        if(root == null)return;

        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }
    public void preOrder(Node root)
    {
        if(root == null)return;

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public void postOrder(Node root)
    {
        if(root == null)return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + " ");
    }
    public void levelOrder(Node root)
    {
        if(root == null)return;
        Queue<Node>q = new LinkedList<Node>();
        q.add(root);
        while(!q.isEmpty())
        {
            List<Integer>tmp = new ArrayList<Integer>() ;
            for(int i = q.size();i>0;i--)
            {
                Node top = q.peek();
                q.poll();
                System.out.print(top.data + " ");
                if(top.left != null)
                {
                    q.add(top.left);
                }
                if(top.right != null)
                {
                    q.add(top.right);
                }
            } 
        }
    }
    public int maxDepth(Node root) {
        if(root== null)return 0;
        if(root.left == null)return 1 + maxDepth(root.right);
        if(root.right == null)return 1 + maxDepth(root.left);
        return 1 + Math.max(maxDepth(root.left) , maxDepth(root.right));
    }
}