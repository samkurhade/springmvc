package com.aop;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.aop.services.PaymentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
        
        @SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("com/aop/config.xml");
        PaymentService paymentObject = context.getBean("payment", PaymentService.class);
        
        //Auth , print payment started
        paymentObject.makePayment(45);
    }
}
