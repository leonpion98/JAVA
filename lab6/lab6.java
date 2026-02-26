package lab6;

import java.util.Scanner;

public class lab6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1 Метод вычисления площади прямоугольника
        System.out.print("Ширина и высота: ");
        double w = in.nextDouble(), h = in.nextDouble();
        System.out.println("Площадь: " + rectangleArea(w, h));

        // 2 Метод определения чётности числа
        System.out.print("Число для проверки чётности: ");
        int n = in.nextInt();
        System.out.println("Чётное: " + isEven(n));

        // 3 Перегрузка метода вычисления максимума
        System.out.println("Max int (5, 10): " + max(5, 10));
        System.out.println("Max double (5.5, 2.2): " + max(5.5, 2.2));

        // 4 Рекурсивное вычисление факториала
        System.out.print("Число для факториала: ");
        int f = in.nextInt();
        System.out.println("Факториал: " + factorial(f));

        // 5 Рекурсивное вычисление степени числа
        System.out.print("Основание и степень: ");
        int base = in.nextInt(), exp = in.nextInt();
        System.out.println("Результат: " + power(base, exp));
    }

    public static double rectangleArea(double width, double height) {
        return width * height;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    public static long factorial(int n) {
        if (n < 0) return -1;
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static long power(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * power(base, exponent - 1);
    }
}