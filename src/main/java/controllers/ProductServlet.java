package controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import data.MockDatabase;
import models.Product;

@WebServlet("/productsServlet")
public class ProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    List<Product> itemCart;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	MockDatabase _db = new MockDatabase(); 
    	List<Product> products = _db.GetAll();
    	request.getSession().setAttribute("products", products);
    	request.getRequestDispatcher("products.jsp").forward(request, response);
    	
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	MockDatabase _db = new MockDatabase(); 
    	
    	itemCart = (List<Product>) request.getSession().getAttribute("itemCart");
    	if (itemCart == null) {
    		itemCart = new ArrayList<Product>();
    	}
    	
    	String pno = request.getParameter("product_id");
    	Product p = _db.Get(Integer.parseInt(pno));
    	itemCart.add(p);
    	
    	List<Product> products = _db.GetAll();
    	request.getSession().setAttribute("products", products);
    	
    	request.getSession().setAttribute("itemCart", itemCart);
    	request.getRequestDispatcher("products.jsp").forward(request, response);
    }

}
