public class Trousers extends Clothing implements MenClothing,WomenClothing {
    public Trousers(Size size, double cost, String color){
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает брюки размера: " + getSize().getDescription() + "(" + "европейского размера: " + getSize().getDescriptionForXXS());
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надевает брюки размера: " + getSize().getDescription() + "(" + "европейского размера: " + getSize().getDescriptionForXXS());
    }
}
