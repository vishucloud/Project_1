package com.purplewisteria.DIDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.purplewisteria.DIDemo.controllers.ConstructorInjectedController;
import com.purplewisteria.DIDemo.controllers.GetterInjectedController;
import com.purplewisteria.DIDemo.controllers.MyController;
import com.purplewisteria.DIDemo.controllers.PropertyInjectedController;

/*
 Setting up Spring its components & do the dependency injection for us.
 */
// Understanding Spring 'Application Context'...

@SpringBootApplication
public class DiDemoApplication {

	public static void main(String[] args) {
		
		// Obtaining the Spring Application context...
		
	/*
	 Bean got created by the spring IoC, we ask the context which 
	 is holding the reference to the bean..
	 */
		
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);

		MyController controller = (MyController) ctx.getBean("myController");

		System.out.println(controller.hello());
		
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		System.out.println(ctx.getBean(GetterInjectedController.class).sayHello());
		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello());
	}

}

