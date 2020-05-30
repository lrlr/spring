package com;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description: TODO 
 * @Author lirui
 * @Date 2020/5/30 
 * @Version V1.0
**/
@Service(value = "service")
@Scope("singleton")
public class UserServiceImpl  {
	public UserServiceImpl() {
		System.out.println(this.getClass().getSimpleName() + " 构造函数执行...");
	}
}
