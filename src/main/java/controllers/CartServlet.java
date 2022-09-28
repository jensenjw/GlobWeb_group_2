package controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Product;

@WebServlet("/cartServlet")
public class CartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	List<Product> products = (List<Product>) request.getAttribute("addToCart");
    	System.out.println(request.getAttribute("addToCart"));
    	request.setAttribute("products", products);
    	request.getRequestDispatcher("cart.jsp").forward(request, response);
    	
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	List<Product> products = (List<Product>) request.getAttribute("cartProducts");
    	Product product = (Product) request.getAttribute("remove");
    	products.remove(product);
    	request.setAttribute("cartProducts", products);
    	
    	response.sendRedirect("cartServlet");
    }

}