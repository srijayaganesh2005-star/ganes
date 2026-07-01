import java.util.*;
class QueueOperations 
{
    public static void main(String[] args) 
	{
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        System.out.println(q);
        System.out.println("Front: " + q.peek());
        System.out.println("Removed: " + q.poll());
        System.out.println(q);
        System.out.println("Size: " + q.size());
        System.out.println("Is Empty: " + q.isEmpty());
    }
}