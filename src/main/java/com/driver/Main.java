package com.driver;

public class Main {
    public static void main(String[] args) {
        A obja = new B();
        System.out.println(obja.meth());

        B objb = new B();
        System.out.println(objb.meth());
    }
}
