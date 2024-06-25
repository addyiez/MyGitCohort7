package com.acc.converter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.acc.service.ExchangeService;

@Component("currencyConverter")

public class CurrencyConverterImpl implements CurrencyConverter {
	@Qualifier("ExchangeServiceImpl")
 
	private ExchangeService exchangeService;//HAS-A Relationship
	//Constructor based Autowiring
	@Autowired
	public CurrencyConverterImpl(ExchangeService exchangeService) {
		super();
		this.exchangeService = exchangeService;
	}


	public ExchangeService getExchangeService() {
		return exchangeService;
	}


	public void setExchangeService(ExchangeService exchangeService) {
		this.exchangeService = exchangeService;
	}


	public double dollarsToRupees(int dollars) {
		// TODO Auto-generated method stub
		return  exchangeService.getExchangerate()*dollars;
	}

}
