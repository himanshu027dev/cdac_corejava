package vehicles3;

public class FourWheeler implements Vehicle {

    public void changeGear(int a)
	{
		// how to change gear in TwoWheeler
        System.out.println("Changing Gear"+a);  //Print statement for demonstration purpose
	}
	public void speedUp(int a)
	{
		System.out.println("speading up"+a*2);// how to speed up TwoWheeler
	}
	public void applyBrakes(int a)
	{
		System.out.println("stoped"+a+"sec");// how to apply brakes of TwoWheeler
	}

}
