import java.util.Scanner;

public class currency {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value1 = 0.00, value2 = 0.00;
        String currency;

        System.out.print("Enter a value: ");
        value1 = input.nextDouble();
        System.out.print("USD or EUR: ");
        currency = input.nextLine();


        if(currency.equals("USD")){
            value2 = value1 * 0.734878047;
            System.out.println(value1 + "USD = " + value2 + " EUR. (Conversion rate: 1 USD = 0.734878047 EUR)");
        } else if (currency.equals("EUR")) {
            value2 = value1 * 1.36077;
            System.out.println(value1 + "EUR = " + value2 + " USD. (Conversion rate: 1 EUR = 1.36077 USD)");
        } else {
            System.out.println("Conversion rate: 1 USD = 0.734878047 EUR"
            + "\nConversion rate: 1 EUR = 1.36077 USD");
        }

        input.close();

    }

}