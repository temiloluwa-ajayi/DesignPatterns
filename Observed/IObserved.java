package SidelineProjects.DesignPatterns.ObserverDesignPattern.Observed;

public interface IObserved {
    void subscribe();
    void unSubscribe();
    String notifyObserver();

}
