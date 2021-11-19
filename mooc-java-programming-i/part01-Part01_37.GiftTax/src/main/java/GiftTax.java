
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        Value of gift	Tax at the lower limit	Tax rate(%) for exceeding part
        5 000 — 25 000	       100                     8
        25 000 — 55 000	       1 700                   10
        55 000 — 200 000       4 700                    12
        200 000 — 1 000 000    22 100	               15
        1 000 000 —            142 100	               17
        
        Example 6000€ gift implies 180€ of gift tax (100 + (6000-5000) * 0.08), 
        and 75000€ gift implies 7100€ of gift tax (4700 + (75000-55000) * 0.12)
        */
        
        System.out.println("Value of the gift?");
        int value = Integer.valueOf(scan.nextLine());
        double tax = 0.0;
        
        if (value < 5000) {
            tax = 0;
        } else if (value < 25000) {
            tax = (double)100 + (value - 5000) * .08;
        } else if (value < 55000) {
            tax = (double)1700 + (value - 25000) * .10;
        } else if (value < 200000) {
            tax = (double)4700 + (value - 55000) * .12;
        } else if (value < 1000000) {
            tax = (double)22100 + (value - 200000) * .15;
        } else if (value >= 1000000) {
            tax = (double)142100 + (value - 1000000) * .17;
        }
        
        if (tax == 0) {
            System.out.println("No tax!");
        } else {
            System.out.println("Tax: " + tax);
        }
    }
}
