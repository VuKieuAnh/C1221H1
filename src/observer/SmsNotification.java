package observer;

public class SmsNotification implements Observer {
    @Override
    public void update(String mess) {
        System.out.println("SMS " + mess);
    }
}
