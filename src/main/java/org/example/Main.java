package org.example;

public class Main {
    public static void main(String[] args) {
        hello("World");
        hello("user");
        hello("Mike");

        double l = 4;
        System.out.println("Площадь квадрата со стороной " + l + " = " + area(l));

        double a = 4;
        double b = 6;
        System.out.println("Площадь прямоугольника со стронами " + a + " и " + b + " = "+ area(a, b));

    }

    public static void hello(String somedoy){
        System.out.println("Hello " + somedoy + "!");
    }

    public static double area (double len) {
        return len * len;
    }

    public static double area (double a, double b) {
        return a * b;
    }
}