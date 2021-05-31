package com.foxmula.assignment2;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class TraverseHashSet {
	public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        Scanner in = new Scanner(System.in);

        while(true) {
        	System.out.println();
            System.out.print("0. Enter Elements\n1. Traverse Set\n2.Exit: ");
            int choice = in.nextInt();
            if(choice == 0) {
                System.out.println("Enter the element you want to add: ");
                int num = in.nextInt();
                set.add(num);
            }
            else if(choice == 1){
            	/*Enhanced for loop*/
            	for (int e : set) {
                    System.out.print(e + " ");
                }
            	// Lambda Traversal
//            	set.forEach((k)->System.out.print(k+" "));
            }else if(choice==2){
            	System.exit(1);
            }else {
            	System.out.println("Enter valid input.");
            }
        }
    }
}
