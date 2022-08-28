
import java.util.Random;

public class Die {

    private Random random;
    private int numberOfFaces;

    /*
    Modify the class, such that the constructor Die(int numberOfFaces) creates a 
    new die-object with the given number of faces (i.e. the number of "sides" 
    with a number).
    */
    public Die(int numberOfFaces) {
        this.random = new Random();
        // Initialize the value of numberOfFaces here
        this.numberOfFaces = numberOfFaces;
    }

    public int throwDie() {
        // generate a random number which may be any number
        // between one and the number of faces, and then return it
        
        return random.nextInt(numberOfFaces) + 1;
    }
}
