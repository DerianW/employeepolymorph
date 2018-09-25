package employeepolymorph ;

public class Employee
{
    private String firstName ;
    private String lastName ;
    private int employeeID ;

    public Employee(String firstName, String lastName, int employeeID)
    {
        this.firstName = firstName ;
        this.lastName = lastName ;
        this.employeeID = employeeID ;
    }

    public String paycheck(){ return "" ; }
}