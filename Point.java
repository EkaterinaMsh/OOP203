package shapes;

import colors.Color;

public class Point extends Shape {
    private double x;
    private double y;

    public Point(){
        this.x = 0.0;
        this.y = 0.0;
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public void setX(double x){
        this.x = x;
    }

    public double getY(){
        return y;
    }

    public void setY(double y){
        this.y = y;
    }

    @Override
    public double getArea() {
        return 0.0;
    }

    @Override
    public double getPerimeter() {
        return 0.0;
    }

    @Override
    public void move(double moveX, double moveY) {
        x += moveX;
        y += moveY;
    }

    @Override
    public void draw() {
        System.out.println("Фигура: Точка");
        System.out.println("Цвет: " + getColor());
        System.out.println("Координаты: (" + x + "," + y + ")");
    }

}
