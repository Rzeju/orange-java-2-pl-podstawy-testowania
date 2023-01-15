package pl.sda.oop;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CircleTest {

    @Test
    void perimeterMethodTest() {
        //given
        Circle circle = new Circle(1);

        //when
        double result = circle.calculatePerimeter();

        //then
        assertEquals(2 * Math.PI * 1, result);
    }

    @Test
    void calculateAreaMethodTest() {
        //given
        Circle circle = new Circle(1);

        //when
        double result = circle.calculateArea();

        //then
        assertEquals(Math.PI * Math.pow(1, 2), result);
    }
}
