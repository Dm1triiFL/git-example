import java.util.Random;
import java.util.Scanner;

public class RandomNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Запрашиваем у пользователя количество случайных чисел
        System.out.print("Введите количество случайных чисел: ");
        int count = scanner.nextInt();

        // Выводим случайные числа без перехода на новую строку
        System.out.println("Случайные числа (без перехода на новую строку): ");
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(100); // Генерируем случайное число от 0 до 99
            System.out.print(randomNumber + " ");
        }

        System.out.println(); // Печатаем новую строку

        // Выводим случайные числа с переходом на новую строку
        System.out.println("Случайные числа (с переходом на новую строку): ");
        for (int i = 0; i < count; i++) {
            int randomNumber = random.nextInt(100); // Генерируем случайное число от 0 до 99
            System.out.println(randomNumber);
        }

        scanner.close();
    }
}