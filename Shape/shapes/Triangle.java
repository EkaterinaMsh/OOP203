package shapes;
import colors.Color;

public class Triangle extends Shape {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public Point getPoint1() {
        return point1;
    }

    public void setPoint1(shapes.Point point1) {
        this.point1 = point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public void setPoint2(Point point2) {
        this.point2 = point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setPoint3(Point point3) {
        this.point3 = point3;
    }

    public boolean isValid(){
        double x1 = point1.getX();
        double y1 = point1.getY();
        double x2 = point2.getX();
        double y2 = point2.getY();
        double x3 = point3.getX();
        double y3 = point3.getY();
        return ((x2 - x1) * (y3 - y1) != (x3 - x1) * (y2 - y1));
    }

    public double distance(Point point, Point point01){
        double x1 = point.getX();
        double x2 = point01.getX();
        double y1 = point.getY();
        double y2 = point01.getY();
        double dx = x2 - x1;
        double dy = y2 - y1;
        return Math.sqrt(dx*dx+dy*dy);


    }

    @Override
    public double getArea() {
        double x1 = point1.getX();
        double y1 = point1.getY();
        double x2 = point2.getX();
        double y2 = point2.getY();
        double x3 = point3.getX();
        double y3 = point3.getY();
        return 0.5 * Math.abs((x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2))) ;
    }

    @Override
    public double getPerimeter() {
        double side1 = distance(point1, point2);
        double side2 = distance(point2, point3);
        double side3 = distance(point3, point1);
        return side1 + side2 + side3;

    }

    @Override
    public void move(double offsetX, double offsetY) {
       point1.move(offsetX, offsetY);
       point2.move(offsetY, offsetY);
       point3.move(offsetX, offsetY);
    }

    @Override
    public void draw() {
        System.out.println("Фигура: Треугольник");
        System.out.println("Цвет: " + getColor());
        System.out.println("Точки: (" + point1.getX()+ "," + point1.getY()+ ")" + "(" + point2.getX() + ","+ point2.getY() + ")" + "(" + point3.getX() + ","+ point3.getY() + ")");
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
    }
}
