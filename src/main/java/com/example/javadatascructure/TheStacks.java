package com.example.javadatascructure;

import java.util.Stack;

public class TheStacks {
    public static void main(String[] args) {

        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(5);
        stack.push(3);
        stack.push(10);

        System.out.println(stack.peek());
        System.out.println(stack.size());
        System.out.println(stack.pop());
        System.out.println(stack.size());

        System.out.println(stack.empty());

        System.out.println(stack.search(3));
        System.out.println(stack.search(5));
        System.out.println(stack.search(1));
        System.out.println(stack.search(10));
        System.out.println(stack.search(8));
    }
}
