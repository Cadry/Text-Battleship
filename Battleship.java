import java.util.Scanner;

public class BattleShip {

  void play() {
    GamePlay game = new GamePlay();

    Player p1 = game.setPlayer();
    p1.showComputerBoard();
    Computer c1 = game.setComputer();

    while (!p1.endGame) {
      p1.getMove(); //Gets player’s move
      p1.win = c1.HitorMiss(p1); //Check if hit or a miss, updates c1 board and p1.win
      screen.showComputerBoard(c1,p1); //Display gameboard

      c1.getMove(); //Gets computer’s move
      c1.win = p1.HitorMiss(c1); //Check if hit or miss, updates p1 board and c1.win
      screen.displayGameProgress(c1,p1); //Display turns, player’s health etc.

      p1.endGame = game.winCheck(c1,p1); // Check if game is over
    }

    //display game result messages
    if (p1.win && !c1.win) {
      system.out.println("You win!");
    } else if (!p1.win && !c1.win) {
      system.out.println("Computer wins! You lose!");
    } else if (p1.win && c1.win) {
      system.out.println("It's a tie!");
    }

    system.out.println("GAME OVER");

  }



}
