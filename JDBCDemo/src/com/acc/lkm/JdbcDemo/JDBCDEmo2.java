package com.acc.lkm.JdbcDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.mysql.jdbc.PreparedStatement;

public class JDBCDEmo2 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");//Driver Class
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/17AprCohortJDBC","root","root");
			/*PreparedStatement preparedStatement=(PreparedStatement) connection.prepareStatement("SELECt * from EMPLOYEE");
			ResultSet resultSet=preparedStatement.executeQuery();
			while(resultSet.next()) {
				//getting the data from Rows
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+
						" "+resultSet.getString(3)+" "+resultSet.getDouble(4)+" "+resultSet.getDate(5));
			}*/
//			PreparedStatement preparedStatement=(PreparedStatement)connection.prepareStatement("INSERT into EMPLOYEE values(?,?,?,?,?)");
//			preparedStatement.setInt(1, 5);
//			preparedStatement.setString(2, "Priyanka");
//			preparedStatement.setString(3,"Chennai");
//			preparedStatement.setDouble(4, 65000.00);
//			preparedStatement.setDate(5, java.sql.Date.valueOf("2024-08-27"));
			PreparedStatement preparedStatement=(PreparedStatement)connection.prepareStatement("UPDATE EMPLOYEE SET LOCATION=?,SALARY=? where EMPID=?");
			preparedStatement.setString(1,"Pune");
			preparedStatement.setDouble(2, 73000.00);
			preparedStatement.setInt(3,5 );
			int result=preparedStatement.executeUpdate();
			System.out.println(result + "row updated");
			connection.close();
			preparedStatement.close();
		}catch(Exception ex) {
			System.out.println(ex);
		}finally {
			System.out.println("Success");
		}

	}

}