public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(1));
        tree.insert(new Node(9));
        tree.insert(new Node(2));
        tree.insert(new Node(7));
        tree.insert(new Node(3));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(8));

        tree.inOrder(tree.root);

        System.out.println("\ntree.search(0): " + tree.search(0));

        tree.remove(7);
        tree.inOrder(tree.root);
        System.out.print("\ninOrder: ");
        tree.preOrder(tree.root);
        System.out.print("\npreOrder: ");
        tree.postOrder(tree.root);
        System.out.print("\nlevelOrder: ");
        tree.levelOrder(tree.root);
        System.out.println("\ntreeHeight: " + tree.maxDepth(tree.root));
    }
}
