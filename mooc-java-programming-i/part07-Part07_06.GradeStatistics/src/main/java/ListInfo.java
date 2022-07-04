
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laurie
 */
public class ListInfo {
    
    private ArrayList<Integer> grades;
    
    public ListInfo(GradeList grades) {
        this.grades = grades.getGrades();
    }
    
    public void average() {
        int sum = 0;
        for (int i : grades) {
            sum += i;
        }
        double average = (double)sum / grades.size();
        System.out.println("Point average (all): " + average);
    }
    
    public void passingAverage() {
        int sum = 0;
        int count = 0;
        for (int i : grades) {
            if (i >= 50) {
                sum += i;
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Point average (passing): -");
        } else {
            double average = (double)sum / count;
            System.out.println("Point average (passing): " + average);
        }
    }
    
    public void passPercentage() {
        int count = 0;
        for (int i : grades) {
            if (i >= 50) {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Pass percentage: -");
        } else {
            double average = 100.00 * count / grades.size();
            System.out.println("Pass percentage: " + average);
        }
    }
    
    public void gradeDistribution() {
        int[] distro = new int[6];
        for (int i : grades) {
            if (i < 50) {
                distro[0]++;
            } else if(i < 60) {
                distro[1]++;
            } else if (i < 70) {
                distro[2]++;
            } else if(i < 80) {
                distro[3]++;
            } else if(i < 90) {
                distro[4]++;
            } else if(i <= 100) {
                distro[5]++;
            }
        }
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < distro[i]; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
