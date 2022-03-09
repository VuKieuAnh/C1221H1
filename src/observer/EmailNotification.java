package observer;

public class EmailNotification implements Observer {
    @Override
    public void update(String mess) {
        System.out.println("Email: " + mess);
    }
}
