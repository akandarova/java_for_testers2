package ru.stqa.geometry;

import java.util.Objects;

import static java.lang.Math.sqrt;

public record Triangle (double sideA, double sideB, double sideC) {

    public Triangle{
        if (sideA < 0 || sideB < 0 || sideC < 0){
            throw new IllegalArgumentException("Triangle side should be non-negative");
        }
        else if((sideA + sideB) < sideC || (sideA + sideC) < sideB || (sideB + sideC) < sideA){
            throw new IllegalArgumentException("Sum of two triagle's sides cannot be less then another side");
        }
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Double.compare(triangle.sideA, this.sideA) == 0 && Double.compare(triangle.sideB, this.sideB) == 0 && Double.compare(triangle.sideC, this.sideC) == 0
                || Double.compare(triangle.sideA, this.sideB) == 0 && Double.compare(triangle.sideB, this.sideC) == 0 && Double.compare(triangle.sideC, this.sideA) == 0
                || Double.compare(triangle.sideA, this.sideC) == 0 && Double.compare(triangle.sideB, this.sideA) == 0 && Double.compare(triangle.sideC, this.sideB) == 0
                || Double.compare(triangle.sideA, this.sideA) == 0 && Double.compare(triangle.sideB, this.sideC) == 0 && Double.compare(triangle.sideC, this.sideB) == 0
                || Double.compare(triangle.sideA, this.sideC) == 0 && Double.compare(triangle.sideB, this.sideB) == 0 && Double.compare(triangle.sideC, this.sideA) == 0
                || Double.compare(triangle.sideA, this.sideB) == 0 && Double.compare(triangle.sideB, this.sideA) == 0 && Double.compare(triangle.sideC, this.sideC) == 0;
    }

    @Override
    public int hashCode() {
        return 1;
    }

}

