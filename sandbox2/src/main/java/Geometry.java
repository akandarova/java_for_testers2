import static java.lang.Math.sqrt;

public class Geometry {
    public static void main(String[] args) {
        printTrianglePerimeter(3.0, 4.0, 5.0);
        printTriangleArea(3.0, 4.0, 5.0);

    }

    private static void printTriangleArea(double a, double b, double c) {
        System.out.println("Площадь треугольника со сторонами: " + a + ", " + b + ", " + c + " = " + triangleArea(a, b, c));
    }

    private static double triangleArea(double a, double b, double c) {
        return (sqrt((trianglePerimeter(a, b, c)/2) * (trianglePerimeter(a, b, c)/2 - a) * (trianglePerimeter(a, b, c)/2 - b) * (trianglePerimeter(a, b, c)/2 - c)));
    }

    static void printTrianglePerimeter(double a, double b, double c){
        System.out.println("Периметр треугольника со сторонами: " + a + ", " + b + ", " + c + " = " + trianglePerimeter(a, b, c));
    }

    private static double trianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }
}
