
import java.util.ArrayList;
import java.util.Scanner;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        ArrayList<Integer> num = new ArrayList<>();
        
        while(true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input < 0) {
                break;
            }
            num.add(input);
        }
        
        num.stream().filter(value -> value > 0 && value <= 5).forEach(System.out::println);
    }
}
