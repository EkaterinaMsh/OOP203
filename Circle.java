package shapes;

public class Circle extends Shape {
    private Point center;
    private double radius;

    public Circle(Point center, double radius){
        this.center = center;
        this.radius = radius;
        validate();
    }

    public Point getCenter(){
        return center;
    }

    public void setCenter(Point center){
        this.center = center;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
        validate();
    }

    private void validate(){
        if (radius<=0){
            System.out.print("Не удалость создать фигуру: радиус не может быть меньше или равен нулю");
        }
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void move(double moveX, double moveY) {
        center.move(moveX, moveY);
    }

    @Override
    public void draw() {
        System.out.println("Фигура: Круг");
        System.out.println("Цвет: " + getColor());
        System.out.println("Координаты центра: (" + center.getX() + "," + center.getY() + ")");
        System.out.println("Радиус: " + radius);
        System.out.println("Площадь: " + getArea());
        System.out.println("Периметр: " + getPerimeter());
    }

}
