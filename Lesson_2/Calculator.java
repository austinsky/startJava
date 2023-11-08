public class Calculator {
    private int a;
    private int b;
    private char mathOperation;

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

    public double calculate() {
        double result;
        switch(mathOperation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
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
                throw new IllegalArgumentException("Вы ввели недопустимую операцию: " 
                        + mathOperation + ". Доступны операции +, -, *, /, %, ^");
        }

        return result;
    }
}