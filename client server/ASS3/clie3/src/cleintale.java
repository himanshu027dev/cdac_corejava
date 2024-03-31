import vehicles3.Vehicle;
import vehicles3.FourWheeler;
import vehicles3.TwoWheeler;
import vehicles3.plane;

public class cleintale {
    static void perform(Vehicle ref){
        ref.speedUp(5);
        ref.changeGear(4);
        ref.applyBrakes(1);

        if(ref instanceof plane){
            plane p =  (plane) ref;
            p.FLY();
        }



    }
    public static void main(String[] args){

       
        perform(new FourWheeler());
		perform(new TwoWheeler());
        perform(new plane());



    }
}
