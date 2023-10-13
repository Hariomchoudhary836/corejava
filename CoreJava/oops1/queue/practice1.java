package queue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class practice1 {
   public static void main(String[] args) {
   Queue<Integer> num = new PriorityQueue<Integer>(Comparator.reverseOrder());
   
   num.add(100);
   num.add(101);
   num.add(102);
   num.add(103);
   num.add(104);
   
  // num.e1 elmenent();
   System.out.println(num);
   
   num.offer(110);
   System.out.println(num);
   
   System.out.println(num.peek());
   
   num.poll();
   System.out.println(num);
   
   System.out.println(num.peek());
   
   num.poll();
   System.out.println(num);
   
   num.remove();
   System.out.println(num);
}
}
