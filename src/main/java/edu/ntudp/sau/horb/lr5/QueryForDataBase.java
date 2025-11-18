package edu.ntudp.sau.horb.lr5;

import java.sql.*;

public class QueryForDataBase {
    public static void main(String[] args) {
        String query = "select * from java5.studentforlab5java where month(studentforlab5java.birth_date)=11";
        try {
            Connection connection = DriverManager.getConnection(ParametersDataBase.url, ParametersDataBase.user, ParametersDataBase.password);
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            while(result.next())
            {
                System.out.println(result.getString(1)+" || "
                +result.getString(2)+" || "
                +result.getString(3)+" || "
                +result.getString(4)+" || "
                +result.getString(5)+" || "
                +result.getString(6));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}