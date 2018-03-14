package co.edureka;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("context.xml");
		Student st1=context.getBean("stud1",Student.class);
		st1.hello();
		((ConfigurableApplicationContext) context).close();

	}

}
