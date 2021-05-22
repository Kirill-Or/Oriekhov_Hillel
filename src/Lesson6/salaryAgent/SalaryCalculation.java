package Lesson6.salaryAgent;

public class SalaryCalculation {
    public static void main(String[] args) {
        SalaryAgentSales salaryAgentSalesProbation = new SalaryAgentSales(160, 2 );
        SalaryAgentSales salaryAgentSales= new SalaryAgentSales(160 ,2, 2, 15,15000  );
        System.out.println("Salary on Probation :" + salaryAgentSalesProbation.getSalary());
        System.out.println("Salary on Probation :" + salaryAgentSales.getSalary() );

    }
}
