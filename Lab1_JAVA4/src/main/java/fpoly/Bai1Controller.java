package fpoly;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/bai1")
public class Bai1Controller extends HttpServlet{
	
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	
	req.setAttribute("ten", "ADUVIPPRO");
	req.getRequestDispatcher("/views/hello.jsp").forward(req, resp);
	
	
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
	String hoten =req.getParameter("hoten");
	req.setAttribute("message", "Xin chao " + hoten);
	req.getRequestDispatcher("/views/xinchao.jsp").forward(req, resp);
	}
}
