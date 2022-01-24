package com.registration.dao;

import com.registration.model.Employee;
import com.registration.util.DBConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class EmployeeDAO {

    Connection con;
    PreparedStatement ps;

    public int registerEmployee(Employee emp) {
        String sql = "insert into employee(first_name, last_name, username, password, address, contact) values (?,?,?,?,?,?)";
        int status = 0;
        try {
            con = DBConnection.getConnection();
            ps = con.prepareStatement(sql);
            ps.setString(1, emp.getFirstName());
            ps.setString(2, emp.getLastName());
            ps.setString(3, emp.getUserName());
            ps.setString(4, emp.getPassword());
            ps.setString(5, emp.getAddress());
            ps.setString(6, emp.getContact());
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return status;
    }
}
