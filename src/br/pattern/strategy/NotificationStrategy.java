package br.pattern.strategy;

public interface NotificationStrategy {

	void process(String order, String message);
}
