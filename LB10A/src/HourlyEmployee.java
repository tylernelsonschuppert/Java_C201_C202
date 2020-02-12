/*
 *  Documentation header goes here
 *  This is a subclass of superclass Employee.
 *  @since 11/18/18
 *  @version LB10A
 * */
public class HourlyEmployee extends Employee{  
   //define additional properties for the subclass
    private double hourlyRate;
	private double hoursWorkedPerWeek;
    
    public HourlyEmployee(){
       System.out.println("Subclass HourlyEmployee const. no-args invoked");
	   hourlyRate = 10.00;
	   hoursWorkedPerWeek = 40.00;
    }
    //Overloaded constructor with arguments
    public HourlyEmployee(String firstName, String lastName, 
						  double hourlyRate, double hoursWorkedPerWeek){
        super(firstName, lastName);
        System.out.println("Subclass HourlyEmployee const. w/args invoked");
		this.hourlyRate = hourlyRate;
		this.hoursWorkedPerWeek = hoursWorkedPerWeek;
    }
    
    //define method setHours
    public void setHours(double newHours) {
		hoursWorkedPerWeek = newHours;
	}
	
    //define method setPayRate
    public void setPayRate(double newPayRate) {
		hourlyRate = newPayRate;
	}
	
    //define method setHoursAndRate
    public void setHoursAndRate(double newHours, double newPayRate) {
		hoursWorkedPerWeek = newHours;
		hourlyRate = newPayRate;
	}
	
    //define method getHours
    public double getHours() {
		return hoursWorkedPerWeek;
	}
	
    //define method getRate
	public double getRate() {
		return hourlyRate;
	}
    
    /*define method getGrossPay 
     * Pay $10/hour upto 40 hours, 1.5 time pay for hours above 40.
    */
	public double getGrossPay() {
		double grossPay;
		grossPay = 0;
		double difference;
		difference = 0;
		if (hoursWorkedPerWeek <= 40.00) {
			grossPay = hoursWorkedPerWeek * hourlyRate;
		}
		if (hoursWorkedPerWeek > 40.00) {
			grossPay += (40.00 * hourlyRate);
			difference = (hoursWorkedPerWeek - 40.00);
			grossPay += ((hourlyRate*1.5) * difference);
		}
		return grossPay;
	}
    
    //Hourly employee toString method overrides the superclass toString method
    public String toString(){
        //should print general employee data
		return super.toString() + 
        //along with hours worked, rate of pay, and gross pay
		"\n" + "Hours Worked: " + getHours() + "  Pay Rate: " + getRate() +
		"\n" + "Gross Pay: " + getGrossPay();
		//  return null; // this is a place holder, you should return a proper String.
    }
}
