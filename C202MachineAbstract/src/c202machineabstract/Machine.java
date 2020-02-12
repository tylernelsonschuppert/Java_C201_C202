

package c202machineabstract;

/**
 *
 * @author DrBobWalsh
 */
public abstract class Machine implements TaxInfo {
    
    private String color;
    private String location;
    private double value;
    private boolean loan;
    
    static int things=0;
    
    //constructor w defaults
    public Machine(){
        things++;
        color = "none";
        location = "Not placed yet";
        value = 0;
        loan = false;
    }// default constructors
    
    public Machine (String color, String location, double value){
        things++;
        loan = false;
        this.color = color;
        this.location = location;
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String Location) {
        this.location = Location;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public boolean isLoan() {
        return loan;
    }

    public void setLoan(boolean loan) {
        this.loan = loan;
    }
    
    public abstract void move();

    @Override
    public String toString() {
        String ans = "Machine" + "\ncolor=" + color + 
                "\nlocation=" + location + "\nvalue=" 
                + value + "\nIs there a loan? " + loan +"\n";
        
        return ans;
    }//to string
    
    
}//class
