package cn.guan.deal;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.context.ApplicationContext;

import cn.guan.control.GetIoc;
import cn.guan.control.Type;
import cn.guan.dao.UserDao;
import cn.guan.domain.User;

public class LoginService {

	public boolean logon(UserDao userdao, HttpServletRequest request) {
		User user = userdao.findByUsername(request.getParameter("username"));
		if (user != null && request.getParameter("password").equals(user.getPassword().trim())) {
			ApplicationContext context = GetIoc.getIoc();
			String stype;
			Type type;
			if ("1".equals(user.getAuthority().trim())) {
				type = (TypeVip) context.getBean("typev");
			} else {
				type = (TypeTravel) context.getBean("typet");
			}
			stype = type.printout();
			HttpSession session = request.getSession();
			session.setAttribute("contents", stype + ":" + request.getParameter("username"));
			return true;
		} else {
			return false;
		}

	}
}
