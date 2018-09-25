package employeepolymorph ;

public class Main
{
    public static void main(String[] args)
    {
        Employee bilboBaggins = new SalariedEmployee("Bilbo", "Baggins",
                229856, 2000);

        Employee jackSparrow = new CommissionedEmployee("Jack", "Sparrow",
                395258, 12000, 0.0807F);

        Employee mrIncredible = new BasePlusEmployee("Robert", "Incredible",
                2882888, 15575, 0.0477F, 800);

        Employee piderman = new HourlyEmployee("peter", "parker",
                92, 20, 7.15F) ;

        Employee[] emps = {bilboBaggins, jackSparrow, mrIncredible, piderman};

        for (Employee e : emps)
        {
            System.out.println("The " + e.getClass().getSimpleName() + " earned " + e.paycheck());
        }

        System.out.println( bilboBaggins.bonusAlert(bilboBaggins) ) ;

        piderman.printEmployeeFullName(piderman);
    }
}