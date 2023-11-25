import java.util.Arrays;
public class Phone {
        private String number;
        private String model;
        private double weight;

        public Phone (String number, String model, double weight) {
            this.number = number;
            this.model = model;
            this.weight = weight;
        }

        public String getNumber() {
            return number;
        }

        public void receiveCall(String callerName) {
            System.out.println("Звонит " + callerName);
        }

        public void receiveCall(String callerName, String callerNumber) {
            System.out.println("Звонит " + callerName + " с номера " + callerNumber);
        }
        public void sendMessage(String... phoneNumbers) {
            System.out.println("Отправлено сообщение на следующие номера: " + Arrays.toString(phoneNumbers));
        }

        public String getModel() {
            return model;
        }

        public double getWeight() {
            return weight;
        }

        public void setNumber(String number) {
            this.number = number;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setWeight(double weight) {
            this.weight = weight;
        }

        public Phone() {
        }
}
