public class Main {
    public static void main(String[] args) {
     // Создать объект класса, вызвав конструктор с параметрами
        Vector vector1 = new Vector(1, 2, 3, 4);

        // Создать объект класса, вызвав конструктор без параметров
        Vector vector2 = new Vector();

        // Вызвать каждый из методов
        double crossProduct = vector1.getCrossProduct();
        double dotProduct = vector1.getDotProduct();
        double length = vector1.getLength();

        vector1.multiplyByScalar(2);

        Vector sum = vector1.add(vector2);
        Vector difference = vector1.subtract(vector2);

        System.out.println("Векторное произведение: " + crossProduct);
        System.out.println("Скалярное произведение: " + dotProduct);
        System.out.println("Длина: " + vector1.getLength());


        System.out.println("Умноженные вектора на число: (" + vector1.getX1() + ", " + vector1.getY1() + ", " + vector1.getX2() + ", " + vector1.getY2() + ")");

        System.out.println("Сумма векторов : (" + sum.getX1() + ", " + sum.getY1() + ", " + sum.getX2() + ", " + sum.getY2() + ")");
        System.out.println("Разность векторов: (" + difference.getX1() + ", " + difference.getY1() + ", " + difference.getX2() + ", " + difference.getY2() + ")");

    }
}