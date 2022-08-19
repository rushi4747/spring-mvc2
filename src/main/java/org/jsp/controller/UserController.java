package org.jsp.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.jsp.dao.UserDao;
import org.jsp.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class UserController {

	@Autowired
	private UserDao dao;
	
	@RequestMapping("/load")
	public ModelAndView loadUser()
	{
		ModelAndView view =new ModelAndView();
		view.addObject("user", new User());
		view.setViewName("register.jsp");
		return view;
	}
	@ResponseBody
	@RequestMapping("/save")
	public String saveUser(@ModelAttribute User user)
	{
		dao.saveUser(user);
		return "<html><body>User Saved Successfully...! </body></html>";
	}
	
	@RequestMapping("/get")
	public ModelAndView getUser(HttpServletRequest request,ModelAndView view)
	{
		int id=Integer.parseInt(request.getParameter("id"));
		User user=dao.getUserById(id);
		view.addObject("user",user);
		view.setViewName("view.jsp");
		return view;
	}
	
	@RequestMapping("/update")
	public ModelAndView loadUpdate(ModelAndView view)
	{
		view.addObject("user", new User());
		view.setViewName("edit.jsp");
		return view;
	}
	
	@ResponseBody
	@RequestMapping("/edit")
	public String updateUser(@ModelAttribute User user)
	{
		dao.updateUser(user);
		return "<html><body> User Updated Successfully...! </body></html>";
	}
	
	@RequestMapping("/delete")
	public ModelAndView loadDelete(ModelAndView view)
	{
		view.addObject("user",new User());
		view.setViewName("delete.jsp");
		return view;	
	}
	
	@ResponseBody
	@RequestMapping("/remove")
	public String deleteUser(@ModelAttribute User user)
	{
		dao.deleteUser(user);
		return "<html><body> User Deleted Successfully...! </body></html>";
	}
	
	@RequestMapping("/getAll")
	public ModelAndView getAllUsers(ModelAndView view)
	{
		List<User>  users=dao.getAllUsers();
		view.addObject("users",users);
		view.setViewName("viewAll.jsp");
		return view;
	}
	
}
