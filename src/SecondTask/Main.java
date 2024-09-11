package SecondTask;

public class Main {

    public static void main(String[] args) {
        Magazine monthlyMagazine = new Magazine("Monthly Magazine");
        Magazine quartetrlyMagazine = new Magazine("Quarterly Magazine");

        Subscriber subscriber1 = new Subscriber("Subscriber 1", "subscriber@email.com");
        Subscriber subscriber2 = new Subscriber("Subscriber 2", "subscriber2@email.com");

        monthlyMagazine.addObserver(subscriber1);
        monthlyMagazine.addObserver(subscriber2);
        quartetrlyMagazine.addObserver(subscriber2);

        monthlyMagazine.publishNewIssue("January ");
        quartetrlyMagazine.publishNewIssue("January 1");

        monthlyMagazine.removeObserver(subscriber2);

        quartetrlyMagazine.publishNewIssue("Quarter 2");


    }
}
