package Lab3;

class Lab3Arrays {


    public static int calculateNegativeSum(int[] array) {
        if (array == null) {
            throw new NullPointerException("Масив не може бути null");
        }

        int sum = 0;
        for (int element : array) {
            if (element < 0) {
                sum += element;
            }
        }
        return sum;
    }


    public static int calculateSumInRange(int[] array) {
        if (array == null) {
            throw new NullPointerException("Масив не може бути null");
        }
        if (array.length < 11) {
            throw new IndexOutOfBoundsException("Масив повинен містити щонайменше 11 елементів");
        }

        int sum = 0;
        for (int i = 5; i <= 10; i++) {
            sum += array[i];
        }
        return sum;
    }


    public static int[] reverse(int[] array) {
        if (array == null) {
            throw new NullPointerException("Масив не може бути null");
        }

        int[] reversedArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversedArray[i] = array[array.length - 1 - i];
        }
        return reversedArray;
    }

    public static void main(String[] args) {

        int[] testArray1 = { -3, -5, 4, -1, 7 };
        int[] testArray2 = { 2, 5, -8, -3, 4 };
        System.out.println("Завдання №5: Сума від'ємних елементів");
        System.out.println("Тест 1: " + calculateNegativeSum(testArray1));
        System.out.println("Тест 2: " + calculateNegativeSum(testArray2));

        // Тестування завдання №35
        int[] testArray3 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 };
        int[] testArray4 = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110 };
        System.out.println("\nЗавдання №35: Сума елементів з індексами в діапазоні [5;10]");
        System.out.println("Тест 1: " + calculateSumInRange(testArray3));
        System.out.println("Тест 2: " + calculateSumInRange(testArray4));

        // Тестування завдання №65
        int[] testArray5 = { 1, 2, 3, 4, 5 };
        int[] testArray6 = { 10, 20, 30, 40, 50, 60 };
        System.out.println("\nЗавдання №65: Зворотний масив");
        System.out.print("Тест 1: ");
        for (int num : reverse(testArray5)) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Тест 2: ");
        for (int num : reverse(testArray6)) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
