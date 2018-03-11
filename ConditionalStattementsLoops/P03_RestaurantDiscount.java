import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P03_RestaurantDiscount {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int quantity = Integer.parseInt(reader.readLine());
        String packageType = reader.readLine();

        double discount = 0;
        int price = 0;
        String hall = "";
        if (quantity <= 120) {
            if (quantity <= 50) {
                hall = "Small Hall";
                price = 2500;
                if ("Normal".equals(packageType)) {
                    price += 500;
                    discount = 0.05;
                } else if ("Gold".equals(packageType)) {
                    price += 750;
                    discount = 0.1;
                } else if ("Platinum".equals(packageType)) {
                    price += 1000;
                    discount = 0.15;
                }
            } else if (quantity <= 100) {
                hall = "Terrace";
                price = 5000;
                if ("Normal".equals(packageType)) {
                    price += 500;
                    discount = 0.05;
                } else if ("Gold".equals(packageType)) {
                    price += 750;
                    discount = 0.1;
                } else if ("Platinum".equals(packageType)) {
                    price += 1000;
                    discount = 0.15;
                }
            } else {
                hall = "Great Hall";
                price = 7500;
                if ("Normal".equals(packageType)) {
                    price += 500;
                    discount = 0.05;
                } else if ("Gold".equals(packageType)) {
                    price += 750;
                    discount = 0.1;
                } else if ("Platinum".equals(packageType)) {
                    price += 1000;
                    discount = 0.15;
                }
            }
            double priseWithoutDiscount = price - (price * discount);
            double perPerson = priseWithoutDiscount / quantity;

            System.out.printf("We can offer you the %s%n", hall);
            System.out.printf("The price per person is %.2f$", perPerson);
        } else {
            System.out.println("We do not have an appropriate hall.");
        }
    }
}