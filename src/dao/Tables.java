
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.Statement;

public class Tables {

    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getcon();
            Statement st = con.createStatement();
//            st.executeUpdate("create table appuser(appuser_pk int AUTO_INCREMENT primary key, userRole varchar(200),name varchar(200), dob varchar(50), mobilenumber varchar(10), email varchar(200), username varchar(200), password varchar(50), address varchar(200))");
//            st.executeUpdate("insert into appuser (userRole,name,dob,mobilenumber,email,username,password,address) values('Admin','Admin','16-12-1992','9168716389','admin@gmail.com','admin','admin','india')");
//st.executeUpdate("DROP TABLE IF EXISTS medicine");
//
//st.executeUpdate("CREATE TABLE medicine (" +
//                 "medicine_pk INT AUTO_INCREMENT PRIMARY KEY, " +
//                 "uniqueId VARCHAR(200), " +
//                 "name VARCHAR(200), " +  // Added the 'name' column
//                 "companyName VARCHAR(200), " +
//                 "quantity BIGINT, " +
//                 "price BIGINT)");
       st.executeUpdate("CREATE TABLE bill ("
                + "bill INT AUTO_INCREMENT PRIMARY KEY, "
                + "billId VARCHAR(200), "
                + "billDate VARCHAR(50), "
                + "totalPaid BIGINT, "
                + "generateBy VARCHAR(50))");


JOptionPane.showMessageDialog(null, "Table Created Succesfully");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }

}
