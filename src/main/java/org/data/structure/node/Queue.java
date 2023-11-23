package org.data.structure.node;

public class Queue {
    Node front;

    public void push(int data){
        Node n1=new Node(data);
        if(front==null){
            front=n1;
        }else{
            Node lastNode=front;
            while (lastNode.next != null) {
                lastNode=lastNode.next;
            }
            lastNode.next=n1;
        }
    }
    public void pop(){
        Node temp=front;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public int[] toArray(){
       Node temp=front;
        int [] ar=new int[size()];
        int count=0;
        while(temp !=null){
            ar[count++]=temp.data;
            temp=temp.next;
        }
        return ar;
    }
    public int size(){
        Node temp=front;
        int count=0;
        while(temp !=null){
            count++;
            temp=temp.next;
        }
        return count;
    }
    public int get(int index){
        Node temp=front;
        int count=0;
        while(temp !=null){
            if(count==index){
                return temp.data;
            }
            temp=temp.next;
            count++;
        }
        return -1;
    }
    public void printStack(){
        Node temp=front;
        System.out.print("[");
        while(temp!=null){
            System.out.print(temp.data+", ");
            temp=temp.next;
        }
        System.out.println("\b\b]");
    }
    public void clear(){
        front=null;
    }
   private class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }
}