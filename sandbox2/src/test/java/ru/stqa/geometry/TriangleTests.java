package ru.stqa.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculatePerimeter() {
        var t = new Triangle(5.0, 4.0, 3.0);
        double result = t.trianglePerimeter();
        Assertions.assertEquals(12.0, result);
    }

    @Test
    void canCalculateArea(){
//        var t = new Triangle(5.0, 4.0, 3.0);
//        var resultArea = t.triangleArea();
        Assertions.assertEquals(6.0, new Triangle(5.0, 4.0, 3.0).area());
    }
}
