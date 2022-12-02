package com.kim.sep051.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Study01 {
public static void main(String[] args) {
	
	
	Connection con = null;
	PreparedStatement pstmt = null;
	Scanner scan = new Scanner(System.in);
	
	try {
		
		con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.123.100:1521:xe", "danidani","1");
		System.out.println("컴터이름:");
		String aa=scan.next();
		System.out.println("os:");
		String bb=scan.next();
		System.out.println("제조일:");
		String cc=scan.next();
		System.out.println("무게:");
		int dd= scan.nextInt();
		System.out.println("cpu:");
		String ee=scan.next();
		
		String a = "insert into com values(com_seq.nextval,?,?,?,?,?)";
		
		pstmt = con.prepareStatement(a);
		pstmt.setString(1, aa);
		pstmt.setString(2, bb);
		pstmt.setString(1, cc);
		pstmt.setDouble(4, dd);
		pstmt.setString(1, ee);
		
		if(pstmt.executeUpdate()==1) {
			System.out.println("success");
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	try {
		pstmt.close();
	} catch (Exception e) {
		// TODO: handle exception
	}
	try {
		con.close();
	} catch (Exception e) {
		// TODO: handle exception
	}
	
	
}
}
