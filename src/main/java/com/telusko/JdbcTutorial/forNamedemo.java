package com.telusko.JdbcTutorial;

public class forNamedemo {

	public static void main(String[] args) throws ClassNotFoundException {
		// TODO Auto-generated method stub
		
		Class.forName("com.telusko.JdbcTutorial.Pqr");
		
	//	Pqr dm = new Pqr();
		

	}


}
class Pqr{
	static {
		System.out.println("in static");
	}
	
	//instance
	{
		System.out.println("in instance");
	}
}
