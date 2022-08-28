/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class Book {
    
    private String name;
    private int ageRecommendation;
    
    public Book(String name, int ageRecommendation) {
        this.name = name;
        this.ageRecommendation = ageRecommendation;
    }
    
    public int getAge() {
        return ageRecommendation;
    }
    public String getName() {
        return name;
    }
    
    @Override
    public String toString() {
        return name + " (recommended for " + ageRecommendation + " year-olds or older)";
    }
}
