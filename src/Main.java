public class Main {
    public static void main(String[] args) {
        int check = 211;
        int payment = 1001;
        int bonus;


        if (payment > 1000) {
            bonus = payment / 100 + payment + check;
            System.out.println("Счет пополнен, на счету: " + bonus + " руб.");

        } else {
            bonus = check + payment;
            System.out.println("Счет пополнен, на счету: " + bonus + " руб.");
        }
    }
}
