package QueueThroughListComposition;
import List.List;
import List.ListNode;

public class Queue {
    private List queueList;

    public Queue () {queueList = new List("Queue");}

    public void enqueue(Object data) {queueList.insertAtBack(data);}

    public Object dequeue() {return queueList.removeFromFront();}

    public ListNode getFirst () {return queueList.getFirst();}

    @Override
    public String toString() {return queueList.toString();}
}
