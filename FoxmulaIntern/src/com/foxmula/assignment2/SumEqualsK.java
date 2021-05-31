package com.foxmula.assignment2;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class SumEqualsK {
	public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(5);
        arr.add(17);
        arr.add(82);
        arr.add(19);
        arr.add(10);
        arr.add(0);
        
        System.out.println("Array:	");
        for(int e:arr)
        	System.out.print(e+" ");
        
        Collections.sort(arr);
        System.out.println();
        
        while(true) {
        	Scanner in = new Scanner(System.in);
            System.out.print("1.Enter value to find corresponding pairs.\n2.Exit ");
            int k = in.nextInt();
            if(k==2)
            	System.exit(1);
            
            System.out.print("Enter k value: ");
            k = in.nextInt();
            int status=0;
            int start = 0, end = arr.size()-1;
            while(start < end) {
                if(arr.get(start) + arr.get(end) == k) {
                    System.out.println("Pair: (" +arr.get(start)+ "," +arr.get(end)+ ")");
                    status = 1;
                }
                if(arr.get(start) + arr.get(end) > k) {
                    end--;
                }
                else {
                    start++;
                }
            }
            if(status==0) {
                System.out.println("No pair possible");
            }
        }
	}
}
