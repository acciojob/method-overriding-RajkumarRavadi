package com.driver;

public class Main {
    public static void main(String [] args){
        // Create an object of class B
        B objb = new B();

        // Call method meth of class A with it
        System.out.println(objb.meth());
    }
}

class A {
    public String meth(){
        return "Invoking method from class A";
    }
}

class B extends A {
    // Override method meth of class A
    @Override
    public String meth(){
        return "Method is overridden in Extended class B";
    }
}
