package lab7;

public class lab7 {

    public static void main(String[] args) {
        task1(); task2(); task3(); task4(); task5();
        task6(); task7(); task8(); task9(); task10();
        task11(); task12(); task13(); task14(); task15();
        System.out.println("16. Создать метод maxX(): " + maxX(new int[]{1, 45, 2, 8}));
        task17();
    }

    public static void task1() {
        int[] A = new int[20]; int s = 0;
        for (int i = 0; i < 20; i++) { A[i] = (int)(Math.random()*20-10); if (A[i] < 0) s += A[i]; }
        System.out.println("1. Сумма отрицательных элементов A[20]: " + s);
    }

    public static void task2() {
        int[] B = new int[15]; int s = 0;
        for (int i = 0; i < 15; i++) { B[i] = (int)(Math.random()*20-10); if (B[i] > 0) s += B[i]; }
        System.out.println("2. Сумма положительных элементов B[15]: " + s);
    }

    public static void task3() {
        double[] A = new double[12]; double p = 1;
        for (int i = 0; i < 12; i++) { A[i] = Math.random()*20-10; if (A[i] < 0) p *= A[i]; }
        System.out.println("3. Произведение отрицательных A[12]: " + p);
    }

    public static void task4() {
        double[] C = new double[25]; double p = 1;
        for (int i = 0; i < 25; i++) { C[i] = Math.random()*10; if (C[i] > 0) p *= C[i]; }
        System.out.println("4. Произведение положительных C[25]: " + p);
    }

    public static void task5() {
        double[] D = new double[17]; double s = 0;
        for (int i = 0; i < 17; i++) { D[i] = Math.random()*10; s += D[i]; }
        System.out.println("5. Среднее арифметическое D[17]: " + (s/17));
    }

    public static void task6() {
        System.out.print("6. Суммы отриц. по строкам A[10][10] -> B[10]: ");
        int[][] A = new int[10][10]; int[] B = new int[10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) { A[i][j] = (int)(Math.random()*20-10); if (A[i][j] < 0) B[i] += A[i][j]; }
            System.out.print(B[i] + " ");
        }
        System.out.println();
    }

    public static void task7() {
        System.out.print("7. Суммы полож. по строкам B[5][5] -> A[5]: ");
        int[][] B = new int[5][5]; int[] A = new int[5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) { B[i][j] = (int)(Math.random()*20-10); if (B[i][j] > 0) A[i] += B[i][j]; }
            System.out.print(A[i] + " ");
        }
        System.out.println();
    }

    public static void task8() {
        System.out.print("8. Произведение отриц. по столбцам A[12][6]: ");
        double[][] A = new double[12][6];
        for (int j = 0; j < 6; j++) {
            double p = 1;
            for (int i = 0; i < 12; i++) { A[i][j] = Math.random()*20-10; if (A[i][j] < 0) p *= A[i][j]; }
            System.out.print(p + " ");
        }
        System.out.println();
    }

    public static void task9() {
        double[][] C = new double[5][5]; double p = 1;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) C[i][j] = Math.random()*20-10;
            if (C[i][i] > 0) p *= C[i][i];
        }
        System.out.println("9. Произведение полож. главной диагонали C[5][5]: " + p);
    }

    public static void task10() {
        double[][] D = new double[7][7]; double s = 0;
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) D[i][j] = Math.random()*10;
            s += D[i][i];
        }
        System.out.println("10. Среднее главной диагонали D[7][7]: " + (s/7));
    }

    public static void task11() {
        int[] A = new int[25]; int min = 0, max = 0;
        for (int i = 0; i < 25; i++) {
            A[i] = (int)(Math.random()*100);
            if (A[i] < A[min]) min = i; if (A[i] > A[max]) max = i;
        }
        int t = A[min]; A[min] = A[max]; A[max] = t;
        System.out.println("11. В массиве A[25] поменяли местами max и min.");
    }

    public static void task12() {
        int[] B = new int[25];
        for (int i = 0; i < 25; i++) B[i] = (int)(Math.random()*100);
        java.util.Arrays.sort(B);
        System.out.println("12. Массив B[25] отсортирован.");
    }

    public static void task13() {
        int[] C = new int[20]; double s = 0;
        for (int i = 0; i < 20; i++) { C[i] = (int)(Math.random()*100); s += C[i]; }
        System.out.println("13. Среднее значение массива C[20]: " + (s/20));
    }

    public static void task14() {
        int[] D = new int[30]; int e = 0, o = 0;
        for (int i = 0; i < 30; i++) {
            D[i] = (int)(Math.random()*50);
            if (D[i] % 2 == 0) e += D[i]; else o += D[i];
        }
        System.out.println("14. Сумма чётных: " + e + ", нечётных: " + o + " в D[30]");
    }

    public static void task15() {
        System.out.println("15. Таблица 3x5 случайных чисел (< 10):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) System.out.print((int)(Math.random()*10) + " ");
            System.out.println();
        }
    }

    public static int maxX(int[] a) {
        int m = a[0];
        for (int x : a) if (x > m) m = x;
        return m;
    }

    public static void task17() {
        String s1="Hello", s2="World", s3="Java", s4="test", s5="test";
        System.out.print("17. Результат строк: ");
        System.out.println(s4.equals(s5) ? s1+s2 : s1+s3);
    }
}
