package com.driver;

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A
        A objA = new B();
        System.out.println(objA.meth()); // Calls the overridden method

        // Task 5: Call the overridden method from object of class B
        B objB = new B();
        System.out.println(objB.meth());
    }
}
