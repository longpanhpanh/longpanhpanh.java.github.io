package Generic;

public class Waiter extends Employee {
    private int compensate;

    public Waiter(int id, String name, int age, int basicSalary, int compensate) {
        super(id, name, age, basicSalary);
        this.compensate = compensate;
    }

    public int getCompensate() {
        return compensate;
    }

    public void setCompensate(int compensate) {
        this.compensate = compensate;
    }

    @Override
    public int calculatorSalary() {
        return getBasicSalary() + compensate;
    }

    @Override
    public String toString() {
        return super.toString() + "Lương: " + calculatorSalary();
    }
}
