import java.util.Scanner;

public class CalculatorTest {
    
    public static void main(String[] args) {
        // создание объектов
        Calculator calculator = new Calculator();
        
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Введите первое число: ");
            calculator.setA(scanner.nextInt());
            scanner.nextLine();
            System.out.print("Введите знак математической операции: ");
            calculator.setMathOperation(scanner.nextLine().charAt(0));
            System.out.print("Введите второе число: ");
            calculator.setB(scanner.nextInt());
            scanner.nextLine();

            if (calculator.execute() == 0) {
                System.out.println(calculator.getA() + " " + calculator.getMathOperation() + " " 
                        + calculator.getB() + " = " + calculator.getResult());
            } else {
                System.out.println("Вы ввели недопустимую операцию: " + calculator.getMathOperation() + "."
                        + " Доступны операции +, -, *, /, %, ^");
            }

            while(true) {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
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
}