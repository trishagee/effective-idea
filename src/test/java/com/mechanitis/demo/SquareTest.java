package com.mechanitis.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.function.IntSupplier;

class SquareTest {
    @Test
    void shouldHaveFourCorners() {
        Square square = new Square();

        assertValue(4, square::getNumberOfCorners);
    }

    @Test
    void shouldHaveFourEdges() {
        final Shape square = new Square();

        assertValue(4, square::getNumberOfEdges);
    }

    private void assertValue(int expected, IntSupplier intSupplier) {
        Assertions.assertEquals(expected, intSupplier.getAsInt());
    }

}
