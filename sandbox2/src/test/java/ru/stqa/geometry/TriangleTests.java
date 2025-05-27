package ru.stqa.geometry;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculatePerimeter(){
        var result = Triangle.trianglePerimeter(3.0, 4.0, 5.0);
        Assertions.assertEquals(12.0, result);
    }

    @Test
    void canCalculateArea(){
        var resultArea = Triangle.triangleArea(3.0, 4.0, 5.0);
        Assertions.assertEquals(6.0, resultArea);
    }
}
