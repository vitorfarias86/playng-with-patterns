package br.pattern.strategy;

public class ChargeRefundStrategy implements NotificationStrategy{

	@Override
	public void process(String order, String message) {
		System.out.println("refund order");
		
	}
}
