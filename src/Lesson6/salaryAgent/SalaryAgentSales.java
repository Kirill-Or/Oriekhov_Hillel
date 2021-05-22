package Lesson6.salaryAgent;

public class SalaryAgentSales {

    int hour;
    double ratePerHour;
    int experience;
    int numberOfSales;
    double salesAmount;
    double salary;


    public SalaryAgentSales(int hour, double ratePerHour, int experience, int numberOfSales, double salesAmount) {
        this.hour = hour;
        this.ratePerHour = ratePerHour;
        this.experience = experience;
        this.numberOfSales = numberOfSales;
        this.salesAmount = salesAmount;
        setSalary(overtimeBonus() + (ratePerHour * 160 * experienceCoefficient()) +
                quantityBonus() + bonusForTheAmount());

    }

    public SalaryAgentSales(int hour, double ratePerHour) {
        this.hour = hour;
        this.ratePerHour = ratePerHour;
        setSalary(overtimeBonus() + (ratePerHour * hour) );
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public double getRatePerHour() {
        return ratePerHour;
    }

    public void setRatePerHour(double ratePerHour) {
        this.ratePerHour = ratePerHour;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getNumberOfSales() {
        return numberOfSales;
    }

    public void setNumberOfSales(int numberOfSales) {
        this.numberOfSales = numberOfSales;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double overtimeBonus() {
        if (hour > 160)
            return ((hour - 160) * 1.5);
        else {
            return 0;
        }
    }

    public double experienceCoefficient() {
        if (experience < 2) {
            return 1.0;
        } else if (experience >= 2 & experience < 4) {
            return 1.2;
        } else if (experience >= 4 & experience < 6) {
            return 1.3;
        } else
            return 1.4;

    }

    public double quantityBonus() {
        if (numberOfSales > 20) {
            return 250;
        } else if (numberOfSales < 10) {
            return -150;
        } else
            return 0;

    }

    public double bonusForTheAmount() {
        if (salesAmount > 15000) {
            return 1000;
        } else
            return 0;
    }

}