package com.workintech.house.model;

public class Bed {
    private String style;
    private int pillows;
    private int height;
    private int sheets;
    private int quilt;

    public Bed(String style, int pillows, int height, int shees, int quilt) {
        this.style = style;
        this.pillows = pillows;
        this.height = height;
        this.sheets = shees;
        this.quilt = quilt;
    }

    public void make() {
        System.out.println("The bed is being made.");
    }

    public int getPillows() {
        return pillows;
    }

    public int getHeight() {
        return height;
    }

    public int getShees() {
        return sheets;
    }

    public int getQuilt() {
        return quilt;
    }
}
