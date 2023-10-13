import java.util.Scanner;
import java.util.Random;

public class Lecture3BUpdate {
    public static void main(String[] args) {
        //initialize a scanner
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        //initialize the different costumes
        String costume1 = "Spiderman";
        String costume2 = "Ghost Face";
        String costume3 = "Walter White ";
        
        //print out question 1
        //use ints to make it simpler
        System.out.println("What is your favorite color?");
        System.out.println("1. Green");
        System.out.println("2. Blue");
        System.out.println("3. Black");
        
        //get the user choice
        int choice1 = input.nextInt();
        
        //print out question 2
        System.out.println("What is your favorite movie or TV show?");
        System.out.println("1. Spiderman");
        System.out.println("2. Scream");
        System.out.println("3. Breaking Bad");
        
        //get the user choice
        int choice2 = input.nextInt();
        
        //print out question 3
        System.out.println("What is your favorite food?");
        System.out.println("1. Pizza");
        System.out.println("2. Spaghetti");
        System.out.println("3. Chicken and rock candy");
        
        //get the user choice
        int choice3 = input.nextInt();
        
        /**************************************************/
        
        //determine the costume
        //strategy: sum up the results for each costume
        //Get the highest sum, which relates to the winner
        //If there is a tie, pick one at random
        
        int c1Score = 0;
        int c2Score = 0;
        int c3Score = 0;
        
        //Question 1: if statement
        if(choice1 == 1){
            c1Score++;
        } else if(choice1 == 3) {
            c3Score++;
        } else if(choice1 == 2){
            c2Score++;
        } else {
            System.out.println("Wrong answer");
        }
        
        //switch statement
        switch(choice2) {
            case 1:
                c1Score++;
                break;
            case 2:
                c3Score++;
                break;
            case 3:
                c2Score++;
                break;
            default:
                System.out.println("Wrong answer");
        }
        
        //question 3
                switch(choice3) {
            case 1:
                c1Score++;
                break;
            case 2:
                c3Score++;
                break;
            case 3:
                c2Score++;
                break;
            default:
                System.out.println("Wrong answer");
        }
        
        String winner = "";
        int randNum = 0;
        //determine the winner
        if(c1Score > c2Score && c1Score > c3Score) {
            winner = costume1;
        } else if (c2Score > c3Score) {
            winner = costume2;
        } else if (c3Score > c2Score && c3Score > c1Score) {
            winner = costume3;
        } else {
            randNum = rand.nextInt(3)+1;
            
            if(randNum == 1){
                winner = costume1;
            } else if (randNum == 2) {
                winner = costume2;
            } else {
                winner = costume3;
            }
        }
        
        //print out costume result
        System.out.printf("You should be %s ", winner);
        System.out.println("You should be " + winner); //alternative verson

        
        
        
        
        
        
        
        
        
        
        
        
    }
}