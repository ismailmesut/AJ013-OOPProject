package com.ismailmesutmujde.oopproject;

// Inheritance (Kalıtım - Miras Alma)
// Nesneye yönelik programlamanın temel taşlarından biri olan Kalıtım, sınıflardan yeni sınıflar türetmeyi sağlar. Türetilen bu yeni sınıflar, türetildiği sınıfların özelliklerine
// sahip olur. Kalıtım yapmak için kullanacağımız kelime extends'dir.
public class SuperMusician extends Musician {

    public SuperMusician(String name, String instrument, int age) {
        super(name, instrument, age);
    }

    public String sing() {
        return "Nothing Else Matters";
    }
}
