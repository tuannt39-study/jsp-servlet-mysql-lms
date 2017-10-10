package vn.hkd.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.hkd.dao.LichHocDAO;
import vn.hkd.model.LichHoc;

/**
 * Servlet implementation class QLLichHoc
 */
@WebServlet("/QLLichHoc")
public class QLLichHoc extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QLLichHoc() {
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
		String xllichhoc = request.getParameter("xllichhoc");
		String id_lichh = request.getParameter("id_lichh");

		String url = "";
		try {
			switch (xllichhoc) {
			case "deletelichh":
				LichHocDAO.deleteLichHoc(Long.parseLong(id_lichh));
				url = "/lichhoc.jsp";
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
		String xllichhoc = request.getParameter("xllichhoc");
		String thu = request.getParameter("thu");
		String bdLichHoc = request.getParameter("bdLichHoc");
		String ktLichHoc = request.getParameter("ktLichHoc");
		String diaDiemLichHoc = request.getParameter("diaDiemLichHoc");
		
		String url = "", error = "";
		if (thu.equals("")) {
			error = "Vui lòng nhập lại!";
			request.setAttribute("error", error);
		}

		try {
			if (error.length() == 0) {
				switch (xllichhoc) {
				case "insertlichh":
					LichHocDAO.insertLichHoc(new LichHoc(new Date().getTime(), thu, bdLichHoc, ktLichHoc, diaDiemLichHoc));
					url = "/lichhoc.jsp";
					break;
				case "updatelichh":
					LichHocDAO.updateLichHoc(new LichHoc(Long.parseLong(request.getParameter("id_lichh")), thu, bdLichHoc, ktLichHoc, diaDiemLichHoc));
					url = "/lichhoc.jsp";
					break;
				}
			} else {
				url = "/lichhoc.jsp";
			}
		} catch (Exception e) {
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
