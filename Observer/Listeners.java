package SidelineProjects.DesignPatterns.ObserverDesignPattern.Observer;

import SidelineProjects.DesignPatterns.ObserverDesignPattern.Observed.Blog;

import java.util.List;

public class Listeners extends Blog implements IObserver {
    private List<String> newsUpdates;
    private List<Blog> subscribedTo;
    private Blog subject;



    public Listeners() {
    }


    public void subscribe() {
        subject.subscribe();
    }


    public void unSubscribe() { subject.unSubscribe(); }


    @Override
    public void update() {
        String notified = subject.notifyObserver();
        newsUpdates.add(notified);
    }

    public Blog getSubject() {
        return subject;
    }

    public void setSubject(Blog subject) {
        this.subject = subject;
    }


    public void newsLog() {
        for(String info : newsUpdates) System.out.println(info);
    }
}
