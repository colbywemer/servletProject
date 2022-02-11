package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Calculator;

/**
 * Servlet implementation class getDivisionAnswerServlet
 */
@WebServlet("/getDivisionAnswerServlet")
public class getDivisionAnswerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getDivisionAnswerServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String value1 = request.getParameter("value1");
		String value2 = request.getParameter("value2");
		Calculator answer = new Calculator(Double.parseDouble(value1),Double.parseDouble(value2));
		request.setAttribute("division", answer);
		getServletContext().getRequestDispatcher("/divisionResult.jsp").forward(request, response);	
	}

}
