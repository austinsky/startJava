import java.util.Scanner;
import java.util.Random;

public class GuessNumber {
    private Player player1;
    private Player player2;
    private Scanner scanner;

    public GuessNumber(Player player1, Player player2, Scanner scanner) {
        this.player1 = player1;
        this.player2 = player2;
        this.scanner = scanner;
    }

    public void startGame() {
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Player currentPlayer = player2;
            
        while(true) {
            if (currentPlayer == player1) {
                currentPlayer = player2;
            } else {
                currentPlayer = player1;
            }

            System.out.print(currentPlayer.getName() + " введите ваше число: ");
            int playerNumber = scanner.nextInt();
            scanner.nextLine();
            if(isGuessed(currentPlayer, playerNumber, number)) {
                break;
            }
        }
    }

    public boolean isGuessed(Player currentPlayer, int playerNumber, int number) {
        if (playerNumber == number) {
            System.out.println(currentPlayer.getName() + " - Вы победили!");
            return true;
        } else if (playerNumber < number) {
            System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
        } else if (playerNumber > number) {
            System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
        }
        return false;
    }
}