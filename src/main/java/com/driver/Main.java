package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly rwOnly = new RWOnly();
        //rwOnly.name = "yash";
        //System.out.println(rwOnly.name);
        // name has private access in com.driver.RWOnly.

        rwOnly.setName("yash");
        System.out.println(rwOnly.getName());
    }
}