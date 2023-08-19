import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int mathMarks, chemistryMarks, physicsMarks, computerMarks = 0;
        int percentage = 0; //absolute value
        double totalMarks = 0;
        double helperVar = 0.0;
        Scanner scn = new Scanner(System.in);
        System.out.print("Math Marks out of 100: ");
        mathMarks = scn.nextInt();
        mathMarks = mathMarks >= 0 && mathMarks <= 100 ? mathMarks : 0;
        System.out.print("Physics Marks out of 100: ");
        physicsMarks = scn.nextInt();
        physicsMarks = physicsMarks >= 0 && physicsMarks <= 100 ? physicsMarks : 0;
        System.out.print("Chemistry Marks out of 100: ");
        chemistryMarks = scn.nextInt();
        chemistryMarks = chemistryMarks >= 0 && chemistryMarks <= 100 ? chemistryMarks : 0;
        System.out.print("Computer Marks out of 100: ");
        computerMarks = scn.nextInt();
        computerMarks = computerMarks >= 0 && computerMarks <= 100 ? computerMarks : 0;
        totalMarks = mathMarks + physicsMarks + computerMarks + chemistryMarks;
        helperVar = (totalMarks / 400.00) * 100;
        percentage = (int) helperVar;
        if(percentage <= 100 && percentage >= 86){
            System.out.println("Grade A");
        }
        else if(percentage >= 82 && percentage <= 85){
            System.out.println("Grade A-");
        }
        else if(percentage >= 79 && percentage <= 81){
            System.out.println("Grade B+");
        }
        else if(percentage >= 76 && percentage <= 78){
            System.out.println("Grade B");
        }
        else if(percentage >= 73 && percentage <= 75){
            System.out.println("Grade B-");
        }
        else if(percentage >= 70 && percentage <= 72){
            System.out.println("Grade C+");
        }
        else if(percentage >= 67 && percentage <= 69){
            System.out.println("Grade C");
        }
        else if(percentage >= 64 && percentage <= 66){
            System.out.println("Grade C-");
        }
        else if(percentage >= 60 && percentage <= 63){
            System.out.println("Grade D+");
        }
        else if(percentage >= 55 && percentage <= 59){
            System.out.println("Grade D");
        }
        else if(percentage >= 50 && percentage <= 54){
            System.out.println("Grade D+");
        }
        else{
            System.out.println("Grade F");
        }
    }
}