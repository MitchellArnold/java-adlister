import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
        } else {
            request.getRequestDispatcher("/login.jsp").forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean validAttempt = username.equals("admin") && password.equals("password");

//        System.out.println("username = " + username);

        request.getSession().setAttribute("user", username);

//        System.out.println("request.getSession().getAttribute(\"user\") = " + request.getSession().getAttribute("user"));

        if(validAttempt){
            request.getSession().setAttribute("user", username);
            response.sendRedirect("/profile");
        }else{
            response.sendRedirect("/login");
        }

    } //== end of getPost ==//

} //== end of LoginServlet ==//
