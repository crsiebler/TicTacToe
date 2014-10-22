// Assignment 3, Tic Tac Toe Client/Server
// Name: Cory Siebler
// StudentID: 1000832292
// Lecture Topic: 9 - Networking
// Description: 
package tictactoeclient;

// Test class for Tic-Tac-Toe client.
import javax.swing.JFrame;

/**
 *
 * @author caustin
 * @author csiebler
 */
public class TicTacToeClientTest {

    public static void main(String[] args) {
        TicTacToeClient application; // declare client application

        // Check for command line args
        if (args.length == 0) {
            application = new TicTacToeClient("127.0.0.1"); // localhost
        } else {
            application = new TicTacToeClient(args[0]); // use args
        }

        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
