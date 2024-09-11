package zadatak_1;

public class Customer {
    private String userName;
    private int id;
    private static int cnt = 1;

    public Customer(String userName) {
        this.id = cnt;
        this.userName = userName;
        cnt++;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userName='" + userName + '\'' +
                ", id=" + id +
                ", cnt=" + cnt +
                '}';
    }

    public void update(Item item, String storeName){
        System.out.println("Notification for customer: ");
        System.out.println(toString());

        System.out.println("****************** " + storeName + " *********************");

        System.out.println("Item: " + item.toString());
        System.out.println("Is now available in our store....");

        System.out.println("////////////////////////////////////////////////////////////\n");
    }
}
