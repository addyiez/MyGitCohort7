package com.acc.spring.annotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acc.converter.CurrencyConverter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       // System.out.println( "Hello World!" );
    	ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
    	CurrencyConverter curCon=(CurrencyConverter)ctx.getBean("currencyConverter");
    	System.out.println("=======Currency Converter=====");
    	System.out.println(curCon.dollarsToRupees(80));
    	curCon=null;
    	ctx.close();
    }
}
