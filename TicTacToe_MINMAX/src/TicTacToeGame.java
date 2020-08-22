import java.util.Scanner;

public class TicTacToeGame {
    public static void main(String[] args) {
        BoardGame board = new BoardGame();
        int turnCount = 0;
        String user = " ";

        board.printBoard();

        while (board.win.gameOn != false) {
            Scanner scan = new Scanner(System.in);
            turnCount++;

            // swtich role
            if (turnCount %2 != 0){
                user = "X Turn";
            }else {
                user = "O Turn";
            }

            // input user
            System.out.println();
            System.out.print(user + " Pilih kolom tabel dari 1-9 : ");

            int userInput = scan.nextInt();
            System.out.println();

            while (board.win.player1Pos.contains(userInput) || board.win.player2Pos.contains(userInput)){
                System.out.println("Kolom telah terisi, Masukan angka lain");
                userInput = scan.nextInt();
            }

            board.placementX_O(userInput, user);

            board.printBoard();

            String result = board.win.winnerCheck();

            if(result.length() > 0) {
                System.out.println();
                System.out.println(result);
            }
        }
    }
}
