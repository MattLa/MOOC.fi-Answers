import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            if (name.isEmpty()) {
                System.out.println("");
                break;
            }
            
            System.out.print("Duration: ");
            int length = Integer.parseInt(scanner.nextLine());
            
            programs.add(new TelevisionProgram(name, length));
            
        }
        System.out.print("Program's maximum duration: ");
        int length = Integer.parseInt(scanner.nextLine());
        
        for (TelevisionProgram t : programs) {
            if (t.getDuration() <= length) {
                System.out.println(t);
            }
        }
    }
}
