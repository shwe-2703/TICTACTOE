public class TICTACTOE{



    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };
    public static void main(String[] args) {

import java.util.Random;

import java.util.Scanner;


public class TICTACTOE {

    static char[][] board = new char[3][3];

    static char userSymbol;
    static char computerSymbol;
    static char currentPlayer;

    public static void main(String[] args) {
        initializeBoard();
        toss();
        printBoard();

        int slot = getUserInput();
        System.out.println("You selected: " + slot);
    }



        System.out.println(isValidMove(1, 1)); // true
        System.out.println(isValidMove(3, 0)); // false (out of bounds)

        board[1][1] = 'X';
        System.out.println(isValidMove(1, 1)); // false (already occupied)
    }

    static boolean isValidMove(int row, int col) {


        if (row < 0 || row > 2 || col < 0 || col > 2) {
            return false;
        }

        if (board[row][col] != '-') {
            return false;
        }

        return true;
    }


    public static void toss() {
        Random rand = new Random();

        int tossResult = rand.nextInt(2);

        int tossResult = rand.nextInt(2); // 0 or 1


        if (tossResult == 0) {
            userSymbol = 'X';
            computerSymbol = 'O';
            currentPlayer = userSymbol;
            System.out.println("User won the toss and plays first with X");
        } else {
            userSymbol = 'O';
            computerSymbol = 'X';
            currentPlayer = computerSymbol;
            System.out.println("Computer won the toss and plays first with X");
        }
    }



    public static int getUserInput() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter slot number (1-9): ");
        int slot = sc.nextInt();

        return slot;
    }

}