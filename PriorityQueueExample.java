import java.util.PriorityQueue;
public class PriorityQueueExample{
    public static void main(String[]args){
    //min-heap(default)
    PriorityQueue<Integer>pq=new PriorityQueue<>();
    pq.offer(30);
    pq.offer(10);
    pq.offer(20);
    System.out.println("PriorityQueue(minHeap):");
    while(!pq.isEmpty()){
        System.out.println(pq.poll());
    }
    //max minHeap
    PriorityQueue<Integer>maxpq=new PriorityQueue<>((a,b)->b-a);
    maxpq.offer(30);
    maxpq.offer(10);
    maxpq.offer(20);
    System.out.println("PriorityQueue(max-heap):");
    while(!maxpq.isEmpty()){
        System.out.println(maxpq.poll());
    }
    }
}

    