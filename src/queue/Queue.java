package queue;

import java.util.PriorityQueue;

public class Queue {
    public static void main(String[] args) {
        PriorityQueue pq=new PriorityQueue();
        pq.add("pramod");
        pq.add("Dutta");
        System.out.println(pq);                 //queue:-first in first out
        System.out.println(pq.offer("geetha"));  //offer()  is add
        System.out.println(pq);
        System.out.println(pq.peek());    //peek() is see the first element
        System.out.println(pq);
        System.out.println(pq.poll());     //poll() is delete the element
        System.out.println(pq);

    }
}
