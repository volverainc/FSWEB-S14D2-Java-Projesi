package com.workintech.house.main;


import com.workintech.house.enums.LampType;
import com.workintech.house.enums.PaintColor;
import com.workintech.house.model.*;

public class Main {
    public static void main(String[] args) {

        Bedroom bedroom =
                new Bedroom("My Room",
                        new Wall("north"),
                        new Wall("west"),
                        new Wall("south"),
                        new Wall("east"),
                        new Ceiling(3, PaintColor.BEIGE),
                        new Bed("twin",2,210,1,1),
                        new Lamp(LampType.LED,true,70),
                        new Wardrobe(2,4,300),
                        new Carpet(2,4,PaintColor.GREEN));

        bedroom.getBed().make();
        bedroom.getCarpet().lying();
        bedroom.getCeiling().create();
        bedroom.getLamp().turnOn();
        bedroom.getWall1().create();
        bedroom.getWall2().create();
        bedroom.getWall3().create();
        bedroom.getWall4().create();
        bedroom.getWardrobe().add();
    }
}