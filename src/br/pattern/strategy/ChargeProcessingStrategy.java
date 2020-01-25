package br.pattern.strategy;

public class ChargeProcessingStrategy implements NotificationStrategy {

	@Override
	public void process(String order, String message) {
		System.out.println("charge processing");
		
	}
}
