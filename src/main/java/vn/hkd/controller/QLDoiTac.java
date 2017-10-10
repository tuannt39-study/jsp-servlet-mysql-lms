package vn.hkd.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.hkd.dao.DoiTacDAO;
import vn.hkd.model.DoiTac;

/**
 * Servlet implementation class QLDoiTac
 */
@WebServlet("/QLDoiTac")
public class QLDoiTac extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QLDoiTac() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String xldoitac = request.getParameter("xldoitac");
		String id_dt = request.getParameter("id_dt");

		String url = "";
		try {
			switch (xldoitac) {
			case "deletedt":
				DoiTacDAO.deleteDoiTac(Long.parseLong(id_dt));
				url = "/doitac.jsp";
				break;
			}
		} catch (Exception e) {
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String xldoitac = request.getParameter("xldoitac");
		String tenDoiTac = request.getParameter("tenDoiTac");
		String truSoDoiTac = request.getParameter("truSoDoiTac");
		String vanPhongDoiTac = request.getParameter("vanPhongDoiTac");
		String sdtDoiTac = request.getParameter("sdtDoiTac");
		String emailDoiTac = request.getParameter("emailDoiTac");
		String websiteDoiTac = request.getParameter("websiteDoiTac");
		String bdDoiTac = request.getParameter("bdDoiTac");
		String ktDoiTac = request.getParameter("ktDoiTac");
		
		String url = "", error = "";
		if (tenDoiTac.equals("")) {
			error = "Vui lòng nhập lại!";
			request.setAttribute("error", error);
		}

		try {
			if (error.length() == 0) {
				switch (xldoitac) {
				case "insertdt":
					DoiTacDAO.insertDoiTac(new DoiTac(new Date().getTime(), tenDoiTac, truSoDoiTac, vanPhongDoiTac, sdtDoiTac, emailDoiTac, websiteDoiTac, bdDoiTac, ktDoiTac));
					url = "/doitac.jsp";
					break;
				case "updatedt":
					DoiTacDAO.updateDoiTac(new DoiTac(Long.parseLong(request.getParameter("id_dt")), tenDoiTac, truSoDoiTac, vanPhongDoiTac, sdtDoiTac, emailDoiTac, websiteDoiTac, bdDoiTac, ktDoiTac));
					url = "/doitac.jsp";
					break;
				}
			} else {
				url = "/doitac.jsp";
			}
		} catch (Exception e) {
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
