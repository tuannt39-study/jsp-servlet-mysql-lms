package vn.hkd.controller;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import vn.hkd.dao.HocPhiDAO;
import vn.hkd.model.HocPhi;

/**
 * Servlet implementation class QLHocPhi
 */
@WebServlet("/QLHocPhi")
public class QLHocPhi extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public QLHocPhi() {
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
		String xlhocphi = request.getParameter("xlhocphi");
		String id_hp = request.getParameter("id_hp");

		String url = "";
		try {
			switch (xlhocphi) {
			case "deletehp":
				HocPhiDAO.deleteHocPhi(Long.parseLong(id_hp));
				url = "/hocphi.jsp";
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
		String xlhocphi = request.getParameter("xlhocphi");
		String hpPhaiNop = request.getParameter("hpPhaiNop");
		String hpNop1 = request.getParameter("hpNop1");
		String ngayNop1 = request.getParameter("ngayNop1");
		String hpNop2 = request.getParameter("hpNop2");
		String ngayNop2 = request.getParameter("ngayNop2");
		String hpNop3 = request.getParameter("hpNop3");
		String ngayNop3 = request.getParameter("ngayNop3");
		String hpNop4 = request.getParameter("hpNop4");
		String ngayNop4 = request.getParameter("ngayNop4");
		
		String url = "", error = "";
		if (hpPhaiNop.equals("")) {
			error = "Vui lòng nhập lại!";
			request.setAttribute("error", error);
		}

		try {
			if (error.length() == 0) {
				switch (xlhocphi) {
				case "inserthp":
					HocPhiDAO.insertHocPhi(new HocPhi(new Date().getTime(), Integer.parseInt(hpPhaiNop), Integer.parseInt(hpNop1), ngayNop1, Integer.parseInt(hpNop2), ngayNop2, Integer.parseInt(hpNop3), ngayNop3, Integer.parseInt(hpNop4), ngayNop4));
					url = "/hocphi.jsp";
					break;
				case "updatehp":
					HocPhiDAO.updateHocPhi(new HocPhi(Long.parseLong(request.getParameter("id_hp")), Integer.parseInt(hpPhaiNop), Integer.parseInt(hpNop1), ngayNop1, Integer.parseInt(hpNop2), ngayNop2, Integer.parseInt(hpNop3), ngayNop3, Integer.parseInt(hpNop4), ngayNop4));
					url = "/hocphi.jsp";
					break;
				}
			} else {
				url = "/hocphi.jsp";
			}
		} catch (Exception e) {
		}
		RequestDispatcher rd = getServletContext().getRequestDispatcher(url);
		rd.forward(request, response);
	}

}
