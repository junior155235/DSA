import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

class DataStructure {
    public static void main(String[] args) {
        // -----stack(LIFO)-----

        Stack<Integer> s = new Stack<Integer>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        System.out.println("s.search(3): " + s.search(3));
        System.out.println("s.search(6): " + s.search(6));
        System.out.println(s);
        System.out.println("s.peek():" + s.peek());
        while (!s.empty()) {
            s.pop();
        }
        System.out.println(s);
        // -----queue(FIFO)-----
        // Queue 為interface,因此是實體化LinkedList

        Queue<Integer> q = new LinkedList<Integer>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        System.out.println("q: " + q);
        System.out.println("q.element(): " + q.element());
        System.out.println("q.contains(): " + q.contains(4));
        while (!q.isEmpty()) {
            q.poll();
        }
        System.out.println("q: " + q);
        // -----priorityqueue(具優先順序的queue)-----
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        pq.offer(3);
        pq.offer(2);
        pq.offer(4);
        pq.offer(1);
        pq.offer(5);
        while (!pq.isEmpty()) {
            System.out.println("pq.poll(): " + pq.poll());
        }

        // -----LinkedList-----
        LinkedList<Integer> linkedlist = new LinkedList<Integer>();

        linkedlist.push(1);
        linkedlist.push(2);
        linkedlist.push(3);
        linkedlist.push(4);
        linkedlist.push(5);
        System.out.println("linkedlist: " + linkedlist);
        linkedlist.add(4, 7);
        System.out.println("linkedlist: " + linkedlist);
        linkedlist.remove(2);
        System.out.println("linkedlist: " + linkedlist);
        System.out.println("linkedlist.indexOf(5): " + linkedlist.indexOf(5));

        // -----Dynamic Array(Vector)-----
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("arr.size(): " + arr.size());
        // java的vector不會給予初值
        /*
         * Leetcode 242.Valid Anagram
         * c++:
         * vector<int>tmp (26,0);
         * Java:
         * int initialCapacity = 26;
         * List<Integer> tmp = new ArrayList<>(Collections.nCopies(initialCapacity, 0));
         */
        try {
            System.out.println("arr.get(0): " + arr.get(0));
        } catch (Exception e) {
            System.out.println("cant print arr.get(0)");
        }
        arr.add(1);
        arr.add(2);
        System.out.println("arr.get(0): " + arr.get(0));

    }
}