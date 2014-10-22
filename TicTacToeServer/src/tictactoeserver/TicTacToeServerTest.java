// Assignment 3, Tic Tac Toe Client/Server
// Name: Cory Siebler
// StudentID: 1000832292
// Lecture Topic: 9 - Networking
// Description: 
package tictactoeserver;

// Class that tests Tic-Tac-Toe server.
import javax.swing.JFrame;

/**
 *
 * @author caustin
 * @author csiebler
 */
public class TicTacToeServerTest {

    public static void main(String[] args) {
        TicTacToeServer application = new TicTacToeServer();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        application.execute();
    }
}
