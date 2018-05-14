package Exercise;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CaschExchanger {
    public static final double[] ZLOTY = {200.00, 100.00, 50.00, 20.00, 10.00, 5.00, 2.00, 1.00, 0.5, 0.2, 0.1, 0.05, 0.02, 0.01};

    public static void main(String[] args) {
        caschCalc(1764.54);
    }

    //dokończyć
    public static void caschCalc(double amount) {

        for (int i = 0; i < ZLOTY.length - 2; i++) {
            double billNumber = Math.floor(amount / ZLOTY[i]);
            double remain = amount - (billNumber * ZLOTY[i]);
            System.out.println("nominał " + ZLOTY[i] + " x " + billNumber + " szt reszta: " + remain);
            amount = remain;
        }
        for (int i = ZLOTY.length - 2; i < ZLOTY.length; i++) {
            amount = amount;
            double coinNumber = (amount * 100) / (100 * ZLOTY[i]);
            double remain = amount - (coinNumber * ZLOTY[i]);
            System.out.println("nominał " + ZLOTY[i] + " x " + Math.ceil(coinNumber) + " szt reszta: " + remain);
            amount = remain;
        }

    }
}
