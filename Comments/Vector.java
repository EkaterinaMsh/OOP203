/**<b>Примечание:<b/>
 * @author Meshkova Ekaterina
 * @version 1.0
 * @since 2023 - 10 - 28
 *
 */


/**
 * Класс Vector представляет двумерный вектор в пространстве.
 */
public class Vector {
    /**
     * Координата x1 вектора.
     */
    private double x1;
    /**
     * Координата y1 вектора.
     */
    private double y1;
    /**
     * Координата x2 вектора.
     */
    private double x2;
    /**
     * Координата y2 вектора.
     */
    private double y2;

    /**
     * Конструктор с параметрами.
     *
     * @param x1 Координата x1 вектора.
     * @param y1 Координата y1 вектора.
     * @param x2 Координата x2 вектора.
     * @param y2 Координата y2 вектора.
     */
    public Vector(double x1, double y1, double x2, double y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }
    /**
     * Конструктор без параметров.
     * Устанавливает начальные значения координат вектора равными 0.
     */
    public Vector() {
        this.x1 = 0;
        this.y1 = 0;
        this.x2 = 0;
        this.y2 = 0;
    }

    /**
     * Получает значение координаты x1 вектора.
     *
     * @return Значение координаты x1 вектора.
     */
    public double getX1() {
        return x1;
    }
    /**
     * Устанавливает значение координаты x1 вектора.
     *
     * @param x1 Новое значение координаты x1 вектора.
     */
    public void setX1(double x1) {
        this.x1 = x1;
    }
    /**
     * Возвращает значение координаты y1 начальной точки вектора
     * @return Значение координаты y1 начальной точки вектора
     */
    public double getY1() {
        return y1;
    }
    /**
     * Устанавливает значение координаты y1 начальной точки вектора
     * @param y1 Новое значение координаты y1 начальной точки вектора
     */
    public void setY1(double y1) {
        this.y1 = y1;
    }
    /**
     * Возвращает значение координаты x2 конечной точки вектора
     * @return Значение координаты x2 конечной точки вектора
     */
    public double getX2() {
        return x2;
    }
    /**
     * Устанавливает значение координаты x2 конечной точки вектора
     * @param x2 Новое значение координаты x2 конечной точки вектора
     */
    public void setX2(double x2) {
        this.x2 = x2;
    }
    /**
     * Возвращает значение координаты y2 конечной точки вектора
     * @return Значение координаты y2 конечной точки вектора
     */
    public double getY2() {
        return y2;
    }
    /**
     * Устанавливает значение координаты y2 конечной точки вектора
     * @param y2 Новое значение координаты y2 конечной точки вектора
     */
    public void setY2(double y2) {
        this.y2 = y2;
    }

    /**
     * Вычисляет векторное произведение векторов
     * @return Векторное произведение векторов
     */
    public double getCrossProduct() {
        return (x1 * y2) - (y1 * x2);
    }

    /**
     * Вычисляет скалярное произведение векторов
     * @return Скалярное произведение векторов
     */
    public double getDotProduct() {
        return (x1 * x2) + (y1 * y2);
    }

    /**
     * Вычисляет длину вектора
     * @return Длина вектора
     */
    public double getLength() {
        return Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
    }

    /**
     * Умножает вектор на заданное число
     * @param scalar Число, на которое умножается вектор
     * @return Вектор, умноженный на заданное число
     */
    public void multiplyByScalar(double scalar) {
        x1 *= scalar;
        y1 *= scalar;
        x2 *= scalar;
        y2 *= scalar;
    }

    /**
     * Вычисляет сумму двух векторов
     * @param otherVector Второй вектор, с которым выполняется суммированиеjavadoc ./src/Vector.java
     * @return Вектор, являющийся суммой двух векторов
     */
    public Vector add(Vector vector) {
        double newX1 = x1 + vector.getX1();
        double newY1 = y1 + vector.getY1();
        double newX2 = x2 + vector.getX2();
        double newY2 = y2 + vector.getY2();
        return new Vector(newX1, newY1, newX2, newY2);
    }

    /**
     * Вычисляет разность двух векторов
     * @param otherVector Второй вектор, с которым выполняется вычитание
     * @return Вектор, являющийся разностью двух векторов
     */
    public Vector subtract(Vector vector) {
        double newX1 = x1 - vector.getX1();
        double newY1 = y1 - vector.getY1();
        double newX2 = x2 - vector.getX2();
        double newY2 = y2 - vector.getY2();

        return new Vector(newX1, newY1, newX2, newY2);
    }
}
