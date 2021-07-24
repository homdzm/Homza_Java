package com.andersen.tasks;

import com.andersen.task1.Hello;
import com.andersen.task2.Name;
import com.andersen.task3.Sort;

public class Main {

    public static void main(String[] args) {
        Hello hello = new Hello();
        hello.checkNum();

        Name name = new Name();
        name.checkName();

        Sort sort = new Sort();
        sort.numSort();
        }
}
