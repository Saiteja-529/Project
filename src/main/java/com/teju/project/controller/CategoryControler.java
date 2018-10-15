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
import com.teju.project.pojo.Category;

@Controller
public class CategoryControler
{
	 @Autowired
	CategoryDao categoryDao;
		   
		    @RequestMapping("/category")

		    public ModelAndView enterCaterory()
		    {
		        ModelAndView modelandview=new ModelAndView("showcategory","cat",new Category());
		        List allproducts=categoryDao.getAll();
		        modelandview.addObject("catinfo", allproducts);
		        return modelandview;
		    }
		    
		    
		    @RequestMapping(value="/addcategory",method=RequestMethod.POST)
		     public ModelAndView saveCategory (@ModelAttribute("cat") Category category)
		        {
		    	categoryDao.insert(category);
		    	   List allcategory=categoryDao.getAll();
		        ModelAndView modelandview=new ModelAndView("showcategory","catinfo",allcategory);
		        return modelandview;
		        }
		    
		    @RequestMapping("/deletecat")
		    public ModelAndView deleteCategory(@RequestParam("catid") int categoryId)
		    { 
		    	categoryDao.delete(categoryId);
		    	List allproducts=categoryDao.getAll();
		    	 ModelAndView modelandview=new ModelAndView("showcategory","cat",new Category());
		    	 modelandview.addObject("catinfo", allproducts);
				return modelandview;
		    }
		    @RequestMapping("/editcat")
		    public ModelAndView editCategory(@RequestParam("catid") int categoryId)
		    { 
		    	Category category=categoryDao.editCategory(categoryId);
		    	List allproducts=categoryDao.getAll();
		    	 ModelAndView modelandview=new ModelAndView("showcategory","cat", category);
		    	 modelandview.addObject("catinfo", allproducts);
				return modelandview;
		    }

}