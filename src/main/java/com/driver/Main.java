package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly first=new RWOnly("Shivam");

//        System.out.println(first.name);// It will give error because our variable is private

//          first.name="Rohit"; // It will also give error because our variable is private we can not access directly we have use getter and setter method

        System.out.println(first.getName());

        first.setName("Rohit"); // Set the name using setter function

        System.out.println(first.getName()); // Get the private member of the class using getter function
    }
}