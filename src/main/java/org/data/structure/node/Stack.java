package org.data.structure.node;
 public class Stack {
    Node node;
    public void push(int data){
        Node n1=new Node(data);
        n1.next=this.node;
        this.node=n1;
    }
    public void pop(){
        Node temp=node;
        while(temp.next.next !=null){
            temp=temp.next;
        }
        temp.next=null;
    }
    public int get(int index){
        Node temp=node;
        int count=0;
        while (temp !=null){
            if(count== index){
               return temp.data;
            }
            temp=temp.next;
            count++;
        }
        return -1;
    }
    public void shift(){
        node=node.next;
    }
    public void printValues(){
        Node temp=node;
        System.out.print("[");
        while (temp != null) {
            System.out.print(temp.data+",");
            temp=temp.next;
        }
        System.out.println("\b]");
    }
     public int size(){
         Node temp=node;
         int count=0;
         while(temp !=null){
             count++;
             temp=temp.next;
         }
         return count;
     }
     public int[] toArray(){
        Node temp=node;
         int [] ar=new int[size()];
         int count=0;
         while(temp !=null){
             ar[count++]=temp.data;
             temp=temp.next;
         }
         return ar;
     }
  private class Node{
        Node next;
        int data;
        public Node(int data) {
            this.data = data;
        }

    }
}

