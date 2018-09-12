package hn;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet( "/AddServlet")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
                String num1 = request.getParameter("num1");
                String num2 = request.getParameter("num2");

                Integer in1 = new Integer(num1);
                Integer in2 = new Integer(num2);

                int in3 = in1 + in2;
                String in3s= in3+"";
                //转发
//           request.setAttribute("in3s",in3s);
//        request.getRequestDispatcher("result.jsp").forward(request,response);

               // 重定向
            request.getServletContext().setAttribute("in3s",in3s);
            response.sendRedirect("result.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
             doPost(request, response);
    }
}
