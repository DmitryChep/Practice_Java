package com.practicejava.studyСore.intefaces;

public class Bike implements Motion, Jump {
    public String name;
    public String moving;
    public String jump;

    public Bike(String name, String moving, String jump) {
        this.name = name;
        this.moving = moving;
        this.jump = jump;
    }


    @Override
    public void showName() {
        System.out.println("My name is " + name);
    }

    @Override
    public void moving() {
        System.out.println("I can " + moving);
    }

    @Override
    public void jump() {
        System.out.println("And also I can " + jump);
    }
}









