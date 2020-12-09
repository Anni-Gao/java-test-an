package design_patten.Observer;

public interface Subject {
     void AddObserver(Observer observer);
     void DeleteObserver(Observer observer);
     void NotifyObserver(String message);
}
