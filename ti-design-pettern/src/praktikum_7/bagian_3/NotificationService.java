package praktikum_7.bagian_3;

public class NotificationService {

    private NotificationStrategy strategy;

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public void sendNotification(String message) {
        strategy.send(message);
    }
}