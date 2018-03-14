package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		Student s2=context.getBean("stud2",Student.class);
		s2.sayHello();
		((ConfigurableApplicationContext)context).close();
	}

}
