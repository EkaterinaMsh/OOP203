import colors.Color;
import service.impl.ShapesServiceImpl;
import shapes.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapeList = new ArrayList<>();
        //Красный треугольник
        Point point1 = new Point(0,0);
        Point point2 = new Point(0,4);
        Point point3 = new Point(4,0);

        Triangle triangle = new Triangle(point1, point2, point3);
        triangle.setColor(Color.RED);
        triangle.draw();
        shapeList.add(triangle);

       //Белый круг радиус 2 ( 3.3)
        Point center = new Point(3,3);
        Circle circle = new Circle(center,2);
        circle.setColor(Color.WHITE);
        circle.draw();
        shapeList.add(circle);

        //Круг желтого цвета, радиус 4, (2,5)
        Point center2 = new Point(2,5);
        Circle circle2 = new Circle(center2,4);
        circle2.setColor(Color.YELLOW);
        circle2.draw();
        shapeList.add(circle2);

        //Прямоугольник (1,1) (5,2)
        Point pointA = new Point(1,1);
        Point pointB = new Point(5,2);
        Rectangle rectangle = new Rectangle(pointA, pointB);
        //rectangle.setColor(Color.BLUE);
        rectangle.draw();
        shapeList.add(rectangle);

        //Точка (100,100)
        Point point = new Point(100,100);
        point.draw();
        shapeList.add(point);

        ShapesServiceImpl ss = new ShapesServiceImpl();
        System.out.println(ss.getSquares(shapeList));
        System.out.println( ss.getMaxPerimeters(shapeList));
        ss.getColors(shapeList);
    }
}