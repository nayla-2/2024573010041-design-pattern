package Praktikum_5.bagian_3.dengan_ocp;

public class NotificationService {

    public void notifyUser(Notifier notifier, String message) {
        notifier.send(message);
    }
}