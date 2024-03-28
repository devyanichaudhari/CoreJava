package com.eb.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HiController 
{
	@RequestMapping(value = "/hii")
	public String info()
	{
		return "webapp/JSP/index.jsp";
	}

	@RequestMapping(value = "/hello")
	public String disp()
	{
		return "webapp/JSP/welcome.jsp";
	}
}
