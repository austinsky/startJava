public class Calculator {
    private int a;
    private int b;
    private char mathOperation;
    private double result;

    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public void setMathOperation(char mathOperation) {
        this.mathOperation = mathOperation;
    }

    public char getMathOperation() {
        return mathOperation;
    }

    public double getResult() {
        return result;
    }

    public double calculate() {
        switch(mathOperation) {
            case '+':
                result = (double) a + b;
                break;
            case '-':
                result = (double) a - b;
                break;
            case '*':
                result = (double) a * b;
                break;
            case '/':
                if (b == 0) {
                    throw new IllegalArgumentException("Недопустимая операция: деление на 0");
                }
                result = (double) a / b;
                break;
            case '^':
                result = 1;
                for (int i = 0; i < b; ++i) {
                    result *= a; 
                }
                break;
            case '%':
                result = a % b;
                break;
            default:
                System.out.println();
                throw new IllegalArgumentException("Вы ввели недопустимую операцию: " 
                        + mathOperation + ". Доступны операции +, -, *, /, %, ^");
        }

        return result;
    }
}