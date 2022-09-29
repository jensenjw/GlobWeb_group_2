package controllers;

import java.io.IOException;
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

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	MockDatabase _db = new MockDatabase(); 
    	List<Product> products = _db.GetAll();
    	request.setAttribute("products", products);
    	//response.sendRedirect("products.jsp");
    	request.getRequestDispatcher("products.jsp").forward(request, response);
    	
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	List<Product> products = (List<Product>) request.getAttribute("addToCart");
    	request.setAttribute("products", products);
    	response.sendRedirect("cartServlet");
    }

}
