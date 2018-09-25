package employeepolymorph ;

public class HourlyEmployee extends Employee
{
    private float hoursWorked ;
    private float hourlyWage ;

    public HourlyEmployee(String firstName, String lastName, int employeeID, float hoursWorked, float hourlyWage)
    {
        super(firstName, lastName, employeeID) ;
        this.hoursWorked = hoursWorked ;
        this.hourlyWage = hourlyWage ;
    }

    @Override
    public float paycheck(){ return hourlyWage * hoursWorked ; }
}