package com.durga.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durga.Student;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Autowiring using XML Configuration.................\n");
		
		String Config_file = "/com/durga/resourse/applicationContext.xml";
		ApplicationContext context = new ClassPathXmlApplicationContext(Config_file);
		
		Student std = (Student) context.getBean("stdid");
		
		std.show();

	}

}
