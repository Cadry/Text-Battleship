import java.util.Random;

public class Computer {
  int MAXROW = 5;
  int MAXCOL = 5;
  int[][] board = new int[5][5]; //initialized in setComputer, 5 by 5 board
  int[] coord = new int[2]; //used to store x,y coordinate for set up and game play
  char direction; //for setPlayer and setComputer, for direction of ships

  boolean win = false; //to determine winner in winCheck()

  public void getMove() {
    //Gets move of computer
    //stores move in coord
  }
  public boolean HitorMiss(Player p1) {
    //Takes in computer’s move and see if hit’s player's game pieces
    //uses coord from p1 and computer's board
    //checks if p1 coords hit computer's board
    //alters computer's board accordingly

    // 
    if (board[p1.coord[0]][p1.coord[1]] == 1 ) {
      board[p1.coord[0]][p1.coord[1]] = 3;
      System.out.println("Hit Computer!");
    //else if (board[p1.coord[0],p1.coord[y]] !=  ) {
    //  board[p1.coord[0],p1.coord[y]] == -1;
    //}
    }
    else {
      board[p1.coord[0]][p1.coord[1]] = 2;
      System.out.println("Missed Computer");
    }
    boolean oppwin = true;
    for (int i=0; i<MAXCOL; i++) {
      for (int j=0; j<MAXROW; j++) {
        if (board[j][i] == 1) {
          oppwin = false;
          }
        }
      }
    return oppwin;   
    }







  //adds values to the computer's board
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

  //for testing purposes
  public void printBoard(int[][] boarda)
  {
    for (int row = 0; row < MAXROW; row++)
    {
      for (int col = 0; col < MAXCOL; col++)
        {
        System.out.print(" " + boarda[row][col] + " ");
        }
      System.out.println("");
    }
  }

  public void placeShip()
  {
    //Carrier, Battleship, Crusier, Submarine, Destroyer
    setShip(3, 1);
    setShip(3, 1);
    setShip(2, 1);
  }

  //symbol is for debugging
  public void setShip(int shipLength, int symbol)
  {
    //Chooses a random point on the array to start off.
    Random rand = new Random();
    //Limits starting point based on the ship's length.
    int startingRow = rand.nextInt(MAXROW);
    int startingCol = rand.nextInt(MAXCOL - (shipLength));
    //int startingRow = r;
    //int startingCol = c;
    //Testing
    System.out.println("StartCol: " + startingCol);
    System.out.println("StartRow: " + startingRow);

    //Checks if the ship will occupy any spaces.
    if (checkComputerSetup(board, startingRow, startingCol, shipLength))
    {
      int shipCol = startingCol;
      for (int sLength = 0; sLength < (shipLength); sLength++)
      {
      //replaces 0 with a number, indicating it is placed.
      board[shipCol][startingRow] = symbol;
      shipCol++;
      //System.out.println(" LOOP: " + sLength + " SCOL: " + shipCol);
      }
      //For testing
      printBoard(board);
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
      if (boardToCheck[col][row] != 0)
        emptySpace = false;
      else
        emptySpace = emptySpace && true;
      col++;
      System.out.println(" BOO= " + emptySpace + " ");
      System.out.println(" Row# = " + row + " Col# = " + col);
    }
    System.out.println("");
    //System.out.println("!!! " + emptySpace);
    return emptySpace;
  }
}
