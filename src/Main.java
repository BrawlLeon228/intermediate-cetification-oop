import java.io.Console;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Для использование калькулятора введите: yes");
        while (in.next().equals("yes")){
            System.out.println("Введите первое число:");
            N number1 = new N(in.nextDouble());
            System.out.println("Введите второе число:");
            N number2 = new N(in.nextDouble());
            System.out.println("Введите операцию:");
            switch (in.next()) {
                case "+":
                    System.out.println(number1.summ(number2));
                    break;
                case "/":
                    System.out.println(number1.divide(number2));
                    break;
                case "*":
                    System.out.println(number1.multiply(number2));
                    break;
                default:
                    System.out.println("Выбрана несуществующая операция");
            }
            System.out.println("Для использование калькулятора введите: yes");
        }
    }
}