package com.teju.project.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.teju.project.dao.SupplierDao;
import com.teju.project.pojo.Category;
import com.teju.project.pojo.Product;
import com.teju.project.pojo.Supplier;

@Controller
public class SupplierControler 
{
	
		@Autowired
		SupplierDao sd;
		    
		    
		@RequestMapping("/supplier")
		public ModelAndView supplier()
		{

	        ModelAndView mv2=new ModelAndView("showsupplier","sup",new Supplier());
	        List allsuppliers=sd.getAll();
	        mv2.addObject("supinfo", allsuppliers);
	        return mv2;
		}

		

		@RequestMapping(value="/add",method=RequestMethod.POST )

		public ModelAndView savesupplier(@ModelAttribute("sup") Supplier supplier)
		{
			
		    sd.insert(supplier);
		    List allsupplier=sd.getAll();
		    return new ModelAndView("showsupplier","supinfo",allsupplier);
		}
		 
	    @RequestMapping("/deletesup")
	    public ModelAndView deleteCategory(@RequestParam("supid") int supplierId)
	    { 
	    	sd.delete(supplierId);
	    	List allsuppliers=sd.getAll();
	    	 ModelAndView mv=new ModelAndView("showsupplier","sup",new Supplier());
	    	 mv.addObject("supinfo", allsuppliers);
			return mv;
	    }
	    @RequestMapping("/editsup")
	    public ModelAndView editCat(@RequestParam("supid") int supplierId)
	    { 
	    	Supplier supplier=sd.editSupplier(supplierId);
	    	List allproducts=sd.getAll();
	    	 ModelAndView mv=new ModelAndView("showsupplier","sup", supplier);
	    	 mv.addObject("supinfo", allproducts);
			return mv;
	    }

}
