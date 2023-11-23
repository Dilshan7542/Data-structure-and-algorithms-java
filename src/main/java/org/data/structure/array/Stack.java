package org.data.structure.array;

import java.util.Arrays;

public class Stack {
    int elementData[];
    int top=-1;

    public Stack(int length) {
        this.elementData =new int[length];

    }
    public Stack(){
        this.elementData =new int[8];
    }
    public void push(int data){
        if(elementData.length<= top){
            grow();
        }
            elementData[++top]=data;

    }

    private void grow() {
        int [] temp=new int[top*2];
        for (int i = 0; i < elementData.length; i++) temp[i]= elementData[i];
        elementData =temp;
    }

    public int pop(){
        int last=-1;
        if(top <=0){
            System.out.println("Stack is empty...!");
        }else{
          last=  elementData[top--];
        }
        return last;
    }
    public int get(int index){
        if(top <=index){
            throw new RuntimeException("Index is not Valid");
        }else{
          return elementData[index];
        }
    }
    public boolean isFull(){
        return top>=elementData.length-1;
    }
    public boolean isEmpty(){
        return top==-1;
    }

    public int peek(){
        return elementData[top];
    }
    public void printStack(){
        if(top <=0){
            System.out.println("Stack is empty...!");
        }else{
            System.out.print("[");
            for (int i = 0; i <=top; i++) {
                System.out.print(elementData[i]+", ");
            }
            System.out.println("\b\b]");
        }
    }
    public void test(){
        System.out.println(Arrays.toString(elementData));
    }
    public int size(){
        return top;
    }
    public int capacity(){
        return elementData.length;
    }
    public void clear(){
        top=-1;
    }
}
