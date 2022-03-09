package observer;

public interface Subject {
    void addNew(Observer observer);
    void remove(Observer observer);
    void notification(String mess);
}
