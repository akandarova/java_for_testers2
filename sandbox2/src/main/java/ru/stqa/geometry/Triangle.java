package ru.stqa.geometry;

import static java.lang.Math.sqrt;

public class Triangle {

    private double sideA;
    private double sideB;
    private double sideC;

    public Triangle(double sideA, double sideB, double sideC) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public static void printTriangleArea(Triangle t) {
        String textArea = String.format("Площадь треугольника со сторонами: +%f + %f + %f = %f", t.sideA, t.sideB, t.sideC, t.area());
        System.out.println(textArea);
    }

    public static void printTrianglePerimeter(Triangle t) {
        String textPerimeter = String.format("Периметр треугольника со сторонами: +%f + %f + %f = %f", t.sideA, t.sideB, t.sideC, t.trianglePerimeter());
        System.out.println(textPerimeter);
    }

    public double trianglePerimeter(){
        return this.sideA + this.sideB + this.sideC;
    }

    public double area() {
        return (sqrt((trianglePerimeter()/2) * (trianglePerimeter()/2 - this.sideA) * (trianglePerimeter()/2 - this.sideB) * (trianglePerimeter()/2 - this.sideC)));
    }

}

