package controller;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/page-view")
public class PageViewCounterServlet extends HttpServlet {
    private int hitCount = 0;


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String count = request.getParameter("count");
        if (count != null){
            hitCount = 0;
        }

        hitCount++;


        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Title</title>\n" +
                "\n" +
                "    <style>\n" +
                "        body{\n" +
                "            border: 2px solid grey;\n" +
                "            background: darkgrey;\n" +
                "            color: lightgrey;\n" +
                "            font-size: 24px;\n" +
                "        }\n" +
                "\n" +
                "        #wrapper{\n" +
                "            display: flex;\n" +
                "            justify-content: center;\n" +
                "            align-items: center;\n" +
                "            flex-direction: column;\n" +
                "        }\n" +
                "    </style>\n" +
                "</head>\n" +
                "<body>\n" +
                "<div id=\"wrapper\">\n" +
                "<h1> Hello, viewer.</h1>\n" +
                "    <p>You have viewed the page " + hitCount + " times. " +
                "\n<br> Reset counter?" + "</p>\n" +

                "</div>\n" +
                "\n" +
                "\n" +
                "</body>\n" +
                "</html>");
    }

}
