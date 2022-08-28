
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        System.out.println("Input numbers, type \"end\" to stop.");
        
        ArrayList<Integer> numList = new ArrayList<>();
        
        while(true) {
            String input = scanner.nextLine();
            if (input.equals("end")) {
                System.out.println("");
                break;
            }
            numList.add(Integer.parseInt(input));
        }
        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();
        if (input.equals("p")) {
            averageOfPositive(numList);
        } else if (input.equals("n")) {
            averageOfNegative(numList);
        }
    }
    
    public static void averageOfPositive(ArrayList<Integer> list) {
        double average = list.stream().filter(num -> num > 0).mapToDouble(num -> num.doubleValue()).average().getAsDouble();
        System.out.println("Average of the negative numbers: " + average);
    }
    
    public static void averageOfNegative(ArrayList<Integer> list) {
        double average = list.stream().filter(num -> num < 0).mapToDouble(num -> num.doubleValue()).average().getAsDouble();
        System.out.println("Average of the negative numbers: " + average);
    }
}
