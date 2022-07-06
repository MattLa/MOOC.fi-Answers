
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            
            int product = cube(input);
            System.out.println(product);
        }
    }
    
    public static int cube(String number) {
        int num = Integer.parseInt(number);
        return num * num * num;
    }
}
