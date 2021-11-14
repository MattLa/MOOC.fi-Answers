
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*
        Get the grade from the user. The grades are as follows
        < 0	impossible!
        0-49	failed
        50-59	1
        60-69	2
        70-79	3
        80-89	4
        90-100	5
        > 100	incredible!
        */
        String grade = "";
        System.out.println("Give points [0-100]:");
        int score = Integer.valueOf(scan.nextLine());
        
        /*
        Cascading if starting at the lowest grade first. Done this way to avoid
        typing a bunch of expression && expression checks. 
        
        Used a String variable to store the grade so I only had to type out a 
        single println. 
        */
        if (score < 0) {
            grade = "impossible!";
        } else if (score < 50) {
            grade = "failed";
        } else if (score < 60) {
            grade = "1";
        } else if (score < 70) {
            grade = "2";
        } else if (score < 80) {
            grade = "3";
        } else if (score < 90) {
            grade = "4";
        } else if (score <= 100) {
            grade = "5";
        } else {
            grade = "incredible!";
        }
        
        //Concatenate the grade variable to the print statement.
        System.out.println("Grade: " + grade);
    }
}
