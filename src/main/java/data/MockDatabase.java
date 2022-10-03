package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import models.Product;

/**
@author Jan William Jensen
*/

public class MockDatabase {

	List<Product> products = new ArrayList<Product>();
	
	public MockDatabase() {
		
		products.add(new Product(101, "Hammer", 25, "", "HammerDescription"));
		products.add(new Product(102, "Nails", 1.5, "", "NailsDescription"));
		products.add(new Product(103, "Planks", 3.5, "", "PlanksDescription"));
		products.add(new Product(104, "Glue", 5, "", "GlueDescription"));
		products.add(new Product(105, "Saw", 15, "", "SawDescription"));
	}
	
	public Product Get(int pno) {
		for(Product p : products) { 
			   if(p.getPno() == (pno)) { 
				   return p;
			   }
			}
		return null;
	}
	
	public List<Product> GetAll() {
		return products;
	}
	
	public Product Post(Product product) {
		if(Get(product.getPno()) == null) {
			products.add(product);
			return product;
		}
		else {
			throw new IllegalArgumentException("This product number: " + product.getPno() + "already exists");
		}
	}
	
	public Product Update(Product product) {
		int index = -1;
		for (Product p : products) {
			if(p.getPno() == product.getPno()) {
				index = products.indexOf(p);
				products.set(index, product);
			}
		}
		return products.get(index);
	}
	
	public void Delete(Product product) {
		products.remove(product);
		products.removeAll(Collections.singleton(null));
	}
	
}
