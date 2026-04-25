package Praktikum_5.bagian_3.tanpa_ocp;

public class Main {

    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        service.sendNotification("Email", "Hello Email!");
        service.sendNotification("SMS", "Hello SMS!");
    }
}
