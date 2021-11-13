package com.company;

public class Main {

    public static void main(String[] args) {
        Waiter w = new Waiter(1, "Mario", 24, 5000000, 2000000);
        System.out.println(w);
        Kitchen k = new Kitchen(2, "Tadaima", 25, 6000000, 1500000);
        System.out.println(k);

    }
}
