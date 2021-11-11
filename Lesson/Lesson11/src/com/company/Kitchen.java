package com.company;

import java.text.DecimalFormat;

public class Kitchen extends Employee {
    double serviceCharge;

    public Kitchen(int id, String name, int age, double basicSalary, double serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public double getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(double serviceCharge) {
        this.serviceCharge = serviceCharge;
    }

    DecimalFormat formatter = new DecimalFormat("###,###,###");

    @Override
    public double calculatorSalary() {
        return basicSalary + serviceCharge;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " - " + formatter.format(calculatorSalary()) + " VNĐ";
    }
}
