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

    public int execute() {
        int error = 0;
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
                error = 1;
                break;
        }

        return error;
    }
}