package com.telusko.JdbcTutorial;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DAOdemo {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		StudentDAO dao = new StudentDAO();
		Student s1 = dao.getStudent(11);
		System.out.println(s1.sname);
		

	}

}

class StudentDAO{
	public Student getStudent(int rollno) throws SQLException {
		String query = "select sname from student where rollno="+rollno;
		Student s = new Student();
		s.rollno =rollno;
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","Venky@5248");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		rs.next();
		String name =rs.getString(1);
		s.sname = name;
		return s;
	
		
		
	}
	
}

class Student{
	int rollno;
	String sname; 
}
