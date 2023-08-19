import java.util.Scanner;
import java.util.Random;
import java.lang.Math;

public class Main{
    public static void main(String[] args) {
        int randomNumber,predictedNumber, score = 0;
        Random rand = new Random();
        Scanner scn = new Scanner(System.in);
        System.out.print("Hi User! What is your name? ");
        String name = scn.nextLine();
        System.out.println(name + " You have three rounds to guess number");
        for(int i = 0; i < 3; i++){
            System.out.println("Round " + (i+1) + " Starts");
            randomNumber = rand.nextInt(99) + 1;
            System.out.print("Number between 1 to 100: ");
            predictedNumber = scn.nextInt();
            if (randomNumber == predictedNumber) {
                System.out.println("Correct");
                score+=1;
            }
            else if(Math.abs(predictedNumber - randomNumber) <= 50){
                System.out.println("Too High");
            }
            else if(Math.abs(predictedNumber - randomNumber) > 50){
                System.out.println("Too Low");
            }
        }
        System.out.println(name+" Your Score is " +score + " Thank You for playing it");
    }
}