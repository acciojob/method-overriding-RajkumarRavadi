package com.driver;

public class Main {
    public static void main(String[] args) {
        A obja = new B();
        obja.meth();
        System.out.println(obja.meth());

        B objb = new B();
        objb.meth();
        System.out.println(objb.meth());
    }

    static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in Extedend class B";
        }
    }
}


