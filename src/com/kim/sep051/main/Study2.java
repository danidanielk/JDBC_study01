package com.kim.sep051.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Study2 {
public static void main(String[] args) {
	
	Connection con=null;
	PreparedStatement ptstmt = null;
	Scanner scan = new Scanner(System.in);
	
	try {
		con=DriverManager.getConnection("jdbc:oracle:thin:@192.168.123.100:1521:xe", "danidani","1");
		System.out.println("이름");
		String a = scan.next();
		System.out.println("지역");
		String b = scan.next();
		System.out.println("크기");
		int c = scan.nextInt();
		System.out.println("주차");
		int d = scan.nextInt();
		
		String aa="insert into mart values(mart_seq.nextval,?,?,?,?)";
		ptstmt = con.prepareStatement(aa);
		ptstmt.setString(1, a);
		ptstmt.setString(2, b);
		ptstmt.setInt(3, c);
		ptstmt.setInt(4, d);
		
		if(ptstmt.executeUpdate()==1) {
			System.out.println("success");
		}
		
	} catch (Exception e) {
		// TODO: handle exception
	}
	try {
	ptstmt.close();	
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
