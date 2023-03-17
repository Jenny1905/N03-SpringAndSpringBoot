package org.tnsif.autowireexample;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
//Program to demonstrate on autowire concept
//driver class
public class Executor {

	public static void main(String[] args) {
		ApplicationContext c=new ClassPathXmlApplicationContext("beans.xml");
		Bike b=c.getBean("bike",Bike.class);
		b.accept();
	}

}
