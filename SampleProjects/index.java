import java.io.*;
          import javax.servlet.*;

    public index() {
        
    }
          import javax.servlet.http.*;

          public class index extends HttpServlet {
             int accesses = 0;

             public void doGet(HttpServletRequest request, HttpServletResponse response)
                throws IOException, ServletException
             {
                response.setContentType("text/html");
                PrintWriter out = response.getWriter();

                accesses++;
                out.print("Number of times this servlet has been accessed:" + accesses);
             }
          } 

