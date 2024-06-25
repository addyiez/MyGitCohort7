package com.acc.lkm.servletdispatcher;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletOne
 */
public class ServletOne extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ServletOne() {
        // TODO Auto-generated constructor stub
    }
    
    public void init() {
    	ServletContext context=getServletContext();
    	System.out.println("Servlet-1");
    	System.out.println(getInitParameter("Eid"));
    	getServletContext().setAttribute("Eid",getInitParameter("Eid"));
        System.out.println(context.getInitParameter("Location"));
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	    request.setAttribute("Company", getInitParameter("Company"));
	    RequestDispatcher requestDispatcher=request.getRequestDispatcher("ServletTwo");
	    requestDispatcher.forward(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
