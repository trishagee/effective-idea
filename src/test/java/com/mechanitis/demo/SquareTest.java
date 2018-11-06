package com.mechanitis.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    void shouldHaveFourCorners() {
        Square square = new Square();

        int numberOfCorners = square.getNumberOfCorners();

        Assertions.assertEquals(4, numberOfCorners);
    }
}
