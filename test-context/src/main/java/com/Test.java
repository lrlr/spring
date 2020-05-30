package com;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

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
		UserServiceImpl bean = (UserServiceImpl)annotationConfigApplicationContext.getBean("userServiceImpl");
		System.out.println(bean);
	}
}
