package cn.guan.web;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.guan.control.GetIoc;
import cn.guan.dao.UserDao;
import cn.guan.deal.LoginService;

@Controller
public class LoginController {

	@Resource
	private UserDao userdao;

	@RequestMapping(value = "/index")
	public String index(HttpServletRequest request, HttpServletResponse response) {
		return "Login";
	}

	@RequestMapping(value = "/login")
	public String Login(HttpServletRequest request, HttpServletResponse response) {
		ApplicationContext context = GetIoc.getIoc();
		if (((LoginService) context.getBean("loginservice")).logon(userdao,request)) {
			return "Main";
		} else {
			return "Login";
		}
	}

}
