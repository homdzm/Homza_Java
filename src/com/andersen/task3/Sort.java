package com.andersen.task3;
import java.util.Scanner;

public class Sort {
    
    Scanner in = new  Scanner(System.in);
    int i;
          
    public void numSort() {
        System.out.println("Please, enter a length of array: ");
        int length = in.nextInt();
        int[] array = new int[length];
        for (i = 0; i < length; i++) {
            System.out.println("Enter " + i + " element of array:");
           array[i] = in.nextInt();
        }
        System.out.println("");
        for (int x :
             array) {
            if (x % 3 == 0)
                System.out.println(x + " - multiple of 3");
        }
    }
}
