package Generic;

import java.util.ArrayList;

public class Repository {
    ArrayList<Waiter> listWaiters;
    ArrayList<Kitchen> listKitchen;

    public ArrayList<Waiter> getListWaiters() {
        listWaiters = new ArrayList<>();
        listWaiters.add(new Waiter(1, "Hà", 24, 50000000, 1500000));
        listWaiters.add(new Waiter(2, "Linh", 22, 50000000, 2000000));
        listWaiters.add(new Waiter(3, "Đạt", 25, 50000000, 3000000));
        return listWaiters;
    }


    public ArrayList<Kitchen> getListKitchen() {
        listKitchen = new ArrayList<>();
        listKitchen.add(new Kitchen(1, "Vân Anh", 27, 6000000, 1500000));
        listKitchen.add(new Kitchen(2, "Tú", 25, 6000000, 1000000));
        listKitchen.add(new Kitchen(3, "Dương", 31, 8000000, 2000000));
        return listKitchen;

    }

    public void printList(ArrayList<? extends Employee> list) {
        for (Object o: list) {
            System.out.println(o);
        }
    }
}
