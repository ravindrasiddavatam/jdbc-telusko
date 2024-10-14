package com.telusko.JdbcTutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcTutorial {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		String url = "jdbc:mysql://localhost:3306/mydb";
		String uname = "root";
		String pass = "Venky@5248";
		int aid =6;
		String aname = "Ali";
		String tech = "Physics";
		String query = "insert into alien values(?,?,?)";
		
		//Class.forName("com.mysql.jdbc.Driver");
		
		Connection con =DriverManager.getConnection(url,uname,pass);
		PreparedStatement st = con.prepareStatement(query);
		st.setInt(1, aid);
		st.setString(2,aname);
		st.setString(3, tech);
		//Statement st =con.createStatement();
		int count = st.executeUpdate();
		System.out.println(count + "row/s affected");
		
//		ResultSet rs =st.executeQuery(query);
//		//rs.next();
//		//String name=rs.getString("aname");
//		
//		while(rs.next()) {
//		
//		String userdata = rs.getInt(1) + " : " +rs.getString(2);
		
	//	System.out.println(name);
	//	System.out.println(userdata);
		//}
		st.close();
		con.close();
		

	}

}
