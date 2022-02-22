
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        /*
        The answer was given in the material. I'll use a for loop instead.
        */
        for (int i = 0; i < number; i++) {
            //Rememeber we dont want a print line. The stars must be on the same 
            //line
            System.out.print("*");
        }
        //The line break prints after the stars.
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        /*
        The answer was given in the material. I'll use a for loop instead.
        */
        for (int i = 0; i < number; i++) {
            //Rememebr we dont want a print line. The blank character must be on 
            //the same line
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        /*
        This one requires a little bit of thought. We need to offset the stars
        so they're right justified. 
        */
        for (int i = 1; i <= size; i++) {
            /*
            Hopefully the logic here makes sense.
            */
            printSpaces(size - i);
            printStars(i);
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        /*
        You can discover the logic for this one by counting the number of stars
        in each row. 1 = 1, 2 = 3, 3 = 5, 4 = 7, 5 = 9, etc. 
        See the pattern? (row * 2) - 1. 
        */
        for (int i = 1; i <= height; i++) {
            printSpaces(height - i);
            printStars((i * 2) - 1);
        }
        /*
        Now to print the base. The first character is always at height - 1
        2 rows by 3 columns
        */
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
