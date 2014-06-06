package org.titozoe.oasi.webserver.controller.isearch;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.titozoe.oasi.core.domain.Profession;
import org.titozoe.oasi.core.domain.Profile;
import org.titozoe.oasi.core.service.OaSiServices;

/**
 * Servlet implementation class Search
 */
@WebServlet("/Search")
public class Search extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Search() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**	
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				
		Profession profession = new Profession();
		profession.setName(request.getParameter("profession.name"));
		
		List<Profile> profileResults = OaSiServices.getProfileService().searchBy(profession);
			
		request.setAttribute("profileResults", profileResults);
		request.setAttribute("research", profession);
		
		getServletContext().getRequestDispatcher("/WEB-INF/pages/i-search/results.jsp").forward(request, response);
					
	}
	
}
