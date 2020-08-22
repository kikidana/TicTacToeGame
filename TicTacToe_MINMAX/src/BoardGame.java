import java.util.ArrayList;

public class BoardGame {

    WinnerCheck win = new WinnerCheck();

    private char[][] board = {{' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '},
            {'-', '+', '-', '+', '-'},
            {' ', '|', ' ', '|', ' '}};

    public void printBoard(){
        for (char[] row : this.board){
            for (char c : row){
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public void placementX_O(int pos, String user){
        char symbol;

        if (user.equals("X Turn")){
            symbol = 'X';
            win.player1Pos.add(pos);
        }else if (user.equals("O Turn")){
            symbol = 'O';
            win.player2Pos.add(pos);
        }else{
            symbol = ' ';
        }

        switch (pos){
            case 1:
                board[0][0] = symbol;
                break;
            case 2:
                board[0][2] = symbol;
                break;
            case 3:
                board[0][4] = symbol;
                break;
            case 4:
                board[2][0] = symbol;
                break;
            case 5:
                board[2][2] = symbol;
                break;
            case 6:
                board[2][4] = symbol;
                break;
            case 7:
                board[4][0] = symbol;
                break;
            case 8:
                board[4][2] = symbol;
                break;
            case 9:
                board[4][4] = symbol;
                break;
        }
    }

}
