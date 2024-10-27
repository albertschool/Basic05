package com.company;

import java.util.ArrayList;

public class Flag implements Colorable {
    private Rectangle flag;
    private ArrayList<String> colors;

    @Override
    public void howToColor() {
        System.out.println("Color by the flag.");
    }
}
