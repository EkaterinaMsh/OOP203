public class Tie extends Clothing implements MenClothing{
    public Tie(Size size, double cost, String color){
        super(size, cost, color);
    }

    @Override
    public void dressMan() {
        System.out.println("Мужчина надевает галстук размера: " + getSize().getDescription() + "(" + "европейского размера: " + getSize().getDescriptionForXXS());
    }
}
