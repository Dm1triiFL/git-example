import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        // Пример строки-образца
        String samplePassword = "mySecret123";

        // Создаем объект Scanner для чтения ввода
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введите пароль: ");
        
        // Читаем введённый пользователем пароль
        String inputPassword = scanner.nextLine();
        
        // Сравниваем введённый пароль со строкой-образцом
        if (inputPassword.equals(samplePassword)) {
            System.out.println("Пароль верный!");
        } else {
            System.out.println("Пароль неверный!");
        }

        // Закрываем сканер
        scanner.close();
    }
}
