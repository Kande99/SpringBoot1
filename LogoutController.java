package com.saraya.firstEasySpringBootProject;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
public class LogoutController {
	@RequestMapping(value="logout-car", method=RequestMethod.GET)
	public String logoutFromApp(HttpServletRequest request) {
		request.getSession().invalidate();
		return "redirect:/login";
	}

/*@SessionAttributes("user")

 	
 	@RequestMapping(value="/logout-todo", method=RequestMethod.GET)
	public String logout(HttpServletRequest request, 
			HttpServletResponse response) { 
 				
 			Authentication auth = SecurityContextHolder.getContext()
 					.getAuthentication();
 			if(auth != null) {
 				new SecurityContextLogoutHandler().logout(request, response, auth);
 				request.getSession().invalidate();
 			}
 			
		return "redirect:/";
	}*/
	
}