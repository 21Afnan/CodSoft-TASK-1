import java.util.Scanner;
import java.util.Random;
public class Task1 {
    int GeneratedNumber;
    int UsersGuess;
    int LimitNumber = 5;
    int choice;
  int attempt=0;
  int Roundswon=0;

    public Task1() {
        Random random = new Random();
        GeneratedNumber = random.nextInt(100) + 1;
        System.out.println(GeneratedNumber);
    }

    void playGame() {
        Scanner scanner = new Scanner(System.in);
        try {

            for (int j = 1; j <= LimitNumber; j++) {
                System.out.println("Enter your guess for generated number B/W 0 to 100 ");
                UsersGuess = scanner.nextInt();
                attempt++;
                if (UsersGuess == GeneratedNumber) {
                    System.out.println("Your guess is correct!");
                    Roundswon++;
                    break;
                } else if (UsersGuess > GeneratedNumber) {
                    System.out.println("Your guess is High from generated Number!");
                } else {
                    System.out.println("Your guess is Low from generated Number!");
                }

            }
            if (UsersGuess != GeneratedNumber) {
                System.out.println("If you want to guess again press 1 for yes and press anyother key to exit : ");
                choice = scanner.nextInt();
            }
            if (choice == 1) {
                playGame();
            } else {
                System.out.println("Alas !" + "The generated number was: " + GeneratedNumber);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            scanner.close();
        }

    }
    void score(){
        System.out.println("Number of attempts taken is " +attempt);
        System.out.println("Round Won : "+Roundswon);
    }
}


public class Main {
    public static void main(String[] args) {
     Task1 task=new Task1();
task.playGame();
        task.score();
        }
    }



