public class SumAndProduct {
    public static void main(String[] args) {
        // Проверяем, есть ли аргументы
        if (args.length == 0) {
            System.out.println("Пожалуйста, введите целые числа в качестве аргументов.");
            return;
        }

        int sum = 0;
        int product = 1;

        for (String arg : args) {
            try {
                // Преобразуем аргумент в целое число
                int number = Integer.parseInt(arg);
                sum += number;          // Суммируем
                product *= number;      // Умножаем
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ввод: '" + arg + "' - это не целое число.");
                return;
            }
        }

        // Выводим результаты
        System.out.println("Сумма: " + sum);
        System.out.println("Произведение: " + product);
    }
}
