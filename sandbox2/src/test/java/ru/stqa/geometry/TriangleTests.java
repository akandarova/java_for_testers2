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

        Assertions.assertEquals(6.0, new Triangle(5.0, 4.0, 3.0).area());
    }

    @Test
    void cannotCreateTriangleWithNegativeSide(){
        try{
            new Triangle(-5.0, 4.0, 3.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception){
            //Ok
        }
    }

    @Test
    void cannotSumOfTwoSideLessOneSide(){
        try{
            new Triangle(1.0, 2.0, 5.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception){
            //Ok
        }
    }

    @Test
    void testEquality(){
        var t1 = new Triangle(5.0, 4.0, 3.0);
        var t2 = new Triangle(5.0, 3.0, 4.0);
        Assertions.assertEquals(t1, t2);
    }
}




