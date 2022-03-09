package observer;

import java.util.ArrayList;
import java.util.List;

public class Account implements Subject {
    String name;
    List<Observer>  observerList = new ArrayList<>();
    public Account(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Observer> getObserverList() {
        return observerList;
    }

    public void setObserverList(List<Observer> observerList) {
        this.observerList = observerList;
    }

    @Override
    public void addNew(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void remove(Observer observer) {
        observerList.remove(observer);
    }

    @Override
    public void notification(String mess) {
        for (Observer o: observerList
             ) {
            o.update(mess);
        }
    }
}
