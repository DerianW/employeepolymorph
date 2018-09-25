package employeepolymorph ;

public class BasePlusEmployee extends CommissionedEmployee
{
    private float baseSalary ;

    public BasePlusEmployee(String firstName, String lastName, int employeeID,
                            float grossSales, float commissionRate, float baseSalary)
    {
        super(firstName, lastName, employeeID, grossSales, commissionRate) ;
        this.baseSalary = baseSalary ;
    }

    @Override
    public String paycheck(){ return "The base plus employee earned " +
                            ( super.getCommissionRate() * super.getGrossSales() + baseSalary ) ; }
}