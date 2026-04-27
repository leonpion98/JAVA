import java.util.Scanner;
import java.util.Random;

public class Lab14AdditionalTasks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int taskNumber;

        do {
            System.out.println("\n--- Лабораторная работа №14: Дополнительные задачи ---");
            System.out.println("Выберите номер задачи (1-10) или 0 для выхода:");
            taskNumber = scanner.nextInt();

            switch (taskNumber) {
                case 1:
                    runTask1(scanner);
                    break;
                case 2:
                    runTask2(scanner);
                    break;
                case 3:
                    runTask3(scanner);
                    break;
                case 4:
                    runTask4(scanner);
                    break;
                case 5:
                    runTask5(scanner);
                    break;
                case 6:
                    runTask6(scanner);
                    break;
                case 7:
                    runTask7();
                    break;
                case 8:
                    runTask8(scanner);
                    break;
                case 9:
                    runTask9(scanner);
                    break;
                case 10:
                    runTask10(scanner);
                    break;
                case 0:
                    System.out.println("Выход из программы...");
                    break;
                default:
                    System.out.println("Неверный номер задачи!");
            }
        } while (taskNumber != 0);
    }

    // Задача 1: Сумма чисел от 1 до N
    private static void runTask1(Scanner sc) {
        System.out.print("Введите число N: ");
        int n = sc.nextInt();
        int sum = 0, i = 1;
        if (n > 0) {
            do {
                sum += i;
                i++;
            } while (i <= n);
        }
        System.out.println("Сумма чисел от 1 до " + n + " = " + sum);
    }

    // Задача 2: Количество цифр в числе
    private static void runTask2(Scanner sc) {
        System.out.print("Введите число: ");
        long num = Math.abs(sc.nextLong());
        int count = 0;
        long temp = num;
        do {
            count++;
            temp /= 10;
        } while (temp > 0);
        System.out.println("Количество цифр в числе " + num + " = " + count);
    }

    // Задача 3: Таблица умножения для числа
    private static void runTask3(Scanner sc) {
        System.out.print("Введите число для таблицы умножения: ");
        int num = sc.nextInt();
        int i = 1;
        do {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
        } while (i <= 10);
    }

    // Задача 4: Наибольшая цифра числа
    private static void runTask4(Scanner sc) {
        System.out.print("Введите число: ");
        int num = Math.abs(sc.nextInt());
        int maxDigit = 0;
        do {
            int digit = num % 10;
            if (digit > maxDigit) maxDigit = digit;
            num /= 10;
        } while (num > 0);
        System.out.println("Наибольшая цифра: " + maxDigit);
    }

    // Задача 5: Палиндром
    private static void runTask5(Scanner sc) {
        System.out.print("Введите число: ");
        int num = sc.nextInt();
        int originalNum = num;
        int reversedNum = 0;
        int temp = Math.abs(num);
        do {
            reversedNum = reversedNum * 10 + (temp % 10);
            temp /= 10;
        } while (temp > 0);

        if (Math.abs(originalNum) == reversedNum) {
            System.out.println("Число является палиндромом.");
        } else {
            System.out.println("Число не является палиндромом.");
        }
    }

    // Задача 6: Количество чётных цифр
    private static void runTask6(Scanner sc) {
        System.out.print("Введите число: ");
        int num = Math.abs(sc.nextInt());
        int evenCount = 0;
        do {
            int digit = num % 10;
            if (digit % 2 == 0) evenCount++;
            num /= 10;
        } while (num > 0);
        System.out.println("Количество чётных цифр: " + evenCount);
    }

    // Задача 7: Случайные числа до 0
    private static void runTask7() {
        Random random = new Random();
        int randNum;
        System.out.println("Генерация чисел:");
        do {
            randNum = random.nextInt(11); // от 0 до 10
            System.out.print(randNum + " ");
        } while (randNum != 0);
        System.out.println("\nВыпал ноль!");
    }

    // Задача 8: Сумма введенных чисел до 0
    private static void runTask8(Scanner sc) {
        int input, totalSum = 0;
        do {
            System.out.print("Введите число (0 для стопа): ");
            input = sc.nextInt();
            totalSum += input;
        } while (input != 0);
        System.out.println("Общая сумма: " + totalSum);
    }

    // Задача 9: Пароль минимум 6 символов
    private static void runTask9(Scanner sc) {
        sc.nextLine(); // Очистка буфера
        String pass;
        do {
            System.out.print("Придумайте пароль (мин. 6 символов): ");
            pass = sc.nextLine();
        } while (pass.length() < 6);
        System.out.println("Пароль принят.");
    }

    // Задача 10: Минимальное число из введенных
    private static void runTask10(Scanner sc) {
        int min = Integer.MAX_VALUE;
        int val;
        System.out.println("Введите числа. Для завершения введите 0.");
        do {
            System.out.print("Число: ");
            val = sc.nextInt();
            if (val != 0 && val < min) {
                min = val;
            }
        } while (val != 0);

        if (min == Integer.MAX_VALUE) {
            System.out.println("Вы не ввели ни одного числа.");
        } else {
            System.out.println("Минимальное число: " + min);
        }
    }
}
