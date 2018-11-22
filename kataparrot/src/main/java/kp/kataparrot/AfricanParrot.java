package kp.kataparrot;

public class AfricanParrot extends Parrot {
	private int numberOfCoconuts;
	protected static final double LOAD_FACTOR = 9.0;

	public AfricanParrot(int numberOfCoconuts) {
		super();
		this.numberOfCoconuts = numberOfCoconuts;
	}
	
	@Override
	public double getSpeed() {
		return Math.max(0, BASE_SPEED - AfricanParrot.LOAD_FACTOR * numberOfCoconuts);
	}
}
