import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/fruit")
public class FruitServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        String fruit = request.getParameter("fruit");
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<h1>Hello Earth!</h1>" + "<p> Here is a " + fruit + "</p>");
    }
}
