package com.company;

public class Outer {
    int number=6;
    public void heyThere() {
        System.out.println("Hey there!");
    }
    public static  class InnerClass{
        public void  heyThere()
        {
            System.out.println("Static Ineer Class: Hey There!");
        }
    }
    public class Inner{
        public void  heyThere()
        {
            System.out.println("Ineer Class: Hey There!");
        }
    }
}
