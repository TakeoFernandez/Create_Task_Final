
import java.util.Scanner;  


public class Tic_Tak{
   
String board[][] = new String[3][3];
int Player_Turn = 1;
static String input;

 //Inialize board
public Tic_Tak(){
    for (int x =0; x< board.length; x++){
        for (int y=0; y<board[0].length; y++){
            board[x][y]="_";
                    System.out.print(board[x][y]);
        }
       System.out.println();
    }
}
//Prints board
public void Display(){
    for (int x =0; x< board.length; x++){
        for (int y=0; y<board[0].length; y++){
                    System.out.print(board[x][y]);
        }
       System.out.println();
    }
}
//Takes user input and runs move accordingly

public void Turn(){
    int input1 = Integer.parseInt(input.substring(0,input.indexOf(",")));
    int input2 = Integer.parseInt(input.substring(input.indexOf(",")+1));
    if(Player_Turn == 1){
        System.out.println("Enter Player 1's Move:");
        move(input1,input2,"x");
        Display();
        Player_Turn = 2;
    }
    else{
        System.out.println("Enter Player 2's turn!");
        move(input1,input2,"o");
        Display();
        Player_Turn =1;
    }
}
public void move(int x, int y,String s){
    board[x][y] = s;
}


public static void main(String[]args){
Tic_Tak game = new Tic_Tak(); 
Scanner myObj = new Scanner(System.in);  // Create a Scanner object
game.input = myObj.nextLine();
game.Turn();
game.input = myObj.nextLine();
game.Turn();






// System.out.println(Turn);
  // Read user input
// System.out.println("Player" +  Player_Turn +"'s turn + userName);  // Output user input
// Tic_Tak.Display
}
}


// public void win(){
// if (board[0][0] == X && board[0][1] == X && board[0][2] == X){
//    return "Player 1 wins!"; 
// }
// if (board[1][0] == X && board[1][1] == X && board[2][2] == X){
//    return "Player 1 wins!"; 
// }
// if (board[2][0] == X && board[2][1] == X && board[2][2] == X){
//    return "Player 1 wins!"; 
// }
// if (board[0][0] == X && board[1][0] == X && board[2][0] == X){
//    return "Player 1 wins!"; 
// }
// if (board[1][0] == X && board[1][1] == X && board[1][2] == X){
//    return "Player 1 wins!"; 
// }
// if (board[2][0] == X && board[2][1] == X && board[2][2] == X){
//    return "Player 1 wins!"; 
// }
// if (board[0][0] == X && board[1][1] == X && board[2][2] == X){
//    return "Player 1 wins!"; 
// }
// if (board[2][0] == X && board[1][1] == X && board[0][2] == X){
//    return "Player 1 wins!"; 
// }


// if (board[0][0] == Y && board[0][1] == Y && board[0][2] == Y){
//    return "Player 2 wins!"; 
// }
// if (board[1][0] == Y && board[1][1] == Y && board[2][2] == Y){
//    return "Player 2 wins!"; 
// }
// if (board[2][0] == Y && board[2][1] == Y && board[2][2] == Y){
//    return "Player 2 wins!"; 
// }
// if (board[0][0] == Y && board[1][0] == Y && board[2][0] == Y){
//    return "Player 2 wins!"; 
// }
// if (board[1][0] == Y && board[1][1] == Y && board[1][2] == Y){
//    return "Player 2 wins!"; 
// }
// if (board[2][0] == Y && board[2][1] == Y && board[2][2] == Y){
//    return "Player 2 wins!"; 
// }
// if (board[0][0] == Y && board[1][1] == Y && board[2][2] == Y){
//    return "Player 2 wins!"; 
// }
// if (board[2][0] == Y && board[1][1] == Y && board[0][2] == Y){
//    return "Player 2 wins!"; 
// }
// }