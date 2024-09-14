import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Task {
    private String developerSurname;
    private LocalDateTime taskReceivedTime;
    private LocalDateTime taskCompletedTime;

    public Task(String developerSurname, LocalDateTime taskReceivedTime, LocalDateTime taskCompletedTime) {
        this.developerSurname = developerSurname;
        this.taskReceivedTime = taskReceivedTime;
        this.taskCompletedTime = taskCompletedTime;
    }

    public void displayTaskInfo() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        System.out.println("Фамилия разработчика: " + developerSurname);
        System.out.println("Дата и время получения задания: " + taskReceivedTime.format(formatter));
        System.out.println("Дата и время сдачи задания: " + taskCompletedTime.format(formatter));
    }

    public static void main(String[] args) {
        // Пример использования
        LocalDateTime receivedTime = LocalDateTime.now(); // Время получения задания
        LocalDateTime completedTime = receivedTime.plusHours(5); // Время сдачи задания (через 5 часов)

        Task task = new Task("Шубин", receivedTime, completedTime);
        task.displayTaskInfo();
    }
}
