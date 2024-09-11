package SecondTask;

import java.util.ArrayList;
import java.util.List;

public class Magazine implements ObservableInterface{
    private String magazineName;
    private String latestIssue;
    private List<Observer> subscribers;

    public Magazine(String name) {
        this.magazineName = name;
        subscribers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        subscribers.add(observer);
        System.out.println( observer + " has been added to the subscriber lst");
    }

    @Override
    public void removeObserver(Observer observer) {
        subscribers.remove(observer);
        System.out.println( observer + " has been removed from the subscriber lst");
    }

    @Override
    public void notifyObservers(String newIssue) {
        for (Observer observer : subscribers) {
            observer.update(newIssue);
        }
    }

    public void publishNewIssue(String issue) {
        latestIssue = issue;
        notifyObservers(issue);
    }

    public String getLatestIssue() {
        return latestIssue;
    }
}
