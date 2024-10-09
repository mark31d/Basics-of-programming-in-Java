public class CombinedTasks {

    public static void main(String[] args) {
        // Тести для першого завдання
        System.out.println("Task 1 Results:");
        printResultsTask1(10, 5);
        printResultsTask1(1, 10);
        printResultsTask1(0, 3);  // Неправильний аргумент для s
        printResultsTask1(2, 35); // Неправильний аргумент для k

        // Тести для другого завдання
        System.out.println("\nTask 2 Results:");
        printResultsTask2(-2, 5);
        printResultsTask2(4, 10);
        printResultsTask2(0, 3);  // Правильний випадок
        printResultsTask2(2, -1); // Неправильний аргумент для n

        // Тести для третього завдання
        System.out.println("\nTask 3 Results:");
        printResultsTask3(0.001);
        printResultsTask3(0.0001);
        printResultsTask3(-0.01);  // Неправильний аргумент для epsilon
    }

    // Завдання 1: Метод для обчислення суми ряду
    public static double calculateSumTask1(double s, int k) {
        if (s <= 0 || k >= 35) {
            throw new IllegalArgumentException("s має бути > 0, k має бути < 35");
        }
        double sum = 0;
        for (int i = 1; i <= k; i++) {
            sum += Math.log10(Math.sqrt(s / (i * i)));
        }
        return sum;
    }

    // Допоміжний метод для виведення результатів завдання 1
    public static void printResultsTask1(double s, int k) {
        try {
            System.out.println("s = " + s + ", k = " + k + ", result = " + calculateSumTask1(s, k));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

    // Завдання 2: Метод для обчислення значення функції x(t, n)
    public static double calculateFunctionTask2(double t, int n) {
        if (n < 1) {
            throw new IllegalArgumentException("n має бути >= 1");
        }
        double sum = 0;
        if (t < 0) {
            for (int i = 1; i <= n; i++) {
                sum += t * t * i;
            }
        } else {
            for (int i = 1; i <= n; i++) {
                sum += Math.sqrt(t) * i;
            }
        }
        return sum;
    }

    // Допоміжний метод для виведення результатів завдання 2
    public static void printResultsTask2(double t, int n) {
        try {
            System.out.println("t = " + t + ", n = " + n + ", result = " + calculateFunctionTask2(t, n));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }

    // Завдання 3: Метод для обчислення нескінченної суми
    public static double calculateInfiniteSumTask3(double epsilon) {
        if (epsilon <= 0) {
            throw new IllegalArgumentException("epsilon має бути > 0");
        }
        double sum = 0;
        int i = 1;
        double term;
        do {
            term = Math.pow(-1, i + 1) / (i * (i + 1) * (i + 2));
            sum += term;
            i++;
        } while (Math.abs(term) >= epsilon);
        return sum;
    }

    // Допоміжний метод для виведення результатів завдання 3
    public static void printResultsTask3(double epsilon) {
        try {
            System.out.println("epsilon = " + epsilon + ", result = " + calculateInfiniteSumTask3(epsilon));
        } catch (IllegalArgumentException e) {
            System.out.println("EXCEPTION! " + e.getMessage());
        }
    }
}