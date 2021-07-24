package com.andersen.task1;
import java.util.Scanner;

public class Hello {
    int num = 7;
    Scanner in = new Scanner(System.in);

    public void checkNum() {
        System.out.println("Plaese, enter a number: ");
        int answer = in.nextInt();
        if (answer > num)
            System.out.println("Привет");

        }
}
