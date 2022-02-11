package com.practicejava.studyСore.loops;

public class ExamplesLoops {

    int a = 5, b = 8;

    public void loopWhile() {
        do {                                // do while
            System.out.println("Off!");
            a++;
        }
        while (a < b);               // while
        System.out.println("Hi! my dear friend(");
        while (true) {
            if (a == b) {
                System.out.println("Oops!\na == b ");
                System.out.println("Sorry it's over( ");
                break;
            } else
                a++;
            System.out.println("a != b");

        }
    }

    String[] arrey = {"F", "u", "c", "k!"};

    public void loopFor() {
        for (String element : arrey) {     //for
            System.out.print(element);
        }
        System.out.println("\n");

        for (int i = 0; i < 9; i = i + 2) {
            System.out.println("qwert");
        }

        for (int i = 0; i< arrey.length;i ++ ){
            System.out.println(arrey[i]);

        }
    }
}
