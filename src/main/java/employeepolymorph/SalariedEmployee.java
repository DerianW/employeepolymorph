package employeepolymorph ;

public class SalariedEmployee extends Employee
{
    private float weeklySalary ;

    public SalariedEmployee(String firstName, String lastName, int employeeID, float weeklySalary)
    {
        super(firstName, lastName, employeeID) ;
        this.weeklySalary = weeklySalary ;
    }

    @Override
    public String paycheck(){ return "The salaried employee earned " + weeklySalary ; }
}