package com.mechanitis.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CircleTest {
    @Test
    void shouldHaveZeroCorners() {
        Circle circle = new Circle();

        Assertions.assertEquals(0, circle.getNumberOfCorners());
    }
}