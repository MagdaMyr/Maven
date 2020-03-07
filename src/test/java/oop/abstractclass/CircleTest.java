package oop.abstractclass;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.offset;

class CircleTest {

    @Test
    void shouldCalculateArea() {
        //given
        Figure figure = new Circle(5);
        //when
        double result = figure.calculateArea();
        //then
        assertThat(result).isCloseTo(78.54, offset(0.01));
    }

    @Test
    void shouldCalculateCircuit() {
        //given
        Figure figure = new Circle(5);
        //when
        double result = figure.calculateCircuit();
        //then
        assertThat(result).isCloseTo(31.42, offset(0.01));
    }

}