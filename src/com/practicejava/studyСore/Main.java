package com.practicejava.studyСore;


public class Main {
    public static void main(String[] args) {
        Example example = new Example(74, 87f);
        System.out.println("Дистанция пройдена: " +example.distans() + "km");


//         // Пример статического и динамического связывания в Java
//         Insurance current = new CarInsurance();
//
//         // Динамическое связывание на основе объекта
//         int premium = current.premium();
//
//         // Статическое связывание на основе класса
//         String category = current.category();
//
//         System.out.println("premium : " + premium);
//         System.out.println("category : " + category);
    }
}

//class Insurance{
//    public static final int LOW = 100;
//
//    public int premium(){
//        return LOW;
//    }
//
//    public static String category(){
//        return "Insurance";
//    }
//
//}
//
//class CarInsurance extends Insurance{
//    public static final int HIGH = 200;
//
//    public int premium(){
//        return HIGH;
//    }
//
//    public static String category(){
//        return "Car Insurance";
//    }

//}

