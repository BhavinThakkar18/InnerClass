package com.company;

public class Outer {
    int number=6;
    public void heyThere() {
        System.out.println("Hey there!");
    }
    public class Inner{
        public void  heyThere()
        {
            System.out.println("Ineer Class: Hey There!");
        }
    }
}
