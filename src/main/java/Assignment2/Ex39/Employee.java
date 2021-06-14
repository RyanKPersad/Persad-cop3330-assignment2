package Assignment2.Ex39;


public class Employee {
    private String firstName;
    private String lastName;

    private String department;
    private double separationDate;

    // constructor
    public Employee(String firstName, String lastName,
                    String department,double separationDate)
    {
        this.firstName = firstName;
        this.lastName = lastName;

        this.department = department;
        this.separationDate=separationDate;
    }

    // set firstName
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    // get firstName
    public String getFirstName()
    {
        return firstName;
    }

    // set lastName
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    // get lastName
    public String getLastName()
    {
        return lastName;
    }



    // set department
    public void setDepartment(String department)
    {
        this.department = department;
    }

    // get department
    public String getDepartment()
    {
        return department;
    }

    public void setseparationDate(double separationDate)
    {
        this.separationDate = separationDate;
    }

    // get salary
    public double getseparationDate()
    {
        return separationDate;
    }

    // return Employee's first and last name combined
    public String getName()
    {
        return String.format("%s %s", getFirstName(), getLastName());
    }

    // return a String containing the Employee's information
    @Override
    public String toString()
    {
        return String.format("%-8s %-8s %s %8.0f",
                getFirstName(), getLastName(), getDepartment(),getseparationDate());
    }

}
