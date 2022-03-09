package observer;

public class Client {
    public static void main(String[] args) {
        Account duong = new Account("Duong");
        EmailNotification email = new EmailNotification();
        SmsNotification sms = new SmsNotification();
        AppNotification app = new AppNotification();
        duong.addNew(email);
        duong.addNew(sms);

        duong.notification("Duong chuyen cho Duc 20 tr");
        duong.remove(sms);
        duong.addNew(app);

        duong.notification("Duong chuyen cho Dat 10 tr");
    }
}
