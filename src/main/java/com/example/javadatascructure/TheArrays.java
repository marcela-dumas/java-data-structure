package com.example.javadatascructure;

import java.util.Arrays;

public class TheArrays {

    public static void main(String[] args) {

        String[] colors = new String[5];
        colors[0] = "purple";
        colors[1] = "blue";
        System.out.println(Arrays.toString(colors));

        int[] numbers = {100, 200};
        System.out.println(Arrays.toString(numbers));

        System.out.println("Using tradicional loop:");
        for(int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        System.out.println("Using enhanced loop:");
        for(String color : colors){
            System.out.println(color);
        }

        System.out.println("Using streams:");
        Arrays.stream(colors).forEach(System.out::println);
    }

}
