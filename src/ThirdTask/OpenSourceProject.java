package zadatak_4;

import java.util.ArrayList;
import java.util.List;

public class OpenSourceProject implements ObservableInterface {

    private List<Observer> collaborators = new ArrayList<>();

    @Override
    public void addObserver(Observer observer) {
        collaborators.add(observer);
        System.out.println( observer.toString() + "has been added to the project");
    }

    @Override
    public void removeObserver(Observer observer) {
        collaborators.remove(observer);
        System.out.println( observer.toString() + "has been removed from the project");
    }

    @Override
    public void notifyObservers(String changeDescription, String dateTime, String codeChange, Programmer contributor) {
        for (Observer observer : collaborators) {
            observer.update(changeDescription, dateTime, codeChange, contributor);
        }
    }

    public void makeCodeChange(String changeDescription, String dateTime, String codeChange, Programmer contributor) {
        System.out.println(contributor + " made a change in project: " + changeDescription);
        notifyObservers(changeDescription, dateTime, codeChange, contributor);
    }
}
