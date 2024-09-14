public class ReverseArgs {
    public static void main(String[] args) {
        // Проверяем, есть ли аргументы
        if (args.length == 0) {
            System.out.println("Нет аргументов командной строки.");
            return;
        }

        // Выводим аргументы в обратном порядке
        for (int i = args.length - 1; i >= 0; i--) {
            System.out.println(args[i]);
        }
    }
}