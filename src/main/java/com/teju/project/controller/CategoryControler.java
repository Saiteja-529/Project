package com.teju.project.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.teju.project.dao.CategoryDao;
import com.teju.project.dao.CategoryDaoImpl;
import com.teju.project.pojo.Category;

@Controller
public class CategoryControler
{
	 @Autowired
	CategoryDao cda;
		   
		    @RequestMapping("/category")

		    public ModelAndView m2()
		    {
		        ModelAndView mv2=new ModelAndView("showcategory","cat",new Category());
		        List allproducts=cda.getAll();
		        mv2.addObject("catinfo", allproducts);
		        return mv2;
		    }
		    
		    
		    @RequestMapping(value="/addcategory",method=RequestMethod.POST)
		     public ModelAndView save(@ModelAttribute("cat") Category cat)
		        {
		    	   cda.insert(cat);
		    	   List allcategory=cda.getAll();
		        ModelAndView mv=new ModelAndView("showcategory","catinfo",allcategory);
		        return mv;
		        }
		    
		    @RequestMapping("/deletecat")
		    public ModelAndView deleteCategory(@RequestParam("catid") int categoryId)
		    { 
		    	cda.delete(categoryId);
		    	List allproducts=cda.getAll();
		    	 ModelAndView mv=new ModelAndView("showcategory","cat",new Category());
		    	 mv.addObject("catinfo", allproducts);
				return mv;
		    }
		    @RequestMapping("/editcat")
		    public ModelAndView editCat(@RequestParam("catid") int categoryId)
		    { 
		    	Category category=cda.editCategory(categoryId);
		    	List allproducts=cda.getAll();
		    	 ModelAndView mv=new ModelAndView("showcategory","cat", category);
		    	 mv.addObject("catinfo", allproducts);
				return mv;
		    }

}