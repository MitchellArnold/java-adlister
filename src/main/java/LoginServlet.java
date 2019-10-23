import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name= "LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    //    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/login.jsp").forward(request, response);


    } //== end doGet method ==//

    //    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            if (username.equals("admin") && password.equals("password")) {
                response.sendRedirect("/profile");
            } else {
                response.sendRedirect("/login?error=true");
            }

//
//        if(request.getParameter("username").equalsIgnoreCase("admin") &&
//           request.getParameter("password").equalsIgnoreCase("password")){
//            response.sendRedirect("/profile");
//        }
        } //== end doPost method ==//
    } //== end LoginServlet ==//

//
//    Products productsDao = DaoFactory.getProductsDao();
//    // create a new product based on the submitted data
//    String name = request.getParameter("name");
//    double price = Double.parseDouble(request.getParameter("price"));
//    Product product = new Product(name, price);
//// persist the new product
//        productsDao.insert(product);
//                response.sendRedirect("/products");
