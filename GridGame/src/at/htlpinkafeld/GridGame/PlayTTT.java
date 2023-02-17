package at.htlpinkafeld.GridGame;

import at.htlpinkafeld.board.CircleSymbol;
import at.htlpinkafeld.board.CrossSymbol;

import java.awt.*;
import java.util.Scanner;

public class PlayTTT {
    private static Scanner in = new Scanner(System.in);
    //use the Scanner in to read a int from the console
    //repeats input if an exception is thrown because of
    //invalid (non int) input
    private static int readIntSave() {
        int a = in.nextInt();
        return a;
    }

    public static void main(String[] args) {
        Player winner, actPlayer;
        Player player1 = new Player("Georg (green circle)",
                new CircleSymbol(Color.GREEN, false, 4));
        Player player2 = new Player("Susanne (blue cross)",
                new CrossSymbol(Color.BLUE, 5));
        int actMove;
        boolean p1Begins=true;
        boolean repeatInput;

        System.out.println("Welcome to TicTacToe!");
        TTTGame game = new TTTGame(player1, player2);
        game.start(p1Begins);
        game.render();
        while( !game.finished() ){
            actPlayer = game.getCurrentPlayer();
            do {
                System.out.print(actPlayer.getName() + ": ");

                //actMove = in.nextInt();  --not save
                //use save int-input instead
                actMove=readIntSave();

                repeatInput = !game.isValidMove(actMove);
                if( repeatInput ){
                    System.out.println("INVALID MOVE. Repeat input!");
                };
            } while ( repeatInput );
            game.doMove(actMove);
            game.render();
        }
        winner = game.getWinner();
        if( winner == null ){
            System.out.println("The game ended in a draw!");
        } else {
            System.out.println(winner.getName() + " has won the game!");
        }
    }
}
