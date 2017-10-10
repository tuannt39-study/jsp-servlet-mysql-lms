package vn.hkd.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.hkd.dao.TuyenDungDAO;
import vn.hkd.model.TuyenDung;

/**
 * Servlet implementation class QLTuyenDung
 */
@WebServlet("/QLTuyenDung")
public class QLTuyenDung extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QLTuyenDung() {
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
		String xltuyendung = request.getParameter("xltuyendung");
		String id_td = request.getParameter("id_td");

		String url = "";
		try {
			switch (xltuyendung) {
			case "deletetd":
				TuyenDungDAO.deleteTuyenDung(Long.parseLong(id_td));
				url = "/tuyendung.jsp";
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
		String xltuyendung = request.getParameter("xltuyendung");
		String tinTuyenDung = request.getParameter("tinTuyenDung");
		String bdTuyenDung = request.getParameter("bdTuyenDung");
		String ktTuyenDung = request.getParameter("ktTuyenDung");
		
		String url = "", error = "";
		if (tinTuyenDung.equals("")) {
			error = "Vui lòng nhập lại!";
			request.setAttribute("error", error);
		}

		try {
			if (error.length() == 0) {
				switch (xltuyendung) {
				case "inserttd":
					TuyenDungDAO.insertTuyenDung(new TuyenDung(new Date().getTime(), tinTuyenDung, bdTuyenDung, ktTuyenDung));
					url = "/tuyendung.jsp";
					break;
				case "updatetd":
					TuyenDungDAO.updateTuyenDung(new TuyenDung(Long.parseLong(request.getParameter("id_td")), tinTuyenDung, bdTuyenDung, ktTuyenDung));
					url = "/tuyendung.jsp";
					break;
				}
			} else {
				url = "/tuyendung.jsp";
			}
		} catch (Exception e) {
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
