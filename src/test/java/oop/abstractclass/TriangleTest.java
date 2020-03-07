package oop.abstractclass;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class TriangleTest {

    @Test
    void shouldCalculateArea() {
        //given
        Figure figure = new Triangle(5, 5, 5);
        //when
        double result = figure.calculateArea();
        //then
        assertThat(result).isCloseTo(10.82, offset(0.01));
    }

    @Test
    void shouldCalculateCircuit() {
        //given
        Figure figure = new Triangle(5, 5, 5);
        //when
        double result = figure.calculateCircuit();
        //then
        assertThat(result).isCloseTo(15, offset(0.01));
    }

}