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

