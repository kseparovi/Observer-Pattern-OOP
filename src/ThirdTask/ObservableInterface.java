package zadatak_4;

public interface ObservableInterface {
    void addObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers(String changeDescription, String dateTime, String codeChange, Programmer contributor);
}
