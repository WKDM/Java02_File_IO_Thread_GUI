package cn.itcast.dao;

import cn.itcast.pojo.User;

public interface UserDao{
	/**
	 * @version 1.1
	 * */
	public abstract void register(User user);
	public abstract boolean isLogin(String username,String password);
	
}
