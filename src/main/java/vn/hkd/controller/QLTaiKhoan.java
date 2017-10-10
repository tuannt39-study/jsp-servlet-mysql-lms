package vn.hkd.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.hkd.dao.TaiKhoanDAO;
import vn.hkd.model.TaiKhoan;

/**
 * Servlet implementation class QLTaiKhoan
 */
@WebServlet("/QLTaiKhoan")
public class QLTaiKhoan extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QLTaiKhoan() {
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
		String xltaikhoan = request.getParameter("xltaikhoan");
		String email_tk = request.getParameter("email_tk");

		String url = "";
		try {
			switch (xltaikhoan) {
			case "deletetk":
				TaiKhoanDAO.deleteTaiKhoan(email_tk);
				url = "/taikhoan.jsp";
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
		String xltaikhoan = request.getParameter("xltaikhoan");
		String emailTaiKhoan = request.getParameter("emailTaiKhoan");
		String loaiTaiKhoan = request.getParameter("loaiTaiKhoan");
		String tenDayDu = request.getParameter("tenDayDu");
		String matKhauTaiKhoan = request.getParameter("matKhauTaiKhoan");
		String moTaiKhoan = request.getParameter("moTaiKhoan");
		String khoaTaiKhoan = request.getParameter("khoaTaiKhoan");
		
		String url = "", error = "";
		if (loaiTaiKhoan.equals("")) {
			error = "Vui lòng nhập lại!";
			request.setAttribute("error", error);
		}

		try {
			if (error.length() == 0) {
				switch (xltaikhoan) {
				case "inserttk":
					TaiKhoanDAO.insertTaiKhoan(new TaiKhoan(emailTaiKhoan, loaiTaiKhoan, tenDayDu, matKhauTaiKhoan, moTaiKhoan, khoaTaiKhoan));
					url = "/taikhoan.jsp";
					break;
				case "updatetk":
					TaiKhoanDAO.updateTaiKhoan(new TaiKhoan(request.getParameter("email_tk"), loaiTaiKhoan, tenDayDu, matKhauTaiKhoan, moTaiKhoan, khoaTaiKhoan));
					url = "/taikhoan.jsp";
					break;
				}
			} else {
				url = "/taikhoan.jsp";
			}
		} catch (Exception e) {
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
