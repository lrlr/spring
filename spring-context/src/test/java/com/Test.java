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
	@org.junit.Test
	public  void main() {
		AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(ContestConfig.class);
		UserServiceImpl bean = (UserServiceImpl)annotationConfigApplicationContext.getBean(UserServiceImpl.class);
		System.out.println(bean);
	}
}
