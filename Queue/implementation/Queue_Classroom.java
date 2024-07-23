import java.util.Queue;
import java.util.LinkedList;

public class Queue_Classroom {

        public static void main(String[] args) {
            // Creating Queue using the LinkedList class
            Queue<Integer> numbers = new LinkedList<>();

            // offer elements to the Queue
            numbers.offer(1);
            numbers.offer(2);
            numbers.offer(3);
            numbers.add(4);
            System.out.println("Queue: " + numbers);

            // Access elements of the Queue
            int accessedNumber = numbers.peek();
            System.out.println("Accessed Element: " + accessedNumber);

            // Remove elements from the Queue
            int removedNumber = numbers.poll();
            System.out.println("Removed Element: " + removedNumber);

            System.out.println("Updated Queue: " + numbers);
        }
    }


    /*
add() - Inserts the specified element into the queue.
If the task is successful, add() returns true,
if not it throws an exception.

offer() - Inserts the specified element into the queue.
If the task is successful, offer() returns true,
if not it returns false.

element() - Returns the head of the queue. Throws an
exception if the queue is empty.

peek() - Returns the head of the queue. Returns
null if the queue is empty.

remove() - Returns and removes the head of the queue.
Throws an exception if the queue is empty.

poll() - Returns and removes the head of the queue.
Returns null if the queue is empty.
     */