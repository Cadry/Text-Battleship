import java.util.Scanner;

public class Display {
  int [][] playerBoard;
  int[] coord = new int[2];


  public static void main (String args[]){
    Display d= new Display();
    Player p = new Player();
    Computer c = new Computer();
    d.playerBoard= p.setPlayer();
    d.showComputerBoard(d.playerBoard);
    // d.displayGameProgress();
    d.coord=p.getMove();
    System.out.println(c.HitorMiss(p));

    // p.HitorMiss(d.coord);


  }

  public void showComputerBoard(int[][] board) {
    //• Show the tracking view of where the player has tried,
    //symbolizing hits and misses, see idea below.
    //I would like the numbers and letters added to see the lines and columns

// following class is heavily modified from something taken online
// unsure of what variable names go where
// public static void showComputerBoard(int[][] board){
    // displays board
        System.out.println();
        System.out.println("\tA \tB \tC \tD \tE");

        // int board[][]={{0,1,2,3,0},{0,1,0,0,0},{0,1,0,0,0},{0,0,0,0,0},{0,0,0,0,0},};
        for(int row=0 ; row < 5 ; row++ ){
            System.out.print((row+1)+"   ");
            for(int column=0 ; column < 5 ; column++ ){
                if(board[row][column]==-1){
                    //for off the board?/not hit yet
                    System.out.print("\t"+"0");
                    //for miss
                }else if(board[row][column]==0){
                    System.out.print(" "+"|"+"     "+"|");
                //for if it hits the ship
                }else if(board[row][column]==1){
                    System.out.print(" "+"|"+"  S  "+"|");
                }
              else if(board[row][column]==2){
                  System.out.print(" "+"|"+"  O  "+"|");
              }
            else if(board[row][column]==3){
                System.out.print(" "+"|"+"  X  "+"|");
              }


            }
            System.out.println();
        }
  }



  // public void displayGameProgress(){
  //   // Turn number
  //   // Health of Player’s ships example: Cruiser: 5, Battleship: SUNK!, Destroyer:1, etc.
  //
  //   //public static void displayGameProgress(){
  //       // begin turn counter
  //       int turn1 = 0;
  //       turn1 = turn1 + 1;
  //       int shipsHit=2;
  //       int attempts = 5;
  //
  //       Scanner input = new Scanner(System.in);
  //       // rough draft on how the code will supposed to display
  //       System.out.print("Turn: " + turn1);
  //       System.out.println("\tShips hit: " + shipsHit);
  //       System.out.println("Where would you like to attack?");
  //
  //       //row input
  //       // System.out.print("Row: ");
  //       // rowTarget = input.nextInt();
  //       //
  //       // // col input
  //       // System.out.print("Column: ");
  //       // colTarget = input.nextInt();
  //       //
  //       // //end game statement
  //       // System.out.println("\n\n\nBattleship conquered! You hit all 5 ships in " +attempts+ " attempts!");
  //       // showComputerBoard();
  //       }
  }
