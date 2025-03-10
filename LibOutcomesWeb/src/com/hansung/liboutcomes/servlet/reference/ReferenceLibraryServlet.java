package com.hansung.liboutcomes.servlet.reference;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * 도서관 DB 서블릿
 */
@WebServlet("/ReferenceLibrary")
public class ReferenceLibraryServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/views/reference/ReferenceLibrary.jsp");
		dispatcher.forward(req, resp);
		
	}

}