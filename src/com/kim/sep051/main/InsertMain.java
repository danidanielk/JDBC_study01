package com.kim.sep051.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertMain {
public static void main(String[] args) {
//sql문을 사용해서 db서버로 전송을 하고 db서버에서 SQl문을 실행해서 그 결과를 자바로 받아오자
	
	Connection con = null;
	
	try {
		String a ="jdbc:oracle:thin:@192.168.123.100:1521:xe";
		con = DriverManager.getConnection(a, "danidani", "1");
		//System.out.println("success");
		
		String sql="insert into product values (food_seq.nextval,1,'테스트',10,3)"; 
		//줄 나눌때는 띄어쓰기 주의
		//세미콜론 따옴표 안에 쓰지말기
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		//서버에 전송/실행/결과 받아오는 작업을 하는 총괄 매니져 preparedstatement 에게 부탁해야함.
		
		pstmt.executeUpdate(); 
		//서버에 전송/실행 의 결과받기
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	try {
		con.close();
	} catch (Exception e) {
		e.printStackTrace();
	}
	
}
}

