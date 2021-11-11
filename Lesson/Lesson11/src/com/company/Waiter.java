package com.company;

import java.text.DecimalFormat;

public class Waiter extends Employee {
    double compensate;

    public double getCompensate() {
        return compensate;
    }

    public void setCompensate(double compensate) {
        this.compensate = compensate;
    }

    public Waiter(int id, String name, int age, double basicSalary, double compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    DecimalFormat formatter = new DecimalFormat("###,###,###");

    @Override
    public double calculatorSalary() {
        return basicSalary + compensate;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " - " + formatter.format(calculatorSalary()) + "VNĐ";
    }
}
