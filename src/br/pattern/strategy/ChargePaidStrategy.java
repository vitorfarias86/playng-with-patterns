package br.pattern.strategy;

public class ChargePaidStrategy implements NotificationStrategy {

	@Override
	public void process(String order, String message) {
		System.out.println("charge paid");
	}

}
