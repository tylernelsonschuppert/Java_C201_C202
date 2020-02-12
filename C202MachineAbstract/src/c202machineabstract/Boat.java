

package c202machineabstract;

public class Boat extends Machine implements TaxInfo{
    private int housePower;
    private int hours;
    
    public Boat(int h, int hr){
        super();
        this.hours=hr;
        this.housePower=h;
    }//boat

    @Override
    public String toString() {
        String ans;
        ans= super.toString();
        ans = ans + "Boat" + "\nhousePower=" + housePower + "\nhours=" 
                + hours
                +"\nValue: "+ getValue()+"\n" + "Tax: "+ calcTax()+
                "\n we have "+
                things+ " things\n\n***************************\n";
        
        return ans;
    }
    
    public double calcTax(){
        return getValue()*LUXURY_TAX;
    }//calc
    
    public void move(){
        System.out.println("This baby is a boat ... glides on the water!");
    }//move
}//class
