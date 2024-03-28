import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
int firstNumber = scanner();
int secondNumber = scanner();
char operator = scannerOp();
      System.out.println("Результат равен " + calculate(firstNumber,secondNumber,operator));

    }
    public static int calculate(int a, int b, char op) {
        int result =0;
            if (op == '+') {
            result = a + b;
            }
            else if (op == '*') {
                result = a * b;
            }
            else if ( op == '-') {
                result = a - b;
            }
            else if (op == '/') {
                if(a ==0 || b== 0) {
                    System.out.println("На ноль делить нельзя");

                } else {
                result = a / b;
                }
            }
            else {
                System.out.println("Вы ввели некорректный опператор.");
            }
            return result;
    }
    public static int scanner() {
        System.out.println("Введите число ");
        return new Scanner(System.in).nextInt();
    }
    public static char scannerOp() {
        System.out.println("Введите оператор. Например \n  \t+\t-\t*\t/    ");
        return new Scanner(System.in).next().charAt(0);
    }
}
