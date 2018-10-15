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
import com.teju.project.pojo.Supplier;

@Controller
public class SupplierControler 
{
	
		@Autowired
		SupplierDao supplierDao;
		    
		    
		@RequestMapping("/supplier")
		public ModelAndView supplier()
		{

	        ModelAndView modelandview=new ModelAndView("showsupplier","sup",new Supplier());
	        List allsuppliers=supplierDao.getAll();
	        modelandview.addObject("supinfo", allsuppliers);
	        return modelandview;
		}

		

		@RequestMapping(value="/add",method=RequestMethod.POST )

		public ModelAndView savesupplier(@ModelAttribute("sup") Supplier supplier)
		{
			
			supplierDao.insert(supplier);
		    List allsupplier=supplierDao.getAll();
		    return new ModelAndView("showsupplier","supinfo",allsupplier);
		}
		 
	    @RequestMapping("/deletesup")
	    public ModelAndView deleteSupplier(@RequestParam("supid") int supplierId)
	    { 
	    	supplierDao.delete(supplierId);
	    	List allsuppliers=supplierDao.getAll();
	    	 ModelAndView modelandview=new ModelAndView("showsupplier","sup",new Supplier());
	    	 modelandview.addObject("supinfo", allsuppliers);
			return modelandview;
	    }
	    @RequestMapping("/editsup")
	    public ModelAndView editSupplier(@RequestParam("supid") int supplierId)
	    { 
	    	Supplier supplier=supplierDao.editSupplier(supplierId);
	    	List allproducts=supplierDao.getAll();
	    	 ModelAndView modelandview=new ModelAndView("showsupplier","sup", supplier);
	    	 modelandview.addObject("supinfo", allproducts);
			return modelandview;
	    }

}
