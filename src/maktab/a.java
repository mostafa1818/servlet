package maktab;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
@WebServlet("/test")
public class a extends HttpServlet {


//        @Override
//        protected void doPost(HttpServletRequest reg, HttpServletResponse resp) throws ServletException, IOException
//        {
//
//              }
        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
            resp.setContentType("text/html");
            try(PrintWriter out= resp.getWriter())
            {
                String name=req.getParameter("name");
                out.println("<h1>xxx</h1>"+name);
            }

        }

}
