package com.hotnewclear.queues;

public class ArrayQueueApp {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(4);
        System.out.println("Add item to queue, result is " + queue.enQueue("1"));
        System.out.println("Add item to queue, result is " + queue.enQueue("2"));
        System.out.println("Add item to queue, result is " + queue.enQueue("3"));
        System.out.println("Add item to queue, result is " + queue.enQueue("4"));
        System.out.println("Add item to queue, result is " + queue.enQueue("5"));

        System.out.println("Pick item from queue, result is " + queue.deQueue());
        System.out.println("Pick item from queue, result is " + queue.deQueue());
        System.out.println("Pick item from queue, result is " + queue.deQueue());
        System.out.println("Pick item from queue, result is " + queue.deQueue());
        System.out.println("Pick item from queue, result is " + queue.deQueue());
    }
}
