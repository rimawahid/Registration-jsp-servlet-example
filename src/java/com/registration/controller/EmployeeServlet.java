package com.registration.controller;

import com.registration.dao.EmployeeDAO;
import com.registration.model.Employee;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/register")
@WebServlet(name = "EmployeeServlet", urlPatterns = {"/register", "/"})
public class EmployeeServlet extends HttpServlet {

    EmployeeDAO employeeDao = new EmployeeDAO();

    @Override
    public void init() throws ServletException {
        super.init(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp); //To change body of generated methods, choose Tools | Templates.
        String fistName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        String userName = req.getParameter("userName");
        String password = req.getParameter("password");
        String address = req.getParameter("address");
        String contact = req.getParameter("contact");

        Employee employee = new Employee();
        employee.setFirstName(fistName);
        employee.setLastName(lastName);
        employee.setUserName(userName);
        employee.setPassword(password);
        employee.setAddress(address);
        employee.setContact(contact);
        
        
        try {
            employeeDao.registerEmployee(employee);
        } catch (Exception e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/view/employeedetails.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/view/employeeregister.jsp").forward(req, resp);
    }

}
