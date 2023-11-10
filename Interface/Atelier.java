public class Atelier {
    public void dressWoman(WomenClothing[] clothes){
        System.out.println("Женская одежда:");
        for (WomenClothing clothing: clothes) {
            clothing.dressWoman();
        }
    }

    public void dressMan(MenClothing[] clothes){
        System.out.println("Мужская одежда:");
        for (MenClothing clothing: clothes) {
            clothing.dressMan();
        }
    }
}
