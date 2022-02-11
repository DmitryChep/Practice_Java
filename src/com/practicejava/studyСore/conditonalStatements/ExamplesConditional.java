package com.practicejava.studyСore.conditonalStatements;

public class ExamplesConditional {
    final int  value = 0, value1 = 14, value2 = 25, value3 = 3;

    public void  comparing (){
//        if (value < value3){
//            System.out.print("Ok");
//        }

        switch (value){
            case value1:
                System.out.println("1");
                break;
            case value3:
                System.out.println("2");
                break;
            case value2:
                System.out.println("3");
                break;
            case value:
                System.out.println("4");
                break;
            default:
                System.out.println("Ooops sorry!");
        }
    }
}
