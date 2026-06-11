package praktikum_7.bagian_3;

public class Main {

    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        service.setStrategy(new EmailNotification());
        service.sendNotification("Selamat datang!");

        service.setStrategy(new SMSNotification());
        service.sendNotification("Kode OTP: 123456");

        service.setStrategy(new PushNotification());
        service.sendNotification("Anda memiliki pesan baru");
    }
}