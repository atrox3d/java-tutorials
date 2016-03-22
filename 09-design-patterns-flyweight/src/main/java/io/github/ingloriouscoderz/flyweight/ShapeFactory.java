package io.github.ingloriouscoderz.flyweight;

import java.util.HashMap;

public class ShapeFactory {
 
    private static final HashMap<ShapeType,Shape> shapes = new HashMap<ShapeType,Shape>();
 
    public static Shape getShape(ShapeType type) {
        final String logTemplate = "[ShapeFactory::getShape] - ";  
    	System.out.printf("%s ShapeType=%s \n", logTemplate, type);
        Shape shapeImpl = shapes.get(type);
 
        if (shapeImpl == null) {
        	System.out.printf("%s shapeImp IS null, creating shape \n", logTemplate);
            if (type.equals(ShapeType.OVAL_FILL)) {
                shapeImpl = new Oval(true);
            } else if (type.equals(ShapeType.OVAL_NOFILL)) {
                shapeImpl = new Oval(false);
            } else if (type.equals(ShapeType.LINE)) {
                shapeImpl = new Line();
            }
            shapes.put(type, shapeImpl);
        } else {
        	System.out.printf("%s shapeImp IS NOT null, returing existing shape \n", logTemplate);
        }
        return shapeImpl;
    }
     
    public static enum ShapeType{
        OVAL_FILL,OVAL_NOFILL,LINE;
    }
}
