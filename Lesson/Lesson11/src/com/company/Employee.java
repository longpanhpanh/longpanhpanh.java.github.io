package com.company;

import java.text.DecimalFormat;
import java.util.Formattable;
import java.util.Formatter;

public abstract class Employee {
    int id;
    String name;
    int age;
    double basicSalary;

    public Employee(int id, String name, int age, double basicSalary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.basicSalary = basicSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }



    public abstract double calculatorSalary();


    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " - " + calculatorSalary();
    }
}
