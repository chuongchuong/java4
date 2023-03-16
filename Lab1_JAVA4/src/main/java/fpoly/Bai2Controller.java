package fpoly;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet({"/bai2","/chuvi","/dientich"})
public class Bai2Controller extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("/views/tinhtoan.jsp").forward(req, resp);
	}
	
	
	public void tinhToan(HttpServletRequest req,HttpServletResponse resp) throws ServletException,IOException {
		
	}
	
	
	
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String xurl = req.getRequestURI();
		
		
		
		String  soA = req.getParameter("txtA");
		double a = Double.parseDouble(soA);
		String  soB = req.getParameter("txtB");
		double b = Double.parseDouble(soB);
		
		
		
		req.setAttribute("setA",a);
		req.setAttribute("setB",b);
		
		
		if(xurl.contains("chuvi")) {
			double answer=(a+b)/2;
			
			req.setAttribute("answer",answer);
			req.getRequestDispatcher("/views/tinhtoan.jsp").forward(req, resp);
			
		}else if(xurl.contains("dientich")) {
			
			double answer2=a*b;
			
			req.setAttribute("answer2",answer2);
			req.getRequestDispatcher("/views/tinhtoan.jsp").forward(req, resp);
		}
		
		
		
		
		
		
	}
}
