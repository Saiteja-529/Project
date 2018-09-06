package com.teju.project.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.teju.project.dao.CategoryDao;
import com.teju.project.dao.ProductDao;
import com.teju.project.pojo.Category;
import com.teju.project.pojo.Product;
@Controller
public class ProductControler 
{
	@Autowired
	ProductDao pd;
			   
			    @RequestMapping("/product")

			    public ModelAndView m2()
			    {
			        ModelAndView mv2=new ModelAndView("showproduct","prod",new Product());
			        List allproducts=pd.getAllProducts();
			        mv2.addObject("proinfo", allproducts);
			        return mv2;
			    }
			    
			    
			    @RequestMapping(value="/addproduct",method=RequestMethod.POST)
			     public ModelAndView save(@ModelAttribute("prod") Product pro) throws IOException
			        { 
			    	   pro.setProductId((int)(Math.random()*10000));
			    	   
			    	   MultipartFile proImg=pro.getProductImg();
			    	   File f=new File("G:\\niit\\MavenWebSpringHibernate\\src\\main\\webapp\\resources\\"+pro.getProductId()+".jpg");
			    	   FileOutputStream fos=new FileOutputStream(f);
			    	   BufferedOutputStream bos=new BufferedOutputStream(fos);
			    	   byte b[]=proImg.getBytes();
			    	   bos.write(b);
			    	   bos.close();
			    	   pd.insert(pro);
			    	   List allproducts=pd.getAllProducts();
			        ModelAndView mv=new ModelAndView("showproduct","proinfo",allproducts);
			        return mv;
			        }
			    
			    @RequestMapping("/deletepro")
			    public ModelAndView deleteProduct(@RequestParam("proid") int productId)
			    { 
			    	pd.delete(productId);
			    	List allproducts=pd.getAllProducts();
			    	 ModelAndView mv=new ModelAndView("showproduct","prod",new Product());
			    	 mv.addObject("proinfo", allproducts);
					return mv;
			    }
			    @RequestMapping("/editpro")
			    public ModelAndView editpro(@RequestParam("proid") int productId)
			    { 
			    	Product product=pd.editProduct(productId);
			    	List allproducts=pd.getAllProducts();
			    	 ModelAndView mv=new ModelAndView("showproduct","prod", product);
			    	 mv.addObject("catinfo", allproducts);
					return mv;
			    }
}
