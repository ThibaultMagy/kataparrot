package kp.kataparrot;

public class AfricanParrot extends Parrot {
	public AfricanParrot(int numberOfCoconuts) {
		super(ParrotTypeEnum.AFRICAN, numberOfCoconuts, 0, false);
	}
	
	@Override
	public double getSpeed() {
		return Math.max(0, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
	}
}
