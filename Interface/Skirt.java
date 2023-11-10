public class Skirt extends Clothing implements WomenClothing{
    public Skirt(Size size, double cost, String color){
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {
        System.out.println("Женщина надевает юбку размера: " + getSize().getDescription() + "(" + "европейского размера: " + getSize().getDescriptionForXXS());
    }

}
