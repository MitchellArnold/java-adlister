import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(name = "AdsIndexServlet", urlPatterns = "/ads")
    public class AdsIndexServlet {
    Ads ad = DaoFactory.getAdsDao();

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


    }
}
//    <List > Ad ads = DaoFactory.getAdsDao().all();
