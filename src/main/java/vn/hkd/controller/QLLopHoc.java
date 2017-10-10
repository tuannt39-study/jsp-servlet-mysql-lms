package vn.hkd.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.hkd.dao.LopHocDAO;
import vn.hkd.model.LopHoc;

/**
 * Servlet implementation class QLLopHoc
 */
@WebServlet("/QLLopHoc")
public class QLLopHoc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QLLopHoc() {
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
		String xllophoc = request.getParameter("xllophoc");
		String id_loph = request.getParameter("id_loph");

		String url = "";
		try {
			switch (xllophoc) {
			case "deleteloph":
				LopHocDAO.deleteLopHoc(Long.parseLong(id_loph));
				url = "/lophoc.jsp";
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
		String xllophoc = request.getParameter("xllophoc");
		String tenLopHoc = request.getParameter("tenLopHoc");
		String ngayBatDau = request.getParameter("ngayBatDau");
		String ngayKetThuc = request.getParameter("ngayKetThuc");

		String url = "", error = "";
		if (tenLopHoc.equals("")) {
			error = "Vui lòng nhập lại!";
			request.setAttribute("error", error);
		}

		try {
			if (error.length() == 0) {
				switch (xllophoc) {
				case "insertloph":
					LopHocDAO.insertLopHoc(new LopHoc(new Date().getTime(), tenLopHoc, ngayBatDau, ngayKetThuc));
					url = "/lophoc.jsp";
					break;
				case "updateloph":
					LopHocDAO.updateLopHoc(new LopHoc(Long.parseLong(request.getParameter("id_loph")), tenLopHoc, ngayBatDau, ngayKetThuc));
					url = "/lophoc.jsp";
					break;
				}
			} else {
				url = "/lophoc.jsp";
			}
		} catch (Exception e) {
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
