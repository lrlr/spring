package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName Test
 * @Description: TODO
 * @Author lirui
 * @Date 2020/5/30
 * @Version V1.0
**/
public class Test {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(Spring.class);
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
		UserServiceImpl bean = (UserServiceImpl)context.getBean("service");
		System.out.println(bean);
	}
}
