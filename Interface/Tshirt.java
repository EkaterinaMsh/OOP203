public class Tshirt extends Clothing implements MenClothing,WomenClothing{
    public Tshirt(Size size, double cost, String color){
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает футболку размера: " + getSize().getDescription() + "(" + "европейского размера: " + getSize().getDescriptionForXXS());
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надевает футболку размера: " + getSize().getDescription() + "(" + "европейского размера: " + getSize().getDescriptionForXXS());
    }
}
