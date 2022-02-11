package com.practicejava.studyСore.arrays;

import org.w3c.dom.ls.LSOutput;

public class Arrays {
    int [][] guitar = new int[3][3];
    static int [][] arrays = {{1,2}, {3,4}};

    String aa = "a", bb = "b", cc = "c";

    String [] arr = new String []{aa, bb, cc};

    public void getarr (){
        for (String element: arr){
            System.out.println(element);

        }
    }









    public void array (){
        for (int i = 0; i < arrays.length; i++){
            for (int j = 0; j < arrays.length; j++)
            System.out.print(arrays[i][j]);

        }



    }







}
