package kp.kataparrot;

public class NorwegianBlueParrot extends Parrot{
	private double voltage;
	private boolean isNailed;
	protected static final double MAXIMUM_SPEED = 24.0;
	
	public NorwegianBlueParrot(double voltage, boolean isNailed) {
		super();
		this.voltage = voltage;
		this.isNailed = isNailed;
	}
	
	@Override
	public double getSpeed() {
		if (isNailed)
			return 0;
		else
			return Math.min(NorwegianBlueParrot.MAXIMUM_SPEED, voltage * BASE_SPEED);
	}
	
	

}
