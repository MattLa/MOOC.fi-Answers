
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        /*
        The answer was given in the material. I'll use a for loop instead.
        */
        for (int i = 0; i < number; i++) {
            //Rememebr we dont want a print line. The stars must be on the same line
            System.out.print("*");
        }
        //The line break prints after the stars.
        System.out.println("");
        
    }

    public static void printSquare(int size) {
        // second part of the exercise
        /*
        Use a for loop again. We want to print stars of length = size, size 
        number of times.
        Size defines the number of rows and columns. 
        */
        for (int i = 0; i < size; i++) {
            /*
            It is important we give size as the argument. 
            */
            printStars(size);
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        /*
        This will be much like sqaure except height defines the number of rows
        (or the number of times we execute the loop). And width defines the 
        number of columns(the argument passed to the printStars method)
        */
        for (int i = 0; i < height; i++) {
            printStars(width);
        }
        /*
        This is a very important concept to understand. If you cannot make sense
        of this, you NEED to go back and read the material again.
        */
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        /*
        This one is a littler more tricky. This time we want to print the value 
        of i in the for loop, not the value size. Since i is incrementing
        */
        for (int i = 1; i <= size; i++) {
            /*
            Also notice we start at 1 instead of 0. printStars needs at least
            1 as an argument to print anything.
            */
            printStars(i);
        }
    }
}
