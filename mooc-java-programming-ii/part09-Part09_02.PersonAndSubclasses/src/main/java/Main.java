
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        // write your test code here
    }

    public static void printPersons(ArrayList<Person> list) {
        list.stream().forEach(item -> System.out.println(item));
    }
}
