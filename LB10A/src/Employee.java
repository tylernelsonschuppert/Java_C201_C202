/*
 *  Documentation header goes here
 *  This is superclass Employee.  It has subclasses SalariedEmployee and HourlyEmployee.
 *  @since 11/18/18
 *  @version LB10A
 * */
public class Employee {  
    private String firstName;
    private String lastName;
    private java.util.Date hireDate;  //Demonstrates composition
        
    public Employee(){
       System.out.println("Superclass Employee constructor no-arg invoked");
       firstName = "not set";
       lastName = "not set";
       hireDate = new java.util.Date();
    }
    //Overloaded constructor has different parameters 
    public Employee(String firstName, String lastName){
       System.out.println("Superclass Employee constructor w/args invoked");
       this.firstName = firstName;
       this.lastName = lastName;
       hireDate = new java.util.Date();
    }
    
    public void setLastName(String newLast){
        lastName = newLast;   
    }
    public void setFirstName(String newFirst){
        firstName = newFirst;   
    }
    public void setName(String newFirst, String newLast){
        setFirstName(newFirst);
        setLastName(newLast);
    }
    public String getLastName(){
        return lastName;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getName(){
        return getFirstName() + " " + getLastName();
    }
    public java.util.Date getHireDate(){
        return hireDate;
    }
    public String toString(){
        return  "\nEmployee: " + getName() + "  Date Hired: " + getHireDate().toString();
    }
}
