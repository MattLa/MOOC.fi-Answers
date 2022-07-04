
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while(true) {
            String st = scanner.nextLine();
            
            if (st.equals("end")) {
                break;
            }
            int num = Integer.parseInt(st);
            System.out.println(num * num * num);
        }
    }
}
