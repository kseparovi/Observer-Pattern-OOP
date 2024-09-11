package zadatak_1;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class OnlineStore implements ObservableInterface{

    private String storeName;
    private int storeId;
    private ArrayList<Customer> customers;
    private Item item;

    public OnlineStore(String storeName) {
        customers = new ArrayList<Customer>();
        this.storeName = storeName;
        this.storeId = ThreadLocalRandom.current().nextInt(100000);
    }

    public void setItemAvailability(Item item){
        this.item = item;
    }

    @Override
    public void add2AvailLst(Customer cst) {
        customers.add(cst);
    }

    @Override
    public void remove4AvailLst(Customer cst) {
        if(!customers.contains(cst)) {
            System.out.println("There is no such customer on our list");
        } else {
            customers.remove(cst);
        }
    }

    @Override
    public void notifyCsts() {
        for(Customer cst : customers) {
            cst.update(item, storeName);
        }
    }
}
