/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author ADMIN
 */
public class DAO {

    public static Connection con;

    public DAO() {
        if (DAO.con == null) {
            final String URL = "jdbc:mysql://localhost:3306/creat_db?autoReconnect=true&useSSL=false";
            final String CLASS_NAME = "com.mysql.cj.jdbc.Driver";
            final String USER = "root";
            final String PASSWORD = "linh01012001";
            try {
                Class.forName(CLASS_NAME);
                DAO.con = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
