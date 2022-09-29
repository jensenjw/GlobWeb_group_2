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

@WebServlet("/cartServlet")
public class CartServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	List<Product> itemCart = (List<Product>) request.getSession().getAttribute("itemCart");
    	request.getSession().setAttribute("itemCart", itemCart);
    	response.sendRedirect("cart.jsp");    	
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	List<Product> itemCart = (List<Product>) request.getSession().getAttribute("itemCart");
    	String index = request.getParameter("remove_product");
    	itemCart.remove(Integer.parseInt(index));
    	request.getSession().setAttribute("itemCart", itemCart);
    	response.sendRedirect("cart.jsp");
    }

}