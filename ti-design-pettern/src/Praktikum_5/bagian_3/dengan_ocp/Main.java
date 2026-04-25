package Praktikum_5.bagian_3.dengan_ocp;

public class Main {

    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        Notifier email = new EmailNotifier();
        service.notifyUser(email, "Hello Email");

        Notifier sms = new SMSNotifier();
        service.notifyUser(sms, "Hello SMS");
    }
}