import java.util.Scanner;

public class CalculatorTest {

    private static Scanner scanner;
    
    public static void main(String[] args) {
        // создание объектов
        Calculator calculator = new Calculator();
        scanner = new Scanner(System.in);
        
        String answerContinue = "";
        while(!answerContinue.equals("no")) {
            enterMathExpression(calculator);
            try {
                double result = calculator.calculate();
                printResult(calculator, result);
            } catch(IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }

            do {
                System.out.print("Хотите продолжить вычисления? [yes/no]: ");
                answerContinue = scanner.nextLine().toLowerCase();
            } while(!answerContinue.equals("yes") && !answerContinue.equals("no"));
        }

        scanner.close();
    }

    public static void printResult(Calculator calculator, double result) {
        System.out.println(calculator.getA() + " " + calculator.getMathOperation() + " " 
                        + calculator.getB() + " = " + result);
    }

    public static void enterMathExpression(Calculator calculator) {
        System.out.print("Введите первое число: ");
        calculator.setA(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Введите знак математической операции: ");
        calculator.setMathOperation(scanner.nextLine().charAt(0));
        System.out.print("Введите второе число: ");
        calculator.setB(scanner.nextInt());
        scanner.nextLine();
    }
}