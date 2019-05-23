package com.hotnewclear.queues;

public class ArrayQueue {
    private String[] items;
    private int number;
    // 设置头尾指针
    private int head = 0;
    private int tail = 0;

    public ArrayQueue(final int capacity) {
        items = new String[capacity];
        number = capacity;
    }

    /**
     * 入队操作
     * 当尾指针等于队列容量时队列充满，插入操作失败
     *
     * @param item 待入队元素
     * @return 插入成功或者失败
     */
    public boolean enQueue(final String item) {
        // 队列已满
        if (tail == number) {
            return false;
        }
        items[tail++] = item;
        return true;
    }

    /**
     * 出队操作
     *
     * @return 返回队头第一个元素
     */
    public String deQueue() {
        // 队列为空
        if (head == tail) {
            return null;
        }
        return items[head++];
    }
}
