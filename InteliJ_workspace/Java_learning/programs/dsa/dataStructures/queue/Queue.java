package dsa.dataStructures.queue;

import java.util.*;

class Queue<T> {
    private LinkedList<T> list = new LinkedList<>();

    // Enqueue operation
    public void enqueue(T item) {
        list.addLast(item);
    }

    // Dequeue operation
    public T dequeue() {
        if (list.isEmpty()) throw new NoSuchElementException("Queue is empty");
        return list.removeFirst();
    }

    // Peek operation
    public T peek() {
        if (list.isEmpty()) throw new NoSuchElementException("Queue is empty");
        return list.getFirst();
    }

    // Check if the queue is empty
    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Front element: " + queue.peek());
        System.out.println("Dequeue element: " + queue.dequeue());
        System.out.println("Front element after dequeue: " + queue.peek());
    }
}