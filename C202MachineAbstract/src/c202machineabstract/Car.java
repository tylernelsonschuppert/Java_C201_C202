

package c202machineabstract;

public class Car extends Machine implements TaxInfo{
    
    String make; /// like a Toyota
    String model; // like RAV4
    int miles;
    
    
    public Car(){ super();}
    public Car(String make, String model, int miles){
        super();
        this.make = make;
        this.model = model;
        this.miles = miles;
    }// with stuff
    
    public void move(){
        System.out.println("This is a car ... you drive it on a road!");
    }//move

    @Override
    public String toString() {
        
        String ans = super.toString()+ "Car:" + "\nmake=" + make 
                + "\nmodel=" + model + "\nmiles=" + miles +"\n" +
                "Value "+getValue()+"\n"+ "Tax:"+ calcTax()+" we have "+
                things+ " things \n\n*********************\n";
        return ans;
    }
    public double calcTax(){
        return getValue()*BASIC_TAX;
        
    }//tax
}//class
