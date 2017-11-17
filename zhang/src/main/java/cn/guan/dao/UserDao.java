package cn.guan.dao;

import cn.guan.domain.User;

public interface UserDao {
	
	public abstract User findByUsername(String username);

}
