package br.pattern.strategy;

public class NotificationServiceImpl {

	private NotificationStrategy strategy;
	
	public void setStrategy(NotificationStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void process(String order, String message) {
		strategy.process(order, message);
	}
}
