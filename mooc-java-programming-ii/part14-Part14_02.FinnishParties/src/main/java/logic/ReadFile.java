/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author laurie
 */
public class ReadFile {

    Database database; 
    
    public ReadFile(Database data) {
        database = data;
    }
    
    /**
     * Reads in the political party data from the tsv file. All data stored in an
     * Array which will be passed directly to another method to parse the data
     */
    public void read() {
        //The array that will hold the data temporarily
        String[][] partySupport = new String[8][12];
        int row = 0;
        
        //Read the file given in the question
        try (Scanner sc = new Scanner(Paths.get("partiesdata.tsv"))) {
            
            //while the file has a next line
            while (sc.hasNextLine()) {
                
                //Read in the line and convert it to a string array
                String line = sc.nextLine();
                String[] split = line.split("\t");
                
                //store each array in the 2D array to be read and stored in a 
                //separate ArrayList after
                for (int i = 0; i < 12; i++) {
                    partySupport[row][i] = split[i];
                }
                row++;
            }
            //Store the data
            
            
        } catch (Exception e) {
            System.out.println("Failed: " + e.getMessage());
        }
        storeData(partySupport);
    }
    
    private void storeData(String[][] list) {
        for (int i = 1; i < 8; i++) {
            for (int j = 1; j < 12; j++) {
                String name = list[i][0];
                double support = 0;
                if (list[i][j].equals("-")) {
                    
                } else {
                    support = Double.parseDouble(list[i][j]);
                }
                int year = Integer.parseInt(list[0][j]);
                database.addNew(name, support, year);               
            }
        }
    }
}
