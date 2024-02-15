import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsDemo {
    public static void main(String[] args) {

        /* LIST -- Ordered collections, Allow repetition */ 

        //ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(10);
        arrayList.add(30);
        arrayList.add(20);
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);

        //LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("First");
        linkedList.add("Second");
        linkedList.add("Third");
        linkedList.add(1,"In Between");
        System.out.println(linkedList);
        linkedList.remove(2);
        System.out.println(linkedList);

        //Vector
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        vector.add(10);
        vector.add(30);
        vector.add(20);
        System.out.println(vector);
        vector.remove(2);
        System.out.println(vector);

        //Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        System.out.println("Peek : "+stack.peek());
        System.out.println(stack);
        stack.pop();
        System.out.println("Peek after Pop: "+stack.peek());
        System.out.println(stack);

        /* Queue -- Ordered Collection, Allows Repetitions*/

        //Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.poll();
        System.out.println(queue);
        System.out.println(queue.peek());
        queue.offer(10);
        System.out.println(queue);
        System.out.println(queue.peek());
        

        //Priority Queue -- Min Heap Default
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(20);
        pq.offer(40);
        pq.offer(30);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.offer(10);
        System.out.println(pq);
        System.out.println(pq.peek());
        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    
        //PriorityQueue -- Reverse Order - MaxHeap
        PriorityQueue<Integer> pqr = new PriorityQueue<>(Comparator.reverseOrder());
        pqr.offer(20);
        pqr.offer(40);
        pqr.offer(30);
        System.out.println(pqr);
        System.out.println(pqr.peek());
        pqr.offer(10);
        System.out.println(pqr);
        System.out.println(pqr.peek());
        pqr.poll();
        System.out.println(pqr);
        System.out.println(pqr.peek());

        //Deque -- Double ended Queue 
        Deque<Integer> deque = new ArrayDeque<Integer>();
        deque.offer(10);
        deque.offer(20);
        deque.offerLast(30);
        deque.offer(40);
        System.out.println(deque);
        deque.pollFirst();
        System.out.println(deque);
        deque.offerFirst(10);
        System.out.println(deque);
        deque.pollLast();
        System.out.println(deque);


        /* SETS - Don't allow repetition*/

        //HashSet - Unordered List
        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.add(20);
        hashSet.add(30);
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        hashSet.remove(30);
        System.out.println(hashSet);
        System.out.println(hashSet.size());

        //LinkedHashSet - Ordered List
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(20);
        linkedHashSet.add(30);
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.size());
        linkedHashSet.remove(30);
        System.out.println(linkedHashSet);
        System.out.println(linkedHashSet.size());

        //TreeSet -- Unordered && Sorted during insertion and deletion 
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(5);
        treeSet.add(5);
        treeSet.add(2);
        treeSet.add(6);
        treeSet.add(4);
        treeSet.add(3);
        System.out.println(treeSet);
        System.out.println(treeSet.size());
        treeSet.remove(3);
        System.out.println(treeSet);
        System.out.println(treeSet.size());

        /* MAP */

        //HashMap
        
        //LinkedHashMap
        //TreeMap
        

    }
}
