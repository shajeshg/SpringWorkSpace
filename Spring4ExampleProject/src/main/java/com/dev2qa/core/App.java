package com.dev2qa.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dev2qa.core.spring.HelloWorldExample;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	/* Get Spring context. */
    	ApplicationContext springContext = new ClassPathXmlApplicationContext("SpringBeansConfig.xml");

    	/* Get HelloWorldExample bean by it's id. */
		HelloWorldExample instance = (HelloWorldExample) springContext.getBean("helloWorldBean");
		
		/* Invoke the bean's method. */
		instance.printHello();
    }
}
