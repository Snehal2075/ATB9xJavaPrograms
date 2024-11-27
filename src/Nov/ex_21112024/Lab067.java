package Nov.ex_21112024;

import java.util.PriorityQueue;

public class Lab067 {
    public static void main(String[] args) {

        PriorityQueue pq = new PriorityQueue();

        //First in First out
        pq.offer("1");
        pq.offer("54");
        pq.offer("5");
        pq.offer("9");
        System.out.println(pq);
        System.out.println(pq.peek());
        System.out.println(pq.poll());
    }
}
