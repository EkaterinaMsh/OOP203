public abstract class Clothing {
    private Size size;
    private double cost;
    private String color;

    public Clothing(Size size, double cost, String color) {
        this.size = size;
        this.cost = cost;
        this.color = color;
    }

    // Геттеры

    public Size getSize() {
        return size;
    }


    public double getCost() {
        return cost;
    }

    public String getColor() {
        return color;
    }
    // Абстрактные методы для мужской и женской одежды
    public abstract void dressMan();

    public abstract void dressWoman();
}
