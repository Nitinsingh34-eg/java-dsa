import java.util.*;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);

      
        System.out.println(q);
        System.out.println("Removed: " + q.poll());

        
        System.out.println("Front: " + q.peek());

       
        System.out.println(q);
    }
}
    

