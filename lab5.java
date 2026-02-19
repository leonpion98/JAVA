import java.util.Scanner;

public class lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Задание 1: Вывод чисел от 1 до N
        System.out.print("Задание 1. Введите N: ");
        int n1 = sc.nextInt();
        for (int i = 1; i <= n1; i++) {
            System.out.print(i + " ");
        }
        System.out.println("\n");

        // Задание 2: Сумма чисел от 1 до N (while)
        System.out.print("Задание 2. Введите N: ");
        int n2 = sc.nextInt();
        int sum2 = 0;
        int i2 = 1;
        while (i2 <= n2) {
            sum2 += i2;
            i2++;
        }
        System.out.println("Сумма: " + sum2 + "\n");

        // Задание 3: Факториал N (for)
        System.out.print("Задание 3. Введите N: ");
        int n3 = sc.nextInt();
        long fact = 1;
        for (int i = 1; i <= n3; i++) {
            fact *= i;
        }
        System.out.println("Факториал: " + fact + "\n");

        // Задание 4: Четные от 1 до 100 (while + continue)
        System.out.println("Задание 4. Четные числа:");
        int i4 = 1;
        while (i4 <= 100) {
            if (i4 % 2 == 0) {
                System.out.print(i4 + " ");
            }
            i4++;
        }
        System.out.println("\n");

        // Задание 5: Ввод до 0 (do-while)
        System.out.println("Задание 5. Вводите числа (0 - стоп):");
        int num5;
        int sum5 = 0;
        do {
            num5 = sc.nextInt();
            sum5 += num5;
        } while (num5 != 0);
        System.out.println("Сумма введенных чисел: " + sum5);

        sc.close();
    }
}