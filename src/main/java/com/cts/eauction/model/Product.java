package com.cts.eauction.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "product")
public class Product {
	
		@Id
	    private String id;
	    private String productname;
	    private String productdescription;
	    private String category;
	    private String startprice;
	    private String bidprice;
	    
	          
	    
		public Product() {
			super();
			// TODO Auto-generated constructor stub
		}



		public Product(String id, String productname, String productdescription, String category, String startprice,
				String bidprice) {
			super();
			this.id = id;
			this.productname = productname;
			this.productdescription = productdescription;
			this.category = category;
			this.startprice = startprice;
			this.bidprice = bidprice;
		}
		
		
		
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getProductname() {
			return productname;
		}
		public void setProductname(String productname) {
			this.productname = productname;
		}
		public String getProductdescription() {
			return productdescription;
		}
		public void setProductdescription(String productdescription) {
			this.productdescription = productdescription;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getStartprice() {
			return startprice;
		}
		public void setStartprice(String startprice) {
			this.startprice = startprice;
		}
		public String getBidprice() {
			return bidprice;
		}
		public void setBidprice(String bidprice) {
			this.bidprice = bidprice;
		}
	    
	    

}
