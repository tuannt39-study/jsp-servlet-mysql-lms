package vn.hkd.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.hkd.dao.NgonNguDAO;
import vn.hkd.model.NgonNgu;

/**
 * Servlet implementation class QLNgonNgu
 */
@WebServlet("/QLNgonNgu")
public class QLNgonNgu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QLNgonNgu() {
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
		String xlngonngu = request.getParameter("xlngonngu");
		String id_nn = request.getParameter("id_nn");

		String url = "";
		try {
			switch (xlngonngu) {
			case "deletenn":
				NgonNguDAO.deleteNgonNgu(Long.parseLong(id_nn));
				url = "/ngonngu.jsp";
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
		String xlngonngu = request.getParameter("xlngonngu");
		String tenNgonNgu = request.getParameter("tenNgonNgu");
		
		String url = "", error = "";
		if (tenNgonNgu.equals("")) {
			error = "Vui lòng nhập lại!";
			request.setAttribute("error", error);
		}

		try {
			if (error.length() == 0) {
				switch (xlngonngu) {
				case "insertnn":
					NgonNguDAO.insertNgonNgu(new NgonNgu(new Date().getTime(), tenNgonNgu));
					url = "/ngonngu.jsp";
					break;
				case "updatenn":
					NgonNguDAO.updateNgonNgu(new NgonNgu(Long.parseLong(request.getParameter("id_nn")), tenNgonNgu));
					url = "/ngonngu.jsp";
					break;
				}
			} else {
				url = "/ngonngu.jsp";
			}
		} catch (Exception e) {
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
