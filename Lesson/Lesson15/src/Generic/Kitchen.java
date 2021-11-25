package Generic;

public class Kitchen extends Employee {
    private int serviceCharge;

    public Kitchen(int id, String name, int age, int basicSalary, int serviceCharge) {
        super(id, name, age, basicSalary);
        this.serviceCharge = serviceCharge;
    }

    public int getServiceCharge() {
        return serviceCharge;
    }

    public void setServiceCharge(int serviceCharge) {
        this.serviceCharge = serviceCharge;
    }


    @Override
    public int calculatorSalary() {
        return getBasicSalary() + serviceCharge;
    }

    @Override
    public String toString() {
        return super.toString() + "Lương: " + calculatorSalary();
    }
}
