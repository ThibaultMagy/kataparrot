package kp.kataparrot;

public class EuropeanParrot extends Parrot {

	public EuropeanParrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
		super(_type, numberOfCoconuts, voltage, isNailed);
	}
	
	@Override
	public double getSpeed() {
		return 12;
	}

}
