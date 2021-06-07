package phone;

/**
 * IPhone
 */
public class IPhone extends Phone implements Ringable{

    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone){
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    
    public String ring(){
        return "IPhone "+this.getVersionNumber()+" says "+this.getRingTone();
    }
    
    public String unlock(){
        return "Unloking via facial recognition";
    }

    public void displayInfo(){
        System.out.println("Iphone "+this.getVersionNumber()+" from "+this.getCarrier());
    }
}