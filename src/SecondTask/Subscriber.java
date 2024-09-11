package SecondTask;

public class Subscriber implements Observer{
    private String name;
    private String email;

    public Subscriber(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public void update(String newIssue) {
        System.out.println(" Dear " + name + " you have received the latest magazine issue " + newIssue + "to email:" + email);
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
