package me.baijuyi.jwa.controller;

import me.baijuyi.jwa.entity.Department;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String departName = request.getParameter("deptname");
        String deptAddr = request.getParameter("deptaddr");
        Department dept = new Department(departName, deptAddr);
        List<Department> departments = (List<Department>) request.getServletContext().getAttribute("departments");
        departments.add(dept);
        response.sendRedirect("success.jsp");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
