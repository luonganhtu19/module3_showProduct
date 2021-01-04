import sun.rmi.server.Dispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "service", urlPatterns = "/service")
public class Service  extends HttpServlet {
    private static List<Product> productList=new ArrayList<>();
    static {
        productList.add(new Product("Beauty","27-12-1995","Japan","beauty.jpg"));
        productList.add(new Product("O_zngu"  ,"13-02-1995","China"   ,"o_zngu.jpg"  ));
        productList.add(new Product("TaylorSwift","10-08-1995","Usa","taylorSwift.jpg"));
        productList.add(new Product("Tiffany","20-08-1995","Kore","tiffany.jpg"));
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("productList",productList);
        req.getRequestDispatcher("index.jsp").forward(req,resp);
    }}
