package br.pattern.main;

import br.pattern.factory.NotificationFactory;

public class Main {

	public static void main(String[] args) {
		
		NotificationFactory.factory("charge.refunded").process("order","message");
	}
}
