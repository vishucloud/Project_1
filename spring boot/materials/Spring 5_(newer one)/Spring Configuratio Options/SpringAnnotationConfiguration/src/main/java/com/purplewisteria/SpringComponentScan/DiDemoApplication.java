package com.purplewisteria.SpringComponentScan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.purplewisteria.SpringComponentScan.controllers.ConstructorInjectedController;
import com.purplewisteria.SpringComponentScan.controllers.GetterInjectedController;
import com.purplewisteria.SpringComponentScan.controllers.MyController;
import com.purplewisteria.SpringComponentScan.controllers.PropertyInjectedController;

/*
 Setting up Spring its components & do the dependency injection for us.
 */
// Understanding Spring 'Application Context'...

@SpringBootApplication

// Base packages to scan for annotated components..overriding the default 'component scanning' behaviour of spring boot
@ComponentScan(basePackages= {
		                       "com.purplewisteria.services",
		                       "com.purplewisteria.SpringComponentScan.controllers",
		                      }
               )
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
		System.out.println();
		
		System.out.println(" ***************************************Bean Scope **************************************** ");
		
		ConstructorInjectedController cgs1 = ctx.getBean("constructorInjectedController", ConstructorInjectedController.class);
		ConstructorInjectedController cgs2 = ctx.getBean("constructorInjectedController", ConstructorInjectedController.class);
		
		boolean result = (cgs1 == cgs2);
		System.out.println(result);
		System.out.println();
		
		
		
		
		
		
	}

}

