package com.teju.project.controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
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
import com.teju.project.pojo.Product;
@Controller
public class ProductControler 
{
	@Autowired
	ProductDao productDao;
	@Autowired
	CategoryDao categoryDao;		   
			    @RequestMapping("/product")

			    public ModelAndView showProduct()
			    {
			        ModelAndView modelandview=new ModelAndView("showproduct","prod",new Product());
			        List allproducts=productDao.getAllProducts();
			        modelandview.addObject("proinfo", allproducts);
			        List allcategories=categoryDao.getAll();
			        modelandview.addObject("catinfo", allcategories);
			        
			        return modelandview;
			        
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
			    	   productDao.insert(pro);
			    	   List allproducts=productDao.getAllProducts();
			        ModelAndView modelandview=new ModelAndView("showproduct","proinfo",allproducts);
			        return modelandview;
			        }
			    
			    @RequestMapping("/deletepro")
			    public ModelAndView deleteProduct(@RequestParam("proid") int productId)
			    { 
			    	productDao.delete(productId);
			    	List allproducts=productDao.getAllProducts();
			    	 ModelAndView modelandview=new ModelAndView("showproduct","prod",new Product());
			    	 modelandview.addObject("proinfo", allproducts);
					return modelandview;
			    }
			    @RequestMapping("/editpro")
			    public ModelAndView editproduct(@RequestParam("proid") int productId)
			    { 
			    	Product product=productDao.editProduct(productId);
			    	List allproducts=productDao.getAllProducts();
			    	 ModelAndView modelandview=new ModelAndView("showproduct","prod", product);
			    	 modelandview.addObject("catinfo", allproducts);
					return modelandview;
			    }
}
