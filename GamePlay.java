import java.util.Scanner;

public class GamePlay {
  int MAXROW = 5;
  int MAXCOL = 5;
  int carrierLength = 5;
  int battleshipLength = 4;
  int cruiserLength = 3;
  int submarineLength = 3;
  int destroyerLength = 2;


  public int[][] createBoard()
  {
    int[][] board = new int[MAXROW][MAXCOL];
    for(int row=0 ; row < MAXROW ; row++ )
    {
      for(int column=0 ; column < MAXCOL ; column++ )
        {
        board[row][column]= 0;
        System.out.print(" " + board[row][column] + " ");
        }
      System.out.println("");
    }
    return board;
  }


  public Player setPlayer() {
    //gets user input to pick positions on the board
    //checks that none of the ships overlap
    //return player
    Player p = new Player();
    int maxship = 3;
    p.board = createBoard();

    for (int i = 0; i < 3; i++) {
      System.out.println("This is your " + (i+1) + " boat out of " + maxship + ".");
      System.out.println("Enter your coordinates...");

      Scanner keyboard = new Scanner(System.in);
      System.out.println(" Horizontal (A-J):");
      p.coord[0] = Char2Int(keyboard.next().charAt(0));

      Scanner keyboard2 = new Scanner(System.in);
      System.out.println(" Vertical (1-10):");
      p.coord[1] = keyboard2.nextInt();

      Scanner keyboard3 = new Scanner(System.in);
      System.out.println(" Direction of ship (N,S,E,W):");
      p.direction = keyboard3.next().charAt(0);

      p.setBattleship();
    }
    return p;
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
    } else if (h == 'F') {
      num = 5;
    } else if (h == 'G') {
      num = 6;
    } else if (h == 'H') {
      num = 7;
    } else if (h == 'I') {
      num = 8;
    } else if (h == 'J') {
      num = 9;
    }
    return num;
  }


  public Computer setComputer() {
    //should return computer;
    //setComputer method calls:
    //Idea- it picks a starting spot for each ship, then directions randomly.
    //o setCarrier
    //o setBattleship
    //o setCruiser
    //o setSubmarine
    //o setDestroyer
    //o checkComputerSetup
    //• checks that none of the positions overlap, if so, resets smaller ship

    //return computer
    //Computer temp;
    //return temp;
  }
  /*
  public void createBoard(int[][] board)
  {
    for(int row=0 ; row < MAXROW ; row++ )
    {
      for(int column=0 ; column < MAXCOL ; column++ )
        {
        board[row][column]= 0;
        System.out.print(" " + board[row][column] + " ");
        }
      System.out.println("");
    }
  }

  //for testing purposes
  public void printBoard(int[][] board)
  {
    for (int row = 0; row < MAXROW; row++)
    {
      for (int col = 0; col < MAXCOL; col++)
        {
        System.out.print(" " + board[row][col] + " ");
        }
      System.out.println("");
    }
  }

  public void placeShip()
  {
    //Carrier, Battleship, Crusier, Submarine, Destroyer
    setShip(3, 1);
    setShip(3, 2);
    setShip(2, 3);
  }

  //symbol is for debugging
  public void setShip(int shipLength, int symbol)
  {
    //Chooses a random point on the array to start off.
    Random rand = new Random();
    //Limits starting point based on the ship's length.
    int startingRow = rand.nextInt(MAXROW);
    int startingCol = rand.nextInt(MAXCOL - shipLength);

    //Testing
    System.out.println("StartCol: " + startingCol);
    System.out.println("StartRow: " + startingRow);

    //Checks if the ship will occupy any spaces.
    if (checkComputerSetup(cpuBoard, startingRow, startingCol, shipLength))
    {
      int shipCol = startingCol;
      for (int sLength = 0; sLength < (shipLength); sLength++)
      {
      //replaces 0 with a number, indicating it is placed.
      cpuBoard[startingRow][shipCol] = symbol;
      shipCol++;
      }
      //For testing
      printBoard(cpuBoard);
    }
    else
      //Finds a new startingRow and Col if the space is occupied.
      //Recursive, so repeats until it finds an empty space.
      setShip(shipLength, symbol);
  }
  //Sets the each of the pieces.

  //Checks if the space the piece is to be placed is empty.
  public boolean checkComputerSetup(int[][] boardToCheck, int row, int col, int shipLength)
  {
    boolean emptySpace = true;

    //cycles through the array for the length of shipLength
    for (int sLength = 0; sLength < shipLength; sLength++)
    {
      //not 0 = space is occupied.
      System.out.println(" SPC: " + boardToCheck[row][col]);
      if (boardToCheck[row][col] != 0)
        emptySpace = false;
      else
        emptySpace = emptySpace && true;
      System.out.print(" BOO= " + emptySpace + " ");
    }
    System.out.println("");
    //System.out.println("!!! " + emptySpace);
    return emptySpace;
  }

  */

  public boolean winCheck(Computer c1, Player p1) {
    //if c1.win or win (of player) is true
      //return true --> p1.endgame = true
    //else
      //return false
    boolean temp = false;
    return temp;
  }


}
