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

    public void start() {
        Random random = new Random();
        int guessNumber = random.nextInt(100) + 1;
        Player currentPlayer = player1;
            
        while(true) {
            currentPlayer.setNumber(enterPlayerNumber(currentPlayer));
            if(isGuessed(currentPlayer, guessNumber)) {
                break;
            }

            currentPlayer = (currentPlayer == player1) ? player2 : player1;
        }
    }

    public int enterPlayerNumber(Player currentPlayer) {
        System.out.print(currentPlayer.getName() + " введите ваше число: ");
        int playerNumber = scanner.nextInt();
        scanner.nextLine();
        return playerNumber;
    }

    public boolean isGuessed(Player currentPlayer,  int guessNumber) {
        int playerNumber = currentPlayer.getNumber();
        if (playerNumber == guessNumber) {
            System.out.println(currentPlayer.getName() + " - Вы победили!");
            return true;
        } else if (playerNumber < guessNumber) {
            System.out.println("Число " + playerNumber + " меньше того, что загадал компьютер");
        } else if (playerNumber > guessNumber) {
            System.out.println("Число " + playerNumber + " больше того, что загадал компьютер");
        }
        return false;
    }
}