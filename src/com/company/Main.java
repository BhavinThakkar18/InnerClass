package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//    Dog myDog = new Dog("Jerry");
//     myDog = new Dog(4);
//    System.out.println(myDog.name);
//    System.out.println(myDog.age);
    Outer outer=new Outer();
    outer.heyThere();
    Outer.Inner inner=outer.new Inner();
    inner.heyThere();
    }
}
