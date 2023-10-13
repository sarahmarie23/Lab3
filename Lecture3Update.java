import java.util.Scanner;
import java.util.Random;

public class Lecture3Update {
    public static void main(String[] args) {
        //initialize a scanner
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        //initialize the different costumes
        String costume1 = "Barbie";
        String costume2 = "Spiderman";
        String costume3 = "Cinderella";
        
        //print out question 1
        //use ints to make it simpler
        System.out.println("What is your favorite color?");
        System.out.println("1. Pink ");
        System.out.println("2. Red");
        System.out.println("3. Blue");
        
        //get the user choice
        int choice1 = input.nextInt();
        
        //print out question 2
        System.out.println("Do you like action movies?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        System.out.println("3. Maybe");
        
        //get the user choice
        int choice2 = input.nextInt();
        
        //print out question 3
        System.out.println("Do you like Barbie dolls?");
        System.out.println("1. YESSS");
        System.out.println("2. No I like action figures");
        System.out.println("3. No not really");
        
        //get the user choice
        int choice3 = input.nextInt();
        
        /**************************************************/
        
        //determine the costume
        //strategy: sum up the results for each costume
        //Find out which costume has the highest score
        //if there is a tie, pick one at random
        //Display result for the user
        
        int c1Score = 0;
        int c2Score = 0;
        int c3Score = 0;
        
        //question 1: if / else if / else 
        
        if(choice1 == 1) {
            c1Score++;
        } else if(choice1 == 2) {
            c2Score++;
        } else if(choice1 == 3) {
            c3Score++;
        } else {
            System.out.println("Invalid response");
        }
        
        //question 2 with a switch statement
        
        switch(choice2) {
            case 1: 
                c1Score++;
                break;
            case 2:
                c2Score++;
                break;
            case 3:
                c3Score++;
                break;
            default:
                System.out.println("Invalid response");
                
        }
        
        //question3
        
        
        String winner = "";
        if(c1Score > c2Score && c1Score > c3Score) {
            winner = costume1; 
            // TODO : finish for c2Score and c3Score
        } else {
            int randNum = rand.nextInt(4)+1;
                if(randNum == 1) {
                    winner = costume1;
                } else if(randNum == 2) {
                    winner = costume2;
                } else {
                    winner = costume3;
                }
        }
        
        System.out.printf("You should be %s",  winner);
        

        
    
        
        
        
        
        
        
        
        
        
        
        
        
        
        

        
    }
}