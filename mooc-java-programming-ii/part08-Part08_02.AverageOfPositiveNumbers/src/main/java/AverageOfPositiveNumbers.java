
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numList = new ArrayList<>();
        
        while (true) {
            int num = Integer.parseInt(scanner.nextLine());
            if(num == 0) {
                break;
            }
            if (num > 0) {
                numList.add(num);
            }
        }
        if (numList.isEmpty()) {
            System.out.println("Cannot calculate the average");
        } else {
            double average = numList.stream().mapToDouble(a -> a).average().getAsDouble();
            System.out.println(average);
        }
    }
}
