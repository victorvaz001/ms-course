package com.victorvaz.hrpayroll.services;

import org.springframework.stereotype.Service;

import com.victorvaz.hrpayroll.entities.Payment;

@Service //registra a classe como componente do Spring
public class PaymentService {
	
	public Payment getPaymenet(Long workerId, int days) {
		return new Payment("Bob", 200.00, days); //instancia o pagamento mocado
	}
}
