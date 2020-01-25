package br.pattern.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import br.pattern.strategy.ChargePaidStrategy;
import br.pattern.strategy.ChargeProcessingStrategy;
import br.pattern.strategy.ChargeRefundStrategy;
import br.pattern.strategy.NotificationStrategy;

public class NotificationFactory {

	private static Map<String, NotificationStrategy> runner = new HashMap<>();
	
	static {
		runner.put("charge.paid", new ChargePaidStrategy());
		runner.put("charge.refunded", new ChargeRefundStrategy());
		runner.put("charge.processing", new ChargeProcessingStrategy());	
	}
	
	public static NotificationStrategy factory(String type) {
		NotificationStrategy strategy = Optional.ofNullable(runner.get(type)).orElseThrow(() -> new UnsupportedOperationException());
		return strategy;
	}
}
