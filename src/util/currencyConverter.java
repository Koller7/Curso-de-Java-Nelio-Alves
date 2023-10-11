package util;

public class currencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double dollarConvert(double dollarPrice, double dollarBought) {
		return dollarPrice * dollarBought * (1.0 + IOF);
	}
}
