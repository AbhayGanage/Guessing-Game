import java.util.Random;
import java.util.Scanner;

class Game{
    int computer;
    public Game(){
        Random rand = new Random();
        computer = rand.nextInt(10);
        System.out.println("Guess the Number Form  1 to 10");
    }
    public int computerNo(){
        return computer;
    }
}
public class GuessingGame {
    static int takeUserInput(){
        int user;
        System.out.println("Enter ");
        Scanner sc= new Scanner(System.in);
        user=sc.nextInt();
        return user;
    }

    static void isCorrectNumber(int i, int j){
        if(i==j){
            System.out.println("Correct NUMBER Guess");
        }
        else if(i>j){
            System.out.println("Your NUMBER is Big than computer Number");
        }
        else {
            System.out.println("Your NUMBER is Small than computer Number");
        }
    }
    public static void main(String[] args) {
        int user=0,computer=0,itteration=0;
        Game g = new Game();
        do {
            user = takeUserInput();
            computer = g.computerNo();

            isCorrectNumber(user, computer);
            itteration++;
        }while (user!=computer);
        System.out.println("YOU GUESS NUMBER IN "+ itteration+" ITTERATIONS");


    }
}