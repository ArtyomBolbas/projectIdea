package com.bolbas.app;

import com.bolbas.app.model.Car;
import com.bolbas.app.model.Mover;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Hello world");
        Car a = new Car();

        Mover mover = () -> "I walk";
        System.out.println(mover.getValue());
    }
}
