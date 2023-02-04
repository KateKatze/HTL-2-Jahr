package at.htlpinkafeld.GridGame;

import at.htlpinkafeld.board.GameBoard;

public class TTTGame {
        private Player p1;   //Player1
        private Player p2;   //Player2

        private Player winner;         //reference to the winning player
        private boolean nextMoveForP1; //Is player 1 next to take his turn?
        private GameBoard board;

        /**
         * Creates a TicTacToe game board for two player
         * @param p1 Player1
         * @param p2 Player2
         */
        public TTTGame(Player p1, Player p2) {
            this.p1 = p1;
            this.p2 = p2;
            this.board = createBoard();
        }

        //create the GameBoard and set the background symbol (NumberingSymbol)
        private GameBoard createBoard(){ ... }

        /**
         * Resets the Players move list and the board
         * Reset this.winner (set to null)
         * Define which Player starts the game
         * @param nextMoveForP1 if true Player1 on is on the turn
         */

        public void start(boolean nextMoveForP1){ ...  }


        //draw the board
        public void render(){ ... }

        /**
         * checks if the game is over
         * @return true if there is a winner (this.winner != null) or
         *         number of moves > 8
         */
        public boolean finished() { . . }

        public Player getWinner() { ... }

        /**
         * Player in turn. Use this.nextMoveForP1
         * @return Player
         */
        public Player getCurrentPlayer() {
            return nextMoveForP1 ? p1 : p2;
        }

        /**
         * Checks if the move is valid.
         * @param move Fieldnumber of the move (1-9)
         * @return true if move is valid (not stored in P1's or P2's moveList
         *                                and between 1 and 9)
         */
        public boolean isValidMove(int move) { ... }

        /**
         * Adds the move to the moveList of the currentPlayer
         * Attach the Symbol of the currentPlayer to the corresponding Grid-Cell
         * of the board:   rowIdx = (move-1)/3; colIdx = (move-1)%3;
         * Toggles the currentPlayer (just change this.nextMoveForP1)
         * check if currentPlayer isWinner --> set this.winner to currentPlayer
         *    and hilite the winning combo in the board
         * @param move Fieldnumber of the move (1-9)
         */
        public void doMove(int move) { ... }

        //private helper to calculate row- and column-index from field number
        private int fieldNrToRow(int fNr){ return (fNr-1)/3; }
        private int fieldNrToCol(int fNr){ return (fNr-1)%3; }
}
