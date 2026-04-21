package com.hello;

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


    public static void initializeBoard() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }


    public static void printBoard() {
        System.out.println("Tic-Tac-Toe Board:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


    public static void toss() {
        Random rand = new Random();
        int tossResult = rand.nextInt(2);

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