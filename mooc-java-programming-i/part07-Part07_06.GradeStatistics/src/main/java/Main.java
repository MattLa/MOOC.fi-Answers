/*
In this exercise we create a program for printing statistics for points in course. 
The program receives points (integers from zero to one hundred) as input, based 
on which it prints statistics about grades. Reading of input stops when the user 
enters the number -1. Numbers that are not within the interval [0-100] should not 
be taken into account when calculating the statistics.
*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        
        UserInterface ui = new UserInterface(scanner);
        ui.start();
    }
    
    
}
