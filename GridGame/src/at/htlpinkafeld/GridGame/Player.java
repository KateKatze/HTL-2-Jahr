package at.htlpinkafeld.GridGame;
import at.htlpinkafeld.board.Symbol;
import java.util.Scanner;

import static java.lang.String.valueOf;

public class Player {
    /**
     * Stores all possible winning combinations of field numbers
     */
    private static int[][] winCombos = {
            {1, 2, 3}, {4, 5, 6}, {7, 8, 9},
            {1, 4, 7}, {2, 5, 8}, {3, 6, 9},
            {1, 5, 9}, {3, 5, 7}
    };
    private String name;       //name of player
    private Symbol sym;        //the players board-symbol
    private int[] moveList;    //moves made; Content: Field numbers (1-9)

    private int numberOfMoves; //Use this as index for moveList


    public Player(String name, Symbol sym) {
        this.name = name;
        this.sym = sym;
        this.numberOfMoves = 0;
        moveList = new int[5]; //for maximum number of moves,
    }

    /**
     * deletes the moveList (set numberOfMoves to 0)
     */
    public void resetMoveList(){
        this.numberOfMoves = 0;
        moveList = new int[5];
    }


    /**
     * insert a move into the moveList (increase numberOfMoves)
     */
    public void setMove(int move){
        moveList[this.numberOfMoves] = move;
        this.numberOfMoves++;
    }

    public int getNumberOfMoves(){
        return numberOfMoves;
    }

    public String getName() {
        Scanner namePlayer = new Scanner(System.in);
        String name = valueOf(namePlayer);
        return name;
    }

    public Symbol getSym() {
        return sym;
    }

    /**
     * Queries if the moveList contains one of the 8 3-int winCombos
     * if a combo is found this player is the winner
     * @return winCombos found or null
     */
    public int[] winComboQuery(){
        if (this.numberOfMoves < 3) {
            return null;
        }
        for (int i = 0; i < winCombos.length; i++) {
            if (checkIfComboWins(winCombos[i])) {
                return winCombos[i];
            }
        }
        return null;
    }

    private boolean checkIfComboWins(int[] combo) {

        int movesInCombo = 0;
        for (int i = 0; i < numberOfMoves; i++) {
            for (int j = 0; j < 3; j++) {
                if (moveList[i] == combo[j]) {
                    movesInCombo++;
                }
            }

        }
        if (movesInCombo == 3) {
            return true;
        }
        return false;
    }

    /**
     * checks if a move is in the moveList
     * @param move
     * @return true if moveList contains move
     */
    public boolean inMoveList(int move) {
        boolean found = false;
        for (int i = 0; i < numberOfMoves; i++) {
            if (moveList[i] == move) {
                found = true;
            }
        }
        return found;
    }

    /**
     * recommende private helper-function
     * check if a winCombo is found in moveList
     * use inMoveList() function
     * @param winCombo
     * @return true if all numbers of the combo are found in the moveList
     */
    private boolean comboInMoveList(int[] winCombo) {
        return true;
    }
}
