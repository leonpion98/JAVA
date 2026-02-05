import java.util.Scanner;

public class lab3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Задание 1
        int a = 5;
        int b = 7;
        int c = 8;
        int sum = a + b + c;
        System.out.println("Сумма трех чисел: " + sum);

        // Задание 2
        double num1 = 9.0;
        double num2 = 3.0;
        System.out.println("Сложение: " + (num1 + num2));
        System.out.println("Умножение: " + (num1 * num2));
        System.out.println("Деление: " + (num1 / num2));

        // Задание 3
        int value = 20;
        value = value * 2 + 5;
        System.out.println("Измененное значение: " + value);

        // Задание 4
        System.out.print("Введите число для возведения в квадрат: ");
        int n = scanner.nextInt();
        System.out.println("Квадрат: " + (n * n));

        // Задание 5
        System.out.print("Введите длину: ");
        double l = scanner.nextDouble();
        System.out.print("Введите ширину: ");
        double w = scanner.nextDouble();
        double area = l * w;
        System.out.println("Площадь: " + area);

        scanner.close();
    }
}
