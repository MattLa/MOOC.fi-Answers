
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> wordList = new ArrayList<>();
        
        while(true) {
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                System.out.println("");
                break;
            }
            wordList.add(input);
        }
        wordList.stream().forEach(System.out::println);
    }
}
