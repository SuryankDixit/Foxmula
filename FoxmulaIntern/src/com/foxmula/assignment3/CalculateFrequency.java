package com.foxmula.assignment3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Collections;


public class CalculateFrequency {
	
	void printSortedOrderFrquency(ArrayList<Integer> arr) {
		
		Map<Integer, Integer> map = new HashMap<>();

        for(int key: arr) {
            if(!map.containsKey(key))
                map.put(key, 1);
            else
                map.put(key, map.get(key)+1);
        }
        
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        
        
        /*
         * Anonymous Class Comparator Sorting
         * 
         * Collections.sort(list, new Comparator<Entry<Integer, Integer>>(){
         * @Override			
         * public int compare(Entry<Integer, Integer> pair1, Entry<Integer, Integer> pair2) {
         * 		if( pair1.getValue() > pair2.getValue() )
         * 			return 1;
	     *   	if( pair1.getValue() < pair2.getValue() )
	     *   		return -1;
	     *   	return 0;
		 *		}
		 *	});
		*/
        
        
        // Lambda Expression for Comparator Sorting;
        Collections.sort(list,(pair1, pair2)->{
        	if( pair1.getValue() > pair2.getValue() )
        		return 1;
        	if( pair1.getValue() < pair2.getValue() )
        		return -1;
        	return 0;
        });
        
        System.out.println("Key"+"	=>	"+"Value");
        
        list.forEach(pair->{
        	System.out.println(pair.getKey()+"	=>	"+pair.getValue());
        });
	}
	
	
	public static void main(String[] args) {
		ArrayList<Integer> l = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        
        CalculateFrequency checkOccurrence = new CalculateFrequency();
        
        while(true) {
            System.out.print("0. Enter Elements\n1. Check Occurrence of each element\n2.Exit: ");
            int choice = in.nextInt();
            if(choice == 0) {
                System.out.println("Enter the element you want to add: ");
                int num = in.nextInt();
                l.add(num);
            }
            else if(choice == 1){
            	checkOccurrence.printSortedOrderFrquency(l);
            }else if(choice==2){
            	System.exit(1);
            	in.close();
            }else {
            	System.out.println("Enter valid input.");
            }        
        }
	}
}
