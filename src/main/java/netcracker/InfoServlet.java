package netcracker;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


@WebServlet("/info")
public class InfoServlet extends HttpServlet {

    @EJB
    Sum sum=new Sum();

    @EJB
    Calculate calculate=new Calculate();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CreateUser createUser=new CreateUser();
        User user=createUser.createUser();
        sum.setSum(calculate.sum(sum.getSum(),Integer.parseInt(user.getAge())));
        request.setAttribute("user", user);
        request.setAttribute("sum",sum.getSum());
        request.getRequestDispatcher("info.jsp").forward(request, response);
    }
}