package com.kim.sep051.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Study3 {
public static void main(String[] args) {
	
	
	Connection con = null;
	PreparedStatement pstmt= null;
	Scanner scan = new Scanner(System.in);
	
	try {
		
		con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.123.100:1521:xe", "danidani", "1");
		
		System.out.println("¾îÂ¼°í");
		String a= scan.next();
		System.out.println("¾îÂ¼°í");
		String b= scan.next();
		System.out.println("¾îÂ¼°í");
		int c = scan.nextInt();
		System.out.println("¾îÂ¼°í");
		int d = scan.nextInt();
		
		String aa = "insert into mart values(mart_seq.nextval,?,?,?,?";
		
		pstmt=con.prepareStatement(aa);
		pstmt.setString(1, a);
		pstmt.setString(2, b);
		pstmt.setInt(3, c);
		pstmt.setInt(4, d);
		
		if(pstmt.executeUpdate()==1) {
			System.out.println("success");
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	
}
}
