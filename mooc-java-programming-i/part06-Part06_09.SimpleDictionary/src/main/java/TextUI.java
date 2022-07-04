
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
public class TextUI {
    
    private Scanner sc;
    private SimpleDictionary dictionary;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        sc = scanner;
        this.dictionary = dictionary;
    }
    
    /**
     * 
    The method asks the user for a command

    If the command is end, the UI prints the string "Bye bye!" and the execution 
    of the start method ends.

    Otherwise the text UI prints the message Unknown command and asks for a new 
    command, so it loops back to step 1.

     */
    public void start() {
        String command = "";
        while (true) {
            System.out.print("Command: ");
            command = sc.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                addWordToDictionary();
            } else if (command.equals("search")) {
                searchDictionary();
            } else {
                System.out.println("Unknown command");
            }
        }
    }
    
    /**
     * Asks the user for a word and its translation. 
     * Then adds the word and its translation to the dictionary
     */
    private void addWordToDictionary() {
        System.out.print("Word: ");
        String word = sc.nextLine();
        System.out.println("Translation: ");
        String translation = sc.nextLine();
        
        dictionary.add(word, translation);
    }
    
    private void searchDictionary() {
        System.out.print("To be translated: ");
        String word = sc.nextLine();
        String translation = dictionary.translate(word);
        if (translation == null) {
            System.out.println("Word " + word + " was not found");
        } else {
            System.out.println("Translation: " + translation);
        }
    }
}
