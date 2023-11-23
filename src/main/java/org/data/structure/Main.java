package org.data.structure;

import org.data.structure.array.Stack;
import org.data.structure.node.LinkedList;
import org.data.structure.node.Queue;

public class Main {

    public static void main(String args[]) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.printStack();
        System.out.println(stack.isEmpty());
        System.out.println("POP : "+stack.pop());
        System.out.println("Peek : "+stack.peek());
        stack.printStack();


    }


}


