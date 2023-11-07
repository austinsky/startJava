import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Random random = new Random();
    private int number;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Scanner scanner;


    public GuessNumber(Player player1, Player player2, Scanner scanner) {
        this.player1 = player1;
        this.player2 = player2;
        this.scanner = scanner;
        startGame();
    }

    public void startGame() {
        while(true) {
            number = random.nextInt(100) + 1;
            currentPlayer = player2;

            while(true) {
                if (currentPlayer == player1) {
                    currentPlayer = player2;
                } else {
                    currentPlayer = player1;
                }

                System.out.println(currentPlayer.getName() + " введите ваше число: ");
                int playerNumber = scanner.nextInt();
                scanner.nextLine();
                if(check(playerNumber)) {
                    break;
                }
            }

            while(true) {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                String answerContinue = scanner.nextLine();
                if (answerContinue.equals("no")) {
                    return;
                } else if (answerContinue.equals("yes")) {
                    break;
                } else {
                    continue;
                }
            }
        }
    }

    public boolean check(int playerNumber) {
        if (playerNumber == number) {
            System.out.println(currentPlayer.getName() + " - Вы победили!");
            return true;
        } else if (playerNumber < number) {
            System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
            return false;
        } else if (playerNumber > number) {
            System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
            return false;
        } else {
            System.out.println("Fatal error: Невозможная ситуация");
            return false;
        }
    }
}