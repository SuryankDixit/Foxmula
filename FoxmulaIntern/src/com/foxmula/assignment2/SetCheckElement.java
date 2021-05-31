package com.foxmula.assignment2;
import java.util.Set;
import java.util.HashSet;
import java.util.Scanner;

public class SetCheckElement {
	public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        Scanner in = new Scanner(System.in);

        while(true) {
        	System.out.println();
            System.out.print("0. Enter Elements\n1. Search Element\n2.Exit: ");
            int choice = in.nextInt();
            if(choice == 0) {
                System.out.println("Enter the element you want to add: ");
                int num = in.nextInt();
                set.add(num);
            }
            else if(choice == 1){
            	System.out.println("Enter the element to search: ");
            	int check = in.nextInt();
            	if(set.contains(check)) {
                    System.out.println("Present !");
                }
                else 
                    System.out.println("Not Present !");
            }else if(choice==2){
            	System.exit(1);
            }else {
            	System.out.println("Enter valid input.");
            }
        }
    }
}
