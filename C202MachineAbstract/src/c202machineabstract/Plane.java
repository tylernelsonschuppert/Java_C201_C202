package c202machineabstract;

import static c202machineabstract.Machine.things;
import static c202machineabstract.TaxInfo.BASIC_TAX;
import static c202machineabstract.TaxInfo.LUXURY_TAX;

public class Plane extends Machine implements TaxInfo{
    
    String make;
    String model;
    int miles;
	int hours;
    
    
    public Plane(){ super();}
    public Plane(String make, String model, int miles, int hours){
        super();
        this.make = make;
        this.model = model;
        this.miles = miles;
		this.hours = hours;
    }
	
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	public int getHours() {
		return this.hours;
	}
    
    public void move(){
        System.out.println("This is a plane ... you fly it vertically and horizontally in the air!");
    }
	
    @Override
    public String toString() {
        
        String ans = super.toString()+ "Plane:" + "\nmake=" + make 
                + "\nmodel=" + model + "\nmiles=" + miles +"\n" + "\nHours=" + getHours() +
                "Value "+getValue()+"\n"+ "Tax:"+ calcTax()+" we have "+
                things+ " things \n\n*********************\n";
        return ans;
    }
    public double calcTax(){
        return getValue()*LUXURY_TAX;
        
    }//tax
}//class