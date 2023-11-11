package ex3.pkg17.rock.paper.scissor.game;

import java.util.Scanner;

public class RockPaperScissorGame {

    public static void main(String[] args) {
        // discrete values as given in the question
        final int STONE = 0;
        final int PAPER = 1;
        final int SCISSOR = 2;
        // generating random numbers
        int compturn = (int) (Math.random() * 3);
        // We want to print string so we convert the random number into string

        String compchoice = "";

        // switch case use as there is discrete values
        switch (compturn) {
            case STONE:
                compchoice = "stone";
                break;
            case PAPER:
                compchoice = "paper";
                break;
            case SCISSOR:
                compchoice = "scissor";
                break;

        }
        System.out.print("please chose 0 stone, 1 paper, 2 scissor > ");
        Scanner input = new Scanner(System.in);

        int humanturn = input.nextInt();

        String humanchoice = "";

        switch (humanturn) {
            case STONE:
                humanchoice = "stone";
                break;
            case PAPER:
                humanchoice = "paper";
                break;
            case SCISSOR:
                humanchoice = "scissor";
                break;

            default:
                System.out.println("please chose between the range");

        }
        // System.out.println("computer chose " + compchoice + " human chose " +
        // humanchoice);
        String result = "";

        // game logic
        if (humanchoice == compchoice) {
            result = "It's a draw";
        } else {

            if ((compturn == STONE && humanturn == SCISSOR)
                    || (compturn == PAPER && humanturn == STONE)
                    || (compturn == SCISSOR && humanturn == PAPER)) {
                result = " Computer wins";

            } else if ((humanturn == STONE && compturn == SCISSOR)
                    || (humanturn == PAPER && compturn == STONE)
                    || (humanturn == SCISSOR && compturn == PAPER)) {
                result = " human wins";

            }
        }

        System.out.println("computer chose " + compchoice + " human chose " + humanchoice + " the result is " + result);
    }

}
