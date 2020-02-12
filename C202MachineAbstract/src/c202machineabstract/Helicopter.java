package c202machineabstract;

import static c202machineabstract.Machine.things;
import static c202machineabstract.TaxInfo.BASIC_TAX;

public class Helicopter extends Machine implements TaxInfo{
    
    String make;
    String model;
    int miles;
	int rotorrpm;
    
    
    public Helicopter(){ super();}
    public Helicopter(String make, String model, int miles){
        super();
        this.make = make;
        this.model = model;
        this.miles = miles;
    }
    
    public void move(){
        System.out.println("This is a helicopter ... you fly it vertically in the air!");
    }

    @Override
    public String toString() {
        
        String ans = super.toString()+ "Helicopter:" + "\nmake=" + make 
                + "\nmodel=" + model + "\nmiles=" + miles +"\n" +
                "Value "+getValue()+"\n"+ "Tax:"+ calcTax()+" we have "+
                things+ " things \n\n*********************\n";
        return ans;
    }
    public double calcTax(){
        return getValue()*LUXURY_TAX;
        
    }//tax
}//class