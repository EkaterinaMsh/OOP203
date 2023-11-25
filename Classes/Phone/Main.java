public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("12345678", "Samsung", 0.5);
        Phone phone2 = new Phone("87654321", "Xiaomi", 0.3);
        Phone phone3 = new Phone("13579246", "iPhone",0.7);

        System.out.println("Phone 1:" + phone1.getNumber() + "," + phone1.getModel() + "," + phone1.getWeight());
        System.out.println("Phone 2:" + phone2.getNumber() + "," + phone2.getModel() + "," + phone2.getWeight());
        System.out.println("Phone 1:" + phone3.getNumber() + "," + phone3.getModel() + "," + phone3.getWeight());

        phone1.receiveCall("Mia", "56895421");
        phone2.receiveCall("Alex", "88888888");
        phone3.receiveCall("55555555");

        phone1.sendMessage("77777777", "11111111", "587624513", "22222222", "6598894516", "33333333");
    }
}