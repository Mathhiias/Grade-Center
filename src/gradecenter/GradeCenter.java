/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradecenter;
import java.util.Scanner;
/**
 *
 * @author mathi
 */
public class GradeCenter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     Scanner keyboard = null;
     char grade;
      double grade1 = getGrade();
      double testScore = grade1;
      gradeLetter(testScore);
      char grade1L = gradeLetter(testScore);
      
      
      double grade2 = getGrade();
      testScore = grade2;
      gradeLetter(testScore);
      char grade2L = gradeLetter(testScore);
      
      
      double grade3 = getGrade();
      testScore = grade3;
      gradeLetter(testScore);
      char grade3L = gradeLetter(testScore);
      
      
      double grade4 = getGrade();
      testScore = grade4;
      gradeLetter(testScore);
      char grade4L = gradeLetter(testScore);
      
      
      double grade5 = getGrade();
      testScore = grade5;
      gradeLetter(testScore);
      char grade5L = gradeLetter(testScore);
      
      double avgScore = ((grade1 + grade2 + grade3 + grade4 + grade5)/5);
      testScore = avgScore;
      gradeLetter(testScore);
      char avgScoreL = gradeLetter(testScore);
      
      System.out.printf("First course mark: %.0f, letter mark is %c.%n", grade1, grade1L);
      System.out.printf("Second course mark: %.0f, letter mark is %c.%n", grade2, grade2L);
      System.out.printf("Third course mark: %.0f, letter mark is %c.%n", grade3, grade3L);
      System.out.printf("Fourth course mark: %.0f, letter mark is %c.%n", grade4, grade4L);
      System.out.printf("Fifth course mark: %.0f, letter mark is %c.%n", grade5, grade5L);
      System.out.printf("Overall average: %.1f, letter mark is %c.%n", avgScore, avgScoreL);
     
    }
    
    /**
     *
     * @param testScore
     * @return
     */
    public static char gradeLetter(double testScore){ 
        char grade = 0;
        if (testScore >= 80 && testScore <= 100) {
            grade = 'A';
            
        } else if (testScore <= 79 && testScore >= 70) {
            grade = 'B';
            
        } else if (testScore <= 69 && testScore >= 60) {
            grade = 'C';
            
        } else if (testScore <= 59 && testScore >= 50) {
            grade = 'D';
            
        } else if (testScore <= 49 && testScore >= 0){
            grade = 'F';
        }
        
        return grade;
    }

    private static double getGrade() {
      System.out.printf("Enter a grade: ");
      Scanner keyboard = new Scanner(System.in);
      int newGrade = keyboard.nextInt();
      return newGrade;
    }

    
}
