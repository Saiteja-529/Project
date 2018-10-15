package com.teju.project.pojo;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="productdata")
public class Product 
{
	@Id
	private int productId;
		@Column
	private String productName;
		@Column
	private int productPrice;
		
	@Transient	
	private MultipartFile productImg;
	@Column
	private String supplierName;
	@Column
	private String category;
	@Column
	private String productDescription;
	@Column
	private String stock;
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public String getStock() {
		return stock;
	}
	public void setStock(String stock) {
		this.stock = stock;
	}
	public MultipartFile getProductImg() {
			return productImg;
		}
		public void setProductImg(MultipartFile productImg) {
			this.productImg = productImg;
		}
		public int getProductId() {
			return productId;
		}
		public void setProductId(int productId) {
			this.productId = productId;
		}
		public String getProductName() {
			return productName;
		}
		public void setProductName(String productName) {
			this.productName = productName;
		}
		public int getProductPrice() {
			return productPrice;
		}
		public void setProductPrice(int productPrice) {
			this.productPrice = productPrice;
		}
		
}

