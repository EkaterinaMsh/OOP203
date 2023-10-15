package shapes;
import colors.Color;

public class Rectangle extends Shape {
    private Point pointA;
    private Point pointB;

    public Rectangle(){
    }

    public Rectangle(Point pointA, Point pointB){
        this.pointA = pointA;
        this.pointB = pointB;
        validate();
    }

    public Point getPointA(){
        return pointA;
    }

    public void setPointA(Point pointA){
        this.pointA = pointA;
        validate();
    }

    public  Point getPointB(){
        return pointB;
    }

    public void setPointB(Point pointB){
        this.pointB = pointB;
        validate();
    }

    private void validate(){
        if (pointA.getX() == pointB.getX() || pointA.getY() == pointB.getY()){
            throw new RuntimeException("Не удалось создать фигуру, так как точки лежат на одной прямой.");
        }
    }

    @Override
    public double getArea() {
        double width = Math.abs(pointA.getX() - pointB.getX());
        double height = Math.abs(pointA.getY() - pointB.getY());
        return width * height;
    }

    @Override
    public double getPerimeter() {
        double width = Math.abs(pointA.getX() - pointB.getX());
        double height = Math.abs(pointA.getY() - pointB.getY());
        return 2 * (width + height);
    }

    @Override
    public void move(double deltaX, double deltaY) {
        pointA.move(deltaX, deltaY);
        pointB.move(deltaX, deltaY);
    }

    @Override
    public void draw() {
        System.out.println("Фигура: Прямоугольник");
        System.out.println("Цвет: " + getColor());
        System.out.println("Точки: (" + pointA.getX()+ "," + pointA.getY()+ ")" + "(" + pointB.getX() + ","+ pointB.getY() + ")");
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
    }
}
