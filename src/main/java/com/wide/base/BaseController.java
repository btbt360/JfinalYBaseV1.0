package com.wide.base;


import javax.servlet.http.HttpSession;

import com.wide.config.UserToken;
import com.jfinal.core.Controller;

public class BaseController extends Controller{
	
	/**
	 * 获取usertoken
	 * */
	public UserToken getToken(String mark){
		HttpSession session=getSession();
		UserToken ut=(UserToken) session.getAttribute("userToken");
		return ut;
	};
	
	
}
