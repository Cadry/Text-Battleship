import java.util.Scanner;

public class Player {
  int MAXROW = 5;
  int MAXCOL = 5;
  int[][] board; //initialized in setPlayer, 5 by 5 board
  int[] coord = new int[2]; //used to store x,y coordinate for set up and game play
  char direction; //for setPlayer and setComputer, for direction of ships

  boolean win = true; //to determine winner in winCheck()
  boolean endGame = false; //to determine when to end game in winCheck()

  public int[] getMove() {
    //Gets user input
    //stores move in coord
    System.out.println("Enter your next move:");

    Scanner keyboard = new Scanner(System.in);
    System.out.println(" Horizontal (A-J):");
    coord[1] = Char2Int(keyboard.next().charAt(0));

    Scanner keyboard2 = new Scanner(System.in);
    System.out.println(" Vertical (1-10):");
    coord[0] = keyboard2.nextInt();

     System.out.println("Your next move is: " + coord[1] + ", " + coord[0] + ".");
     return coord;
  }

    public int Char2Int(char h) {
    int num = 0;
    if (h == 'A') {
      num = 0;
    } else if (h == 'B') {
      num = 1;
    } else if (h == 'C') {
      num = 2;
    } else if (h == 'D') {
      num = 3;
    } else if (h == 'E') {
      num = 4;
    // } else if (h == 'F') {
    //   num = 5;
    // } else if (h == 'G') {
    //   num = 6;
    // } else if (h == 'H') {
    //   num = 7;
    // } else if (h == 'I') {
    //   num = 8;
    // } else if (h == 'J') {
    //   num = 9;
     }
    return num;
  }


  //  public boolean HitorMiss(int[] coord) {
  //
  //   if (board[c1.coord[0]][c1.coord[1]] == 2) {
  //     board[c1.coord[0]][c1.coord[1]] = 1;
  //   }
  //   else {
  //     board[c1.coord[0]][c1.coord[1]] = 0;
  //   }
  //   boolean oppwin = true;
  //   for (int i=0; i<MAXCOL; i++) {
  //     for (int j=0; j<MAXROW; j++) {
  //       if (board[j][i] == 1) {
  //         oppwin = false;
  //         }
  //       }
  //     }
  //   return oppwin;
  //   }

  public int boardSum() {
    int sum = 0;
    for (int i = 0; i < board[0].length; i++) {
      for (int j = 0; j < board[0].length; j++) {
        sum += board[i][j];
      }
    }
    return sum;
  }

  public void setBattleship() {
    int shipsize = 3;//can change this later
    int sum = boardSum();

    for (int i = 0; i < shipsize; i++) {
      if (direction == 'N') {
        board[coord[0]-i][coord[1]] = 1;
      }
      if (direction == 'S') {
        board[coord[0]+i][coord[1]] = 1;
      }
      if (direction == 'E') {
        board[coord[0]][coord[1]+i] = 1;
      }
      if (direction == 'W') {
        board[coord[0]][coord[1]-i] = 1;
      }
    }
  }

  public int[][] setPlayer() {
    //gets user input to pick positions on the board
    //checks that none of the ships overlap
    //return player
    int maxship = 3;
    board = createBoard();

    for (int i = 0; i < 3; i++) {
      System.out.println("This is your " + (i+1) + " boat out of " + maxship + ".");
      System.out.println("Enter your coordinates...");

      Scanner keyboard = new Scanner(System.in);
      System.out.println(" Horizontal (A-E):");
      coord[1] = Char2Int(keyboard.next().charAt(0));

      Scanner keyboard2 = new Scanner(System.in);
      System.out.println(" Vertical (1-5):");
      coord[0] = keyboard2.nextInt() - 1;

      Scanner keyboard3 = new Scanner(System.in);
      System.out.println(" Direction of ship (N,S,E,W):");
      direction = keyboard3.next().charAt(0);

      setBattleship();
      // printBoard(board);
    }
    return board;
  }

  public int[][] createBoard()
  {
    int[][] board = new int[MAXROW][MAXCOL];
    for(int row=0 ; row < MAXROW ; row++ )
    {
      for(int column=0 ; column < MAXCOL ; column++ )
        {
        board[row][column]= 0;
        // System.out.print(" " + board[row][column] + " ");
        }
      // System.out.println("");
    }
    return board;
  }

//   public void printBoard(int[][] board)
//     {
//       for (int row = 0; row < MAXROW; row++)
//       {
//         for (int col = 0; col < MAXCOL; col++)
//           {
//           System.out.print(" " + board[row][col] + " ");
//           }
//         System.out.println("");
//       }
//     }
//
}
