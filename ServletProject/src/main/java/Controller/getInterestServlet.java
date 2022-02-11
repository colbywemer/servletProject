package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Calculator;
import Model.interestCalculator;

/**
 * Servlet implementation class getMultiplicationAnswerServlet
 */
@WebServlet("/getInterestServlet")
public class getInterestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getInterestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String investment = request.getParameter("investment");
		String rate = request.getParameter("interestRate");
		String years = request.getParameter("years");
		interestCalculator answer = new interestCalculator(Double.parseDouble(investment), Double.parseDouble(rate), Double.parseDouble(years));
		request.setAttribute("interest", answer);
		getServletContext().getRequestDispatcher("/interestResult.jsp").forward(request, response);	
	}

}
