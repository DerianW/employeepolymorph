package employeepolymorph ;

public class Employee
{
    private String firstName ;
    private String lastName ;
    private int employeeID ;
    protected float bonus = 50 ;

    public Employee(String firstName, String lastName, int employeeID)
    {
        this.firstName = firstName ;
        this.lastName = lastName ;
        this.employeeID = employeeID ;
    }

    public float paycheck(){ return 0 ; }

    public String bonusAlert(Employee type)
    {
        return type.getClass().getSimpleName() + " got a bonus of " + bonus +
                " and now earns " + ( type.paycheck() + bonus ) ;
    }

    public void printEmployeeFullName(Employee type)
    {
        System.out.println(type.firstName + " " + type.lastName) ;
    }
}