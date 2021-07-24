package com.andersen.task2;
import java.util.Scanner;

public class Name {
    Scanner in = new Scanner(System.in);
    String name = "Вячеслав";

    public void checkName() {
        System.out.println("Please, enter a name: ");
        String answer = in.nextLine();
        if (answer.equalsIgnoreCase(name))
            System.out.println("Привет, Вячеслав");
        else System.out.println("Нет такого имени");

    }
}
