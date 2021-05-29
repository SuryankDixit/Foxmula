package com.foxmula.assignment1;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Time time1 = new Time(55, 700, 293);
        Time time2 = new Time(43, 233, 323);

        time1.Add(time2);

        Stack stack1 = new Stack();
        Stack stack2 = new Stack();

        MenuForStackOperations(stack1, stack2);

        CoordinatePair p1 = new CoordinatePair(2.3, 4.3);
        CoordinatePair p2 = new CoordinatePair(4.3, 3.2);
        CoordinatePair p3 = new CoordinatePair(3.2, 4.5);
        CoordinatePair p4 = new CoordinatePair(11, 4.9);
        Trapezoid trapezoid = new Trapezoid(p1, p2, p3, p4, 5);

        p1 = new CoordinatePair(2.3, 4.3);
        p2 = new CoordinatePair(4.3, 3.2);
        p3 = new CoordinatePair(3.2, 4.5);
        p4 = new CoordinatePair(11, 4.9);
        Parallelogram parallelogram = new Parallelogram(p1, p2, p3, p4, 5.3);

        p1 = new CoordinatePair(5.3, 2.3);
        p2 = new CoordinatePair(6.3, 2.2);
        p3 = new CoordinatePair(7.2, 5.5);
        p4 = new CoordinatePair(12, 2.9);
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4, 8);

        p1 = new CoordinatePair(7.3, 2.4);
        p2 = new CoordinatePair(2.3, 7.2);
        p3 = new CoordinatePair(8.2, 3.5);
        p4 = new CoordinatePair(1, 8.9);
        Square square = new Square(p1, p2, p3, p4, 3);

        System.out.println(trapezoid.Area() + "is the area of trapezoid");
        System.out.println(parallelogram.Area() + "is the area of parallelogram");
        System.out.println(rectangle.Area() + "is the area of rectangle");
        System.out.println(square.Area() + "is the area of square");
    }

    public static void MenuForStackOperations(Stack stack1, Stack stack2) {
        while (true) {
            Scanner scan = new Scanner(System.in);

            System.out.println("1 to perform push() on Stack1");
            System.out.println("2 to perform push() on Stack2");
            System.out.println("\n3 to perform pop() on Stack1");
            System.out.println("4 to perform pop() on Stack2");
            System.out.println("\n5 to check if Stack1 is empty");
            System.out.println("6 to check if Stack2 is empty");
            System.out.println("\n0 to exit");
            System.out.print("Your Choice: ");

            int input = Integer.parseInt(scan.nextLine());

            if (input == 0) {
                break;
            }
            if (input == 1) {
                System.out.print("Enter a number to push() in Stack1: ");
                int number = Integer.parseInt(scan.nextLine());
                stack1.push(number);
            }
            if (input == 2) {
                System.out.print("Enter a number to push() in Stack2: ");
                int number = Integer.parseInt(scan.nextLine());
                stack2.push(number);
            }
            if (input == 3) {
                try {
                    System.out.println(stack1.pop());
                } catch (NoSuchElementException exp) {
                    System.out.println("Stack is empty please push first");
                    continue;
                }
            }
            if (input == 4) {
                try {
                    System.out.println(stack2.pop());
                } catch (NoSuchElementException exp) {
                    System.out.println("Stack is empty please push first");
                    continue;
                }
            }
            if (input == 5) {
                System.out.println(stack1.isEmpty());
            }
            if (input == 6) {
                System.out.println(stack2.isEmpty());
            }

            if (AreStacksEqual(stack1, stack2)) {
                System.out.println("Stacks are equal after this operation, there length is: " + stack1.length());
            }
        }
    }

    public static boolean AreStacksEqual(Stack stack1, Stack stack2) {
        return (stack1.length() == stack2.length());
    }
}
