package vn.hkd.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import vn.hkd.dao.TaiKhoanDAO;
import vn.hkd.model.TaiKhoan;

/**
 * Servlet implementation class QLLogin
 */
@WebServlet("/QLLogin")
public class QLLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TaiKhoanDAO taiKhoanDAO = new TaiKhoanDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QLLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String xllogin = request.getParameter("xllogin");
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String emailTaiKhoan = request.getParameter("emailTaiKhoan");
		String loaiTaiKhoan = request.getParameter("loaiTaiKhoan");
		String tenDayDu = request.getParameter("tenDayDu");
		String matKhauTaiKhoan = request.getParameter("matKhauTaiKhoan");
		String url = "", error = "";
		TaiKhoan taiKhoan = new TaiKhoan();
		if (emailTaiKhoan.equals("")) {
			error = "Vui lòng nhập lại!";
			request.setAttribute("error", error);
		}
		HttpSession session = request.getSession();
		switch (xllogin) {
		case "insertlg":
			try {
				TaiKhoanDAO.insertTaiKhoan(new TaiKhoan(emailTaiKhoan, loaiTaiKhoan, tenDayDu, matKhauTaiKhoan));
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			url = "/taikhoan.jsp";
			break;
		case "loginlg":
			try {
				taiKhoan = TaiKhoanDAO.login(emailTaiKhoan, matKhauTaiKhoan);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			if (taiKhoan != null) {
				session.setAttribute("user", taiKhoan);
				url = "/index.jsp";
			} else {
				request.setAttribute("error", "Error email or password!");
				url = "/login.jsp";
			}
			break;
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
