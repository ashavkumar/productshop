package com.barclays.product.beans;





import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Product {
	@Id
	private int productId;
	private String productName;
	private String productManufacurer;
	private Date productPackedDate;
	private Date productExpiryDate;
	public Product() {
		super();
	}
	public Product(int productId, String productName, String productManufacurer, Date productPackedDate,
			Date productExpiryDate) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productManufacurer = productManufacurer;
		this.productPackedDate = productPackedDate;
		this.productExpiryDate = productExpiryDate;
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
	public String getProductManufacurer() {
		return productManufacurer;
	}
	public void setProductManufacurer(String productManufacurer) {
		this.productManufacurer = productManufacurer;
	}
	public Date getProductPackedDate() {
		return productPackedDate;
	}
	public void setProductPackedDate(Date productPackedDate) {
		this.productPackedDate = productPackedDate;
	}
	public Date getProductExpiryDate() {
		return productExpiryDate;
	}
	public void setProductExpiryDate(Date productExpiryDate) {
		this.productExpiryDate = productExpiryDate;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((productExpiryDate == null) ? 0 : productExpiryDate.hashCode());
		result = prime * result + productId;
		result = prime * result + ((productManufacurer == null) ? 0 : productManufacurer.hashCode());
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + ((productPackedDate == null) ? 0 : productPackedDate.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productExpiryDate == null) {
			if (other.productExpiryDate != null)
				return false;
		} else if (!productExpiryDate.equals(other.productExpiryDate))
			return false;
		if (productId != other.productId)
			return false;
		if (productManufacurer == null) {
			if (other.productManufacurer != null)
				return false;
		} else if (!productManufacurer.equals(other.productManufacurer))
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (productPackedDate == null) {
			if (other.productPackedDate != null)
				return false;
		} else if (!productPackedDate.equals(other.productPackedDate))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productManufacurer="
				+ productManufacurer + ", productPackedDate=" + productPackedDate + ", productExpiryDate="
				+ productExpiryDate + "]";
	}
}
