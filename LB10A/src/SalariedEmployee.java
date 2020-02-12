/*
 *  Documentation header goes here
 *  This is a subclass of superclass Employee.
 *  @since 11/18/18
 *  @version LB10A
 * */
public class SalariedEmployee extends Employee{
    //define additional properties in subclass
    //Note: first name, last name, date hired all derived from superclass
    private String title;
    private double weeklySalary;
        
    public SalariedEmployee(){
       System.out.println("Subclass SalariedEmployee const. no-arg invoked");
       title = "no title set";
       weeklySalary = 50000.00;
    }
    //Overloaded constructor has different parameters
    public SalariedEmployee(String firstName, String lastName, 
                            String title, double weeklySalary){
        super(firstName, lastName);
        System.out.println("Subclass SalariedEmployee const. w/args invoked");
        this.title = title;
        this.weeklySalary = weeklySalary;
    }
       
    public void setTitle(String newTitle){
        title = newTitle;
    }
    public void setSalary(double newSalary){
        weeklySalary = newSalary;
    }
    public String getTitle(){
        return title;
    }
    public double getSalary(){
        return weeklySalary;
    }
    //This toString method overrides the toString method in the superclass
    /* Modify this toString method to get the name and hire date from toString method in Employee class. 
       This allows us to eliminate the first line of the return statement. We can use super keyword to 
       invoke parent's method when methods are overridden.( item #5 of Word Doc)
     */
    @Override
    public String toString(){
 //     return "\nSalaried Employee print method \n" + "Employee: " + getName() + "  Date Hired: " +
		return super.toString() + 
 //     getHireDate().toString() +"\n" + "Title: " + getTitle() + "  Salary: " + getSalary() + "\n";
		"\n" + "Title: " + getTitle() + "  Salary: " + getSalary() + "\n";
    }
}