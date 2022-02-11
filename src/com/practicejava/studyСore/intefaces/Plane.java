package com.practicejava.studyСore.intefaces;

public class Plane implements Motion {
    public String namePilot;
    public String moving;

    public Plane(String namePilot, String moving) {
        this.namePilot = namePilot;
        this.moving = moving;
    }


    @Override
    public void showName() {
        System.out.println("\nMy name is " + namePilot);
    }

    @Override
    public void moving() {
        System.out.println("I can " + moving);

    }
}
