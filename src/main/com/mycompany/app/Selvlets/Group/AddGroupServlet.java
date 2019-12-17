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

/**
 * Created by пользователь on 18.12.2019.
 */
@WebServlet("/addGroup")
public class AddGroupServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        if(request.getParameter("groupId")!=null&&request.getParameter("fucNum")!=null){
            int groupId = Integer.parseInt(request.getParameter("groupId"));
            int fucNum = Integer.parseInt(request.getParameter("fucNum"));
            GroupDao groupDao = new GroupDaoImpl();
            GroupEntity group = new GroupEntity();
            group.setId(groupId);
            group.setFac(fucNum);
            groupDao.save(group);
            response.sendRedirect("/groupList");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("addGroup.jsp").forward(request, response);
    }
}
