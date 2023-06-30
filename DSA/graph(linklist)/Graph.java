import java.util.ArrayList;
import java.util.LinkedList;

public class Graph {
    ArrayList<LinkedList<Node>> alist;

    Graph() {
        alist = new ArrayList<>();
    }

    public void addNode(Node node) {
        LinkedList<Node> curr = new LinkedList<>();
        curr.add(node);
        alist.add(curr);
    }

    public void addEdge(int src, int dst) {
        LinkedList<Node> curr = alist.get(src);
        Node dstNode = alist.get(dst).get(0);
        curr.add(dstNode);
    }

    public boolean checkEdge(int src, int dst) {
        LinkedList<Node> curr = alist.get(src);
        Node dstNode = alist.get(dst).get(0);

        for (Node node : curr) {
            if (node == dstNode) {
                return true;
            }
        }
        return false;
    }

    public void print() {
        for (LinkedList<Node> curr : alist) {
            for (Node node : curr) {
                System.out.print(node.data + " -> ");
            }
            System.out.println();
        }
    }
}
