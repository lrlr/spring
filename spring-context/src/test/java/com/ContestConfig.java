package com;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @ClassName ContestConfig
 * @Description: TODO 
 * @Author lirui
 * @Date 2020/5/30 
 * @Version V1.0
**/
@Configuration
public class ContestConfig {
	public UserServiceImpl userService(){
		return new UserServiceImpl();
	}
}
