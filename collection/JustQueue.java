import java.util.PriorityQueue;

public class JustQueue {

    public static void main(String[] args) {
        // by default min heap
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        queue.add(12);
        queue.add(10);
        queue.add(7);
        queue.add(13);

        
        // while (!queue.isEmpty()) {
        //     int value = queue.poll();
        //     System.out.println(value);
        // }

        // queue.forEach((Integer i )-> System.out.println(i));


// max heap
        PriorityQueue<Integer> maxQ = new PriorityQueue<>((Integer a, Integer b) -> b - a);
         maxQ.add(12);
        maxQ.add(10);
        maxQ.add(7);
        maxQ.add(13);

        while (!maxQ.isEmpty()) {
            int value = maxQ.poll();
            System.out.println(value);
        }

        // maxQ.forEach((Integer i )-> System.out.println(i));

    }

}
