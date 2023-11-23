package org.data.structure.array;

public class Queue {
    int[] elementData;
    int rear = -1;
    int front = -1;

    public Queue(int initialCapacity) {
        this.elementData = new int[initialCapacity];
    }

    public void enQueue(int data) {
        if (elementData.length <= rear) {
            grow();
        } else {
            if (front == -1) front = 0;
            elementData[++rear] = data;
        }
    }

    public void deQueue() {
        if (rear <= front) {
            rear = -1;
            front = -1;
        } else {
            front++;
        }
    }

    private void grow() {
        int[] temp = new int[elementData.length * 2];
        for (int i = 0; i < elementData.length; i++) temp[i] = elementData[i];
        elementData = temp;
    }

    public void printStack() {
        if (rear <= 0) {
            System.out.println("Queue is empty..!!");
        } else {
            System.out.print("[");
            for (int i = front; i <= rear; i++) {
                System.out.print(elementData[i] + ", ");
            }
            System.out.println("\b\b]");
        }
    }

    public void clear() {
        front = -1;
        rear = -1;
    }

    public int peek() {
        return elementData[front];
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public boolean isFull() {
        return rear == elementData.length - 1 || front > rear;
    }


}
