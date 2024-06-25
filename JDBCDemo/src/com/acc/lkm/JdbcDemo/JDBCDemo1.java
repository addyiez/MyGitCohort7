package com.acc.lkm.JdbcDemo;
import java.sql.*;
public class JDBCDemo1 {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");//Driver Class
			Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/17AprCohortJDBC","root","root");
			Statement statement=connection.createStatement();
			//Execute Queries
			/*String sql="SELECT * from EMPLOYEE";
			ResultSet resultSet=statement.executeQuery(sql);
			while(resultSet.next()) {
				//getting the data from Rows
				System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+
						" "+resultSet.getString(3)+" "+resultSet.getDouble(4)+" "+resultSet.getDate(5));
			}*/
			/*String sql="INSERT into EMPLOYEE values(3,'Samar','Gurugram',60000.00,'2024-07-11')";
			int result=statement.executeUpdate(sql);*/
			String sql="UPDATE EMPLOYEE set location='Bangalore',salary=85000.00 where empId=3";
			int result=statement.executeUpdate(sql);
			System.out.println(result + "row(s) stored");
				
			connection.close();
				statement.close();
			}catch(Exception ex) {
				System.out.println(ex);
		}
		finally {
			System.out.println("Success");
		}
				

	}

}
