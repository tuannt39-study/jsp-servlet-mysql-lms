package vn.hkd.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.hkd.dao.DuAnDAO;
import vn.hkd.model.DuAn;

/**
 * Servlet implementation class QLDuAn
 */
@WebServlet("/QLDuAn")
public class QLDuAn extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QLDuAn() {
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
		String xlduan = request.getParameter("xlduan");
		String id_da = request.getParameter("id_da");

		String url = "";
		try {
			switch (xlduan) {
			case "deleteda":
				DuAnDAO.deleteDuAn(Long.parseLong(id_da));
				url = "/duan.jsp";
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
		String xlduan = request.getParameter("xlduan");
		String tenDuAn = request.getParameter("tenDuAn");
		String tenKhachHang = request.getParameter("tenKhachHang");
		String bdDuAn = request.getParameter("bdDuAn");
		String ktDuAn = request.getParameter("ktDuAn");
		
		String url = "", error = "";
		if (tenDuAn.equals("")) {
			error = "Vui lòng nhập lại!";
			request.setAttribute("error", error);
		}

		try {
			if (error.length() == 0) {
				switch (xlduan) {
				case "insertda":
					DuAnDAO.insertDuAn(new DuAn(new Date().getTime(), tenDuAn, tenKhachHang, bdDuAn, ktDuAn));
					url = "/duan.jsp";
					break;
				case "updateda":
					DuAnDAO.updateDuAn(new DuAn(Long.parseLong(request.getParameter("id_da")), tenDuAn, tenKhachHang, bdDuAn, ktDuAn));
					url = "/duan.jsp";
					break;
				}
			} else {
				url = "/duan.jsp";
			}
		} catch (Exception e) {
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
