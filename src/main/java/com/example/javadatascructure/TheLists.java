package com.example.javadatascructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TheLists {

    public static void main(String[] args) {
        List colors = new ArrayList();
        colors.add("purple");
        colors.add(1);
        colors.add(5.0);

        colors.forEach(System.out::println);

        List<String> rightColors = new ArrayList();
        rightColors.add("purple");
        rightColors.add("red");
        System.out.println(rightColors);

        List<String> unmodifiableList = List.of("opa", "opa");

        List<String> list = new ArrayList<>(Arrays.asList("oi", "eita"));
    }
}
