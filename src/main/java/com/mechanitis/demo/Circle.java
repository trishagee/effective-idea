package com.mechanitis.demo;

public class Circle implements Shape {
    public int getNumberOfCorners() {
        return 0;
    }

    public int getNumberOfEdges() {
        throw new UnsupportedOperationException("Not implemented!");
    }
}
