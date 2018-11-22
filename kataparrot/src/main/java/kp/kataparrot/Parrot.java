package kp.kataparrot;

public class Parrot {

	protected static final double MAXIMUM_SPEED = 24.0;
	protected static final double LOAD_FACTOR = 9.0;
	protected static final double BASE_SPEED = 12.0;
	private ParrotTypeEnum type;
	protected int numberOfCoconuts;
	private double voltage;
	private boolean isNailed;

	public Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
		this.type = _type;
		this.numberOfCoconuts = numberOfCoconuts;
		this.voltage = voltage;
		this.isNailed = isNailed;
	}
	
	public Parrot() {
	}

	public double getSpeed() {
		switch (type) {
		case EUROPEAN:
			throw new RuntimeException("Should be unreachable");
		case AFRICAN:
			throw new RuntimeException("Should be unreachable");
		case NORWEGIAN_BLUE:
			return (isNailed) ? 0 : getBaseSpeed(voltage);
		}
		throw new RuntimeException("Should be unreachable");
	}

	private double getBaseSpeed(double voltage) {
		return Math.min(MAXIMUM_SPEED, voltage * BASE_SPEED);
	}

}