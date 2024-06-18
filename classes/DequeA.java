import java.util.*;
public class DequeA {
    public static void main(String args[]){
        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);//1
        deque.addFirst(2);// 2 1
        deque.addLast(3);//2 1 3
        deque.addLast(4);// 2 1 3 4
        System.out.println(deque.getFirst());//2
        System.out.println(deque.getLast());//4
        System.out.println(deque);// 2 1 3 4
        deque.removeFirst();// 1 3 4
        deque.removeLast();//1 3
        System.out.print(deque);// 1 3
    }
}
