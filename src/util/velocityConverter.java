package util;

public class velocityConverter {

	public static double convertMs(double velocity) {
		return velocity / 3.6;
	}

	public static double convertkm(double velocity) {
		return velocity * 3.6;
	}
	
	public double ms;
	public double km;
	
	public double velocityms() {
		return ms / 3.6;
	}
	
	public double velocitykm() {
		return km * 3.6;
	}
}

