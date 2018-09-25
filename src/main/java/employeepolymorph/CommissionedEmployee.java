package employeepolymorph ;

public class CommissionedEmployee extends Employee
{
    private float grossSales ;
    private float commissionRate ;

    public CommissionedEmployee(String firstName, String lastName, int employeeID,
                                float grossSales, float commissionRate)
    {
        super(firstName, lastName, employeeID) ;
        this.grossSales = grossSales ;
        this.commissionRate = commissionRate ;
    }

    public float getGrossSales(){ return grossSales ; }
    public float getCommissionRate(){ return commissionRate ; }

    @Override
    public String paycheck(){ return "The commissioned employee earned: " + commissionRate * grossSales ; }
}