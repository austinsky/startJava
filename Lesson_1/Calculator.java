public class Calculator {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        char sign = '*';
        long result = 0;

        switch(sign) {
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
                result = a / b;
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
        }
        System.out.println(a + " " + sign + " " + b + " = " + result);
    }
}