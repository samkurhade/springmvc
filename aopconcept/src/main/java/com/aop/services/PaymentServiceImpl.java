package com.aop.services;

public class PaymentServiceImpl implements PaymentService {

	public void makePayment(int amt) {
		// payment code
		System.out.println(amt+" Amount Debited...");

		
		
		System.out.println(amt+" Amount Credited...");

	}

}
