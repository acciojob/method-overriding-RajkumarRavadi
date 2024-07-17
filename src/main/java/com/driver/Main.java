package com.driver;

public class Main {
  public static void main(String [] args){
          //nothing
    }
}

class A{
    public String meth(){
        return "Invoking method from class A";
    }
}

class B extends A{
    B objb = new B();
    String str1 = objb.meth();

    public String meth(){
        return "Method is overridden in Extended class B";
    }

    String str2 = objb.meth();

}