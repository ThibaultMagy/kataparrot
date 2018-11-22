package kp.kataparrot;

public class NorwegianBlueParrot extends Parrot{
	private double voltage;
	private boolean isNailed;
	
	public NorwegianBlueParrot(double voltage, boolean isNailed) {
		super(ParrotTypeEnum.NORWEGIAN_BLUE);
		this.voltage = voltage;
		this.isNailed = isNailed;
	}
	
	@Override
	public double getSpeed() {
		if (isNailed)
			return 0;
		else
			return Math.min(MAXIMUM_SPEED, voltage * BASE_SPEED);
	}
	
	

}
