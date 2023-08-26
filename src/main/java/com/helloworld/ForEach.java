package com.helloworld;

public class ForEach {
    public static void main(String[] args) {
        String[] array = {
            "Ehzand", "Firly", "Faiq", "Bilqis"
        };

        for (var value : array){
            System.out.println(value);
        }
    }
}
