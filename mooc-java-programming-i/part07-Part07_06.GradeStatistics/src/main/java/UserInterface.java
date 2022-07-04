
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class UserInterface {
    
    public GradeList list;
    public Scanner scanner;
    
    public UserInterface(Scanner scanner) {
        list = new GradeList();
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int input = Integer.parseInt(scanner.nextLine());
            if (input == -1) {
                break;
            }
            list.putGrade(input);
        }
        ListInfo info = new ListInfo(list);
        
        info.average();
        info.passingAverage();
        info.passPercentage();
        info.gradeDistribution();
    }
}
