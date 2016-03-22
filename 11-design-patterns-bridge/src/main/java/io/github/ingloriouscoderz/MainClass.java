package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.bridge.color.Red;
import io.github.ingloriouscoderz.bridge.color.Shape;
import io.github.ingloriouscoderz.bridge.color.Triangle;

public class MainClass {
 
    public static void main(String[] args) {
    	Shape t = new Triangle(new Red());
    	t.applyColor();
    }
}
