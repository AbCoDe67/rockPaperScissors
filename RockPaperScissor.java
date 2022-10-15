
import java.util.Scanner;

public class RockPaperScissor {
    public static void main(String[] args) {

        System.out.println("Hello !!");
        System.out.println("Please Enter Your Move: ");

        Scanner myMove = new Scanner(System.in);

        // if user wants to quit the game

        while (true){

            String inputUser = myMove.nextLine();

            // This code is for quit the game
            if (inputUser.equals("quit")){
                break;
            }

            if (!inputUser.equals("Rock") && !inputUser.equals("Scissors") && !inputUser.equals("Paper")){
                System.out.println("Your move is not valid !");
            }
            else {
                //randomly generated my move

                int number = (int)(Math.random() * 3);

                String opponentMove = "";

                if(number == 0){
                    opponentMove = "Rock";
                }
                else if(number == 1){
                    opponentMove = "Scissors";
                }
                else {
                    opponentMove ="Paper";
                }
                System.out.println("The Opponent Move Is: " + opponentMove);

                if (inputUser.equals(opponentMove)){
                    System.out.println("The Result is Tied !");
                }
                else if((inputUser.equals("Rock") && opponentMove.equals("Scissors")) || (inputUser.equals("Scissors") && opponentMove.equals("Paper")) || (inputUser.equals("Paper") && opponentMove.equals("Rock"))){
                    System.out.println("Hurre..You Have Won the Game !!");
                }
                else {
                    System.out.println("Oho.. You Lost !!");
                }
            }

        }
        System.out.println("Thanks for playing This Game !!");


        // let see the tie condition



    }
}
