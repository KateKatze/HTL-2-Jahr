package at.htlpinkafeld.GridGame;
import at.htlpinkafeld.board.*;

import java.awt.*;
import java.util.Scanner;

public class CheckBoard {
    private static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        int field;
        Symbol p1Symbol = new CircleSymbol(Color.RED, false, 4);
        Symbol p2Symbol = new CrossSymbol(Color.BLUE, 5);

        GridDefinition gd = new GridDefinition(3,3);
        GameBoard board = new GameBoard("Board check!", gd);
        board.setBackgroundSymbol(new NumberingSymbol(1));
        board.draw();

        System.out.print("Next move: ");
        field=in.nextInt();
        board.setGridCell((field-1)/3, (field-1)%3, p1Symbol);
        board.draw();

        System.out.print("Next move: ");
        field=in.nextInt();
        board.setGridCell((field-1)/3, (field-1)%3, p2Symbol);
        board.draw();

        System.out.print("Next move: ");
        field=in.nextInt();
        board.setGridCell((field-1)/3, (field-1)%3, p1Symbol);
        board.draw();

        System.out.print("Next move: ");
        field=in.nextInt();
        board.setGridCell((field-1)/3, (field-1)%3, p2Symbol);
        board.draw();

        System.out.print("Next move: ");
        field=in.nextInt();
        board.setGridCell((field-1)/3, (field-1)%3, p1Symbol);
        board.draw();

        System.out.print("Next move: ");
        field=in.nextInt();
        board.setGridCell((field-1)/3, (field-1)%3, p2Symbol);
        board.draw();

        System.out.println("Hilite field 6 (row=1, col=2)");
        board.setHiliteCell(1, 2);
        board.draw();
    }
}
