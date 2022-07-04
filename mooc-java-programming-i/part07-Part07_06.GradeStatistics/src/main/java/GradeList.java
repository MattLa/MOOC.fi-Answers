
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *This class will contain the grades given in an ArrayList. This class 
 * exclusively deals with functions you expect of a list. Storing and returning
 * values. 
 * @author laurie
 */
public class GradeList {
    
    private ArrayList<Integer> grades;
    
    public GradeList() {
        grades = new ArrayList<>();
    }
    
    /**
     * A function used to get a list containing the grades that have been submitted
     * @return ArrayList containing all the grades
     */
    public ArrayList<Integer> getGrades() {
        return grades;
    }
    
    /**
     * Add a grade to the list. Only grades between 0-100 will be accepted.
     * @param grade The grade to be added to the list. 
     */
    public void putGrade(int grade) {
        if (grade >= 0 && grade <= 100) {
            grades.add(grade);
        }
    }
}
