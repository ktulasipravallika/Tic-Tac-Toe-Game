
public class LaunchGame {
    public static void main(String[] args) {
        TicTacToe t = new TicTacToe();

        HumanPlayer p1 = new HumanPlayer("Max", 'X');
        HumanPlayer p2 = new HumanPlayer("BobAI", 'O');

        System.out.println("Your board is ready!..");

        Player cp;
        cp = p1;

        while (true) {
            System.out.println(cp.name + "'s turn now..");
            cp.makeMove();
            TicTacToe.displayBoard();

            if (TicTacToe.checkColWin() || TicTacToe.checkRowWin() || TicTacToe.checkDiagWin()) {
                System.out.println(cp.name + " Won the Game..!!!..");
                break;
            } else if(TicTacToe.checkdrawMatch()){
                System.out.println("Game is a draw!!!...");
                break;
            }
            else {
                if (cp == p1) {
                    cp = p2;
                } else {
                    cp = p1;
                }
            }
        }

    }
}
