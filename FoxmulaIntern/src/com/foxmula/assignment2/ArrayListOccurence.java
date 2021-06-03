package com.foxmula.assignment2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;


public class ArrayListOccurence {

    public void printFrequency(ArrayList<Integer> arr) {

        Map<Integer, Integer> map = new HashMap<>();

        for(int i: arr) {
            if(!map.containsKey(i))
                map.put(i, 1);
            else
                map.put(i, map.get(i)+1);
        }

//        for(Map.Entry<Integer,Integer> e: map.entrySet()) {
//            System.out.println(e.getKey()+ ": " +e.getValue() + ", ");
//        }
        
        // Lambda function:
        map.forEach((k,v)->System.out.println(k+" => "+v));
    }

    public static void main(String[] args) {

    	ArrayList<Integer> l = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        	
        ArrayListOccurence checkOccurrence = new ArrayListOccurence();
        
        while(true) {
            System.out.print("0. Enter Elements\n1. Check Occurrence of each element\n2.Exit: ");
            int choice = in.nextInt();
            if(choice == 0) {
                System.out.println("Enter the element you want to add: ");
                int num = in.nextInt();
                l.add(num);
            }
            else if(choice == 1){
            	checkOccurrence.printFrequency(l);
            }else if(choice==2){
            	System.exit(1);
            	in.close();
            }else {
            	System.out.println("Enter valid input.");
            }
        }
    }
}