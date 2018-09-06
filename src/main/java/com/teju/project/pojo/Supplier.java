package com.teju.project.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="supplierdata")
public class Supplier 
{
	    @Id
	    private int supplierId;
	    @Column	   
        private String supplierName;
	    
	    public int getSupplierId()
	    {
	        return supplierId;
	    }
	    public void setSupplierId(int supplierId) {
	        this.supplierId = supplierId;
	    }
	    public String getSupplierName() {
	        return supplierName;
	    }
	    public void setSupplierName(String supplierName) {
	        this.supplierName = supplierName;
	    }
}
