package com.teju.project.controller;

import java.util.Collection;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import com.teju.project.dao.AuthenticationDao;
import com.teju.project.dao.LoginDao;
import com.teju.project.pojo.Authentication;

@Controller
public class LoginController 
{
	@Autowired
	LoginDao loginDao;
	@Autowired
	AuthenticationDao authenticationDao;
	
	 @RequestMapping("/Login")
	  public String login()
	  {
		
		  
		  return "login";
	  }

	 @RequestMapping(value="/checklogin",method=RequestMethod.POST)
	  public ModelAndView checkLogin(@RequestParam("e")String userName,@RequestParam("p")String passWord  )
	  {
		
		 loginDao.loginCheck(userName,passWord);
		  return null;
	  }
	 @RequestMapping("/LoginError")
	  public ModelAndView loginError()
	  {
		 
		 
		  return new ModelAndView("LoginError");
	  }
	 
	 
	 
	 @SuppressWarnings("unchecked")
     @RequestMapping(value = "/login_session_attributes")
     public String login_session_attributes(HttpSession session,Model model) 
	 {
      
         String userName = SecurityContextHolder.getContext().getAuthentication().getName();
      
          Authentication  user = authenticationDao.getUser(userName);
          session.setAttribute("userName", user.getUserName());
          session.setAttribute("name", user.getPassWord());
          session.setAttribute("LoggedIn", "true");
         
         
          //session.setAttribute("cartcnt",count);
         Collection<GrantedAuthority> authorities;
         authorities= (Collection<GrantedAuthority>) SecurityContextHolder.getContext().getAuthentication().getAuthorities();
         String page="";
         
         String role="ROLE_USER";
         for (GrantedAuthority authority : authorities)
         {
        	 
        	 System.out.println(authority.getAuthority());
              if (authority.getAuthority().equals(role))
              {
                  session.setAttribute("UserLoggedIn", true);
                  session.setAttribute("UserName", user.getUserName());
              page="/home";
              
                  session.setAttribute("test",1);
                 
              }
              else
              {
                  session.setAttribute("Administrator",true);
                  session.setAttribute("UserName", user.getUserName());
                  page="/administrator";
             
             }
         }
         return page;
     }

	

}
