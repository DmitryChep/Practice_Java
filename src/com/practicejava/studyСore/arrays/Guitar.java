package com.practicejava.studyСore.arrays;

public class Guitar {
    Strings strings1 = new Strings();
    Strings strings2 = new Strings();
    Strings strings3 = new Strings();
    Strings strings4 = new Strings();
    Strings strings5 = new Strings();
    Strings strings6 = new Strings();

    Strings[] guitar = new Strings[]{strings1, strings2, strings3, strings4, strings5, strings6};

    public void setGuitar() {
        for ( Object elem : guitar) {
            System.out.println(elem);
        }

    }
}

