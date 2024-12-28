package designPattern.behavioralDesignPattern.observerPattern;

import java.util.ArrayList;
import java.util.List;

interface Observer {
    void update(String message);
}

class Subscriber implements Observer {
    private String name;

    public Subscriber(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println(name + " received update: " + message);
    }
}

public class ChannelObserverPattern {
    private List<Observer> subscribers = new ArrayList<>();

    public void subscribe(Observer observer) {
        subscribers.add(observer);
    }

    public void notifySubscribers(String message) {
        for (Observer subscriber : subscribers) {
            subscriber.update(message);
        }
    }

    public static void main(String[] args) {
        ChannelObserverPattern channel = new ChannelObserverPattern();
        Observer user1 = new Subscriber("User1");
        channel.subscribe(user1);
        channel.notifySubscribers("New Video Uploaded");
    }
}
