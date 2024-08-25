package com.ismailmesutmujde.oopproject;

public class Dog extends Animal {

    public void test() {
        // super: extends edilen sınıfa (Animal) referans veriyor
        super.sing();
    }

    public void sing() {
        System.out.println("dog class");
    }
}
