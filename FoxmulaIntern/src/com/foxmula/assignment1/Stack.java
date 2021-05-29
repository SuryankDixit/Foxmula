package com.foxmula.assignment1;

import java.util.LinkedList;

public class Stack {
    private LinkedList<Integer> stack;

    public Stack() {
        this.stack = new LinkedList<>();
    }

    public void push(int number){
        this.stack.add(number);
    }

    public int pop(){
        return this.stack.removeLast();
    }

    public boolean isEmpty(){
        return (this.stack.size() == 0);
    }

    public int length(){
        return this.stack.size();
    }
}
