public class TICTACTOE{


    static char[][] board = {
            {'-', '-', '-'},
            {'-', '-', '-'},
            {'-', '-', '-'}
    };
    public static void main(String[] args) {


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
}