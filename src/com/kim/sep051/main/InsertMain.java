package com.kim.sep051.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class InsertMain {
public static void main(String[] args) {
//sql���� ����ؼ� db������ ������ �ϰ� db�������� SQl���� �����ؼ� �� ����� �ڹٷ� �޾ƿ���
	
	Connection con = null;
	
	try {
		String a ="jdbc:oracle:thin:@192.168.123.100:1521:xe";
		con = DriverManager.getConnection(a, "danidani", "1");
		//System.out.println("success");
		
		String sql="insert into product values (food_seq.nextval,1,'�׽�Ʈ',10,3)"; 
		//�� �������� ���� ����
		//�����ݷ� ����ǥ �ȿ� ��������
		
		PreparedStatement pstmt = con.prepareStatement(sql);
		//������ ����/����/��� �޾ƿ��� �۾��� �ϴ� �Ѱ� �Ŵ��� preparedstatement ���� ��Ź�ؾ���.
		
		pstmt.executeUpdate(); 
		//������ ����/���� �� ����ޱ�
		
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

