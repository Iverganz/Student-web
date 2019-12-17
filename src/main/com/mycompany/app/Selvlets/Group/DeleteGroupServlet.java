package main.com.mycompany.app.Selvlets.Group;

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
@WebServlet("/deleteGroup")
public class DeleteGroupServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GroupDao groupDao = new GroupDaoImpl();
        if(request.getParameter("groupId")!=null){
            int groupId=Integer.parseInt(request.getParameter("groupId"));
            groupDao.deleteById(groupId);
        }
        response.sendRedirect("groupList");
    }
}
