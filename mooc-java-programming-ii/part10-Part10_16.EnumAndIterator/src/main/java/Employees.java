
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Make a class Employees. Employees -object contains a list of Person -objects. 
 * The class has a constructor which takes no parameters.
 * @author laurie
 */
public class Employees {
    
    private List<Person> employeeList;
    
    public Employees() {
        this.employeeList = new ArrayList<>();
    }
    
    /**
     * adds the given person to the employees list
     * @param personToAdd 
     */
    public void add(Person personToAdd) {
        employeeList.add(personToAdd);
    }
    
    /**
     * adds the given list of people to the employees list
     * @param peopleToAdd 
     */
    public void add(List<Person> peopleToAdd) {
        for (Person p : peopleToAdd) {
            employeeList.add(p);
        }
    }
    
    /**
     * prints all employees
     */
    public void print() {
        for (Person p : employeeList) {
            System.out.println(p);
        }
    }
    
    /**
     * prints the employees whose education matches the education given as a 
     * parameter.
     * @param education 
     */
    public void print(Education education) {
        Iterator<Person> iterator = employeeList.iterator();
        while(iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getEducation() == education) {
                System.out.println(p);
            }
        }
    }
    
    /**
     * The method removes all employees whose education matches the education 
     * given as parameter from the employees list.
     * @param education 
     */
    public void fire(Education education) {
        Iterator<Person> iterator = employeeList.iterator();
        while(iterator.hasNext()) {
            Person p = iterator.next();
            if (p.getEducation() == education) {
                iterator.remove();
            }
        }
    }
}
