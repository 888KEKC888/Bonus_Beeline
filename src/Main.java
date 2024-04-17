public class Main {
    public static void main(String[] args) {
       int Check;                                                               // Объявляете переменные для входных данных и
       int Payment;                                                             // параметров программы: начального счёта,
       int Bonus;

       Check = 211;
       Payment = 1500;                                                          // суммы пополнения и тп

        if (Payment >= 1000)
        {                                                                       // Условным оператором проверяете, превысила ли
            Bonus = Payment / 100 + Payment + Check;                            // сумма пополнения порог, и для этих двух разных
            System.out.println("Счет пополнен, на счету: " + Bonus + " руб.");  // сценариев рассчитываете сумму бонуса и выводите

        }else                                                                   // на экран.
        {
            Bonus = Check+Payment;
            System.out.println("Счет пополнен, на счету: " + Bonus + " руб.");
        }
        }
    }
