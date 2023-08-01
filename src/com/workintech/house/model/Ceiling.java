package com.workintech.house.model;

import com.workintech.house.enums.PaintColor;

public class Ceiling {
    private int height;
    private PaintColor paintedColor;

    public Ceiling(int height, PaintColor paintedColor) {
        this.height = height;
        this.paintedColor = paintedColor;
    }

    public int getHeight() {
        return height;
    }

    public PaintColor getPaintedColor() {
        return paintedColor;
    }

    public void create() {
        System.out.println("Height: " + height + "m" + " Color: " + paintedColor);
    }
}
