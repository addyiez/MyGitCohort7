package com.acc.service;
import javax.annotation.*;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("exchangeService")
public class ExchangeServiceImpl implements ExchangeService{
	
	@Value("56")
 private double exchangeRate;
	
public void setExchangeRate(double exchangeRate) {
	this.exchangeRate = exchangeRate;
}
	public double getExchangerate() {
		// TODO Auto-generated method stub
		return exchangeRate;
	}
	
@PostConstruct  //acts as init-method of bean entry
	public void init() {
	
	this.exchangeRate=this.exchangeRate-this.exchangeRate*.15;
	System.out.println("Custom InitializationLogic");
}

@PreDestroy  // acts as destroy method
public void clean() {
	System.out.println("Custom destroy/cleaning ");
}

}
