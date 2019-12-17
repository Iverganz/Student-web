package main.com.mycompany.app.Selvlets.Student;

import main.com.mycompany.app.Entity.GroupEntity;
import main.com.mycompany.app.Entity.StudentEntity;
import main.com.mycompany.app.dao.GroupDaoImpl;
import main.com.mycompany.app.dao.Interface.GroupDao;
import main.com.mycompany.app.dao.Interface.StudentDao;
import main.com.mycompany.app.dao.StudentDaoImpl;

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
@WebServlet( "/StudentListServlet")
public class StudentListServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        GroupDao groupDao = new GroupDaoImpl();
        StudentDao studentDao = new StudentDaoImpl();
        if(request.getParameter("groupId")!=null){
            int groupId = Integer.parseInt(request.getParameter("groupId"));
            List<StudentEntity> students = studentDao.getByGroup(groupId);
            GroupEntity group = groupDao.getById(groupId);
            request.getSession().setAttribute("students", students);
            request.getSession().setAttribute("group",group);
        }
        request.getRequestDispatcher("students.jsp").forward(request,response);

    }
}
