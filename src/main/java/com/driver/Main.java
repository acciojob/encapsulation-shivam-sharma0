package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly first= new RWOnly();
//        first.name="Shivam";

        first.setName("Shivam");
        first.getName();
    }

}