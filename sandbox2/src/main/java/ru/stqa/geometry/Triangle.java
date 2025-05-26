package ru.stqa.geometry;

import static java.lang.Math.sqrt;

public class Triangle {
    static void printTriangleArea(double a, double b, double c) {
        String textArea = String.format("Площадь треугольника со сторонами: +%f + %f + %f = %f", a, b, c, triangleArea(a, b, c));
        System.out.println(textArea);
    }

    private static double triangleArea(double a, double b, double c) {
        return (sqrt((trianglePerimeter(a, b, c)/2) * (trianglePerimeter(a, b, c)/2 - a) * (trianglePerimeter(a, b, c)/2 - b) * (trianglePerimeter(a, b, c)/2 - c)));
    }

    static void printTrianglePerimeter(double a, double b, double c){
        String textPerimeter = String.format("Периметр треугольника со сторонами: +%f + %f + %f = %f", a, b, c, trianglePerimeter(a, b, c));
        System.out.println(textPerimeter);
    }

    private static double trianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }
}
