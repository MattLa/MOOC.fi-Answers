/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class Item implements Comparable<Item> {
    
    private String theme;
    private String ageGroup;
    private String gender;
    private String country;
    private String year;
    private double literacyPercent;
    
    public Item(String theme, String ageGroup, String gender, String country, String year, double literacyPercent) {
        this.theme = theme;
        this.ageGroup = ageGroup;
        this.gender = gender.substring(0, gender.lastIndexOf(" ")).trim();
        this.country = country;
        this.year = year;
        this.literacyPercent = literacyPercent;
    }
    
    @Override
    public String toString() {
        return country + " (" + year + "), " + gender + ", " + literacyPercent;
    }

    @Override
    public int compareTo(Item o) {
        if (this.literacyPercent == o.literacyPercent) {
            return 0;
        }
        if (this.literacyPercent > o.literacyPercent) {
            return 1;
        }
        return -1;
    }
    
    
}
