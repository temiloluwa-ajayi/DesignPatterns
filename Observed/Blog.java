package SidelineProjects.DesignPatterns.ObserverDesignPattern.Observed;

import SidelineProjects.DesignPatterns.ObserverDesignPattern.Observer.Listeners;

import java.util.ArrayList;
import java.util.List;

public class Blog implements IObserved{
    private Listeners listeners;
    private String news;
    private List<Listeners> customer = new ArrayList<>();


    @Override
    public void subscribe() {
        customer.add(listeners);
    }


    @Override
    public void unSubscribe() {
        customer.remove(listeners);
    }


    @Override
    public String notifyObserver() {
        for(Listeners allObservers : customer) {
            listeners.update();
            System.out.println(getNews());
        }
        return news;
    }


    public void setNews(String news) {
        this.news = news;
    }


    public String getNews() {
        return news;
    }


    public int getSubscribersSize() {
//        for(Listeners member: customer) System.out.println(member);
        return customer.size();
    }

    public String toString() {
        return String.format("");
    }
}
