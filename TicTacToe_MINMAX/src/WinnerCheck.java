import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WinnerCheck {

    TicTacToeGame tttg = new TicTacToeGame();

    public ArrayList<Integer> player1Pos = new ArrayList<Integer>();
    public ArrayList<Integer> player2Pos = new ArrayList<Integer>();
    public boolean gameOn = true;

    public String winnerCheck(){
        List barisAtas = Arrays.asList(1,2,3);
        List barisTengah = Arrays.asList(4,5,6);
        List barisBawah = Arrays.asList(7,8,9);
        List kolomKanan = Arrays.asList(1,4,7);
        List kolomTengah = Arrays.asList(2,5,8);
        List kolomKiri = Arrays.asList(3,6,9);
        List silangKanan = Arrays.asList(1,5,9);
        List silangKiri = Arrays.asList(3,5,7);

        List<List> menang = new ArrayList<List>();
        menang.add(barisAtas);
        menang.add(barisTengah);
        menang.add(barisBawah);
        menang.add(kolomKanan);
        menang.add(kolomTengah);
        menang.add(kolomKiri);
        menang.add(silangKanan);
        menang.add(silangKiri);

        for (List l : menang){
            if (player1Pos.containsAll(l)){
                this.gameOn = false;
                return "Player X Menang !";
            }else if (player2Pos.containsAll(l)){
                this.gameOn = false;
                return "Player O Menang !";
            }else if (player1Pos.size() + player2Pos.size() == 9) {
                this.gameOn = false;
                return "Seri";
            }
        }

        return "";
    }
}
