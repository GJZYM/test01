package cn.guan.control;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetIoc {

	public static ApplicationContext getIoc(){
		return new ClassPathXmlApplicationContext("bean.xml");
	}
	
}
