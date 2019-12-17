package main.com.mycompany.app.Selvlets.Group;

import main.com.mycompany.app.Entity.GroupEntity;
import main.com.mycompany.app.dao.GroupDaoImpl;
import main.com.mycompany.app.dao.Interface.GroupDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by пользователь on 17.12.2019.
 */
@WebServlet( "/groupList")
public class GroupListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GroupDao groupDao = new GroupDaoImpl();
        List<GroupEntity> groups= groupDao.getAll();
        request.getSession().setAttribute("groups", groups);
        request.getRequestDispatcher("groupList.jsp").forward(request, response);

    }
}
