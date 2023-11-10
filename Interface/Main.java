public class Main {
    public static void main(String[] args) {
        Tshirt tshirtWomen = new Tshirt(Size.M, 900, "Красный");
        Trousers trousersWomen = new Trousers(Size.M, 1890, "Черный");
        Skirt skirt = new Skirt(Size.S, 2500, "Синий");
        Tshirt tshirtMen = new Tshirt(Size.M, 1200, "Синий");
        Trousers trousersMen = new Trousers(Size.M, 2200, "Коричневый");
        Tie tie = new Tie(Size.XXS, 800, "Зеленый");

        WomenClothing[] womenClothes = {tshirtWomen, trousersWomen, skirt};
        MenClothing[] menClothes = {tshirtMen, trousersMen, tie};

        Atelier atelier = new Atelier();
        atelier.dressWoman(womenClothes);
        atelier.dressMan(menClothes);
    }
}