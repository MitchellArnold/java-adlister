import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

    @WebServlet(name= "ColorPreferenceServlet", urlPatterns = "/color-profile")
    public class ColorPreferenceServlet extends HttpServlet {
        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            HttpSession session = request.getSession();

            if (request.getParameter("forget") != null) {
                session.removeAttribute("font-color");
                response.sendRedirect("/color-profile");
            }else {
                session.setAttribute("font-color", request.getParameter("font-color"));
                session.setAttribute("background-color", request.getParameter("background-color"));

                response.sendRedirect("/ads");
            }
        }
    }
