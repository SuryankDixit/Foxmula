package com.foxmula.assignment1;

public class Stack
{
	private Node top;
    private class Node {
        int data; 
        Node link;
    }
    
    public int count;
    
    public Stack(){
        this.top = null;
    }
 
    public void push(int x){	
    	Node temp = new Node();	
 
        temp.data = x;    
        temp.link = top;
        top = temp;
        count++;
    }
 
    public int pop() {
        if (top == null)
            return Integer.MIN_VALUE;
        
    	int x = top.data;
        top = top.link;
        count--;
        return x;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
}