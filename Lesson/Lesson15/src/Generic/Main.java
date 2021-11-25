package Generic;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        ArrayList<? extends Employee> list;
        Repository repo = new Repository();
        Scanner sc = new Scanner(System.in);
        System.out.println("1. In danh sách Waiter");
        System.out.println("2. In danh sách Kitchen");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                list = repo.getListWaiters();
                repo.printList(list);
            break;
            case 2:
                list = repo.getListKitchen();
                repo.printList(list);
        }

    }
}

