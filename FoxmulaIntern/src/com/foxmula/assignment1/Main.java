package com.foxmula.assignment1;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    	
    	// Addition of Time
    	Time time1 = new Time(23,30,59);
        Time time2 = new Time(0,31,1);
        time1.add(time2);
        
        
        // Area of different quadrilaterals
        Trapezoid trap = new Trapezoid(20,20,40,20,30,30,10,30,8);
        System.out.println("Trapezoid area : "+trap.area());

        Parallelogram para = new Parallelogram(20,20,40,20,30,30,10,30,8);
        System.out.println("Parallelogram area : "+para.area());

        Rectangle rect = new Rectangle(20,20,40,20,40,30,20,30);
        System.out.println("Rectangle area : "+rect.area());

        Square sq = new Square(20,20,40,20,40,40,20,40);
        System.out.println("Square area : "+sq.area());
        
        

        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        MenuForStackOperations(stack1, stack2);
    }
    
    public static void AreStacksEqual(Stack stack1, Stack stack2) {
        if(stack1.length() == stack2.length())
        	System.out.println("Stack1 and Stack2 are equal in size.");
    }

    public static void MenuForStackOperations(Stack stack1, Stack stack2) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Choose Operations to Perform\n\t1.Push in Stack1.\n\t2.Push in Stack2.\n\t3.Pop from stack1.\n\t4.Pop from Stack2.\n\t5.Is Stack1 empty?\n\t6.Is Stack2 empty?\n\t7.Exit");
            int option = input.nextInt();
            switch(option){
                case 1: System.out.println("Enter value to push in stack1: ");
                        int data1 = input.nextInt();
                        stack1.push(data1);
                        AreStacksEqual(stack1, stack2);
                        break;
                case 2: System.out.println("Enter value to push in stack1: ");
		                int data2 = input.nextInt();
		                stack2.push(data2);
		                AreStacksEqual(stack1, stack2);
		                break;
                case 3: try {
	                    System.out.println("Popped element from stack1: "+stack1.pop());
	                    AreStacksEqual(stack1, stack2);
		                } catch (NoSuchElementException exp) {
		                    System.out.println("Stack is empty please push first");
		                    continue;
		                }
                		break;
                case 4: try {
	                    System.out.println("Popped element from stack2: "+stack2.pop());
	                    AreStacksEqual(stack1, stack2);
		                } catch (NoSuchElementException exp) {
		                    System.out.println("Stack is empty please push first");
		                    continue;
		                }
                        break;
                case 5:	System.out.println(stack1.isEmpty());
                		break;
                case 6:	System.out.println(stack2.isEmpty());
                		break;
                case 7:	System.exit(1);
                default:System.out.println("Enter Valid Option");
                        break;   
            }
        }
    }
}
