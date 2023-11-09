import java.util.Scanner;

public class GuessNumberTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя первого игрока: ");
        Player player1 = new Player(scanner.nextLine());

        System.out.print("Введите имя второго игрока: ");
        Player player2 = new Player(scanner.nextLine());
        GuessNumber guessNumber = new GuessNumber(player1, player2, scanner); 
        
        String answerContinue = "";
        Player currentPlayer;
        while(!answerContinue.equals("no")) {
            guessNumber.startGame();
            do {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
                answerContinue = scanner.nextLine().toLowerCase();
            } while(!answerContinue.equals("yes") && !answerContinue.equals("no"));
        }
        scanner.close();
    }
}