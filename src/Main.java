import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    private static int[] generateRandomArray() {
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    private static int calculateSum(int[] arr) {
        int result = 0;
        for (int element : arr) {
            result += element;
        }
        return result;
    }

    private static void task1() {
        System.out.println("Задача №1");
        int[] arrayInt = new int[]{1, 2, 3};
        double[] arrayDouble = {1.57, 7.654, 9.986};
        long[] arrayLong = {230L, 23_321L};
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задача №2");
        int[] arrayInt = new int[]{1, 2, 3};
        double[] arrayDouble = {1.57, 7.654, 9.986};
        long[] arrayLong = {230L, 23_321L};
        for (int i = 0; i < arrayInt.length; i++) {
            if (i != arrayInt.length - 1) {
                System.out.print(arrayInt[i] + ", ");
            } else {
                System.out.println(arrayInt[i]);
            }
        }
        for (int i = 0; i < arrayDouble.length; i++) {
            if (i != arrayDouble.length - 1) {
                System.out.print(arrayDouble[i] + ", ");
            } else {
                System.out.println(arrayDouble[i]);
            }
        }
        for (int i = 0; i < arrayLong.length; i++) {
            if (i != arrayLong.length - 1) {
                System.out.print(arrayLong[i] + ", ");
            } else {
                System.out.println(arrayLong[i]);
            }
        }
    }

    private static void task3() {
        System.out.println("Задача №3");
        int[] arrayInt = new int[]{1, 2, 3};
        double[] arrayDouble = {1.57, 7.654, 9.986};
        long[] arrayLong = {230L, 23_321L};
        for (int i = arrayInt.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrayInt[i] + ", ");
            } else {
                System.out.println(arrayInt[i]);
            }
        }
        for (int i = arrayDouble.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrayDouble[i] + ", ");
            } else {
                System.out.println(arrayDouble[i]);
            }
        }
        for (int i = arrayLong.length - 1; i >= 0; i--) {
            if (i != 0) {
                System.out.print(arrayLong[i] + ", ");
            } else {
                System.out.println(arrayLong[i]);
            }
        }
    }

    private static void task4() {
        System.out.println("Задача №4");
        int[] arrayInt = new int[]{1, 2, 3};
        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] % 2 != 0) {
                arrayInt[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arrayInt));
    }

    private static void task5() {
        System.out.println("Задача №5");
        int[] payments = generateRandomArray();
        int sumPayments = calculateSum(payments);
        System.out.println("Сумма трат за месяц составила " + sumPayments + " рублей");
    }

    private static void task6() {
        System.out.println("Задача №6");
        int[] payments = generateRandomArray();
        int minPayment = Integer.MAX_VALUE;
        int maxPayment = Integer.MIN_VALUE;
        for (int payment : payments) {
            if (payment < minPayment) {
                minPayment = payment;
            }
            if (payment > maxPayment) {
                maxPayment = payment;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minPayment + " рублей. Максимальная сумма трат за день составила " + maxPayment + " рублей");
    }

    private static void task7() {
        System.out.println("Задача №7");
        int[] payments = generateRandomArray();
        int sumPayments = calculateSum(payments);
        double avePayment = sumPayments / payments.length;
        System.out.println("Средняя сумма трат за месяц составила " + avePayment + " рублей");
    }

    private static void task8() {
        System.out.println("Задача №8");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }
}