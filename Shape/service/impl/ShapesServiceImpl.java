package service.impl;


import colors.Color;
import service.ShapesService;
import shapes.Shape;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ShapesServiceImpl implements ShapesService {
    @Override
    public double getSquares(List<Shape> shapeList) {
        double Squares = 0;
        for (Shape shape : shapeList) {
            Squares += shape.getArea();
        }
        return Squares;
    }

    @Override
    public double getMaxPerimeters(List<Shape> shapeList) {
        double max = 0;
        for (Shape shape : shapeList) {
            double perimeter = shape.getPerimeter();
            if (perimeter > max) {
                max = perimeter;
            }
        }
        return max;
    }
    @Override
    public Set<Color> getColors(List<Shape> shapeList) {
        Set<Color> setOfColors = new HashSet<>();
        for (int i=0; i<shapeList.size(); i++){
            setOfColors.add(shapeList.get(i).getColor());
        }
        for (Color c: setOfColors)
            System.out.print(c+" ");

        return setOfColors;
    }
}
