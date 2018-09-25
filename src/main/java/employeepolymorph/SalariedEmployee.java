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
    public float paycheck(){ return weeklySalary ; }
}