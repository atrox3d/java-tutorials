package io.github.ingloriouscoderz;

import io.github.ingloriouscoderz.bridge.Red;
import io.github.ingloriouscoderz.bridge.Shape;
import io.github.ingloriouscoderz.bridge.Triangle;

public class MainClass {
 
    public static void main(String[] args) {
    	Shape t = new Triangle(new Red());
    	t.applyColor();
    }
}
