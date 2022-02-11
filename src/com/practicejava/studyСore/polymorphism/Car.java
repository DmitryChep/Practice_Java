package com.practicejava.studyСore.polymorphism;

public class Car extends Factory{

    void machProduct(String color) { //перегрузка метода (статический/мнимый/ad-hock плиморфизм)
        System.out.println("BMW 2" + color);

    }

    @Override
    public void machProduct() {    // переопределение метода (динамический/истинный полиморфиз)
        System.out.println("Lamba");

    }
}
