package oop.abstractclass;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RectangleTest {

    @Test
    void shouldCalculateArea() {
        //given
        Figure figure = new Rectangle(2, 5);
        //when
        double result = figure.calculateArea();
        //then
        assertThat(result).isEqualTo(10);
    }
}