package design_patten.Observer;

import java.util.ArrayList;
import java.util.List;

public class ComponentQuality implements Subject{

    private List<Observer> personList = new ArrayList<Observer>();

    @Override
    public void AddObserver(Observer observer) {
        personList.add(observer);
    }

    @Override
    public void DeleteObserver(Observer observer) {
        personList.remove(observer);
    }

    @Override
    public void NotifyObserver(String message) {
        for (Observer observer : personList){
            observer.Update(message);
        }
    }


}